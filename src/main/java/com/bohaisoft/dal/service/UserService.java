/**
 * 
 */
package com.bohaisoft.dal.service;

import com.bohaisoft.dal.model.Stock;
import com.bohaisoft.dal.model.StockDTO;
import com.bohaisoft.dal.model.User;

import java.util.List;

/**
 * Class Name		: UserService<br>
 * 
 * Description		: 这里记述class说明<br>
 * 
 * @author liuhb
 * @version $Revision$
 * @see
 *
 */
public interface UserService {

    User getUserById(Long id);

    List<Stock> selectMerchantStockByMerchantId(Long merchantId);

    List<Stock> selectMerchantStockByMerchantIds(List<Long> merchantIds);

    List<Stock> getMerchantStocksByMap(Long merchantId);

    int updateStockNumByDto(StockDTO stockDTO);

    int insertStockNumByDto(StockDTO stockDTO);
}
