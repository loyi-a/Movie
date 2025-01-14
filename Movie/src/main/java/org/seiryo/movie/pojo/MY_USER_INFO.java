package org.seiryo.movie.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** 用户详情实体类
 * @return null
 * @author 罗伊
 * @date 13/1/2025
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MY_USER_INFO {

	//用户详情编号
	private Integer USERINFO_ID;

	//用户编号
	private Integer USER_ID;

	//用户余额
	private Double USER_MONEY;

	//用户积分
	private Integer USER_JF;

	//用户VIP
	private String USER_VIP;

	//用户手机号
	private String USER_PHONE;

	//用户状态
	private Integer USER_S;

}
