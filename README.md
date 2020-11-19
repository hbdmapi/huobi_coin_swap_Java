# **Installation**

  1.Install library into your Maven's local repository by running mvn install
  
  2.Add the following Maven dependency to your project's pom.xml:
  
    <dependency>
         <groupId>com.huobi.coin.margined.swap.api</groupId>
         <artifactId>huobi-coin.margined-swap-api</artifactId>
         <version>1.0.0</version>
    </dependency>
    
  3.Install Lombok Plugin  
    
    
    

# **Examples**  

  接口分为三大类：
  
     1.合约市场行情接口   --测试类放在包com.huobi.swap.api.MarketAPITest 下
     2.合约资产接口      --测试类放在包com.huobi.swap.api.AccountAPITest 下
     3.合约交易接口      --测试类放在包com.huobi.swap.api.TradeAPITest 下
     
     
     
  调用举例：
  
  1.获取合约信息  
    
    测试类是com.huobi.swap.api.MarketAPITest类的getSwapContractInfo()方法
    HuobiAPIServiceImpl huobiAPIService = new HuobiAPIServiceImpl("", "");
    @Test
    public void getSwapContractInfo() {
        SwapContractInfoResponse result =
                huobiAPIService.getSwapContractInfo("BTC-USD");
        logger.debug("1.获取合约信息：{}", JSON.toJSONString(result));
    }
    
    
    
  2.获取用户账户信息   
    
    测试类是com.huobi.swap.api.AccountAPITest类的getSwapAccountInfoResponse()方法 
    //填写申请的API-KEY 和 SECRET
    HuobiAPIServiceImpl huobiAPIService = new HuobiAPIServiceImpl("API-KEY", "SECRET");
    @Test
    public void getSwapAccountInfoResponse() {
        SwapAccountInfoResponse response = huobiAPIService.getSwapAccountInfo("theta-usd");
        logger.debug("1.获取用户账户信息：{}", JSON.toJSONString(response));
    }
    
  3.币本位永续下单
    
    测试类是com.huobi.swap.api.TradeAPITest类的swapOrderRequest()方法
    //填写申请的API-KEY 和 SECRET   
    HuobiAPIServiceImpl huobiAPIService = new HuobiAPIServiceImpl("API-KEY", "SECRET");
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
     
     
     
      

  
  
    