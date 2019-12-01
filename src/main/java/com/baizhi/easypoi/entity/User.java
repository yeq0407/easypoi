package com.baizhi.easypoi.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Excel(name = "编号")
    private String id;
    @Excel(name = "姓名")
    private String name;
    @Excel(name = "密码")
    private String password;
    @Excel(name = "生日", format = "yyyy-MM-dd", width = 20)
    private Date bir;
    @Excel(name = "性别", replace = {"男_1", "女_2"})
    private String sex;
}
