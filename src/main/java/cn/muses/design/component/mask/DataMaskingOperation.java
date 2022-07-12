/**
 * Copyright 2022 XYZ Co., Ltd. All Rights Reserved
 */
package cn.muses.design.component.mask;

/**
 * @author jervis
 * @date 2022/7/12.
 */
public interface DataMaskingOperation {

    String MASK_CHAR = "*";

    String mask(String content, String maskChar);
}
