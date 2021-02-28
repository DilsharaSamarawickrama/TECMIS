
package AddUser;

import AddUser.DashboardAdmin;
import DataBase.DBConnectAdmin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Login extends javax.swing.JFrame {
    private static String id=null;
    private char[] pwd;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public char[] getPwd() {
        return pwd;
    }

    public void setPwd(char[] pwd) {
        this.pwd = pwd;
    }
            
    Connection con=null;
    PreparedStatement pst=null;
    
    public Login() {
        initComponents();
        con=DBConnectAdmin.connect();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        pwdPw = new javax.swing.JPasswordField();
        errMsg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1040, 650));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setPreferredSize(new java.awt.Dimension(1040, 650));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), new java.awt.Color(0, 0, 0)));
        jPanel2.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("User ID");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Microsoft YaHei", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Password");

        login.setBackground(new java.awt.Color(204, 204, 204));
        login.setFont(new java.awt.Font("Microsoft YaHei", 1, 15)); // NOI18N
        login.setForeground(new java.awt.Color(51, 51, 51));
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        txtId.setBackground(new java.awt.Color(204, 204, 204));
        txtId.setFont(new java.awt.Font("Microsoft YaHei", 1, 15)); // NOI18N
        txtId.setForeground(new java.awt.Color(51, 51, 51));
        txtId.setRequestFocusEnabled(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        pwdPw.setBackground(new java.awt.Color(204, 204, 204));
        pwdPw.setFont(new java.awt.Font("Microsoft YaHei", 1, 15)); // NOI18N
        pwdPw.setForeground(new java.awt.Color(51, 51, 51));

        errMsg.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        errMsg.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwdPw, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errMsg, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwdPw, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(570, 270, 410, 290);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/black-wallpaper-12.jpg"))); // NOI18N
        jLabel1.setDoubleBuffered(true);
        jLabel1.setMaximumSize(new java.awt.Dimension(1040, 650));
        jLabel1.setMinimumSize(null);
        jLabel1.setPreferredSize(new java.awt.Dimension(1040, 650));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1040, 620);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1040, 620);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        con=DBConnectAdmin.connect();
        
        setId(txtId.getText());
        setPwd(pwdPw.getPassword());
        
        String id=getId();
        char[] pwd=getPwd();
        String ps=pwd.toString();
        
        if(id.isEmpty() && ps.isEmpty())
        {
            errMsg.setText("Enter User ID & Password!");
        }
        else if(id.isEmpty())
        {
            errMsg.setText("Enter User ID!");
        }
        else if(ps.isEmpty())
        {
            errMsg.setText("Enter Password!");
        }
        else
        {
            char[] pw = null;
            char[] user=null;
            char[] uid=getId().toCharArray();
            String u=null;
        
            try
            {
                Statement stmt=con.createStatement();
                String q="SELECT Password FROM user WHERE UserID='"+getId()+"';";
                ResultSet rs =stmt.executeQuery(q);
                
                while(rs.next())
                {
                    pw=rs.getString("Password").toCharArray();
                }
                
                
                String lect="SELECT UserID FROM user WHERE UserID like 'Lec%';";
                ResultSet rsl =stmt.executeQuery(lect);
                while(rsl.next())
                {
                    user=rsl.getString("UserID").toCharArray();
                    if(java.util.Arrays.equals(user,uid))
                    {
                        u="lect";
                    }
                }
                
                String to="SELECT UserID FROM user WHERE UserID like 'TO%';";
                ResultSet rst =stmt.executeQuery(to);
                while(rst.next())
                {
                    user=rst.getString("UserID").toCharArray();
                    if(java.util.Arrays.equals(user,uid))
                    {
                        u="to";
                    }
                }
                
                String student="SELECT UserID FROM user WHERE UserID like 'TG%';";
                ResultSet rss =stmt.executeQuery(student);
                while(rss.next())
                {
                    user=rss.getString("UserID").toCharArray();
                    if(java.util.Arrays.equals(user,uid))
                    {
                        u="student";
                    }
                }

                String admin="SELECT UserID FROM user WHERE UserID like 'Adm%';";
                ResultSet rsa =stmt.executeQuery(admin);
                while(rsa.next())
                {
                    user=rsa.getString("UserID").toCharArray();
                    if(java.util.Arrays.equals(user,uid))
                    {
                        u="admin";
                    }
                }
                
                   if(java.util.Arrays.equals(pw, getPwd()))
                    {
                        if("admin".equals(u))
                        {
                            DashboardAdmin adash=new DashboardAdmin();
                            adash.setVisible(true);
                            this.dispose();
                        }
                        else if("student".equals(u))
                        {
                            
                        }
                        else if("to".equals(u))
                        {
                        
                        }
                        else if("lect".equals(u))
                        {
                        
                        }
                        else
                        {
                            errMsg.setText("Incorrect User ID!");
                        }
                    }
                    else
                    {
                        errMsg.setText("Incorrect Password!");
                    }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_loginActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errMsg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField pwdPw;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables

    
}
