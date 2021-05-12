package com.huobi.api.service.trade;

import com.huobi.api.request.trade.*;
import com.huobi.api.response.trade.*;

public interface TradeAPIService {
    SwapOrderResponse swapOrderRequest(SwapOrderRequest request);//合约下单

    SwapBatchorderResponse swapBatchorderRequest(SwapBatchorderRequest request);//合约批量下单

    SwapCancelResponse swapCancelRequest(SwapCancelRequest request);//撤销订单

    SwapCancelallResponse swapCancelallRequest(SwapCancelallRequest request);//全部撤单

    SwapOrderInfoResponse swapOrderInfoRequest(SwapOrderInfoRequest request);//获取合约订单信息


    SwapOrderDetailResponse swapOrderDetailRequest(SwapOrderDetailRequest request);//获取订单明细信息

    SwapOpenordersResponse swapOpenordersRequest(SwapOpenordersRequest request);//获取合约当前未成交委托

    SwapHisordersResponse swapHisordersRequest(SwapHisordersRequest request);//获取合约历史委托

    SwapMatchresultsResponse swapMatchresultsRequest(SwapMatchresultsRequest request);//获取历史成交记录

    SwapLightningClosePositionResponse swapLightningClosePositionRequest(SwapLightningClosePositionRequest request);//闪电平仓下单

    SwapTriggerOrderResponse swapTriggerOrderResponse(SwapTriggerOrderRequest request);//计划委托下单

    SwapTriggerCancelResponse swapTriggerCancelResponse(SwapTriggerCancelRequest request);//计划委托撤单

    SwapTriggerCancelallResponse swapTriggerCancelallResponse(SwapTriggerCancelallRequest request);//计划委托合部撤单

    SwapTriggerOpenordersResponse swapTriggerOpenordersResponse(SwapTriggerOpenordersRequest request);//获取计划委托当前委托

    SwapTriggerHisordersResponse swapTriggerHisordersResponse(SwapTriggerHisordersRequest request);//获取计划委托历史委托

    SwapSwitchLeverRateResponse swapSwitchLeverRateResponse(String contractCdoe,Integer leverRate);//切换杠杆

    SwapHisordersExactResponse swapHisordersExactResponse(SwapHisordersExectRequest request);//组合查询合约历史委托

    SwapMatchresultsExactResponse swapMatchresultsExactResponse(SwapMatchresultsExactRequest request);//组合查询用户历史成交记录

    SwapTpslOrderResponse swapTpslOrderResponse(SwapTpslOrderRequest request);

    SwapTpslCancelResponse swapTpslCancelResponse(SwapTpslCancelRequest request);

    SwapTpslCancelallResponse swapTpslCancelallResponse(SwapTpslCancelallRequest request);

    SwapTpslOpenordersResponse swapTpslOpenordersResponse(SwapTpslOpenordersRequest request);

    SwapTpslHisordersResponse swapTpslHisordersResponse(SwapTpslHisordersRequset request);

    SwapRelationTpslOrderResponse swapRelationTpslOrderResponse(SwapRelationTpslOrderRequest request);

    SwapTrackOrderResponse swapTrackOrderResponse(SwapTrackOrderRequest request);

    SwapTrackCancelResponse swapTrackCancelResponse(SwapTrackCancelRequest request);

    SwapTrackCancelallResponse swapTrackCancelallResponse(SwapTrackCancelallRequest request);

    SwapTrackOpenordersResponse swapTrackOpenordersResponse(SwapTrackOpenordersRequest request);

    SwapTrackHisordersResponse swapTrackHisordersResponse(SwapTrackHisordersRequest request);
}
