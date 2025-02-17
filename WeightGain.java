/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fitnesstrackerproject;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class WeightGain extends javax.swing.JFrame {

    /**
     * Creates new form Form4
     */
    public WeightGain() {
        initComponents();
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        backbutton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        textarea = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        jLabel1.setText("TARGET WEIGHT :(kg)");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 190, 30));

        backbutton.setBackground(new java.awt.Color(222, 222, 222));
        backbutton.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        backbutton.setText("BACK");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(backbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 80, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        jLabel2.setText(" CURRENT WEIGHT:(kg)");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, 190, 41));

        jLabel3.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        jLabel3.setText("WEIGHT GAIN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 183, 20));

        jTextField1.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 260, 50, 30));

        jTextField2.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 300, 50, 30));

        jButton1.setFont(new java.awt.Font("Lucida Handwriting", 1, 8)); // NOI18N
        jButton1.setText("GO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 380, -1, -1));

        jCheckBox1.setBackground(new java.awt.Color(255, 102, 0));
        buttonGroup1.add(jCheckBox1);
        jCheckBox1.setFont(new java.awt.Font("Lucida Handwriting", 0, 8)); // NOI18N
        jCheckBox1.setText("DIET PLAN");
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 340, 100, -1));

        jCheckBox2.setBackground(new java.awt.Color(0, 51, 204));
        buttonGroup1.add(jCheckBox2);
        jCheckBox2.setFont(new java.awt.Font("Lucida Handwriting", 0, 8)); // NOI18N
        jCheckBox2.setText("NUTRITION TIPS ");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 340, -1, -1));

        jCheckBox3.setBackground(new java.awt.Color(255, 0, 51));
        buttonGroup1.add(jCheckBox3);
        jCheckBox3.setFont(new java.awt.Font("Lucida Handwriting", 0, 8)); // NOI18N
        jCheckBox3.setText("EXERCISE");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, 100, -1));

        textarea.setColumns(20);
        textarea.setRows(5);
        jScrollPane2.setViewportView(textarea);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 120, 280, 290));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fitnesstrackerproject/dumbells.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        // TODO add your handling code here:
        SelectionPage form2 = new SelectionPage();
        form2.setVisible(true);
        dispose();
    }//GEN-LAST:event_backbuttonActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      try {
        String currentWeightText = jTextField1.getText();
        String targetWeightText = jTextField2.getText();

        if (currentWeightText.isEmpty() || targetWeightText.isEmpty()) {
            throw new NumberFormatException("All fields must be filled.");
        }

       
        int currentWeight = Integer.parseInt(currentWeightText);
        int targetWeight = Integer.parseInt(targetWeightText);

        if (!jCheckBox1.isSelected() && !jCheckBox2.isSelected() && !jCheckBox3.isSelected()) {
            throw new Exception("At least one plan must be selected.");
        }

       
        String url = "jdbc:ucanaccess://C:/Users/HP/Desktop/Fitness Tracker.accdb";
        Connection conn = DriverManager.getConnection(url);

        
        String sql = "INSERT INTO weightgain (currentweight, targetweight ) VALUES (?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, currentWeight);
        pstmt.setInt(2, targetWeight);

       
        pstmt.executeUpdate();

        
        pstmt.close();
        conn.close();

        StringBuilder message = new StringBuilder("Based on your inputs:\n");
        
        // Display the result to the user
        if (jCheckBox3.isSelected()) {
            message.append("Exercise Plan:\n");
            message.append(getExercisePlan(currentWeight, targetWeight)).append("\n");
        }
        if (jCheckBox1.isSelected()) {
            message.append("Diet Plan:\n");
            message.append(getDietPlan(currentWeight, targetWeight)).append("\n");
        }
        if (jCheckBox2.isSelected()) {
            message.append("Nutrition Tips:\n");
            message.append(getNutritionTips(currentWeight, targetWeight)).append("\n");
        }

        textarea.setText(message.toString());
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Please enter valid numeric values in all fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, ex.getMessage(), "Input Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

 private String getExercisePlan(int currentWeight, int targetWeight) {
    if (targetWeight > currentWeight) {
        if (targetWeight - currentWeight >= 20) {
            return "Recommended exercises:\n  Heavy weightlifting,\n powerlifting,\n and high-intensity interval training (HIIT) for muscle gain.";
        } else if (targetWeight - currentWeight >= 10) {
            return "Recommended exercises:\n  Resistance training,\n bodyweight exercises,\n and compound movements to build muscle mass.";
        } else {
            return "Recommended exercises:\n  Moderate weightlifting,\n cardio exercises like running or cycling,\n and circuit training.";
        }
    } else if (targetWeight == currentWeight) {
        return "Recommended exercises:\n  Play sports,\n cycling,\n swimming,\n and basic strength training.";
    } else {
        if (currentWeight - targetWeight >= 20) {
            return "Recommended exercises:\n  Low-impact exercises like yoga or Pilates,\n light resistance training,\n and flexibility exercises.";
        } else if (currentWeight - targetWeight >= 10) {
            return "Recommended exercises:\n  Light walking,\n stretching,\n and low-impact cardio like swimming or cycling.";
        } else {
            return "Recommended exercises:\n  Walking,\n gentle yoga,\n and mobility exercises.";
        }
    }
}

