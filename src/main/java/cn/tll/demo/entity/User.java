package cn.tll.demo.entity;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


/**
 * @author tll
 * @date 2020/04/21、
 * Date自动get set hash  toString
 */
@Data
@Table(name = "t_user")
public class User {

    /**
     * id 主键 自增长
     */
    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别 1 男  2 女
     */
    private Integer sex;

    /**
     *出生日期
     */
    private Date birthday;

    /**
     * 备注
     */
    private String remark;

    /**
     *创建时间
     */
    private Date createtime;

    /**
     * 更新时间
     */
    private Date modifytime;
}
