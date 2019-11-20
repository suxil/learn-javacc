package com.learn.javacc.rsql.asm.node;

/**
 * <p> Title: 标题 </p>
 * <pre> Description: 描述 </pre>
 * date: 2019/11/19 21:12
 * <p>
 * Copyright: © 2012-2019 CSG. All rights reserved.
 * Company: CSG
 *
 * @author lu_it:1300815418@qq.com
 * @version V1.0
 * @Package com.learn.javacc.rsql
 */
public enum  ConditionSymbol {

    OR(","),
    AND(";");

    private final String condition;

    ConditionSymbol(String condition) {
        this.condition = condition;
    }

    public String toString() {
        return condition;
    }

}