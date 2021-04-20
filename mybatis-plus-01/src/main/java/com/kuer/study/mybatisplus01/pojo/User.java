package com.kuer.study.mybatisplus01.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;

/**
 * @author kuer
 */
@Data
public class User implements Serializable {

    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private String name;

    private String password;

    @TableLogic
    private Integer deleted;
}
