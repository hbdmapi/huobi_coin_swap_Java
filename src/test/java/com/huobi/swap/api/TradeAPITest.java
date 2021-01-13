package com.huobi.swap.api;

import com.alibaba.fastjson.JSON;
import com.huobi.api.enums.DirectionEnum;
import com.huobi.api.enums.OffsetEnum;
import com.huobi.api.request.trade.*;
import com.huobi.api.response.trade.*;
import com.huobi.api.service.trade.TradeAPIServiceImpl;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@FixMethodOrder(MethodSorters.JVM)
public class TradeAPITest implements BaseTest {

    TradeAPIServiceImpl huobiAPIService = new TradeAPIServiceImpl("", "");

    @Test
    public void swapOrderRequest() {
        SwapOrderRequest request = SwapOrderRequest.builder()
                .contractCode("xrp-usd")
                .volume(1l)
                .price(BigDecimal.valueOf(0.2))
                .direction(DirectionEnum.BUY)
                .offset(OffsetEnum.OPEN)
                .leverRate(10)
                .orderPriceType("opponent")
                .tpTriggerPrice(BigDecimal.valueOf(0.296))
                .tpOrderPrice(BigDecimal.valueOf(0.296))
                .tpOrderPriceType("limit")
                .slTriggerPrice(BigDecimal.valueOf(0.1))
                .slOrderPrice(BigDecimal.valueOf(0.1))
                .slOrderPriceType("limit")
                .build();
        SwapOrderResponse response = huobiAPIService.swapOrderRequest(request);
        logger.debug("1合约下单：{}", JSON.toJSONString(response));
    }

