# Huobi Coin Margined Java SDK

为更好的方便用户使用API接口，现推出以下接口供用户使用。

## 目录：
    合约市场行情类接口
    合约资产类接口
    合约交易类接口
    现货-币本位永续合约划转接口
    市场行情类推送接口
    资产交易类推送接口

### 使用方法
1、该SDK是由Java8编译的，您可以将SDK源代码导入 Intellij IDEA 或 Eclipse中运行（推荐使用 Intellij IDEA） 

2、通过运行mvn install将库安装到Maven的本地存储库中。

3、将以下Maven依赖项添加到项目的pom.xml中；

### 签名注意事项
1、创建API KEY时需勾选上交易的权限设置。

2、在使用API KEY进行签名认证时一定要先在WEB页面开通币本位永续合约的交易权限。

3、如果你使用的是子账户，需要在母账户上的子账号管理页面开通币本位永续合的交易权限。

## 合约市场行情类接口
此类接口不需要进行签名认证。您可以直接在 src/test/java/com/huobi/swqp/api/MarketAPITest 调用以下接口进行测试：
  接口地址      |    请求类型  |   接口名称       |   需要验签   |
  ---------------------------------------- |  ---------- |  ------------------------------- |  --------------  |
  /swap-api/v1/swap_contract_info               |                  GET        |  获取合约信息                 |  否  |
  /swap-api/v1/swap_index                       |                  GET        |  获取合约指数信息             |  否  |
  /swap-api/v1/swap_price_limit                 |                  GET        |  获取合约最高限价和最低限价   |  否  |
  /swap-api/v1/swap_open_interest               |                  GET        |  获取当前可用合约总持仓量     |  否  |
  /swap-ex/market/depth                         |                  GET        |  获取行情深度数据     |  否  |
  /swap-ex/market/history/kline                 |                  GET        |  获取K线数据     |  否  |
  /swap-ex/market/detail/merged                 |                  GET        |  获取聚合行情     |  否  |
  /swap-ex/market/trade                         |                  GET        |  获取市场最近成交记录     |  否  |
  /swap-api/v1/swap_risk_info                   |                  GET        |  查询合约风险准备金余额和预估分摊比例     |  否  |
  /swap-api/v1/swap_insurance_fund              |                  GET        |  查询合约风险准备金余额历史数据     |  否  |
  /swap-api/v1/swap_adjustfactor                |                  GET        |  查询平台阶梯调整系数     |  否  |
  /swap-api/v1/swap_his_open_interest           |                  GET        |  平台持仓量的查询     |  否  |
  /swap-api/v1/swap_elite_account_ratio         |                  GET        |  精英账户多空持仓对比-账户数     |  否  |
  /swap-api/v1/swap_elite_position_ratio        |                  GET        |  精英账户多空持仓对比-持仓量     |  否  |
  /swap-api/v1/swap_api_state                   |                  GET        |  查询系统状态   |  否  |
  /swap-api/v1/swap_funding_rate                |                  GET        |  获取合约的资金费率   |  否  |
  /swap-api/v1/swap_historical_funding_rate     |                  GET        |  获取合约的历史资金费率   |  否  |
  /index/market/history/swap_premium_index_kline   |              GET        |  获取溢价指数K线   |  否  |
  /index/market/history/swap_estimated_rate_kline  |              GET        |  获取实时预测资金费率的K线数据   |  否  |
  /index/market/history/swap_basis                 |              GET        |  获取基差数据   |  否  |

### 调用举例：
```
@Test
public void getSwapContractInfo() {
    SwapContractInfoResponse result =
            huobiAPIService.getSwapContractInfo("BTC-USD");
    logger.debug("1.获取合约信息：{}", JSON.toJSONString(result));
}
```

