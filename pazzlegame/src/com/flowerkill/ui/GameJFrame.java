package com.flowerkill.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {

    //创建二维数组
    //目的：用来管理数据
    //加载的时候用来初始化图片
    int[][] data = new int[4][4];
    //记录空白方块在二维数组中的位置
    int x = 0;
    int y = 0;
    //定义一个变量，记录当前展示图片的路径
    String path = "pazzlegame\\image\\animal\\animal3\\";

    //定义一个二维数组，储存正确的数据
    int[][] win = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };

    //定义变量用来统计步数
    int step = 0;
    //创建选项下面的条目对象

    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");


    JMenuItem accountItem = new JMenuItem("公众号");

    public GameJFrame() {

        //初始化界面
        initJFrame();

        //初始化菜单
        initJMenuBar();

        //初始化数据
        initData();

        //初始化图片
        initImage();


        //让界面显示出来，建议写在最后
        setVisible(true);

    }


    //初始化数据
    private void initData() {
        //1.定义一个一维数组
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        //2.打乱数组中的数据的顺序
        //遍历数组，得到每一个元素，拿着每一个元素跟随机索引上的数据进行交换
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            //获取到随机索引
            int index = r.nextInt(tempArr.length);
            //拿着遍历的每一个数据，跟随机索引上的数据进行交换
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;

        }

        //3.给二维数组添加数据
        //遍历一维数组tempArr得到每一个元素，把每一个元素依次添加到二维数组当中
        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] == 0) {
                x = i / 4;
                y = i % 4;
            }
            data[i / 4][i % 4] = tempArr[i];


        }


    }

    //初始化图片
    //添加图片的时候，就需要按照二维数组中管理的数据添加图片
    private void initImage() {
        //清空原本已经出现的所有图片
        this.getContentPane().removeAll();
        if (victory()) {
            //显示胜利的图片
            JLabel winJLabel = new JLabel(new ImageIcon("D:\\Desktop\\java\\pazzlegame\\image\\win.png"));
            winJLabel.setBounds(203, 283, 197, 73);
            this.getContentPane().add(winJLabel);

        }
        JLabel setpCount = new JLabel("步数：" + step);
        setpCount.setBounds(50, 30, 100, 20);
        this.getContentPane().add(setpCount);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //获取当前要加载图片的序号
                int num = data[i][j];
                //创建一个JLable的对象（管理容器）
                JLabel jLabel = new JLabel(new ImageIcon(path + num + ".jpg"));
                //指定图片位置
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                //给图片添加边框
                jLabel.setBorder(new BevelBorder(1));
                //把管理容器添加到界面中
                this.getContentPane().add(jLabel);

            }

        }
        //添加背景图片
        JLabel background = new JLabel(new ImageIcon("pazzlegame\\image\\background.png"));
        background.setBounds(40, 40, 508, 560);
        //把背景图片添加到界面中
        this.getContentPane().add(background);

        //刷新一下界面
        this.getContentPane().repaint();

    }

    private void initJMenuBar() {
        //初始化菜单
        //创建整个的菜单对象
        JMenuBar jMenuBar = new JMenuBar();

        //创建菜单上面的两个对象 （功能 关于我们）
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");


        //将每一个选项下面的条目添加到选项当中
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        //给条目绑定事件
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);

        //将菜单里面的两个选项添加到菜单当中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //给整个界面设置菜单
        setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        //设置界面的宽高
        setSize(603, 680);
        //设置界面的标题
        setTitle("拼图单机版 v1.0");
        //设置界面置顶
        setAlwaysOnTop(true);
        //设置界面居中
        setLocationRelativeTo(null);
        //设置关闭模式
        setDefaultCloseOperation(3);

        //取消默认的居中放置，只有取消了才会按照XY轴的形式添加组件
        this.setLayout(null);
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //按下不送时会调用这个方法
    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == 65) {
            //把界面中的左右图片全部删除
            this.getContentPane().removeAll();
            //加载第一张完整的图片
            JLabel all = new JLabel(new ImageIcon("pazzlegame\\image\\animal\\animal3\\" + "all.jpg"));
            all.setBounds(83, 134, 420, 420);
            this.getContentPane().add(all);
            //添加背景图片
            JLabel background = new JLabel(new ImageIcon("pazzlegame\\image\\background.png"));
            background.setBounds(40, 40, 508, 560);
            //把背景图片添加到界面中
            this.getContentPane().add(background);
            //刷新页面
            this.getContentPane().repaint();
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (victory()) {
            return;
        }
        //对上，下，左，右进行判断
        //左：37，上：38，右：39，下：40
        int code = e.getKeyCode();
        if (code == 37) {
            if (y == 3) {
                //表示空白方块已经在最右方了，他的右面没有图片能在移动了
                return;
            }
            data[x][y] = data[x][y + 1];
            data[x][y + 1] = 0;
            y++;
            step++;
            initImage();

        } else if (code == 38) {
            if (x == 3) {
                //表示空白方块已经在最下方了，他的下面没有图片能在移动了
                return;
            }
            data[x][y] = data[x + 1][y];
            data[x + 1][y] = 0;
            x++;
            step++;
            initImage();

        } else if (code == 39) {
            if (y == 0) {
                //表示空白方块已经在最左方了，他的左面没有图片能在移动了
                return;
            }
            data[x][y] = data[x][y - 1];
            data[x][y - 1] = 0;
            y--;
            step++;

            initImage();
        } else if (code == 40) {
            if (x == 0) {
                //表示空白方块已经在最上方了，他的上面没有图片能在移动了
                return;
            }
            data[x][y] = data[x - 1][y];
            data[x - 1][y] = 0;
            x--;
            step++;

            initImage();
        } else if (code == 65) {
            initImage();
        } else if (code == 87) {
            data = win;
            x = 3;
            y = 3;
            initImage();
        }

    }

    //判断data数组中的数据是否跟win 数组中的相同
    //如果全部相同就返回 true 否则返回 false
    public boolean victory() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != win[i][j]) {
                    //只要有一个数据不一样，则返回false
                    return false;
                }

            }

        }
        //循环结束表示遍历比较完毕，全部一样返回true
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == replayItem) {
            //计步器清零
            step = 0;
            //再次打乱二维数组中的数据
            initData();

            //重新加载图片
            initImage();

        } else if (obj == reLoginItem) {
            //返回登录界面
            this.setVisible(false);
            //打开登录界面
            new LoginJFrame();

        } else if (obj == closeItem) {
            //直接关闭游戏
            System.exit(0);

        } else if (obj == accountItem) {
            //创建一个弹框对象
            JDialog jDialog = new JDialog();
            JLabel jLabel = new JLabel(new ImageIcon("pazzlegame\\image\\about.png"));
            jLabel.setBounds(0, 0, 258, 258);
            jDialog.getContentPane().add(jLabel);
            jDialog.setSize(344, 344);
            jDialog.setAlwaysOnTop(true);
            jDialog.setLocationRelativeTo(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
        }
    }
}

