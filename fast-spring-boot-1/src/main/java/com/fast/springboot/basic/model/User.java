package com.fast.springboot.basic.model;

import com.fast.springboot.basic.annotation.EncryptResponseFieldParam;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author bowen.yan
 * @date 2018-11-16
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @EncryptResponseFieldParam
    private String userName;
    @EncryptResponseFieldParam
    private String password;
    private String mobile;
    private Address address;
}