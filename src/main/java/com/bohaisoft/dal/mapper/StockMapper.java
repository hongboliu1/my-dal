package com.bohaisoft.dal.mapper;

import com.bohaisoft.dal.model.Stock;
import com.bohaisoft.dal.model.StockDTO;

import java.util.List;
import java.util.Map;

/**
 * Created by liuhb on 2017/1/18.
 */
public interface StockMapper {

    List<Stock> selectMerchantStockByMerchantId(StockDTO stockDTO);

    List<Stock> selectMerchantStockByMerchantIds(List<StockDTO> stockDTOs);

    List<Stock> getMerchantStocksByMap(Map<String,Long> merchantMaps);

    int updateStockNumByDto(StockDTO stockDTO);

    int insertStockNumByDto(StockDTO stockDTO);

}
