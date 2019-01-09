package cn.hhfarcry.entity;



import javax.persistence.*;

/**
 * @program: springbootjpa
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-01-07 17:33
 */
@Entity
@Table(name="t_user")
public class UserEntity {

    public UserEntity() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String name;

    public UserEntity(String name) {
        this.name = name;
    }

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

