
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Cette classe est la classe principale, elle est la première page du logiciel.
 * On choisi la redirection parmi l'inscription à un compte, la connexion à un compte,
 * la consultation des films en tant qu'invité et le choix de quitter l'applicationla liste des films disponibles dans le catalogue.
 * @author Adeel Yousaf
 * @author Fateh Groussi
 * @author Valentin Pigaux
 */
public class Acceuil extends javax.swing.JFrame {

    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;

    public Acceuil() {
        initComponents();
    }

    /**
     * cette methode permet de creer les composants de jframe
     */

    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 150)); // NOI18N
        jLabel2.setText("Ultra Ticket");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 790, 150));

        jButton6.setBackground(new java.awt.Color(204, 255, 255));
        jButton6.setText("Créer un compte");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 0, 0), new java.awt.Color(204, 255, 255), new java.awt.Color(204, 255, 255), new java.awt.Color(255, 51, 51)));
        jButton6.setMaximumSize(new java.awt.Dimension(99, 19));
        jButton6.setMinimumSize(new java.awt.Dimension(99, 19));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 240, 80));

        jButton7.setBackground(new java.awt.Color(204, 255, 255));
        jButton7.setText("Continuer sans compte");
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 0, 0), new java.awt.Color(204, 255, 255), new java.awt.Color(204, 255, 255), new java.awt.Color(255, 51, 51)));
        jButton7.setMaximumSize(new java.awt.Dimension(99, 19));
        jButton7.setMinimumSize(new java.awt.Dimension(99, 19));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 500, 240, 80));

        jButton8.setBackground(new java.awt.Color(204, 255, 255));
        jButton8.setText("Connexion");
        jButton8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 0, 0), new java.awt.Color(204, 255, 255), new java.awt.Color(204, 255, 255), new java.awt.Color(255, 51, 51)));
        jButton8.setMaximumSize(new java.awt.Dimension(99, 19));
        jButton8.setMinimumSize(new java.awt.Dimension(99, 19));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, 240, 80));

        jButton9.setBackground(new java.awt.Color(204, 255, 255));
        jButton9.setText("Quitter");
        jButton9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 0, 0), new java.awt.Color(204, 255, 255), new java.awt.Color(204, 255, 255), new java.awt.Color(255, 51, 51)));
        jButton9.setMaximumSize(new java.awt.Dimension(99, 19));
        jButton9.setMinimumSize(new java.awt.Dimension(99, 19));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 600, 240, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon("src/main/images/acc.jpg"));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 850));

        pack();
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        Inscription i = new Inscription();
        i.setVisible(true);


    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        CatalogueGuest g = new CatalogueGuest();
        g.setVisible(true);

    }

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
        Connexion c = new Connexion();
        c.setVisible(true);
    }

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    /**
     * cette methode permet d'executer le programme
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acceuil().setVisible(true);

            }
        });

    }

}