## 合约资产类接口
此类接口是需要进行签名认证的。将你创建的API KEY 放入 API-KEY 和 SECRET-KEY。然后可以调用下面的接口进行测试：
 AccountAPIServiceImpl huobiAPIService = new AccountAPIServiceImpl("API-KEY", "SECRET-KEY"); 

 接口地址      |    请求类型  |   接口名称       |   需要验签   |
 ---------------------------------------- |  ---------- |  ------------------------------- |  --------------  |
  /swap-api/v1/swap_account_info            |       POST        |  获取用户账户信息   |  是  |
  /swap-api/v1/swap_position_info           |       POST        |  获取用户持仓信息   |  是  |
  /swap-api/v1/swap_sub_account_list        |       POST        |  查询母账户下所有子账户资产信息   |  是  |
  /swap-api/v1/swap_sub_account_info        |       POST        |  查询单个子账户资产信息   |  是  |
  /swap-api/v1/swap_sub_position_info       |       POST        |  查询单个子账户持仓信息   |  是  |
  /swap-api/v1/swap_financial_record        |       POST        |  查询用户财务记录   |  是  |
  /swap-api/v1/swap_financial_record_exact  |       POST        |  组合查询财务记录   |  是  |
  /swap-api/v1/swap_user_settlement_records |       POST        |  查询用户结算记录   |  是  |
  /swap-api/v1/swap_available_level_rate    |       POST        |  查询用户可用杠杆倍数   |  是  |
  /swap-api/v1/swap_order_limit             |       POST        |  查询用户当前的下单量限制   |  是  |
  /swap-api/v1/swap_fee                     |       POST        |  查询用户当前的手续费费率   |  是  |
  /swap-api/v1/swap_transfer_limit          |       POST        |  查询用户当前的划转限制   |  是  |
  /swap-api/v1/swap_position_limit          |       POST        |  用户持仓量限制的查询   |  是  |
  /swap-api/v1/swap_master_sub_transfer     |       POST        |  母子账户划转          |  是  |
  /swap-api/v1/swap_master_sub_transfer_record     |       POST        |  获取母账户下的所有母子账户划转记录   |  是  |
  /swap-api/v1/swap_api_trading_status      |       GET        |  获取用户的API指标禁用信息  |  是  |
 
 ### 调用举例：

测试类目录放在：src/test/java/com/huobi/swqp/api/AccountAPITest 中。
```
@Test
public void getSwapAccountInfoResponse() {
    SwapAccountInfoResponse response = huobiAPIService.getSwapAccountInfo("theta-usd");
    logger.debug("1.获取用户账户信息：{}", JSON.toJSONString(response));
}
```

## 合约交易类接口
此类接口是需要进行签名认证的。将你创建的API KEY 放入 API-KEY 和 SECRET-KEY。然后可以调用下面的接口进行测试：
TradeAPIServiceImpl huobiAPIService = new TradeAPIServiceImpl("API-KEY", "SECRET-KEY");

接口地址      |    请求类型  |   接口名称       |   需要验签   |
---------------------------------------- |  ---------- |  ------------------------------- |  --------------  |
/swap-api/v1/swap_order                     |    POST       |       合约下单       |  是  |
/swap-api/v1/swap_batchorder                |    POST       |       合约批量下单       |  是  |
/swap-api/v1/swap_cancel                    |    POST       |       撤销订单       |  是  |
/swap-api/v1/swap_cancelall                 |    POST       |       全部撤单       |  是  |
/swap-api/v1/swap_switch_lever_rate         |    POST       |       切换杠杆                  |  是  |
/swap-api/v1/swap_order_info                |    POST       |       获取合约订单信息       |  是  |
/swap-api/v1/swap_order_detail              |    POST       |       获取订单明细信息       |  是  |
/swap-api/v1/swap_openorders                |    POST       |       获取合约当前未成交委托       |  是  |
/swap-api/v1/swap_hisorders                 |    POST       |       获取合约历史委托       |  是  |
/swap-api/v1/swap_hisorders_exact           |    POST       |       组合查询合约历史委托      |  是  |
/swap-api/v1/swap_matchresults              |    POST       |       获取历史成交记录       |  是  |
/swap-api/v1/swap_matchresults_exact        |    POST       |       组合查询合约历史成交记录       |  是  |
/swap-api/v1/swap_lightning_close_position  |    POST       |       闪电平仓下单       |  是  |
/swap-api/v1/swap_liquidation_orders        |    POST       |       获取强平订单       |  是  |
/swap-api/v1/swap_trigger_order             |    POST       |       合约计划委托下单       |  是  |
/swap-api/v1/swap_trigger_cancel            |    POST       |       合约计划委托撤单       |  是  |
/swap-api/v1/swap_trigger_cancelall         |    POST       |       合约计划委托全部撤单       |  是  |
/swap-api/v1/swap_trigger_openorders        |    POST       |       获取计划委托当前委托接口       |  是  |
/swap-api/v1/swap_trigger_hisorders         |    POST       |       获取计划委托历史委托接口       |  是  |

