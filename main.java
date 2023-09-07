package Java_Calculator;

public class main extends javax.swing.JFrame {
	
	double num1, num2;
	String operator = null;
	

	public main() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
        private void initComponents() {

                b2 = new javax.swing.JButton();
                b3 = new javax.swing.JButton();
                b1 = new javax.swing.JButton();
                b5 = new javax.swing.JButton();
                b6 = new javax.swing.JButton();
                b4 = new javax.swing.JButton();
                b8 = new javax.swing.JButton();
                b9 = new javax.swing.JButton();
                b7 = new javax.swing.JButton();
                jButton13 = new javax.swing.JButton();
                clear = new javax.swing.JButton();
                equal = new javax.swing.JButton();
                divide = new javax.swing.JButton();
                back = new javax.swing.JButton();
                plus = new javax.swing.JButton();
                minus = new javax.swing.JButton();
                jPanel1 = new javax.swing.JPanel();
                t1 = new javax.swing.JTextField();
                multiply1 = new javax.swing.JButton();
                labelChanChan = new java.awt.Label();
                label1 = new java.awt.Label();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                b2.setBackground(new java.awt.Color(204, 204, 255));
                b2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                b2.setForeground(new java.awt.Color(0, 0, 0));
                b2.setText("2");
                b2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
                b2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                b2ActionPerformed(evt);
                        }
                });

                b3.setBackground(new java.awt.Color(204, 204, 255));
                b3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                b3.setForeground(new java.awt.Color(0, 0, 0));
                b3.setText("3");
                b3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
                b3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                b3ActionPerformed(evt);
                        }
                });

                b1.setBackground(new java.awt.Color(204, 204, 255));
                b1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                b1.setForeground(new java.awt.Color(0, 0, 0));
                b1.setText("1");
                b1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
                b1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                b1ActionPerformed(evt);
                        }
                });

                b5.setBackground(new java.awt.Color(204, 204, 255));
                b5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                b5.setForeground(new java.awt.Color(0, 0, 0));
                b5.setText("5");
                b5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
                b5.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                b5ActionPerformed(evt);
                        }
                });

                b6.setBackground(new java.awt.Color(204, 204, 255));
                b6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                b6.setForeground(new java.awt.Color(0, 0, 0));
                b6.setText("6");
                b6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
                b6.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                b6ActionPerformed(evt);
                        }
                });

                b4.setBackground(new java.awt.Color(204, 204, 255));
                b4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                b4.setForeground(new java.awt.Color(0, 0, 0));
                b4.setText("4");
                b4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
                b4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                b4ActionPerformed(evt);
                        }
                });

                b8.setBackground(new java.awt.Color(204, 204, 255));
                b8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                b8.setForeground(new java.awt.Color(0, 0, 0));
                b8.setText("8");
                b8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
                b8.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                b8ActionPerformed(evt);
                        }
                });

                b9.setBackground(new java.awt.Color(204, 204, 255));
                b9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                b9.setForeground(new java.awt.Color(0, 0, 0));
                b9.setText("9");
                b9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
                b9.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                b9ActionPerformed(evt);
                        }
                });

                b7.setBackground(new java.awt.Color(204, 204, 255));
                b7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                b7.setForeground(new java.awt.Color(0, 0, 0));
                b7.setText("7");
                b7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
                b7.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                b7ActionPerformed(evt);
                        }
                });

                jButton13.setBackground(new java.awt.Color(204, 204, 255));
                jButton13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jButton13.setForeground(new java.awt.Color(0, 0, 0));
                jButton13.setText("0");
                jButton13.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
                jButton13.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton13ActionPerformed(evt);
                        }
                });

                clear.setBackground(new java.awt.Color(255, 255, 204));
                clear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                clear.setForeground(new java.awt.Color(0, 0, 0));
                clear.setText("C");
                clear.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
                clear.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                clearActionPerformed(evt);
                        }
                });

                equal.setBackground(new java.awt.Color(255, 255, 204));
                equal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                equal.setForeground(new java.awt.Color(0, 0, 0));
                equal.setText("=");
                equal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
                equal.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                equalActionPerformed(evt);
                        }
                });

                divide.setBackground(new java.awt.Color(204, 255, 204));
                divide.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                divide.setForeground(new java.awt.Color(255, 0, 0));
                divide.setText("/");
                divide.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
                divide.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                divideActionPerformed(evt);
                        }
                });

                back.setBackground(new java.awt.Color(204, 255, 204));
                back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                back.setForeground(new java.awt.Color(255, 0, 0));
                back.setText("Back");
                back.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
                back.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                backActionPerformed(evt);
                        }
                });

                plus.setBackground(new java.awt.Color(204, 255, 204));
                plus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                plus.setForeground(new java.awt.Color(255, 0, 0));
                plus.setText("+");
                plus.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
                plus.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                plusActionPerformed(evt);
                        }
                });

                minus.setBackground(new java.awt.Color(204, 255, 204));
                minus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                minus.setForeground(new java.awt.Color(255, 0, 0));
                minus.setText("-");
                minus.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
                minus.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                minusActionPerformed(evt);
                        }
                });

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));

                t1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                t1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t1ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(t1)
                                .addContainerGap())
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(t1, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                .addContainerGap())
                );

                multiply1.setBackground(new java.awt.Color(204, 255, 204));
                multiply1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                multiply1.setForeground(new java.awt.Color(255, 0, 0));
                multiply1.setText("X");
                multiply1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
                multiply1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                multiply1ActionPerformed(evt);
                        }
                });

                labelChanChan.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
                labelChanChan.setText("Chan Calculator");
                labelChanChan.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                labelChanChanMouseClicked(evt);
                        }
                });

                label1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 8)); // NOI18N
                label1.setText("CB-Cal001");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(labelChanChan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(multiply1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(labelChanChan, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(multiply1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                );

                pack();
        }// </editor-fold>                        

        private void b2ActionPerformed(java.awt.event.ActionEvent evt) {                                   
                t1.setText(t1.getText()+"2");
        }                                  

        private void b3ActionPerformed(java.awt.event.ActionEvent evt) {                                   
             t1.setText(t1.getText()+"3");
        }                                  

        private void b5ActionPerformed(java.awt.event.ActionEvent evt) {                                   
               t1.setText(t1.getText()+"5");
        }                                  

        private void b6ActionPerformed(java.awt.event.ActionEvent evt) {                                   
               t1.setText(t1.getText()+"6");
        }                                  

        private void b8ActionPerformed(java.awt.event.ActionEvent evt) {                                   
               t1.setText(t1.getText()+"8");
        }                                  

        private void b9ActionPerformed(java.awt.event.ActionEvent evt) {                                   
             t1.setText(t1.getText()+"9");
        }                                  

        private void b4ActionPerformed(java.awt.event.ActionEvent evt) {                                   
             t1.setText(t1.getText()+"4");
        }                                  

        private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {                                          
               t1.setText(t1.getText()+"0");
        }                                         

        private void clearActionPerformed(java.awt.event.ActionEvent evt) {                                      
                t1.setText("");
        }                                     

        private void divideActionPerformed(java.awt.event.ActionEvent evt) {                                       
               num1 = Double.parseDouble(t1.getText());
	       t1.setText("");
	       
	       operator = "/";
        }                                      

        private void backActionPerformed(java.awt.event.ActionEvent evt) {                                     
            String str = t1.getText();
	    t1.setText(str.substring(0, str.length()-1));
	    
        }                                    

        private void plusActionPerformed(java.awt.event.ActionEvent evt) {                                     
               num1 = Double.parseDouble(t1.getText());
	       t1.setText("");
	       
	       operator = "+";
        }                                    

        private void minusActionPerformed(java.awt.event.ActionEvent evt) {                                      
               num1 = Double.parseDouble(t1.getText());
	       t1.setText("");
	       
	       operator = "-";
        }                                     

        private void b1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
             t1.setText(t1.getText()+"1");
        }                                  

        private void t1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
                // TODO add your handling code here:
        }                                  

        private void b7ActionPerformed(java.awt.event.ActionEvent evt) {                                   
              t1.setText(t1.getText()+"7");
        }                                  

        private void equalActionPerformed(java.awt.event.ActionEvent evt) {                                      
            
	       num2 = Double.parseDouble(t1.getText());
	       double ans = 0;
	       
	       if(operator == "+"){
		       ans=num1+num2;
	       }if(operator == "-"){
		       ans=num1-num2;
	       }if(operator == "*"){
		       ans=num1 * num2;
	       } if(operator == "/"){
		       ans=num1/num2;
	       }
	       t1.setText("" + ans);
	       operator = null;	
        }                                     

        private void multiply1ActionPerformed(java.awt.event.ActionEvent evt) {                                          
               num1 = Double.parseDouble(t1.getText());
	       t1.setText("");
	       
	       operator = "*";
        }                                         

        private void labelChanChanMouseClicked(java.awt.event.MouseEvent evt) {                                           
                 t1.setText(t1.getText()+"Hello I'm Chan");
        }                                          

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
			java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new main().setVisible(true);
			}
		});
	}
	
	

        // Variables declaration - do not modify                     
        private javax.swing.JButton b1;
        private javax.swing.JButton b2;
        private javax.swing.JButton b3;
        private javax.swing.JButton b4;
        private javax.swing.JButton b5;
        private javax.swing.JButton b6;
        private javax.swing.JButton b7;
        private javax.swing.JButton b8;
        private javax.swing.JButton b9;
        private javax.swing.JButton back;
        private javax.swing.JButton clear;
        private javax.swing.JButton divide;
        private javax.swing.JButton equal;
        private javax.swing.JButton jButton13;
        private javax.swing.JPanel jPanel1;
        private java.awt.Label label1;
        private java.awt.Label labelChanChan;
        private javax.swing.JButton minus;
        private javax.swing.JButton multiply1;
        private javax.swing.JButton plus;
        private javax.swing.JTextField t1;
        // End of variables declaration                   
}
//this program is created by: Christian Barbosa
//BSIT-AI-41
//Enjoy

//add some features
//add +- button, ".", CE. <-