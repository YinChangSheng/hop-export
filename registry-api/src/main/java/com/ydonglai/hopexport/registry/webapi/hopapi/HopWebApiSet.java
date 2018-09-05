package com.ydonglai.hopexport.registry.webapi.hopapi;

/**
 * @author 账户组-东来
 * @mail changsheng.yin@hipac.cn
 * @createAt 2018/8/28
 */
public class HopWebApiSet {

	/**
	 * 入参
	 * | 		参数名			 		| 		默认值		 							 | 		备注		 																						 						|
	 * | 		---				 		| 		---		 								 | 		---		 																						 						|
	 * |		isQuery		 		| 		true 									 | 					 																						 						|
	 * | 		env				 		| 		1 								 		 | 		所属环境 dev, daily, test, app, master (mysql自增ID，需要接口查询) |
	 * | 		module		 		| 		41 									 	 | 		模块 shop (可在模块列表中查询) 																		|
	 * | 		apiVersion 		| 		1.0.0 								 | 		api 版本 																											|
	 * | 		interfaceName | 		com.yangt.hop.QueryApi | 		接口类名 																												|
	 * | 		methodName 		| 		queryShop 						 | 		方法名称 																												|
	 * | 		dubboGroup 		| 		crm-daily 						 | 		dubbo 分组名称 																									|
	 * | 		apiName		 		| 		hopexport.apistore.add | 		api 名称 																											|
	 *
	 * 返回
	 * {"code":0,"data":
	 * 	{"currentEnv":2,"pageIndex":1,"pageSize":20,"pageCount":14,"totalCount":271,
	 * 		"items":[
	 * 			{"apiId":8957,"apiName":"mall.item.detail.dynamicPrice","envId":1,"env":"dev","appId":1,"app":"mall","moduleId":13,"module":"item","version":"1.0.0","owner":"少平","isSkipLogin":0,"desc":"增加购买数量获取价格信息","dubboGroup":"mall_test"},
	 * 			{"apiId":8882,"apiName":"mall.artifact.getMaterialByItemId","envId":1,"env":"dev","appId":1,"app":"mall","moduleId":26,"module":"shop","version":"1.0.0","owner":"萝卜","isSkipLogin":0,"desc":"到店神器2.0 门店创建自定义活动，选择海拍客商品之后，默认显示该商品关联的素材，回显到页面上，主要是描述和图片,商品如果关联多个素材，默认取第一个","dubboGroup":"mall_test"},
	 * 			{"apiId":8566,"apiName":"mall.item.detail.itemPriceList","envId":1,"env":"dev","appId":1,"app":"mall","moduleId":13,"module":"item","version":"1.0.0","owner":"少平","isSkipLogin":0,"desc":"商品详情页根据条件参数查询规格列表","dubboGroup":"mall_test"},
	 * 			{"apiId":8548,"apiName":"mall.item.rebateList.app","envId":1,"env":"dev","appId":1,"app":"mall","moduleId":13,"module":"item","version":"1.0.0","owner":"少平","isSkipLogin":0,"desc":"活动商品列表","dubboGroup":"aadd"},
	 * 			{"apiId":8545,"apiName":"mall.item.rebateList.pc","envId":1,"env":"dev","appId":1,"app":"mall","moduleId":13,"module":"item","version":"1.0.0","owner":"少平","isSkipLogin":0,"desc":"活动商品列表","dubboGroup":"mall_test"},
	 * 			{"apiId":8459,"apiName":"mall.item.searchItemListWithFlashBuyAct.app","envId":1,"env":"dev","appId":1,"app":"mall","moduleId":13,"module":"item","version":"1.0.4","owner":"少平","isSkipLogin":0,"desc":"查询符合条件的商品以及聚划算活动（过滤重复商品）","dubboGroup":"mall_test"},
	 * 			{"apiId":8374,"apiName":"hipac.mall.module.moduleData","envId":1,"env":"dev","appId":1,"app":"mall","moduleId":11,"module":"home","version":"1.0.5","owner":"少平","isSkipLogin":0,"desc":"模块化取数据","dubboGroup":"mall_test"},
	 * 			{"apiId":8370,"apiName":"hipac.mall.module.layout","envId":1,"env":"dev","appId":1,"app":"mall","moduleId":11,"module":"home","version":"1.0.2","owner":"niangao","isSkipLogin":0,"desc":"模块化布局","dubboGroup":"docker-mall-jay"},
	 * 			{"apiId":8321,"apiName":"mall.item.recommendItem.app","envId":1,"env":"dev","appId":1,"app":"mall","moduleId":13,"module":"item","version":"1.0.4","owner":"少平","isSkipLogin":0,"desc":"搜索无结果页和支付完成页的推荐商品列表，根据推荐类型区分","dubboGroup":"mall_test"},
	 * 			{"apiId":8041,"apiName":"mall.artifact.getShopArtifactActivitySpMapSchema","envId":1,"env":"dev","appId":1,"app":"mall","moduleId":26,"module":"shop","version":"1.0.0","owner":"yaozi","isSkipLogin":0,"desc":"来店吧查看商品按钮","dubboGroup":"mall_test"},
	 * 			{"apiId":7941,"apiName":"mall.app.ta.queryStoreyList","envId":1,"env":"dev","appId":1,"app":"mall","moduleId":100,"module":"ta","version":"1.0.0","owner":"小崮","isSkipLogin":0,"desc":"ytms模板活动 APP端获取活动楼层信息","dubboGroup":"mall_xiaogu"},
	 * 			{"apiId":7940,"apiName":"mall.pc.ta.queryStoreyList","envId":1,"env":"dev","appId":1,"app":"mall","moduleId":100,"module":"ta","version":"1.0.0","owner":"小崮","isSkipLogin":0,"desc":"ytms模板活动 PC端获取活动楼层信息","dubboGroup":"mall_xiaogu"},
	 * 			{"apiId":7939,"apiName":"mall.app.ta.getPage","envId":1,"env":"dev","appId":1,"app":"mall","moduleId":100,"module":"ta","version":"1.0.0","owner":"小崮","isSkipLogin":0,"desc":"ytms模板活动 APP端获取页面信息","dubboGroup":"mall_xiaogu"},
	 * 			{"apiId":7938,"apiName":"mall.pc.ta.getPage","envId":1,"env":"dev","appId":1,"app":"mall","moduleId":100,"module":"ta","version":"1.0.0","owner":"小崮","isSkipLogin":0,"desc":"ytms模板活动 PC端获取页面信息","dubboGroup":"mall_xiaogu"},
	 * 			{"apiId":7925,"apiName":"mall.module.moduleData2","envId":1,"env":"dev","appId":1,"app":"mall","moduleId":11,"module":"home","version":"1.0.3","owner":"少平","isSkipLogin":0,"desc":"模块化取数据","dubboGroup":"mall_test"},
	 * 			{"apiId":7917,"apiName":"mall.item.regular.planRuleList.get","envId":1,"env":"dev","appId":1,"app":"mall","moduleId":13,"module":"item","version":"1.0.0","owner":"少平","isSkipLogin":0,"desc":"查询商品设置的比价条件","dubboGroup":"mall_test"},
	 * 			{"apiId":7904,"apiName":"mall.item.regular.ruleList.save","envId":1,"env":"dev","appId":1,"app":"mall","moduleId":13,"module":"item","version":"1.0.0","owner":"少平","isSkipLogin":0,"desc":"保存商品设置的比价条件","dubboGroup":"mall_test"},
	 * 			{"apiId":7903,"apiName":"mall.item.regular.ruleList.get","envId":1,"env":"dev","appId":1,"app":"mall","moduleId":13,"module":"item","version":"1.0.0","owner":"少平","isSkipLogin":0,"desc":"查询商品设置的比价条件","dubboGroup":"mall_test"},
	 * 			{"apiId":7901,"apiName":"mall.item.regular.statusList.get","envId":1,"env":"dev","appId":1,"app":"mall","moduleId":13,"module":"item","version":"1.0.0","owner":"少平","isSkipLogin":0,"desc":"查询商品在所在区域的售卖情况","dubboGroup":"mall_test"},
	 * 			{"apiId":7900,"apiName":"mall.item.regular.myList.get","envId":1,"env":"dev","appId":1,"app":"mall","moduleId":13,"module":"item","version":"1.0.1","owner":"少平","isSkipLogin":0,"desc":"根据类型获取我的常购列表信息","dubboGroup":"mall_test"}
	 * 		]
	 * 	}
	 * }
	 */
	public static HopWebApi ApiQuery = new HopWebApi(
			"apis/query.do ", HopWebApi.METHOD_GET, "hopApi查询"
	);

