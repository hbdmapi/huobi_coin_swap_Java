package com.huobi.api.swaps;

public class HuobiCoinMarginedSwapAPIOptions {

    //合约市场行情接口
    public static final String SWAP_CONTRACT_INFO = "/swap-api/v1/swap_contract_info"; // 1.获取合约信息
    public static final String SWAP_INDEX = "/swap-api/v1/swap_index"; // 2.获取合约指数信息
    public static final String SWAP_PRICE_LIMIT = "/swap-api/v1/swap_price_limit"; // 3.获取合约最高限价和最低限价
    public static final String SWAP_RISK_INFO = "/swap-api/v1/swap_risk_info";//4.查询合约风险准备金和预估分摊比例
    public static final String SWAP_OPEN_INTEREST = "/swap-api/v1/swap_open_interest";// 5.获取当前可用合约总持仓量

    public static final String SWAP_INSURANCE_FUND = "/swap-api/v1/swap_insurance_fund"; // 6.获取风险准备金历史数据
    public static final String SWAP_HIS_OPEN_INTEREST = "/swap-api/v1/swap_his_open_interest"; // 7.平台持仓量的查询
    public static final String SWAP_API_STATE = "/swap-api/v1/swap_api_state"; // 8.查询系统状态
    public static final String SWAP_MARKET_DEPTH = "/swap-ex/market/depth";// 9.获取行情深度数据
    public static final String SWAP_MARKET_HISTORY_KLINE = "/swap-ex/market/history/kline";// 10.获取K线数据

    public static final String SWAP_MARKET_DETAIL_MERGED = "/swap-ex/market/detail/merged"; // 11.获取聚合行情
    public static final String SWAP_MARKET_TRADE = "/swap-ex/market/trade";// 12.获取市场最近成交记录
    public static final String SWAP_MARKET_HISTORY_TRADE = "/swap-ex/market/history/trade";  // 13.批量获取最近的交易记录
    public static final String SWAP_ADJUSTFACTOR = "/swap-api/v1/swap_adjustfactor";  // 14.查询平台阶梯调整系数
    public static final String SWAP_ELITE_ACCOUNT_RATIO = "/swap-api/v1/swap_elite_account_ratio";  // 15.精英账户多空持仓对比-账户数

    public static final String SWAP_ELITE_POSITION_RATIO = "/swap-api/v1/swap_elite_position_ratio";  // 16.精英账户多空持仓对比-持仓量
    public static final String SWAP_LIQUIDATION_ORDERS = "/swap-api/v1/swap_liquidation_orders";  // 17.获取强平订单
    public static final String SWAP_FUNDING_RATE = "/swap-api/v1/swap_funding_rate";  // 18.获取合约的资金费率
    public static final String SWAP_HISTORICAL_FUNDING_RATE = "/swap-api/v1/swap_historical_funding_rate";  // 19.获取合约的历史资金费率
    public static final String LINEAR_SWAP_BASIS = "/index/market/history/swap_basis";  // 20.获取基差数据

    public static final String LINEAR_SWAP_PREMIUM_INDEX_KLINE = "/index/market/history/swap_premium_index_kline ";  // 21.获取溢价指数K线数据
    public static final String LINEAR_SWAP_ESTIMATED_RATE_KLINE = "/index/market/history/swap_estimated_rate_kline";  // 22.获取预测资金费率的K线数据
    public static final String SWAP_ESTIMATED_SETTLEMENT_PRICE = "/swap-api/v1/swap_estimated_settlement_price"; // 23.获取预估结算价
    public static final String SWAP_LADDER_MARGIN = "/swap-api/v1/swap_ladder_margin"; // 24.获取平台阶梯保证金
    public static final String BATCH_MERGED = "/swap-ex/market/detail/batch_merged"; // 25.批量获取聚合行情

    public static final String SWAP_MARK_PRICE_KLINE = "/index/market/history/swap_mark_price_kline"; // 26.获取标记价格的 K 线数据
    public static final String SWAP_BATCH_FUNDING_RATE = "/swap-api/v1/swap_batch_funding_rate";  // 27.批量获取合约资金费率
    public static final String MARKET_BBO = "/swap-ex/market/bbo";  // 28.获取市场最优挂单

    //合约资产接口
    public static final String SWAP_ACCOUNT_INFO = "/swap-api/v1/swap_account_info"; // 1.获取用户账户信息
    public static final String SWAP_POSITION_INFO = "/swap-api/v1/swap_position_info"; // 2.获取用户持仓信息
    public static final String SWAP_SUB_ACCOUNT_LIST = "/swap-api/v1/swap_sub_account_list"; // 3.查询母账户下所有子账户资产信息
    public static final String SWAP_SUB_ACCOUNT_INFO = "/swap-api/v1/swap_sub_account_info"; // 4.查询单个子账户资产信息
    public static final String SWAP_SUB_POSITION_INFO = "/swap-api/v1/swap_sub_position_info"; // 5.查询单个子账户持仓信息

    public static final String SWAP_FINANCIAL_RECORD = "/swap-api/v1/swap_financial_record"; // 6.查询用户财务记录
    public static final String SWAP_ORDER_LIMIT = "/swap-api/v1/swap_order_limit"; // 7.查询用户当前的下单量限制
    public static final String SWAP_FEE = "/swap-api/v1/swap_fee"; // 8.查询用户当前的手续费费率
    public static final String SWAP_TRANSFER_LIMIT = "/swap-api/v1/swap_transfer_limit"; // 9.查询用户当前的划转限制
    public static final String SWAP_POSITION_LIMIT = "/swap-api/v1/swap_position_limit"; // 10.用户持仓量限制的查询

