/**
 * 
 */
package com.bohaisoft.dal.model;

import java.io.Serializable;

/**
 * Class Name		: User<br>
 * 
 * Description		: 这里记述class说明<br>
 * 
 * @author liuhb
 * @version $Revision$
 * @see
 *
 */
public class User implements Serializable {

    private static final long serialVersionUID = 3128798421782862065L;

    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
