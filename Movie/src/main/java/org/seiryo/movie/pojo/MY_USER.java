package org.seiryo.movie.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** 用户实体类
 * @return null
 * @author 罗伊
 * @date 13/1/2025
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MY_USER {

	//用户编号
	private Integer USER_ID;
	//用户名称
	private String USER_NAME;
	//用户密码
	private String USER_PASS;

}