    public static final String SWAP_ACCOUNT_POSITION_INFO = "/swap-api/v1/swap_account_position_info";//11.获取用户资产和持仓信息
    public static final String SWAP_MASTER_SUB_TRANSFER = "/swap-api/v1/swap_master_sub_transfer";//12.母子账户划转
    public static final String SWAP_MASTER_SUB_TRANSFER_RECORD = "/swap-api/v1/swap_master_sub_transfer_record";//13.获取母账户下的所有母子账户划转记录
    public static final String SWAP_API_TRADING_STATUS = "/swap-api/v1/swap_api_trading_status";//14.获取用户API指标禁用信息
    public static final String SWAP_FINANCIAL_RECORD_EXACT = "/swap-api/v1/swap_financial_record_exact";//15.组合查询用户财务记录

    public static final String SWAP_USER_SETTLEMENT_RECORDS = "/swap-api/v1/swap_user_settlement_records";//16.获取用户API指标禁用信息
    public static final String SWAP_AVAILABLE_LEVEL_RATE = "/swap-api/v1/swap_available_level_rate";//17.获取合约可用杠杆倍数
    public static final String SWAP_SUB_AUTH = "/swap-api/v1/swap_sub_auth";//18.批量设置子账户交易权限
    public static final String SWAP_SUB_ACCOUNT_INFO_LIST = "/swap-api/v1/swap_sub_account_info_list";//19.批量获取子账户资产信息
    public static final String SWAP_BALANCE_VALUATION = "/swap-api/v1/swap_balance_valuation"; // 20.获取账户总资产估值

    //合约交易接口
    public static final String SWAP_ORDER = "/swap-api/v1/swap_order"; // 1.合约下单
    public static final String SWAP_BATCHORDER = "/swap-api/v1/swap_batchorder"; // 2.合约批量下单
    public static final String SWAP_CANCEL = "/swap-api/v1/swap_cancel"; // 3.撤销订单
    public static final String SWAP_CANCELALL = "/swap-api/v1/swap_cancelall"; // 4.全部撤单
    public static final String SWAP_ORDER_INFO = "/swap-api/v1/swap_order_info"; // 5.获取合约订单信息

    public static final String SWAP_ORDER_DETAIL = "/swap-api/v1/swap_order_detail"; // 6.获取订单明细信息
    public static final String SWAP_OPENORDERS = "/swap-api/v1/swap_openorders"; // 7.获取合约当前未成交委托
    public static final String SWAP_HISORDERS = "/swap-api/v1/swap_hisorders"; // 8.获取合约历史委托
    public static final String SWAP_MATCHRESULTS = "/swap-api/v1/swap_matchresults"; // 9.获取历史成交记录
    public static final String SWAP_LIGHTNING_CLOSE_POSITION = "/swap-api/v1/swap_lightning_close_position"; // 10.闪电平仓下单

    public static final String SWAP_TRIGGER_ORDER = "/swap-api/v1/swap_trigger_order"; //计划委托下单
    public static final String SWAP_TRIGGER_CANCEL = "/swap-api/v1/swap_trigger_cancel";//计划委托撤单
    public static final String SWAP_TRIGGER_CANCELALL = "/swap-api/v1/swap_trigger_cancelall";//计划委托全部撤单
    public static final String SWAP_TRIGGER_OPENORDERS = "/swap-api/v1/swap_trigger_openorders";////获取计划委托当前委托
    public static final String SWAP_TRIGGER_HISORDERS = "/swap-api/v1/swap_trigger_hisorders";////获取计划委托历史委托

    public static final String SWAP_SWITCH_LEVER_RATE = "/swap-api/v1/swap_switch_lever_rate";////切换杠杆
    public static final String SWAP_HISORDERS_EXACT = "/swap-api/v1/swap_hisorders_exact";////获取计划委托历史委托
    public static final String SWAP_MATCHRESULTS_EXACT = "/swap-api/v1/swap_matchresults_exact";////获取计划委托历史委托
    public static final String SWAP_TPSL_ORDER = "/swap-api/v1/swap_tpsl_order";//对仓位设置止盈止损订单
    public static final String SWAP_TPSL_CANCEL = "/swap-api/v1/swap_tpsl_cancel";//止盈止损订单撤单

    public static final String SWAP_TPSL_CANCELALL = "/swap-api/v1/swap_tpsl_cancelall";//止盈止损订单全部撤单
    public static final String SWAP_TPSL_OPENORDERS = "/swap-api/v1/swap_tpsl_openorders";//查询止盈止损订单当前委托
    public static final String SWAP_TPSL_HISORDERS = "/swap-api/v1/swap_tpsl_hisorders";//查询止盈止损订单历史委托
    public static final String SWAP_RELATION_TPSL_ORDER = "/swap-api/v1/swap_relation_tpsl_order";//查询开仓单关联的止盈止损订单详情
    public static final String SWAP_TRACK_ORDER = "/swap-api/v1/swap_track_order"; // 跟踪委托订单下单

    public static final String SWAP_TRACK_CANCEL= "/swap-api/v1/swap_track_cancel"; // 跟踪委托订单撤单
    public static final String SWAP_TRACK_CANCELALL = "/swap-api/v1/swap_track_cancelall"; // 跟踪委托订单全部撤单
    public static final String SWAP_TRACK_OPENORDERS = "/swap-api/v1/swap_track_openorders"; // 跟踪委托订单当前委托
    public static final String SWAP_TRACK_HISORDERS = "/swap-api/v1/swap_track_hisorders"; // 跟踪委托订单历史委托

    //合约划转接口
    public static final String USDT_SWAP_TRANSFER = "/v2/account/transfer"; // 1.现货-USDT永续账户间进行资金的划转


}
