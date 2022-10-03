/**
 * Cette classe permet de visualiser le catalogue des films, de se rendre dans l'espace commentaires,
 * de se rendre dans l'espace notation, de se rendre dans l'espace réservation et localisation
 * d'un cinéma.
 */


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Catalogue extends javax.swing.JFrame {
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;

    public Catalogue() {
        initComponents();
    }

    private void initComponents() {

        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();


        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel45.setText("<html> &emsp &emsp This summer, experience the epic conclusion to the Jurassic era as two generations unite for the first time.  Jurassic World Dominion, a bold, timely and breathtaking new adventure that spans the globe. <br>                 <strong> <b>  Director: </b> </strong> <br>                  &emsp &emsp Colin Trevorrow <br>                  <strong> <b>  Genre: </b> </strong> <br>                  &emsp &emsp Sci-Fi, Thriller, Action <br>                  <strong> <b>  Length: </b> </strong> <br>                  &emsp &emsp 2h 27min                   </html>\"");
        getContentPane().add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 101, 422, 172));

        jLabel46.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); 
        jLabel46.setText("Description:");
        getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 80, -1, -1));

        jLabel47.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); 
        jLabel47.setText("Jurrasic World Dominion");
        getContentPane().add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 51, -1, -1));

        jLabel48.setIcon(new javax.swing.ImageIcon("src/main/images/jw.jpeg"));
        jLabel48.setText("jLabel2");
        getContentPane().add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 70, 182, 270));

        jLabel49.setIcon(new javax.swing.ImageIcon("src/main/images/topgun.jpeg"));
        jLabel49.setText("jLabel2");
        getContentPane().add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 79, 182, 260));

        jLabel50.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); 
        jLabel50.setText("Top Gun: Maverick");
        getContentPane().add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 50, -1, -1));

        jLabel51.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); 
        jLabel51.setText("Description:");
        getContentPane().add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 80, -1, -1));

        jLabel52.setText("<html>&emsp &emsp After more than thirty years of service as one of the Navy's top aviators, 'Maverick' Mitchell (Tom Cruise) is where he belongs, pushing the envelope nas a courageous test pilot and dodging the advancement in rank that would ground him When he finds himself training a detachment of Top Gun graduates for a specialized mission the likes of which no living pilot has ever seen. <br>                   <strong> <b>  Director: </b> </strong> <br>                  &emsp &emsp Joseph Kosinski <br>                  <strong> <b>  Genre: </b> </strong> <br>                  &emsp &emsp Action, Drama <br>                   <strong> <b>  Length: </b> </strong> <br>                  &emsp &emsp 2h 11min                    </html>                ");
        getContentPane().add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 100, 470, 190));

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setText("Réserver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 306, 124, 34));

        jButton3.setBackground(new java.awt.Color(51, 153, 255));
        jButton3.setText("Réserver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 300, 124, 34));

        jButton4.setBackground(new java.awt.Color(51, 153, 255));
        jButton4.setText("Réserver");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 618, 124, 34));

        jLabel60.setText("<html>&emsp &emsp The world’s favorite blue hedgehog is back for a next-level adventure in SONIC THE HEDGEHOG 2. After settling in Green Hills, Sonic is eager to prove he has what it takes to be a true hero. His test comes when Dr. Robotnik returns, this time with a new partner, Knuckles, in search for an emerald that has the power to destroy  civilizations  <br>\n                 <strong> <b>  Director: </b> </strong> <br>\n                &emsp &emsp CJeff Fowler <br>\n                 <strong> <b>  Genre: </b> </strong> <br>\n                &emsp &emsp  Action <br>\n                 <strong> <b>  Length: </b> </strong> <br>\n                &emsp &emsp 2h 2min\n                  </html>");
        getContentPane().add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 413, 420, 199));

        jLabel61.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); 
        jLabel61.setText("Description:");
        getContentPane().add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 389, -1, -1));

        jLabel62.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); 
        jLabel62.setText(" Sonic The Hedgehog 2");
        getContentPane().add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 363, -1, -1));

        jLabel63.setIcon(new javax.swing.ImageIcon("src/main/images/sonic.jpg"));
        jLabel63.setText("jLabel2");
        getContentPane().add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 363, 182, 289));

        jLabel64.setIcon(new javax.swing.ImageIcon("src/main/images/drstrang.jpg"));
        jLabel64.setText("jLabel2");
        getContentPane().add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 360, 182, 289));

        jButton5.setBackground(new java.awt.Color(51, 153, 255));
        jButton5.setText("Réserver");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 610, 124, 34));

        jButton6.setBackground(new java.awt.Color(51, 153, 255));
        jButton6.setText("Réserver");
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 913, 124, 34));

        jLabel68.setText("<html> &emsp &emsp crackerjack criminal crew of animal outlaws are about to attempt their most challenging con yet—becoming model citizens. Never have there been five friends as infamous as The Bad Guys\n  when a new villain threatens the city, will the gang stay as The Good Guys?  <br> \n                 <strong> <b>  Director: </b> </strong> <br>\n                &emsp &emsp Pierre Perifel <br>\n                 <strong> <b>  Genre: </b> </strong> <br>\n                &emsp &emsp Comedy, Animated, Action <br>\n                 <strong> <b>  Length: </b> </strong> <br>\n                &emsp &emsp 1h 40min\n                 </html>\n                 ");
        getContentPane().add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 708, 420, 199));

        jLabel69.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); 
        jLabel69.setText("Description:");
        getContentPane().add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 687, -1, -1));

        jLabel70.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); 
        jLabel70.setText("The Bad Guys");
        getContentPane().add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 658, -1, -1));

        jLabel71.setIcon(new javax.swing.ImageIcon("src/main/images/bguys.jpg"));
        jLabel71.setText("jLabel2");
        getContentPane().add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 658, 182, 289));

        jLabel5.setText("deja vu?");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, -1));

        jLabel6.setText("deja vu?");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 920, -1, -1));

        jLabel7.setText("deja vu?");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 630, -1, -1));

        jLabel8.setText("deja vu?");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 310, -1, -1));

        jLabel9.setText("deja vu?");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 620, -1, -1));

        jLabel10.setText("deja vu?");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 897, -1, 20));

        jLabel65.setIcon(new javax.swing.ImageIcon("src/main/images/ee.jpeg"));
        jLabel65.setText("jLabel2");
        getContentPane().add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 650, 182, 289));

        jButton10.setBackground(new java.awt.Color(51, 153, 255));
        jButton10.setText("Réserver");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 890, 124, 34));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel59.setText("<html>&emsp &emsp Doctor Strange in the Multiverse of Madness”—a thrilling ride through the Multiverse with Doctor Strange, his trusted friend Wong and Wanda Maximoff, aka Scarlet Witch. “Doctor Strange in the Multiverse of Madness<br>\n                <strong> <b>  Director: </b> </strong> <br>\n                &emsp &emsp Sam Raimi <br>\n                <strong> <b>  Genre: </b> </strong> <br>\n                &emsp &emsp Action <br>\n                <strong> <b>  Length: </b> </strong> <br>\n                &emsp &emsp 2h 6min\n                  </html>");

        jLabel58.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); 
        jLabel58.setText("Description:");

        jLabel57.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); 
        jLabel57.setText("Doctor Strange in the Multiverse of Madness");

        jLabel66.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); 
        jLabel66.setText(" Everything Everywhere All At Once");

        jLabel67.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); 
        jLabel67.setText("Description:");

        jLabel72.setText("<html> &emsp &emsp Directed by Daniel Kwan and Daniel Scheinert, collectively known as Daniels, the film is a hilarious and big-hearted sci-fi action-adventure about an exhausted Chinese American woman (Michelle Yeoh) who can't seem to finish her taxes. <br> \n                <strong> <b>  Director: </b> </strong> <br>\n                &emsp &emsp Dan Kwan, Daniel Scheinert <br>\n                 <strong> <b>  Genre: </b> </strong> <br>\n                &emsp &emsp Action, Comedy <br>\n                <strong> <b>  Length: </b> </strong> <br>\n                &emsp &emsp 2h 19min\" +\n                 </html>");

        jLabel44.setFont(new java.awt.Font("Arial", 3, 33)); 
        jLabel44.setText("Le Catalogue");

        jButton2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); 
        jButton2.setText("Localiser les cinémas proches de chez moi");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255), 2));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(926, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel57)
                        .addComponent(jLabel58)
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel66)
                        .addComponent(jLabel67)
                        .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(596, 596, 596)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel44)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 321, Short.MAX_VALUE)
                .addComponent(jLabel57)
                .addGap(7, 7, 7)
                .addComponent(jLabel58)
                .addGap(2, 2, 2)
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel66)
                .addGap(7, 7, 7)
                .addComponent(jLabel67)
                .addGap(12, 12, 12)
                .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1450, 950));

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        Reservation r1 = new Reservation();
        r1.setVisible(true);
        this.setVisible(false);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        CodePostal c1 = new CodePostal();
        c1.setVisible(true);
        this.setVisible(false);
    }


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        Reservation r3 = new Reservation();
        r3.setVisible(true);
        this.setVisible(false);
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        Reservation r4 = new Reservation();
        r4.setVisible(true);
        this.setVisible(false);
    }


    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        Reservation r5 = new Reservation();
        r5.setVisible(true);
        this.setVisible(false);
    }


    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        Reservation r6 = new Reservation();
        r6.setVisible(true);
        this.setVisible(false);
    }

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
        Reservation r10 = new Reservation();
        r10.setVisible(true);
        this.setVisible(false);
    }

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {
        Comment c1 = new Comment();
        c1.setVisible(true);
        this.setVisible(false);
    }

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {
        Comment c6 = new Comment();
        c6.setVisible(true);
        this.setVisible(false);
    }

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {
        Comment c4 = new Comment();
        c4.setVisible(true);
        this.setVisible(false);
    }

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {
        Comment c3 = new Comment();
        c3.setVisible(true);
        this.setVisible(false);
    }

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {
        Comment c5 = new Comment();
        c5.setVisible(true);
        this.setVisible(false);
    }

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {
        Comment c10 = new Comment();
        c10.setVisible(true);
        this.setVisible(false);
    }
}
