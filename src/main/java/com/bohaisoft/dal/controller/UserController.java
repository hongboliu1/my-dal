/**
 * 
 */
package com.bohaisoft.dal.controller;

import com.bohaisoft.dal.model.Stock;
import com.bohaisoft.dal.model.StockDTO;
import com.bohaisoft.dal.model.User;
import com.bohaisoft.dal.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Class Name		: UserController<br>
 * 
 * Description		: 这里记述class说明<br>
 * 
 * @author liuhb
 * @version $Revision$
 * @see
 *
 */
@Controller
@RequestMapping(value = "/dal")
public class UserController {
    
    @Resource private UserService       userService;
    
    @RequestMapping(method={RequestMethod.GET,RequestMethod.POST} ,value="/getUserById")
    @ResponseBody
    public User getUserById(Long id) {
        return userService.getUserById(id);
    }

    @RequestMapping(method = {RequestMethod.GET,RequestMethod.POST},value = "/getMerchantStock")
    @ResponseBody
    public List<Stock> getMerchantStock(Long merchantId) {
        return userService.selectMerchantStockByMerchantId(merchantId);
    }

    @RequestMapping(method = {RequestMethod.GET,RequestMethod.POST},value = "/getMerchantStocks")
    @ResponseBody
    public List<Stock> getMerchantStocks() {
        List<Long> merchantIds = new ArrayList<>();
        merchantIds.add(10000L);
        merchantIds.add(10003L);
        return userService.selectMerchantStockByMerchantIds(merchantIds);
    }

    @RequestMapping(method = {RequestMethod.GET,RequestMethod.POST},value = "/getMerchantStocksByMap")
    @ResponseBody
    public List<Stock> getMerchantStocksByMap(Long merchantId) {
        return userService.getMerchantStocksByMap(merchantId);
    }

    @RequestMapping(method = {RequestMethod.GET,RequestMethod.POST},value = "/updateStockNumByDto")
    @ResponseBody
    public int updateStockNumByDto(StockDTO stockDTO) {
        return userService.updateStockNumByDto(stockDTO);
    }

    @RequestMapping(method = {RequestMethod.GET,RequestMethod.POST},value = "/insertStockNumByDto")
    @ResponseBody
    public int insertStockNumByDto(StockDTO stockDTO) {
        return userService.insertStockNumByDto(stockDTO);
    }
}
