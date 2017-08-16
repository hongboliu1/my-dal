/**
 *
 */
package com.bohaisoft.dal.manager;

import com.bohaisoft.dal.model.User;

/**
 * Class Name		: UserManager<br>
 * <p>
 * Description		: 这里记述class说明<br>
 *
 * @author liuhb
 * @version $Revision$
 * @see
 */
public interface UserManagerFacade {

    User getUserById(Long id);
}
