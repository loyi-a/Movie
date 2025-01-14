package org.seiryo.movie.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** 电影实体类
 * @return null
 * @author 罗伊
 * @date 13/1/2025
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DY_INFO {

	//电影编号
	private Integer DY_ID;

	//电影名称
	private String DY_NAME;

	//电影上映时间
	private String DY_SY;

	//电影单价
	private Double DY_MONEY;

	//观影时间
	private String DY_DATE;

	//电影状态
	private Integer DY_S;

	//电影座位（库存）
	private Integer DY_WZ;


}
