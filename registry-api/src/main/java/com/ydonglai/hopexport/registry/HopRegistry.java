package com.ydonglai.hopexport.registry;

import java.util.Set;

/**
 * @author 账户组-东来
 * @mail changsheng.yin@hipac.cn
 * @createAt 2018/8/28
 */
public interface HopRegistry {

	/**
	 * 获取 registry info
	 * @return
	 */
	HopRegistryInfo getInfo();

	/**
	 * 该接口封装了
	 * POST apis/add.do
	 * POST apis/update.do
	 * GET apis/targetExist.do
	 * 将 method 以接口的方法为单位发布到 hop
	 * 接口不存在，就创建
	 */
	HopApiID publish(HopApiDefinition apiDef);

	/**
	 * 批量发布
	 * @return
	 */
	Set<HopApiID> batchPublish(Set<HopApiDefinition> apiDefSet);

	/**
	 * 根据 apiID 信息，查询 Api 定义信息
	 * @param apiID
	 * @return
	 */
	HopApiDefinition resolveApi(HopApiID apiID);

	/**
	 * hop 登录
	 */
	HopAdminSession login(HopAdminUser user);

	/**
	 * hop 登出
	 * @param session
	 */
	void logout(HopAdminSession session);

}
