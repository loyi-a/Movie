/**
 * 注册
 */
 $(function(){
    $("#userRegister").unbind("click").bind("click", function() {
	    //获取用户输入的账号密码和手机号
        var userName = $("#userName2").val();
        var userPass = $("#userPass2").val();
        var userPhone = $("#userPhone").val();
	   
        //验证每个字段是否为空
        if (!userName) {
            alert("账号不能为空！");
            return; 
        }

        if (!userPass) {
            alert("密码不能为空！");
            return; 
        }

        if (!userPhone) {
            alert("手机号不能为空！");
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

        //手机号验证
        var regPhone = /^1\d{10}$/;
        if (!regPhone.test(userPhone)) {
            alert("手机号必须由十一位数字组成！");
            return;
        }

        $.ajax({
            url: "/userCtrl/userRegister",
            type: "post",
            cache:false,
            data: {"userName": userName, "userPass": userPass,"userPhone": userPhone},
            dataType: "json",
            success: function(data) {
                if (data == 1) {
                    alert("注册成功，将跳转到登录页面");
                } else if (data == 0){
                    alert("注册失败，请重新注册！");
                }else if (data == 2){
                    alert("账号重复，注册失败，请重新注册！");
                }
                window.location.href = "login.html";
            },
            error: function() {
                alert("网络有误，请稍后再试！");
            }
        });
    });
});
