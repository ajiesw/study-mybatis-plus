package com.kuer.study.mybatisplus01.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

/**
 * 数据自动填充处理
 * @author kuer
 */
@Slf4j
@Component
public class MyMateObjectHandler implements MetaObjectHandler {
    /**
     * 插入时填充策略
     * @param metaObject
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        // 根据属性名称设置属性值
        setFieldValByName("name", "wkj", metaObject);

    }
    /**
     * 更新时填充策略
     * @param metaObject
     */
    @Override
    public void updateFill(MetaObject metaObject) {

    }
}
