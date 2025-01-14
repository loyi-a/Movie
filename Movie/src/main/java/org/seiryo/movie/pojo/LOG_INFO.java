package org.seiryo.movie.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** 日志实体类
 * @return null
 * @author 罗伊
 * @date 13/1/2025
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LOG_INFO {

	//日志编号
	private Integer LOG_ID;

	//日志详情
	private String LOG_INFO;

	//日志操作时间
	private String LOG_DATE;

	//日志操作人
	private String LOG_NAME;

}
