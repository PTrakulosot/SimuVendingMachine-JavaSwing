
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ASUS
 */
public class ItemPage extends javax.swing.JFrame {

    public void setX(String x) {
        this.x = x;
    }

    /**
     * Creates new form ItemPage
     */
    public void setY(String y) {
        this.y = y;
    }

    public String x;
    public String y;
    public String z = "00";

    public void ChangeEx() {
        this.extn = 0;
        this.exfv = 0;
        this.extw = 0;
        this.exon = 0;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String id;

    public ItemPage() {
        initComponents();
    }

    public void Sell() {
        Connection conn = null;
        try {
            String base_URL = "jdbc:mysql://";
            String server = "localhost";
            String db = "vendingmachine01";
            String u = "root";
            String p = "12345678";
            String con_string = base_URL + server + "/" + db;
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(con_string, u, p);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        try {
            String sql = "UPDATE item SET quantity = (quantity - 1) WHERE item_id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql); //6
            stmt.setInt(1, Integer.parseInt(id));
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void DropItem(String item, String price) {
        ResultPage RPage = new ResultPage();
        if (item.equals("โค๊ก")) {
            RPage.jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cola-bot.png")));
        } else if (item.equals("น้ำเปล่า")) {
            RPage.jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/water-bot.png")));
        } else if (item.equals("แฟนต้าน้ำแดง")) {
            RPage.jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/fanta-can.png")));
        } else if (item.equals("สไปร์ท")) {
            RPage.jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/sprite-can.png")));
        } else if (item.equals("นมจืดไทยเดนมาร์ค UHT")) {
            RPage.jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/freshmilk-box.png")));
        } else if (item.equals("นมช็อกโกแลตไทยเดนมาร์ค UHT")) {
            RPage.jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/chocomilk-box.png")));
        } else if (item.equals("นมหวานไทยเดนมาร์ค UHT")) {
            RPage.jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/sweethmilk-box.png")));
        } else if (item.equals("เครื่องดื่มเกลือแร่สปอนเซอร์")) {
            RPage.jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/energy-bot.png")));
        } else if (item.equals("ปาปริก้ามันฝรั่งกรอบ")) {
            RPage.jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/paprika-bag.png")));
        } else if (item.equals("โปเต้มันฝรั่งกรอบ")) {
            RPage.jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/potato-bag.png")));
        }
        setVisible(false);
        RPage.setVisible(true);
    }

    public void DropChange(int ten, int five, int two, int one, String item, String price) {
        ResultPage RPage = new ResultPage();
        if (item.equals("โค๊ก")) {
            RPage.jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cola-bot.png")));
        } else if (item.equals("น้ำเปล่า")) {
            RPage.jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/water-bot.png")));
        } else if (item.equals("แฟนต้าน้ำแดง")) {
            RPage.jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/fanta-can.png")));
        } else if (item.equals("สไปร์ท")) {
            RPage.jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/sprite-can.png")));
        } else if (item.equals("นมจืดไทยเดนมาร์ค UHT")) {
            RPage.jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/freshmilk-box.png")));
        } else if (item.equals("นมช็อกโกแลตไทยเดนมาร์ค UHT")) {
            RPage.jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/chocomilk-box.png")));
        } else if (item.equals("นมหวานไทยเดนมาร์ค UHT")) {
            RPage.jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/sweethmilk-box.png")));
        } else if (item.equals("เครื่องดื่มเกลือแร่สปอนเซอร์")) {
            RPage.jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/energy-bot.png")));
        } else if (item.equals("ปาปริก้ามันฝรั่งกรอบ")) {
            RPage.jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/paprika-bag.png")));
        } else if (item.equals("โปเต้มันฝรั่งกรอบ")) {
            RPage.jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/potato-bag.png")));
        }
        if (extn != 0) {
            if (extn == 1) {
                RPage.jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/10baht.png")));
            } else if (extn == 2) {
                RPage.jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/10baht.png")));
                RPage.jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/10baht.png")));
            }
        }
        if (exfv != 0) {
            if (exfv == 1) {
                RPage.jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/5baht.png")));
            } else if (exfv == 2) {
                RPage.jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/5baht.png")));
                RPage.jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/5baht.png")));
            }
        }
        if (extw != 0) {
            if (extw == 1) {
                RPage.jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/2baht.png")));
            } else if (extw == 2) {
                RPage.jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/2baht.png")));
                RPage.jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/2baht.png")));
            }
        }
        if (exon != 0) {
            if (exon == 1) {
                RPage.jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/1baht.png")));
            } else if (exon == 2) {
                RPage.jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/1baht.png")));
                RPage.jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/1baht.png")));
            }
        }
        setVisible(false);
        RPage.setVisible(true);
    }

    static int deno[] = {1, 2, 5, 10};
    static int n = deno.length;
    static int extn = 0;
    static int exfv = 0;
    static int extw = 0;
    static int exon = 0;
    
    public static void FindChange(int V) {
        Vector<Integer> ans = new Vector<>();

        for (int i = n - 1; i >= 0; i--) {
            // Find denominations
            while (V >= deno[i]) {
                V -= deno[i];
                ans.add(deno[i]);
            }
        }

        for (int i = 0; i < ans.size(); i++) {
            if (ans.elementAt(i) == 10) {
                extn = extn + 1;
            } else if (ans.elementAt(i) == 5) {
                exfv = exfv + 1;
            } else if (ans.elementAt(i) == 2) {
                extw = extw + 1;
            } else if (ans.elementAt(i) == 1) {
                exon = exon + 1;
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("AngsanaUPC", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ชื่อ");

        jLabel2.setFont(new java.awt.Font("AngsanaUPC", 0, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("รายละเอียด");

        jLabel3.setFont(new java.awt.Font("AngsanaUPC", 0, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ราคา");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/back.png"))); // NOI18N
        jButton1.setText("ย้อนกลับ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(60, 60, 60), 5, true));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 153, 51));

        jLabel6.setFont(new java.awt.Font("AngsanaUPC", 0, 44)); // NOI18N
        jLabel6.setText("ยอดเงินที่ยังต้องชำระ");

        jLabel5.setFont(new java.awt.Font("AngsanaUPC", 0, 44)); // NOI18N
        jLabel5.setText("ยอดเงินในระบบ");

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("AngsanaUPC", 0, 40)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("AngsanaUPC", 0, 40)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jButton2.setBackground(new java.awt.Color(153, 255, 153));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/20baht.jpg"))); // NOI18N
        jButton2.setText("ธนบัตร 20 บาท");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 255, 153));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/10baht.png"))); // NOI18N
        jButton3.setText("เหรียญ 10 บาท");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(153, 255, 153));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/5baht.png"))); // NOI18N
        jButton4.setText("เหรียญ 5 บาท");
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(153, 255, 153));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/2baht.png"))); // NOI18N
        jButton5.setText("เหรียญ 2 บาท");
        jButton5.setEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(153, 255, 153));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/1baht.png"))); // NOI18N
        jButton6.setText("เหรียญ 1 บาท");
        jButton6.setEnabled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("AngsanaUPC", 0, 44)); // NOI18N
        jLabel7.setText("ยอดเงินทอน");

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("AngsanaUPC", 0, 40)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel8.setFont(new java.awt.Font("AngsanaUPC", 0, 44)); // NOI18N
        jLabel8.setText("ราคาสินค้า");

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("AngsanaUPC", 0, 40)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField4.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(41, 41, 41)
                                .addComponent(jButton3)
                                .addGap(32, 32, 32)
                                .addComponent(jButton4))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addGap(51, 51, 51)
                                .addComponent(jButton6)
                                .addGap(93, 93, 93)))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField4)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(69, 69, 69)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(68, 68, 68)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(41, 41, 41)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(57, 57, 57))
        );

        jButton7.setBackground(new java.awt.Color(0, 153, 255));
        jButton7.setFont(new java.awt.Font("AngsanaUPC", 0, 36)); // NOI18N
        jButton7.setForeground(new java.awt.Color(240, 240, 240));
        jButton7.setText("ยืนยันการเลือกสินค้า");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(32, 32, 32)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addGap(40, 40, 40)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        MainPage MPage = new MainPage();
        MPage.setVisible(true);
        if (Integer.parseInt(jTextField1.getText()) != 0) {
            JOptionPane.showMessageDialog(rootPane, "ท่านได้รับเงินคืน" + jTextField1.getText() + "บาท");
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    // 20 baht
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int sum = Integer.parseInt(jTextField1.getText());
        int amount = Integer.parseInt(jTextField2.getText());
        int change = Integer.parseInt(jTextField3.getText());
        if ((amount - 20) < 0 && sum == 0) {
            change = 20 - amount;
            amount = 0;
        } else if ((amount - 20) < 0) {
            change = 20 - amount;
            amount = 0;
        } else if (amount == 0) {
            change = change + 20;
        } else {
            amount = amount - 20;
        }
        sum = sum + 20;
        jTextField1.setText(sum + "");
        jTextField2.setText(amount + "");
        jTextField3.setText(change + "");
        JOptionPane.showMessageDialog(rootPane, "ท่านได้ใส่ธนบัตร 20 บาท");
        if (amount == 0 && change == 0) {
            Sell();
            try {
                Thread.sleep(750);
            } catch (InterruptedException ex) {
                Logger.getLogger(ItemPage.class.getName()).log(Level.SEVERE, null, ex);
            }
            DropItem(jLabel1.getText(), jLabel3.getText());
        } else if (amount == 0 && change > 0) {
            ChangeEx();
            FindChange(change);
            Sell();
            try {
                Thread.sleep(750);
            } catch (InterruptedException ex) {
                Logger.getLogger(ItemPage.class.getName()).log(Level.SEVERE, null, ex);
            }
            DropChange(extn, exfv, extw, exon, jLabel1.getText(), jLabel3.getText());
        }

    }//GEN-LAST:event_jButton2ActionPerformed
    // 10 baht
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int sum = Integer.parseInt(jTextField1.getText());
        int amount = Integer.parseInt(jTextField2.getText());
        int change = Integer.parseInt(jTextField3.getText());
        if ((amount - 10) < 0) {
            change = 10 - amount;
            amount = 0;
        } else if (amount == 0) {
            change = change + 10;
        } else {
            amount = amount - 10;
        }
        sum = sum + 10;
        jTextField1.setText(sum + "");
        jTextField2.setText(amount + "");
        jTextField3.setText(change + "");
        JOptionPane.showMessageDialog(rootPane, "ท่านได้ใส่เหรียญ 10 บาท");
        if (amount == 0 && change == 0) {
            Sell();
            try {
                Thread.sleep(750);
            } catch (InterruptedException ex) {
                Logger.getLogger(ItemPage.class.getName()).log(Level.SEVERE, null, ex);
            }
            DropItem(jLabel1.getText(), jLabel3.getText());
        } else if (amount == 0 && change > 0) {
            ChangeEx();
            FindChange(change);
            Sell();
            try {
                Thread.sleep(750);
            } catch (InterruptedException ex) {
                Logger.getLogger(ItemPage.class.getName()).log(Level.SEVERE, null, ex);
            }
            DropChange(extn, exfv, extw, exon, jLabel1.getText(), jLabel3.getText());
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    // 5 baht
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int sum = Integer.parseInt(jTextField1.getText());
        int amount = Integer.parseInt(jTextField2.getText());
        int change = Integer.parseInt(jTextField3.getText());
        if ((amount - 5) < 0) {
            change = 5 - amount;
            amount = 0;
        } else if (amount == 0) {
            change = change + 5;
        } else {
            amount = amount - 5;
        }
        sum = sum + 5;
        jTextField1.setText(sum + "");
        jTextField2.setText(amount + "");
        jTextField3.setText(change + "");
        JOptionPane.showMessageDialog(rootPane, "ท่านได้ใส่เหรียญ 5 บาท");
        if (amount == 0 && change == 0) {
            Sell();
            try {
                Thread.sleep(750);
            } catch (InterruptedException ex) {
                Logger.getLogger(ItemPage.class.getName()).log(Level.SEVERE, null, ex);
            }
            DropItem(jLabel1.getText(), jLabel3.getText());
        } else if (amount == 0 && change > 0) {
            ChangeEx();
            FindChange(change);
            Sell();
            try {
                Thread.sleep(750);
            } catch (InterruptedException ex) {
                Logger.getLogger(ItemPage.class.getName()).log(Level.SEVERE, null, ex);
            }
            DropChange(extn, exfv, extw, exon, jLabel1.getText(), jLabel3.getText());
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    // 2 baht
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int sum = Integer.parseInt(jTextField1.getText());
        int amount = Integer.parseInt(jTextField2.getText());
        int change = Integer.parseInt(jTextField3.getText());
        if ((amount - 2) < 0) {
            change = 2 - amount;
            amount = 0;
        } else if (amount == 0) {
            change = change + 2;
        } else {
            amount = amount - 2;
        }
        sum = sum + 2;
        jTextField1.setText(sum + "");
        jTextField2.setText(amount + "");
        jTextField3.setText(change + "");
        JOptionPane.showMessageDialog(rootPane, "ท่านได้ใส่เหรียญ 2 บาท");
        if (amount == 0 && change == 0) {
            Sell();
            try {
                Thread.sleep(750);
            } catch (InterruptedException ex) {
                Logger.getLogger(ItemPage.class.getName()).log(Level.SEVERE, null, ex);
            }
            DropItem(jLabel1.getText(), jLabel3.getText());
        } else if (amount == 0 && change > 0) {
            ChangeEx();
            FindChange(change);
            Sell();
            try {
                Thread.sleep(750);
            } catch (InterruptedException ex) {
                Logger.getLogger(ItemPage.class.getName()).log(Level.SEVERE, null, ex);
            }
            DropChange(extn, exfv, extw, exon, jLabel1.getText(), jLabel3.getText());
        }
    }//GEN-LAST:event_jButton5ActionPerformed
    // 1 baht
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int sum = Integer.parseInt(jTextField1.getText());
        int amount = Integer.parseInt(jTextField2.getText());
        int change = Integer.parseInt(jTextField3.getText());
        if ((amount - 1) < 0) {
            change = 1 - amount;
            amount = 0;
        } else if (amount == 0) {
            change = change + 1;
        } else {
            amount = amount - 1;
        }
        sum = sum + 1;
        jTextField1.setText(sum + "");
        jTextField2.setText(amount + "");
        jTextField3.setText(change + "");
        JOptionPane.showMessageDialog(rootPane, "ท่านได้ใส่เหรียญ 1 บาท");
        if (amount == 0 && change == 0) {
            Sell();
            try {
                Thread.sleep(750);
            } catch (InterruptedException ex) {
                Logger.getLogger(ItemPage.class.getName()).log(Level.SEVERE, null, ex);
            }
            DropItem(jLabel1.getText(), jLabel3.getText());
        } else if (amount == 0 && change > 0) {
            ChangeEx();
            FindChange(change);
            Sell();
            try {
                Thread.sleep(750);
            } catch (InterruptedException ex) {
                Logger.getLogger(ItemPage.class.getName()).log(Level.SEVERE, null, ex);
            }
            DropChange(extn, exfv, extw, exon, jLabel1.getText(), jLabel3.getText());
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(false);
        JOptionPane.showMessageDialog(rootPane, "กรุณาใส่เงินเพื่อทำการซื้อ");
        jTextField1.setText(x);
        jTextField2.setText(y);
        jTextField3.setText(z);
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ItemPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ItemPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ItemPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ItemPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ItemPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    public javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
