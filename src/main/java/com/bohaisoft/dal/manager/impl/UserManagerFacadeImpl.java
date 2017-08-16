/**
 *
 */
package com.bohaisoft.dal.manager.impl;

import com.bohaisoft.dal.manager.UserManagerFacade;
import com.bohaisoft.dal.mapper.UserMapper;
import com.bohaisoft.dal.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Class Name		: UserManagerImpl<br>
 * <p>
 * Description		: 这里记述class说明<br>
 *
 * @author liuhb
 * @version $Revision$
 * @see
 */
@Service("UserManagerFacade")
public class UserManagerFacadeImpl implements UserManagerFacade {

    @Resource
    private UserMapper userMapper;

    @Override
    public User getUserById(Long id) {
        return userMapper.getUserById(id);
    }
}
