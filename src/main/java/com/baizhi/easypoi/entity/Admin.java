package com.baizhi.easypoi.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelCollection;
import cn.afterturn.easypoi.excel.annotation.ExcelEntity;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ExcelTarget(value = "管理员")
public class Admin {
    @Excel(name = "头像", type = 2, width = 20, height = 10)
    private String imgUrl;
    @Excel(name = "编号", needMerge = true)
    private String id;
    @Excel(name = "姓名", needMerge = true)
    private String name;
    @Excel(name = "密码", needMerge = true)
    private String password;
    @ExcelCollection(name = "所有用户", orderNum = "11")
    private List<User> users;
    @ExcelEntity(name = "一对一")
    private Emp emp;
}
