/**
 * 登陆
 */
$(function(){
    $("#userLogin").unbind("click").bind("click", function() {
        //获取用户输入的账号和密码
        var userName = $("#userName").val();
        var userPass = $("#userPass").val();

        //验证每个字段是否为空
        if (!userName) {
            alert("账号不能为空！");
            return; 
        }
        if (!userPass) {
            alert("密码不能为空！");
            return; 
        }

        //账号验证
        var regName = /^(?=.*[A-Z])(?=.*[0-9])(?=.*[\W_])[A-Za-z0-9\W_]+$/;  // 正则表达式对象
        if (!regName.test(userName)) {
            alert("账号必须由数字和英文组合，必须包含大写字母和特殊符号！");
            return;
        }

        //密码验证
        var regPass = /^\d{6}$/;
        if (!regPass.test(userPass)) {
            alert("密码必须由六位数字组成！");
            return;
        }

        $.ajax({
            url: "/userCtrl/userLogin",
            type: "post",
            data: {"userName": userName, "userPass": userPass},
            dataType: "json",
            success: function(data) {
	            if (data == 2) {
                    alert("管理员登录成功，将跳转到管理页面");
                    window.location.href = "/adminCtrl/queryAllLog";
                } else if (data == 1) {
                    //存储userId到sessionStorage
                    sessionStorage.setItem("userId", data.userId);
                    alert("登录成功，将跳转到电影城页面");
                    window.location.href = "/dyCtrl/queryAllDyInfo";
                } else if (data == 0) {
                    alert("账号或密码错误，请重新登录！");
                    window.location.href = "login.html";
                }else if (data == 3) {
                    alert("账号已被冻结，请联系管理员进行处理");
                    window.location.href = "login.html";
                }
            }
        });
    });
});
