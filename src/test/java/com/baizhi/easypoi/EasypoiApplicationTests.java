package com.baizhi.easypoi;


import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import com.baizhi.easypoi.entity.Admin;
import com.baizhi.easypoi.entity.Emp;
import com.baizhi.easypoi.entity.User;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
public class EasypoiApplicationTests {

    @Test
    public void contextLoads() {

        List<Admin> admins = new ArrayList<Admin>();

        List<User> users = new ArrayList<>();
        User u1 = new User("1", "小黑", "123456", new Date(), "1");
        User u2 = new User("2", "小花", "123456", new Date(), "2");
        users.add(u1);
        users.add(u2);

        Emp aa = new Emp("1", "aa");
        Emp bb = new Emp("2", "bb");


        Admin admin1 = new Admin("D:\\idea\\source\\maven\\easypoi\\src\\main\\webapp\\img\\0.jpg", "1", "大黑", "123456", users, aa);
        Admin admin2 = new Admin("D:\\idea\\source\\maven\\easypoi\\src\\main\\webapp\\img\\1.jpg", "2", "大花", "123456", users, bb);
        admins.add(admin1);
        admins.add(admin2);
        Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams("管理员表", "管理员"), Admin.class, admins);
        try {
            workbook.write(new FileOutputStream("D:/easypoi.xls"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
