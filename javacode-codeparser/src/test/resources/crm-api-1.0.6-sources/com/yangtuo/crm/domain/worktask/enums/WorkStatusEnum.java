package com.yangtuo.crm.domain.worktask.enums;

import java.util.Objects;

/**
 * 作者: 账户组-东来
 * 邮箱: changsheng.yin@hipac.cn
 * 创建于: 2018/4/25
 * 微信: yin80871901
 *
 * 工单状态枚举类
 */
public enum WorkStatusEnum {

	PROCESSING(1, "进行中", "运行中"), TERMINATE(2, "已终止", "已终止"), COMPLETE(3, "已完成", "已完成"), CANCELED(4, "已撤销", "已撤销");

	private Integer code;

	private String name;

	private String processName;

	WorkStatusEnum(Integer code, String name, String processName) {
		this.code = code;
		this.name = name;
		this.processName = processName;
	}

	/**
	 * 通过状态 反查出 WorkStatusEnum
	 * @param status
	 * @return
	 */
	public static WorkStatusEnum codeOf(Integer status) {
		for (WorkStatusEnum st : values()) {
			if (Objects.equals(st.code, status) ) {
				return st;
			}
		}
		return null;
	}

	public static WorkStatusEnum nameOf(String name) {
		for (WorkStatusEnum st : values()) {
			if ( st.name.equals(name) ) {
				return st;
			}
		}
		return null;
	}

	// 从工作流状态中映射系统状态
	public static WorkStatusEnum mapOfProcess(String processName) {
		for (WorkStatusEnum st : values()) {
			if (Objects.equals(st.processName, processName) ) {
				return st;
			}
		}
		return null;
	}

	public Integer getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public String getProcessName() {
		return processName;
	}
}
