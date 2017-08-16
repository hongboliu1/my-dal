/**
 * 
 */
package com.bohaisoft.dal.mapper;

import com.bohaisoft.dal.model.User;
import com.bohaisoft.dal.util.DataSource;
import com.bohaisoft.dal.util.DataSourceUtils;

/**
 * Class Name		: UserMapper<br>
 * 
 * Description		: 这里记述class说明<br>
 * 
 * @author liuhb
 * @version $Revision$
 * @see
 *
 */
public interface UserMapper {

    User getUserById(Long id);


    User getMasterUserById(Long id);
}
