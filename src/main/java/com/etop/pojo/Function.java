package com.etop.pojo;

import com.etop.basic.entity.BaseEntity;

import javax.persistence.*;

/**
 * Created by Jeremie on 2014/10/1.
 */
@Entity
@Table(name = "t_function")
public class Function extends BaseEntity {

    private String value;
    private Permission permission;
    private Role role;
    private String type;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @OneToOne
    @JoinColumn(name = "permission_id")
    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }

    @OneToOne
    @JoinColumn(name = "role_id")
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
