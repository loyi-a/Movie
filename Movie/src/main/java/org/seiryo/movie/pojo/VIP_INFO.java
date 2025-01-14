package org.seiryo.movie.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** VIP详情实体类
 * @return null
 * @author 罗伊
 * @date 13/1/2025
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VIP_INFO {

	//VIP编号
	private Integer VIP_ID;

	//VIP积分
	private Integer VIP_JF;

	//VIP名称
	private Integer VIP_NAME;

	//VIP折扣
	private Integer VIP_ZK;


}
