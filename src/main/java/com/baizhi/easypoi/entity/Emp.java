package com.baizhi.easypoi.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {

    @Excel(name = "编号", needMerge = true)
    private String id;
    @Excel(name = "姓名", needMerge = true)
    private String name;
}
