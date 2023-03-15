package com.macro.mall.portal.domain;

import com.macro.mall.model.UmsMember;
import com.macro.mall.model.UmsMemberLevel;
import lombok.Data;

/**
 * @author ：杨过
 * @date ：Created in 2020/1/6 21:12
 * @version: V1.0
 * @slogan: 天下风云出我辈，一入代码岁月催
 * @description:
 **/
@Data
public class PortalMemberInfo extends UmsMember {
    private UmsMemberLevel umsMemberLevel;
}
