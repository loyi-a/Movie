package org.seiryo.movie.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** 管理员实体类
 * @return null
 * @author 罗伊
 * @date 13/1/2025
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ADMIN_INFO {

	//管理员编号
	private Integer ADMIN_ID;

	//管理员账号
	private String ADMIN_NAME;

	//管理员密码
	private String ADMIN_PASS;

	//管理员权限
	private Integer ADMIN_QX;

	//管理员状态
	private Integer ADMIN_S;


}
