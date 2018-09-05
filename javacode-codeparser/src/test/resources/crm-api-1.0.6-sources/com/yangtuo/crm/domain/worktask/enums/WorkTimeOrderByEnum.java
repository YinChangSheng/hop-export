package com.yangtuo.crm.domain.worktask.enums;

/**
 * 作者: 账户组-东来
 * 邮箱: changsheng.yin@hipac.cn
 * 创建于: 2018/4/26
 * 微信: yin80871901
 */
public enum WorkTimeOrderByEnum {

	START_TIME_ASC(new String[]{"asc", "1"}, "PROCESS_START_TIME_ASC"),
	START_TIME_DESC(new String[]{"desc", "3"}, "PROCESS_START_TIME_DESC"),
	TASK_START_TIME_ASC(new String[]{"asc", "2"}, "TASK_CREATE_TIME_ASC"),
	TASK_START_TIME_DESC(new String[]{"desc", "4"}, "TASK_CREATE_TIME_DESC");

	private String[] names;

	/**
	 * 针对流程引擎的排序名称
	 */
	private String nameForProcess;

	WorkTimeOrderByEnum(String[] names, String nameForProcess) {
		this.names = names;
		this.nameForProcess = nameForProcess;
	}

	public static WorkTimeOrderByEnum nameOf(String name) {
		for (WorkTimeOrderByEnum en : values()) {
			if (en.names[0].equals(name) || en.names[1].equals(name)) {
				return en;
			}
		}
		return null;
	}

	public String getNameForHCS() {
		return nameForProcess;
	}
}
