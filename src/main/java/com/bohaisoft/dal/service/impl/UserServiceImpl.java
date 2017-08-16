/**
 *
 */
package com.bohaisoft.dal.service.impl;

import com.bohaisoft.dal.manager.UserManagerFacade;
import com.bohaisoft.dal.mapper.PanMapper;
import com.bohaisoft.dal.mapper.StockMapper;
import com.bohaisoft.dal.model.Pan;
import com.bohaisoft.dal.model.Stock;
import com.bohaisoft.dal.model.StockDTO;
import com.bohaisoft.dal.model.User;
import com.bohaisoft.dal.service.UserService;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.map.HashedMap;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.STColID;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Class Name : UserServiceImpl<br>
 * <p>
 * Description : 这里记述class说明<br>
 *
 * @author liuhb
 * @version $Revision$
 * @see
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserManagerFacade userManagerFacade;
    @Resource
    private PanMapper panMapper;
    @Resource
    private StockMapper stockMapper;

    @Override
    public User getUserById(Long id) {
        Pan pan = panMapper.getPanById("48b2b0884b67162d0898c143291ddb37");
        System.out.println(pan.getFileid());
        return userManagerFacade.getUserById(id);
    }

    @Override
    public List<Stock> selectMerchantStockByMerchantId(Long merchantId) {
        StockDTO dto = new StockDTO();
        dto.setMerchantId(merchantId);
        return stockMapper.selectMerchantStockByMerchantId(dto);
    }

    @Override
    public List<Stock> selectMerchantStockByMerchantIds(List<Long> merchantIds) {
        List<StockDTO> stockDTOs = Collections.EMPTY_LIST;
        List<Stock> result = Collections.emptyList();
        if (CollectionUtils.isNotEmpty(merchantIds)) {
            stockDTOs = new ArrayList<>(merchantIds.size());
            for (Long merchantId : merchantIds) {
                StockDTO dto = new StockDTO();
                dto.setMerchantId(merchantId);
                stockDTOs.add(dto);
            }
            result = stockMapper.selectMerchantStockByMerchantIds(stockDTOs);
        }
        return result;
    }

    @Override
    public List<Stock> getMerchantStocksByMap(Long merchantId) {
        Map<String,Long> param = new HashedMap<>(1);
        param.put("merchantId",merchantId);
        return stockMapper.getMerchantStocksByMap(param);
    }

    @Override
    public int updateStockNumByDto(StockDTO stockDTO) {
        return stockMapper.updateStockNumByDto(stockDTO);
    }

    @Override
    public int insertStockNumByDto(StockDTO stockDTO) {
        stockMapper.insertStockNumByDto(stockDTO);
        StockDTO dto = new StockDTO();
        dto.setMerchantId(10009L);
        dto.setProductId(10011L);
        dto.setStockNum(132L);
        return stockMapper.insertStockNumByDto(dto);
    }
}
