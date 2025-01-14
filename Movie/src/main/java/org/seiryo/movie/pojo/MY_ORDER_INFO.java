package org.seiryo.movie.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** 订单详情实体类
 * @return null
 * @author 罗伊
 * @date 13/1/2025
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MY_ORDER_INFO {

	//订单详情编号
	private Integer ORDERINFO_ID;

	//订单编号
	private Integer ORDER_ID;

	//订单购票位置
	private Integer ORDER_ZW;

	//订单状态
	private Integer ORDER_S;

	//订单创建时间
	private String ORDER_DATE;

}
