package Java实验;/*
 * Created by JFormDesigner on Sun Nov 20 09:55:27 CST 2022
 */

import java.awt.event.*;
import java.io.*;
import java.awt.*;
import java.io.IOException;
import javax.swing.*;
import java.sql.*;
import java.util.Vector;

/**
 * @author ChangFeng
 */
public class main extends JPanel {
    public main() throws IOException, SQLException, ClassNotFoundException {
        initComponents();
    }

    private void initComponents() throws IOException, ClassNotFoundException, SQLException {
        FileReader file= new FileReader("book.txt");
        BufferedReader book = new BufferedReader(file);
        String line;
        Vector<String> vector = new Vector<String>();
        while ((line = book.readLine()) != null) {
            vector.add(line);
        }
        //界面操作
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        textArea1 = new JTextArea();
        frame1 = new JFrame();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        label5 = new JLabel();
        label6 = new JLabel();
        scrollPane1 = new JScrollPane();
        list1 = new JList();
        label7 = new JLabel();
        textField1 = new JTextField();
        label8 = new JLabel();
        textField2 = new JTextField();
        comboBox1 = new JComboBox<>();
        checkBox1 = new JCheckBox();
        checkBox2 = new JCheckBox();
        label9 = new JLabel();
        textField3 = new JTextField();
        button5 = new JButton();
        label10 = new JLabel();
        label11 = new JLabel();
        textField4 = new JTextField();
        button6 = new JButton();
        dialog2 = new JDialog();
        label13 = new JLabel();

        //======== frame1 ========
        {
            frame1.setAlwaysOnTop(true);
            var frame1ContentPane = frame1.getContentPane();
            frame1ContentPane.setLayout(new FlowLayout());

            //======== this ========
            {
                this.setMinimumSize(new Dimension(400, 310));

                //---- button1 ----
                button1.setText("\u4ece\u6587\u4ef6\u8bfb\u53d6\u8bb0\u5f55");

                //---- button2 ----
                button2.setText("\u6dfb\u52a0\u8bb0\u5f55");

                //---- button3 ----
                button3.setText("\u5199\u5165\u6570\u636e\u5e93");

                //---- label5 ----
                label5.setText("\u56fe\u4e66");

                //---- label6 ----
                label6.setText("\u56fe\u4e66");

                //======== scrollPane1 ========
                {
                    scrollPane1.setViewportView(list1);
                }

                //---- label7 ----
                label7.setText("ISBN");

                //---- label8 ----
                label8.setText("\u4e66\u540d");

                //---- comboBox1 ----
                comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
                    "\u9ad8\u7b49\u6559\u80b2\u51fa\u7248\u793e",
                    "\u6e05\u534e\u5927\u5b66\u51fa\u7248\u793e",
                    "\u673a\u68b0\u5de5\u4e1a\u51fa\u7248\u793e"
                }));

                //---- checkBox1 ----
                checkBox1.setText("\u4e2d\u6587");

                //---- checkBox2 ----
                checkBox2.setText("\u82f1\u6587");

                //---- label9 ----
                label9.setText("\u4ef7\u683c");

                //---- button5 ----
                button5.setText("\u6309\u51fa\u7248\u793e\u67e5\u8be2");

                //---- label10 ----
                label10.setText("\u5047\u671f\u5012\u8ba1\u65f6");

                //---- label11 ----
                label11.setText("\u8ddd\u79bb2023\u5e74\u4e94\u4e00\u5047\u671f\u8fd8\u6709\uff1a");

                //---- textField4 ----
                textField4.setBackground(Color.cyan);

                //---- button6 ----
                button6.setText("\u5f00\u59cb\u5012\u8ba1\u65f6");

