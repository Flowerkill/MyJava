package com.flowerkill.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    public LoginJFrame() {
        this.setSize(488, 430);
        //设置界面的标题
        setTitle("拼图 登录");
        //设置界面置顶
        setAlwaysOnTop(true);
        //设置界面居中
        setLocationRelativeTo(null);
        //设置关闭模式
        setDefaultCloseOperation(3);
        //让界面显示出来，建议写在最后
        setVisible(true);
    }
}