### 调用举例：
测试类目录放在：src/test/java/com/huobi/swqp/api/TradeAPITest 中。
```
@Test
public void swapOrderRequest() {
    SwapOrderRequest request = SwapOrderRequest.builder()
            .contractCode("THETA-USD")
            .volume(1l)
            .price(BigDecimal.valueOf(0.677))
            .direction(DirectionEnum.SELL)
            .offset(OffsetEnum.OPEN)
            .leverRate(20)
            .orderPriceType("limit")
            .build();
    SwapOrderResponse response = huobiAPIService.swapOrderRequest(request);
    logger.debug("1合约下单：{}", JSON.toJSONString(response));
}
```

## 现货-币本位永续合约划转接口
此接口的目录：src/test/java/com/huobi/swqp/api/TransferAPITest.
### 调用此接口需要注意以下几个问题：
1、这个接口使用的API KEY是不变的。

2、这个接口是属于现货的，所以我们要使用现货的域名来访问（现货的域名：api.huobi.pro）。

3、这个接口划转金额的精度要在8位小数以内。

### 调用举例：
```
@Test
public void transfer() {
    UsdtSwapTransferRequest request = UsdtSwapTransferRequest.builder()
            .from("swap")
            .to("spot")
            .currency("theta")
            .amount(BigDecimal.valueOf(10))
            .build();
    UsdtSwapTransferResponse response = transferApiService.transfer(request);
    logger.debug("1.现货-币本位永续账户间进行资金的划转：{}", JSON.toJSONString(response));
}
```

## 市场行情类推送接口
推送接口分为请求和订阅，请求的目录：src/test/java/com/huobi/swqp/wss/WssMarketReqTest. 订阅的目录：src/test/java/com/huobi/swqp/wss/WssMarketSubTest.
 
 - 合约订阅地址：wss://api.hbdm.com/swap-ws    国内可以使用：wss://api.btcgateway.pro/swap-ws
 
 请求、订阅方法   |  订阅类型    |  描述                     |  需要验签       |    
------------------ |---------- |---------------------------- |--------------|
market.$contract_code.kline.$period                    | sub  | 订阅 KLine 数据               |       否      |
market.$contract_code.kline.$period                    | req  | 请求 KLine 数据               |       否      |
market.$contract_code.depth.$type                      | sub  | 订阅 Market Depth 数据        |       否      |
market.$contract_code.depth.size_${size}.high_freq     | sub  | 订阅 Market Depth增量推送数据 |       否      |
market.$contract_code.bbo                              | sub  | 买一卖一逐笔行情推送         |       否      |
market.$contract_code.detail                           | sub  | 订阅 Market detail 数据       |       否      |
market.$contract_code.trade.detail                     | req  | 请求 Trade detail 数据        |       否      |
market.$contract_code.trade.detail                     | sub  | 订阅 Trade Detail 数据        |       否      |