	public static HopWebApi ApiUpdate = new HopWebApi(
			"apis/update.do", HopWebApi.METHOD_POST, "hopApi更新"
	);

	public static HopWebApi ApiCopy = new HopWebApi(
			"apis/copyApi.do", HopWebApi.METHOD_POST, "hopApi同步"
	);

	public static HopWebApi ApiBatchCopy = new HopWebApi(
			"apis/batchCopy.do", HopWebApi.METHOD_POST, "hopApi批量同步"
	);

	public static HopWebApi ApiTargetExists = new HopWebApi(
			"apis/targetExist.do", HopWebApi.METHOD_GET, "hopApi判断是否存在"
	);

	public static HopWebApi ApiBatchTargetExists = new HopWebApi(
			"apis/batchTargetExist.do", HopWebApi.METHOD_GET, "hopApi批量判断是否存在"
	);

	public static HopWebApi ApiAdd = new HopWebApi(
			"apis/add.do", HopWebApi.METHOD_POST, "hopApi创建"
	);

	public static final HopWebApi ApiEnvs = new HopWebApi(
			"apis/appEnvs.do", HopWebApi.METHOD_GET, "获取app和环境列表"
	);

	/**
	 * | 参数名 | 默认值 | 备注 |
	 * | --- | --- | --- |
	 * | appId | 10 | 应用id, 可从应用列表查询 |
	 * | moduleName | shop | 模块名称 |
	 */
	public static final HopWebApi ModuleList = new HopWebApi(
			"module/list.do", HopWebApi.METHOD_GET, "hop模块列表"
	);

	/**
	 * | 参数名 | 默认值 | 备注 |
	 * | --- | --- | --- |
	 * | keyword | 10 | 查询 应用名称关键字 |
	 * | pageNo | 1 | 页号 |
	 * | pageSize | 10 | 页大小 |
	 * 数据不会很多50条以内
	 */
	public static final HopWebApi AppList = new HopWebApi(
			"app/list.do", HopWebApi.METHOD_GET, "应用列表"
	);

	/**
	 * 记录 evn,app, dubbo-group 之间映射关系
	 * | 参数名 | 默认值 | 备注 |
	 * | --- | --- | --- |
	 * | keyword | 10 | 查询 应用名称关键字 |
	 * | pageNo | 1 | 页号 |
	 * | pageSize | 10 | 页大小 |
	 */
	public static final HopWebApi EnvConfigList = new HopWebApi(
			"envappconfig/list.do", HopWebApi.METHOD_GET, "获取应用环境配置"
	);

}