                GroupLayout layout = new GroupLayout(this);
                setLayout(layout);
                layout.setHorizontalGroup(
                    layout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup()
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(label5))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(38, 38, 38)
                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(label6)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(label9)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(textField3, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(button2, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(button3, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(button5))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addGroup(layout.createParallelGroup()
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(label8)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(label7)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
                                                .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(checkBox1)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(checkBox2)))
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(scrollPane1)))
                                    .addGroup(layout.createParallelGroup()
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup()
                                                .addComponent(label10)
                                                .addComponent(label11)
                                                .addComponent(textField4, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(60, 60, 60)
                                            .addComponent(button6)))))
                            .addGap(230, 230, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                    layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(label5, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup()
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(label6)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(label7)
                                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(label8)
                                        .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addGap(28, 28, 28)
                                    .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(checkBox1)
                                        .addComponent(checkBox2))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(label9)
                                        .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(label10)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(label11)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(textField4))
                                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE))))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(button1)
                                .addComponent(button2)
                                .addComponent(button3)
                                .addComponent(button5)
                                .addComponent(button6))
                            .addContainerGap(140, Short.MAX_VALUE))
                );
            }
            frame1ContentPane.add(this);
            frame1.pack();
            frame1.setLocationRelativeTo(null);
        }

        //======== dialog2 ========
        {
            dialog2.setAlwaysOnTop(true);
            var dialog2ContentPane = dialog2.getContentPane();

            //---- label13 ----
            label13.setText("\u5199\u5165\u6570\u636e\u5e93\u6210\u529f\uff01");

            GroupLayout dialog2ContentPaneLayout = new GroupLayout(dialog2ContentPane);
            dialog2ContentPane.setLayout(dialog2ContentPaneLayout);
            dialog2ContentPaneLayout.setHorizontalGroup(
                dialog2ContentPaneLayout.createParallelGroup()
                    .addGroup(dialog2ContentPaneLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(label13)
                        .addContainerGap(73, Short.MAX_VALUE))
            );
            dialog2ContentPaneLayout.setVerticalGroup(
                dialog2ContentPaneLayout.createParallelGroup()
                    .addGroup(dialog2ContentPaneLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(label13)
                        .addContainerGap(88, Short.MAX_VALUE))
            );
            dialog2.pack();
            dialog2.setLocationRelativeTo(dialog2.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list1.setListData(vector);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String isbn=textField1.getText();
                String name=textField2.getText();
                String price=textField3.getText();
                String chubanshe=comboBox1.getSelectedItem().toString();
                String language=null;
                if(checkBox1.isSelected()) language="中文";
                if(checkBox2.isSelected()) language="英文";
                if(isbn!=null&&name!=null&&price!=null&&language!=null&&chubanshe!=null){
                    String step=isbn+","+name+","+chubanshe+","+language+","+price;
                    vector.add(step);
                    list1.removeAll();
                    list1.setListData(vector);
                }
            }
        });
        frame1.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        frame1.setVisible(true);
        button5.addActionListener(new ActionListener() {
            //线程方式写入文件
            FileWriter result1=new FileWriter(new File("result.txt"));
            BufferedWriter result= new BufferedWriter(result1);
            class Write extends Thread{
                public void run(){
                    try {
                        System.out.println(String.valueOf(vector1));
                        result.write(String.valueOf(vector1));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    try {
                        result.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    try {
                        result1.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            Write wirte=new Write();
            Vector<String> vector1 = new Vector<String>();
            @Override
            public void actionPerformed(ActionEvent e) {
                list1.removeAll();
                String step = comboBox1.getSelectedItem().toString();
                String[] st = new String[0];
                for (String d : vector) {
                    st = d.split(",");
                    if (step.equals(st[2])) {
                        vector1.add(d);
                    }
                }
                list1.setListData(vector1);
                wirte.start();
            }

        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //数据库
                //加载驱动类
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                } catch (ClassNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
                //构建连接参数
                String url="jdbc:mysql://localhost:3306";
                String user="root";
                String password="ChangFeng";
                //获取连接对象
                Connection conn= null;
                try {
                    conn = DriverManager.getConnection(url,user,password);
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
                //获取执行者
                Statement stmt= null;
                try {
                    stmt = conn.createStatement();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
                //判断连接对象
                if(conn==null){
                    System.out.println("连接失败");
                }else{
                    System.out.println("连接成功");
                }
                String sql;
                for(String d:vector){
                    String []step=d.split(",");
                    double j=Double.parseDouble(step[4]);
                        sql = "insert into mydb.book values('"+step[0]+"','"+step[1]+"','"+step[2]+"','"+step[3]+"','j')";
                        try {
                            stmt.executeUpdate(sql);
                        } catch (SQLException ex) {
                            throw new RuntimeException(ex);
                        }
                }
                dialog2.pack();
                dialog2.setVisible(true);
            }
        });
        dialog2.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dialog2.dispose();
            }
        });
        //假期倒计时
        class TimeReader extends Thread{
            @Override
            public void run() {
                double time=6532210;
                while(time>=1) {
                    try {
                        TimeReader.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    time -= 1;
//                    textField4.setText(String.valueOf(time).substring(0,3));
                    textField4.setText(String.valueOf(time)+"(秒)");
                }
                time=0;
                textField4.setText(String.valueOf(time));
            }
        }
        TimeReader timeReader=new TimeReader();
        timeReader.start();
        timeReader.suspend();//此语句不能去除！
        final int[] i = {1};
        textField4.setHorizontalAlignment(JTextField.CENTER);//文字居中
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(i[0] ==1) {
                    timeReader.resume();//此语句不能去除！
                    button6.setText("停止倒计时");
                    i[0] =0;
                }else{
                    timeReader.suspend();//此语句不能去除！
                    button6.setText("开始倒计时");
                    i[0] =1;
                }
            }
        });
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JTextArea textArea1;
    private JFrame frame1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JLabel label5;
    private JLabel label6;
    private JScrollPane scrollPane1;
    private JList list1;
    private JLabel label7;
    private JTextField textField1;
    private JLabel label8;
    private JTextField textField2;
    private JComboBox<String> comboBox1;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JLabel label9;
    private JTextField textField3;
    private JButton button5;
    private JLabel label10;
    private JLabel label11;
    private JTextField textField4;
    private JButton button6;
    private JDialog dialog2;
    private JLabel label13;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    class Node{
        char nodeID;
    }
    class Edge{
        char startID,endID;
    }
    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        new main();
    }
}
