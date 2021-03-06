/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parashar.e2e.dto;

import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 *
 * @author parashar
 */
@ToString(includeFieldNames=true)
@Data
@AllArgsConstructor
public class EncryptionSpec {
    @NotNull
    private String xml;
    @NotNull
    private String sessionKey;
    @NotNull
    private String xoredNonce;
   
}