### 调用举例：
 - 请求的实例：
```
@Test
public void test1() throws URISyntaxException, InterruptedException {
    WssMarketReqHandle wssMarketReqHandle = new WssMarketReqHandle(URL, response -> {
        logger.info("请求 KLine 数据用户收到的原始数据:{}", response);
        MarketKLineReqResponse marketKLineReqResponse = JSON.parseObject(response, MarketKLineReqResponse.class);
        logger.info("请求 KLine 数据解析之后的数据为:{}", JSON.toJSON(marketKLineReqResponse));
    });
    while (true) {
        try {
            Date fromDate = DateUtils.parseDate("2020-10-22T00:00:00", "yyyy-MM-dd'T'HH:mm:ss");
            Date toDate = DateUtils.parseDate("2020-10-30T00:00:01", "yyyy-MM-dd'T'HH:mm:ss");            KLineSubRequest kLineSubRequest = KLineSubRequest.builder()
                    .req("market.BTC-USD.kline.60min")
                    .from(fromDate.getTime() / 1000)
                    .to(toDate.getTime() / 1000)
                    .build();
            wssMarketReqHandle.doReq(JSON.toJSONString(kLineSubRequest));       
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Thread.sleep(1000);
        }
    }
}
```
 - 订阅的实例：
```
@Test
public void test1() throws URISyntaxException, InterruptedException {
    List<String> channels = Lists.newArrayList();
    channels.add("market.BTC-USD.kline.1min");
    wssMarketHandle.sub(channels, response -> {
        logger.info("kLineEvent用户收到的数据===============:{}", JSON.toJSON(response));
        Long currentTimeMillis = System.currentTimeMillis();
        MarketKLineSubResponse event = JSON.parseObject(response, MarketKLineSubResponse.class);
        logger.info("kLineEvent的ts为：{},当前的时间戳为：{},时间间隔为：{}毫秒", event.getTs(), currentTimeMillis, currentTimeMillis - event.getTs());
    });
    Thread.sleep(Integer.MAX_VALUE);
}
```


## 资产交易类推送接口
此推送需要进行签名才可以订阅。订阅的目录：src/test/java/com/huobi/swqp/wss/WssNotificationSubTest.
 
 - 合约订阅地址：wss://api.hbdm.com/swap-notification   国内可以使用：wss://api.btcgateway.pro/swap-notification

 请求、订阅方法   |  订阅类型    |  描述                     |  需要验签       |    
------------------ |---------- |---------------------------- |--------------|
public.$contract_code.liquidation_orders               | sub  | 订阅强平订单数据（免鉴权）    |       否      |
public.$contract_code.funding_rate                     | sub  | 订阅资金费率变动数据（免鉴权）|       否      |
public.$contract_code.contract_info                    | sub  | 订阅合约信息变动数据（免鉴权）|       否      |
orders.$contract_code                                  | sub  | 订阅订单成交数据              |    是       |
accounts.$contract_code                                | sub  | 订阅资产变动数据              |    是       |
positions.$contract_code                               | sub  | 订阅持仓变动更新数据          |    是       |
matchOrders.$contract_code                             | sub  | 订阅撮合订单成交数据          |    是       |

### 注意事项
1、websocket构建签名与restful类似，websocket构造json请求数据时不需要URL编码。

2、更换请求的域名时，需将WssNotificationHandle类中的addAuth()方法里面的域名也一起替换掉。

### 调用举例
```
@Test
public void test1() throws URISyntaxException, InterruptedException {
    List<String> channels = Lists.newArrayList();
    channels.add("orders.*");
    channels.add("positions.*");
    channels.add("accounts.*");
    wssNotificationHandle.sub(channels, response -> {
        logger.info("用户收到的数据===============:{}", JSON.toJSON(response));
    });
    Thread.sleep(Integer.MAX_VALUE);
}
```