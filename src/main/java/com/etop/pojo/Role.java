package com.etop.pojo;

import com.etop.basic.entity.BaseEntity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Jeremie on 2014/10/1.
 */

@Entity
@Table(name = "t_role")
public class Role extends BaseEntity {

    private String rolename;
    private Set<Permission> permissionList;
    private Set<User> userList;

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    @OneToMany(targetEntity = Permission.class, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "t_role_permission", joinColumns = {@JoinColumn(name = "role_id")}, inverseJoinColumns = {@JoinColumn(name = "permission_id")})
    public Set<Permission> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(Set<Permission> permissionList) {
        this.permissionList = permissionList;
    }

    @ManyToMany(targetEntity = com.etop.pojo.User.class, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "t_user_role", joinColumns = {@JoinColumn(name = "role_id")}, inverseJoinColumns = {@JoinColumn(name = "user_id")})
    public Set<User> getUserList() {
        return userList;
    }

    public void setUserList(Set<User> userList) {
        this.userList = userList;
    }

    @Transient
    public Set<String> getPermissionsName() {
        Set<String> list = new HashSet<>();
        Set<Permission> perlist = getPermissionList();
        for (Permission per : perlist) {
            list.add(per.getPermissionname());
        }
        return list;
    }

    private class User {
    }
}