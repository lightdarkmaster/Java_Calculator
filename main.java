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
                dot = new javax.swing.JButton();
                equal = new javax.swing.JButton();
                divide = new javax.swing.JButton();
                plus = new javax.swing.JButton();
                minus = new javax.swing.JButton();
                jPanel1 = new javax.swing.JPanel();
                t1 = new javax.swing.JTextField();
                multiply1 = new javax.swing.JButton();
                labelChanChan = new java.awt.Label();
                label1 = new java.awt.Label();
                backSpace = new javax.swing.JButton();
                posNeg = new javax.swing.JButton();
                clear = new javax.swing.JButton();
                jMenuBar1 = new javax.swing.JMenuBar();
                fileMenu = new javax.swing.JMenu();
                editMenu = new javax.swing.JMenu();
                optionMenu = new javax.swing.JMenu();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setResizable(false);

                b2.setBackground(new java.awt.Color(255, 94, 12));
                b2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                b2.setForeground(new java.awt.Color(255, 255, 255));
                b2.setText("2");
                b2.setBorder(null);
                b2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                b2ActionPerformed(evt);
                        }
                });

                b3.setBackground(new java.awt.Color(255, 94, 12));
                b3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                b3.setForeground(new java.awt.Color(255, 255, 255));
                b3.setText("3");
                b3.setBorder(null);
                b3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                b3ActionPerformed(evt);
                        }
                });

                b1.setBackground(new java.awt.Color(255, 94, 12));
                b1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                b1.setForeground(new java.awt.Color(255, 255, 255));
                b1.setText("1");
                b1.setBorder(null);
                b1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                b1ActionPerformed(evt);
                        }
                });

                b5.setBackground(new java.awt.Color(255, 94, 12));
                b5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                b5.setForeground(new java.awt.Color(255, 255, 255));
                b5.setText("5");
                b5.setBorder(null);
                b5.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                b5ActionPerformed(evt);
                        }
                });

                b6.setBackground(new java.awt.Color(255, 94, 12));
                b6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                b6.setForeground(new java.awt.Color(255, 255, 255));
                b6.setText("6");
                b6.setBorder(null);
                b6.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                b6ActionPerformed(evt);
                        }
                });

                b4.setBackground(new java.awt.Color(255, 94, 12));
                b4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                b4.setForeground(new java.awt.Color(255, 255, 255));
                b4.setText("4");
                b4.setBorder(null);
                b4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                b4ActionPerformed(evt);
                        }
                });

                b8.setBackground(new java.awt.Color(255, 94, 12));
                b8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                b8.setForeground(new java.awt.Color(255, 255, 255));
                b8.setText("8");
                b8.setBorder(null);
                b8.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                b8ActionPerformed(evt);
                        }
                });

                b9.setBackground(new java.awt.Color(255, 94, 12));
                b9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                b9.setForeground(new java.awt.Color(255, 255, 255));
                b9.setText("9");
                b9.setBorder(null);
                b9.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                b9ActionPerformed(evt);
                        }
                });

                b7.setBackground(new java.awt.Color(255, 94, 12));
                b7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                b7.setForeground(new java.awt.Color(255, 255, 255));
                b7.setText("7");
                b7.setBorder(null);
                b7.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                b7ActionPerformed(evt);
                        }
                });

                jButton13.setBackground(new java.awt.Color(255, 94, 12));
                jButton13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jButton13.setForeground(new java.awt.Color(255, 255, 255));
                jButton13.setText("0");
                jButton13.setBorder(null);
                jButton13.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton13ActionPerformed(evt);
                        }
                });

                dot.setBackground(new java.awt.Color(255, 94, 12));
                dot.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                dot.setForeground(new java.awt.Color(255, 255, 255));
                dot.setText(".");
                dot.setBorder(null);
                dot.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                dotActionPerformed(evt);
                        }
                });

                equal.setBackground(new java.awt.Color(255, 255, 255));
                equal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                equal.setForeground(new java.awt.Color(0, 0, 0));
                equal.setText("=");
                equal.setBorder(null);
                equal.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                equalActionPerformed(evt);
                        }
                });

                divide.setBackground(new java.awt.Color(255, 255, 255));
                divide.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                divide.setForeground(new java.awt.Color(0, 0, 0));
                divide.setText("÷");
                divide.setBorder(null);
                divide.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                divideActionPerformed(evt);
                        }
                });

                plus.setBackground(new java.awt.Color(255, 255, 255));
                plus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                plus.setForeground(new java.awt.Color(0, 0, 0));
                plus.setText("+");
                plus.setBorder(null);
                plus.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                plusActionPerformed(evt);
                        }
                });

                minus.setBackground(new java.awt.Color(255, 255, 255));
                minus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                minus.setForeground(new java.awt.Color(0, 0, 0));
                minus.setText("-");
                minus.setBorder(null);
                minus.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                minusActionPerformed(evt);
                        }
                });

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));

                t1.setEditable(false);
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

                multiply1.setBackground(new java.awt.Color(255, 255, 255));
                multiply1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                multiply1.setForeground(new java.awt.Color(0, 0, 0));
                multiply1.setText("X");
                multiply1.setBorder(null);
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
                label1.setText("CB-Cal002");

                backSpace.setBackground(new java.awt.Color(255, 255, 255));
                backSpace.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                backSpace.setForeground(new java.awt.Color(0, 0, 0));
                backSpace.setText("←");
                backSpace.setBorder(null);
                backSpace.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                backSpaceActionPerformed(evt);
                        }
                });

                posNeg.setBackground(new java.awt.Color(255, 255, 255));
                posNeg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                posNeg.setForeground(new java.awt.Color(0, 0, 0));
                posNeg.setText("±");
                posNeg.setBorder(null);
                posNeg.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                posNegActionPerformed(evt);
                        }
                });

                clear.setBackground(new java.awt.Color(255, 255, 255));
                clear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                clear.setForeground(new java.awt.Color(0, 0, 0));
                clear.setText("CE");
                clear.setBorder(null);
                clear.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                clearActionPerformed(evt);
                        }
                });

                fileMenu.setText("File");
                jMenuBar1.add(fileMenu);

                editMenu.setText("Edit");
                jMenuBar1.add(editMenu);

                optionMenu.setText("Options");
                jMenuBar1.add(optionMenu);

                setJMenuBar(jMenuBar1);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
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
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(backSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(posNeg, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(multiply1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(84, 84, 84)
                                                                .addComponent(labelChanChan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(dot, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(equal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addGap(0, 6, Short.MAX_VALUE)))
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(20, Short.MAX_VALUE)
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(labelChanChan, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(backSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(posNeg, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
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
                                                        .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(multiply1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dot, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17))
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

        private void dotActionPerformed(java.awt.event.ActionEvent evt) {                                    
               t1.setText(t1.getText()+ ".");
        }                                   

        private void divideActionPerformed(java.awt.event.ActionEvent evt) {                                       
               num1 = Double.parseDouble(t1.getText());
	       t1.setText("");
	       
	       operator = "/";
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

        private void backSpaceActionPerformed(java.awt.event.ActionEvent evt) {                                          
                String bs = null;
		if(t1.getText().length() > 0){
			StringBuilder sb = new StringBuilder(t1.getText());
			sb.deleteCharAt(t1.getText().length() -1);
			bs = sb.toString();
			t1.setText(bs);
		}
        }                                         

        private void posNegActionPerformed(java.awt.event.ActionEvent evt) {                                       
                double nums = Double.parseDouble(String.valueOf(t1.getText()));
		nums = nums * (-1);
		t1.setText(String.valueOf(nums));
        }                                      

        private void clearActionPerformed(java.awt.event.ActionEvent evt) {                                      
                 t1.setText("");
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
        private javax.swing.JButton backSpace;
        private javax.swing.JButton clear;
        private javax.swing.JButton divide;
        private javax.swing.JButton dot;
        private javax.swing.JMenu editMenu;
        private javax.swing.JButton equal;
        private javax.swing.JMenu fileMenu;
        private javax.swing.JButton jButton13;
        private javax.swing.JMenuBar jMenuBar1;
        private javax.swing.JPanel jPanel1;
        private java.awt.Label label1;
        private java.awt.Label labelChanChan;
        private javax.swing.JButton minus;
        private javax.swing.JButton multiply1;
        private javax.swing.JMenu optionMenu;
        private javax.swing.JButton plus;
        private javax.swing.JButton posNeg;
        private javax.swing.JTextField t1;
        // End of variables declaration                   
}