private String getNutritionTips(int currentWeight, int targetWeight) {
    if (targetWeight > currentWeight) {
        if (targetWeight - currentWeight >= 20) {
            return "Nutrition tips:\n  Increase caloric intake significantly with emphasis on protein-rich foods,\n healthy fats,\n and complex carbohydrates.\n Consider consulting a nutritionist for personalized advice.";
        } else if (targetWeight - currentWeight >= 10) {
            return "Nutrition tips:\n  Increase caloric intake with nutrient-dense foods,\n eat frequent meals,\n and include protein-rich snacks.\n Consider incorporating protein shakes into your diet.";
        } else {
            return "Nutrition tips: \n Increase your daily caloric intake by adding healthy snacks\n between meals and including protein-rich foods in your diet.";
        }
    } else if (targetWeight == currentWeight) {
        return "Nutrition tips: Eat balanced meals, stay hydrated, and avoid junk food.";
    } else {
        if (currentWeight - targetWeight >= 20) {
            return "Nutrition tips:\n  Focus on maintaining a balanced diet with portion control\n and regular physical activity to reach your target weight gradually.\n Consider consulting a nutritionist for personalized advice.";
        } else if (currentWeight - targetWeight >= 10) {
            return "Nutrition tips:\n  Focus on healthy eating habits and portion control\n to gradually reach your target weight.\n Consider keeping a food journal to track your intake.";
        } else {
            return "Nutrition tips: \n Focus on increasing your caloric intake with nutrient-dense foods\n and healthy fats to reach your target weight.";
        }
    }
}

private String getDietPlan(int currentWeight, int targetWeight) {
    if (targetWeight > currentWeight) {
        if (targetWeight - currentWeight >= 20) {
            return "\"Recommended diet:\n Balanced diet with portion control and emphasis on whole foods such as fruits,\n vegetables, lean proteins, and whole grains.\".";
        } else if (targetWeight - currentWeight >= 10) {
            return "Recommended diet:\n Balanced diet with moderate increase in calories from lean protein sources,\n healthy fats, and complex carbohydrates to sustain energy levels\n for longer duration exercises";
        } else {
            return "Recommended diet:\n Balanced diet with moderate increase in calories from lean protein,\n  healthy fats, and complex carbs.";
        }
    } else if (targetWeight == currentWeight) {
        return "Recommended diet:\n Balanced diet with plenty of fruits, vegetables, whole grains, and lean proteins.";
    } else {
        if (currentWeight - targetWeight >= 20) {
            return "Recommended diet:\n Balanced diet with portion control and nutrient-dense\n  foods to gradually reach your target weight.\n  Consider consulting a dietitian for personalized meal plans.";
        } else if (currentWeight - targetWeight >= 10) {
            return "Recommended diet:\n  Balanced diet with increased protein intake and portion control\n  to gradually reach your target weight.";
        } else {
            return "Recommended diet:\n  Balanced diet with extra protein \n and healthy fats to reach your target weight.";
        }
    }
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
            java.util.logging.Logger.getLogger(WeightGain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WeightGain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WeightGain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WeightGain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WeightGain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbutton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextArea textarea;
    // End of variables declaration//GEN-END:variables
}
