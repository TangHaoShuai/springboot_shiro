package com.example.springboot_shiro.bean.shiro;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 权限对应实体类
 */
@Data
@AllArgsConstructor
public class Permissions {
    private String id;
    private String permissionsName;
}