    @Test
    public void swapBatchorderRequest() {
        List<SwapOrderRequest> list = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
        SwapOrderRequest request = SwapOrderRequest.builder()
                .contractCode("THETA-USD")
                .volume(1l)
                .price(BigDecimal.valueOf(0.677))
                .direction(DirectionEnum.SELL)
                .offset(OffsetEnum.OPEN)
                .leverRate(20)
                .orderPriceType("limit")
                .build();
        list.add(request);
         }
        SwapBatchorderRequest request = SwapBatchorderRequest.builder()
                .list(list)
                .build();
        SwapBatchorderResponse response =
                huobiAPIService.swapBatchorderRequest(request);
        logger.debug("2.合约批量下单：{}", JSON.toJSONString(response));
    }


    @Test
    public void swapCancelRequest() {
        SwapCancelRequest request = SwapCancelRequest.builder()
                .contractCode("theta-usd")
                .orderId("778677604210589696")
                //.clientOrderId("")
                .build();
        SwapCancelResponse response =
                huobiAPIService.swapCancelRequest(request);
        logger.debug("3.撤销订单：{}", JSON.toJSONString(response));
    }


    @Test
    public void swapCancelallRequest() {
        SwapCancelallRequest request = SwapCancelallRequest.builder()
                .contractCode("theta-usd")
                .build();
        SwapCancelallResponse response =
                huobiAPIService.swapCancelallRequest(request);
        logger.debug("4全部撤单：{}", JSON.toJSONString(response));
    }


    @Test
    public void swapOrderInfoRequest() {
        SwapOrderInfoRequest request = SwapOrderInfoRequest.builder()
                .contractCode("theta-USD")
                //.clientOrderId("")
                .orderId("778582198420418560")
                .build();
        SwapOrderInfoResponse response =
                huobiAPIService.swapOrderInfoRequest(request);
        logger.debug("5获取合约订单信息：{}", JSON.toJSONString(response));
    }


    @Test
    public void swapOrderDetailRequest() {
        SwapOrderDetailRequest request = SwapOrderDetailRequest.builder()
                .contractCode("theta-usd")
                .orderId(778582198420418560l)
                //.createdAt(System.currentTimeMillis())
                //.orderType(1)
                //.pageIndex(1)
                //.pageSize(20)
                .build();
        SwapOrderDetailResponse response =
                huobiAPIService.swapOrderDetailRequest(request);
        logger.debug("6.获取订单明细信息：{}", JSON.toJSONString(response));
    }


    @Test
    public void swapOpenordersRequest() {
        SwapOpenordersRequest request = SwapOpenordersRequest.builder()
                .contractCode("theta-usd")
                .pageIndex(1)
                .pageSize(20)
                .build();
        SwapOpenordersResponse response =
                huobiAPIService.swapOpenordersRequest(request);
        logger.debug("7.获取合约当前未成交委托：{}", JSON.toJSONString(response));
    }


    @Test
    public void swapHisordersRequest() {
        SwapHisordersRequest request = SwapHisordersRequest.builder()
                .contractCode("theta-usd")
                .tradeType(0)
                .type(1)
                .status(0)
                .createDate(10)
                .pageIndex(1)
                .pageSize(5)
                .sortBy("update_time")
                .build();
        SwapHisordersResponse response =
                huobiAPIService.swapHisordersRequest(request);
        logger.debug("8.获取合约历史委托：{}", JSON.toJSONString(response));
    }

    @Test
    public void swapMatchresultsRequest() {
        SwapMatchresultsRequest request = SwapMatchresultsRequest.builder()
                .contractCode("ada-usd")
                .tradeType(0)
                .createDate(90)
                .pageIndex(1)
                .pageSize(5)
                .build();
        SwapMatchresultsResponse response =
                huobiAPIService.swapMatchresultsRequest(request);
        logger.debug("9.获取历史成交记录：{}", JSON.toJSONString(response));
    }

    @Test
    public void swapLightningClosePositionRequest() {
        SwapLightningClosePositionRequest request = SwapLightningClosePositionRequest.builder()
                .contractCode("ada-usd")
                .direction("sell")
                .volume(1)
                .build();
        SwapLightningClosePositionResponse response =
                huobiAPIService.swapLightningClosePositionRequest(request);
        logger.debug("10.闪电平仓下单：{}", JSON.toJSONString(response));
    }

    @Test
    public void swapTriggerOrderRequest() {
        SwapTriggerOrderRequest request = SwapTriggerOrderRequest.builder()
                .contractCode("theta-usd")
                .triggerType("le")
                .triggerPrice(BigDecimal.valueOf(0.677))
                .orderPrice(BigDecimal.valueOf(0.677))
                .orderPriceType("limit")
                .volume(1l)
                .direction(DirectionEnum.BUY)
                .offset(OffsetEnum.OPEN)
                .leverRate(20)
                .build();
        SwapTriggerOrderResponse response = huobiAPIService.swapTriggerOrderResponse(request);
        logger.debug("11.计划委托下单：{}", JSON.toJSONString(response));
    }

    @Test
    public void swapTriggerCancelRequest() {
        SwapTriggerCancelRequest request = SwapTriggerCancelRequest.builder()
                .orderId("4699")
                .contractCode("theta-usd")
                .build();
        SwapTriggerCancelResponse response = huobiAPIService.swapTriggerCancelResponse(request);
        logger.debug("12.计划委托撤单：{}", JSON.toJSONString(response));
    }

    @Test
    public void swapTriggerCancelallRequest() {
        SwapTriggerCancelallRequest request = SwapTriggerCancelallRequest.builder()
                .contractCode("theta-usd")
                .build();
        SwapTriggerCancelallResponse response = huobiAPIService.swapTriggerCancelallResponse(request);
        logger.debug("13.计划委托全部撤单：{}", JSON.toJSONString(response));
    }

    @Test
    public void swapTriggerOpenordersRequest() {
        SwapTriggerOpenordersRequest request = SwapTriggerOpenordersRequest.builder()
                .contractCode("btc-usd")
                .pageIndex(1)
                .pageSize(10)
                .build();
        SwapTriggerOpenordersResponse response = huobiAPIService.swapTriggerOpenordersResponse(request);
        logger.debug("14.获取计划委托当前委托：{}", JSON.toJSONString(response));

    }

    @Test
    public void swapTriggerHisordersRequest() {
        SwapTriggerHisordersRequest request = SwapTriggerHisordersRequest.builder()
                .tradeType(0)
                .status("0")
                .createDate(10)
                .contractCode("btc-usd")
                .pageIndex(1)
                .pageSize(1)
                .sortBy("update_time")
                .build();
        SwapTriggerHisordersResponse response = huobiAPIService.swapTriggerHisordersResponse(request);
        logger.debug("15.获取计划委托历史委托：{}", JSON.toJSONString(response));
    }

    @Test
    public void swapSwitchLeverRateRequest(){
        SwapSwitchLeverRateResponse response=huobiAPIService.swapSwitchLeverRateResponse("ADA-USD",30);
        logger.debug("16.切换杠杆：{}", JSON.toJSONString(response));
    }

    @Test
    public void swapHisordersExact(){
        SwapHisordersExectRequest request=SwapHisordersExectRequest.builder()
                .contractCode("theta-usd")
                .tradeType(0)
                .type(1)
                .status("0")
                .orderPriceType("post_only")
                //.startTime()
                //.endTime()
                //.fromId()
                //.size()
                //.direct()
                .build();
        SwapHisordersExactResponse response=huobiAPIService.swapHisordersExactResponse(request);
        logger.debug("17.组合查询合约历史委托：{}", JSON.toJSONString(response));
    }

    @Test
    public void swapMatchresultsExact(){
        SwapMatchresultsExactRequest request=SwapMatchresultsExactRequest.builder()
                .contractCode("theta-usd")
                .tradeType(0)
                //.startTime()
                //.endTime()
                //.fromId()
                //.size()
                //.direct()
                .build();
        SwapMatchresultsExactResponse response=huobiAPIService.swapMatchresultsExactResponse(request);
        logger.debug("18.组合查询用户历史成交记录：{}", JSON.toJSONString(response));
    }

    @Test
    public void swapTpslOrderRequest(){
        SwapTpslOrderRequest request= SwapTpslOrderRequest.builder()
                .contractCode("xrp-usd")
                .direction("sell")
                .volume(BigDecimal.valueOf(1))
                .tpTriggerPrice(BigDecimal.valueOf(0.5))
                .tpOrderPrice(BigDecimal.valueOf(0.5))
                .tpOrderPriceType("limit")
                .slTriggerPrice(BigDecimal.valueOf(0.2))
                .slOrderPrice(BigDecimal.valueOf(0.2))
                .slOrderPriceType("limit")
                .build();
        SwapTpslOrderResponse response=huobiAPIService.swapTpslOrderResponse(request);
        logger.debug("19.对仓位设置止盈止损订单：{}", JSON.toJSONString(response));
    }


    @Test
    public void swapTpslCancelRequest(){
        SwapTpslCancelRequest request= SwapTpslCancelRequest.builder()
                .contractCode("xrp-usd")
                .orderId("798933220753608704,798593423673294823")
                .build();
        SwapTpslCancelResponse response=huobiAPIService.swapTpslCancelResponse(request);
        logger.debug("20.止盈止损订单撤单：{}", JSON.toJSONString(response));
    }

    @Test
    public void swapTpslCancelallRequest(){
        SwapTpslCancelallRequest request= SwapTpslCancelallRequest.builder()
                .contractCode("xrp-usd")
                .build();
        SwapTpslCancelallResponse response=huobiAPIService.swapTpslCancelallResponse(request);
        logger.debug("21.止盈止损订单全部撤单：{}", JSON.toJSONString(response));
    }

    @Test
    public void swapTpslOpenorderRequest(){
        SwapTpslOpenordersRequest request= SwapTpslOpenordersRequest.builder()
                .contractCode("xrp-usd")
                .pageIndex(1)
                .pageSize(20)
                .build();
        SwapTpslOpenordersResponse response=huobiAPIService.swapTpslOpenordersResponse(request);
        logger.debug("22.查询止盈止损订单当前委托：{}", JSON.toJSONString(response));

    }

    @Test
    public void swapTpslHisordersRequest(){
        SwapTpslHisordersRequset requset= SwapTpslHisordersRequset.builder()
                .contractCode("xrp-usd")
                .status("0")
                .createDate(10l)
                .pageIndex(1)
                .pageSize(20)
                .sortBy("update_time")
                .build();
        SwapTpslHisordersResponse response=huobiAPIService.swapTpslHisordersResponse(requset);
        logger.debug("23.查询止盈止损订单历史委托：{}", JSON.toJSONString(response));
    }

    @Test
    public void swapRelationTpslOrder(){
        SwapRelationTpslOrderRequest request= SwapRelationTpslOrderRequest.builder()
                .contractCode("xrp-usd")
                .orderId(798931252656209920l)
                .build();
        SwapRelationTpslOrderResponse response=huobiAPIService.swapRelationTpslOrderResponse(request);
        logger.debug("24.查询开仓单关联的止盈止损订单详情：{}", JSON.toJSONString(response));
    }


}
