package org.seiryo.movie.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** 订单实体类
 * @return null
 * @author 罗伊
 * @date 13/1/2025
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MY_ORDER {

	//订单编号
	private Integer ORDER_ID;

	//订单电影编号
	private Integer ORDER_DY_ID;

	//订单用户编号
	private Integer ORDER_USER_ID;
	


}
