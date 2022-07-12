/**
 * Copyright 2022 XYZ Co., Ltd. All Rights Reserved
 */
package cn.muses.design.web.vo;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

import cn.muses.design.component.mask.DataMasking;
import cn.muses.design.component.mask.DataMaskingFunc;

/**
 * @author jervis
 * @date 2022/7/12.
 */
public class UserVO implements Serializable {
    private static final long serialVersionUID = 8089038268625216718L;

    public String name;
    public String mobile;

    @DataMasking(DataMaskingFunc.ALL_MASK)
    public String cardNo;

    public UserVO(String name, String mobile, String cardNo) {
        this.name = name;
        this.mobile = mobile;
        this.cardNo = cardNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
            .append("name", name)
            .append("mobile", mobile)
            .append("cardNo", cardNo)
            .toString();
    }
}
