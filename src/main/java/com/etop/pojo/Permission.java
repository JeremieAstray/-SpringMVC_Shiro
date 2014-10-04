package com.etop.pojo;

import com.etop.basic.entity.BaseEntity;

import javax.persistence.*;

/**
 * Created by Jeremie on 2014/10/1.
 */

@Entity
@Table(name = "t_permission")
public class Permission extends BaseEntity {

    private String permissionname;
    private Role role;

    public String getPermissionname() {
        return permissionname;
    }

    public void setPermissionname(String permissionname) {
        this.permissionname = permissionname;
    }

    @ManyToOne(targetEntity = Role.class)
    @JoinTable(name = "t_role_permission", joinColumns = {@JoinColumn(name = "permission_id")}, inverseJoinColumns = {@JoinColumn(name = "role_id")})
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

}