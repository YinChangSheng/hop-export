package com.ydonglai.hopexport.registry.webapi;

import com.ydonglai.hopexport.registry.*;

import java.util.Set;

/**
 * @author 账户组-东来
 * @mail changsheng.yin@hipac.cn
 * @createAt 2018/8/28
 */
public class WebApiHopRegistry implements HopRegistry {

	private String baseUrl;

	protected WebApiHopRegistry(String baseUrl) {

	}

	@Override
	public HopRegistryInfo getInfo() {
		return null;
	}

	@Override
	public HopApiID publish(HopApiDefinition apiDef) {
		return null;
	}

	@Override
	public Set<HopApiID> batchPublish(Set<HopApiDefinition> apiDefSet) {
		return null;
	}

	@Override
	public HopApiDefinition resolveApi(HopApiID apiID) {
		return null;
	}

	@Override
	public HopAdminSession login(HopAdminUser user) {
		return null;
	}

	@Override
	public void logout(HopAdminSession session) {

	}
}
