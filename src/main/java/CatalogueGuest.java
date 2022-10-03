import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Cette classe permet de gerer le catalogue de film pour ceux qui n'ont pas de compte
 */
public class CatalogueGuest extends javax.swing.JFrame {
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
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
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JPanel jPanel1;
    public CatalogueGuest() {
        initComponents();
    }


    /**
     * cette methode permet d'initialiser les composants de la fenetre
     */
    private void initComponents() {

        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();


        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel44.setFont(new java.awt.Font("Arial", 3, 33));
        jLabel44.setText("Le Catalogue");
        getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 6, 242, -1));

        jLabel45.setForeground(new java.awt.Color(0, 0, 0));
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
        getContentPane().add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 51, 182, 289));

        jLabel49.setIcon(new javax.swing.ImageIcon("src/main/images/topgun.jpeg"));
        jLabel49.setText("jLabel2");
        getContentPane().add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(694, 51, 182, 289));

        jLabel50.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        jLabel50.setText("Top Gun: Maverick");
        getContentPane().add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(891, 51, -1, -1));

        jLabel51.setFont(new java.awt.Font("Helvetica Neue", 1, 14));
        jLabel51.setText("Description:");
        getContentPane().add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(891, 80, -1, -1));

        jLabel52.setText("<html>&emsp &emsp After more than thirty years of service as one of the Navy's top aviators, 'Maverick' Mitchell (Tom Cruise) is where he belongs, pushing the envelope nas a courageous test pilot and dodging the advancement in rank that would ground him When he finds himself training a detachment of Top Gun graduates for a specialized mission the likes of which no living pilot has ever seen. <br>                   <strong> <b>  Director: </b> </strong> <br>                  &emsp &emsp Joseph Kosinski <br>                  <strong> <b>  Genre: </b> </strong> <br>                  &emsp &emsp Action, Drama <br>                   <strong> <b>  Length: </b> </strong> <br>                  &emsp &emsp 2h 11min                    </html>                ");
        getContentPane().add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(891, 104, 470, 190));

        jLabel57.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        jLabel57.setText("Doctor Strange in the Multiverse of Madness");
        getContentPane().add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(882, 363, -1, -1));

        jLabel58.setFont(new java.awt.Font("Helvetica Neue", 1, 14));
        jLabel58.setText("Description:");
        getContentPane().add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(882, 392, -1, -1));

        jLabel59.setText("<html>&emsp &emsp Doctor Strange in the Multiverse of Madness”—a thrilling ride through the Multiverse with Doctor Strange, his trusted friend Wong and Wanda Maximoff, aka Scarlet Witch. “Doctor Strange in the Multiverse of Madness<br>\n                <strong> <b>  Director: </b> </strong> <br>\n                &emsp &emsp Sam Raimi <br>\n                <strong> <b>  Genre: </b> </strong> <br>\n                &emsp &emsp Action <br>\n                <strong> <b>  Length: </b> </strong> <br>\n                &emsp &emsp 2h 6min\n                  </html>");
        getContentPane().add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(882, 416, 518, 213));

        jLabel60.setText("<html>&emsp &emsp The world’s favorite blue hedgehog is back for a next-level adventure in SONIC THE HEDGEHOG 2. After settling in Green Hills, Sonic is eager to prove he has what it takes to be a true hero. His test comes when Dr. Robotnik returns, this time with a new partner, Knuckles, in search for an emerald that has the power to destroy  civilizations  <br>\n                 <strong> <b>  Director: </b> </strong> <br>\n                &emsp &emsp CJeff Fowler <br>\n                 <strong> <b>  Genre: </b> </strong> <br>\n                &emsp &emsp  Action <br>\n                 <strong> <b>  Length: </b> </strong> <br>\n                &emsp &emsp 2h 2min\n                  </html>");
        getContentPane().add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 413, 431, 199));

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
        getContentPane().add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(694, 363, 182, 289));

        jLabel68.setText("<html> &emsp &emsp crackerjack criminal crew of animal outlaws are about to attempt their most challenging con yet—becoming model citizens. Never have there been five friends as infamous as The Bad Guys\n  when a new villain threatens the city, will the gang stay as The Good Guys?  <br> \n                 <strong> <b>  Director: </b> </strong> <br>\n                &emsp &emsp Pierre Perifel <br>\n                 <strong> <b>  Genre: </b> </strong> <br>\n                &emsp &emsp Comedy, Animated, Action <br>\n                 <strong> <b>  Length: </b> </strong> <br>\n                &emsp &emsp 1h 40min\n                 </html>\n                 ");
        getContentPane().add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 725, 442, 199));

        jLabel69.setFont(new java.awt.Font("Helvetica Neue", 1, 14));
        jLabel69.setText("Description:");
        getContentPane().add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 704, -1, -1));

        jLabel70.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        jLabel70.setText("The Bad Guys");
        getContentPane().add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 675, -1, -1));

        jLabel71.setIcon(new javax.swing.ImageIcon("src/main/images/bguys.jpg"));
        jLabel71.setText("jLabel2");
        getContentPane().add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 675, 182, 289));

        jLabel65.setIcon(new javax.swing.ImageIcon("src/main/images/ee.jpeg"));
        jLabel65.setText("jLabel2");
        getContentPane().add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(694, 675, 182, 289));

        jLabel66.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        jLabel66.setText(" Everything Everywhere All At Once");
        getContentPane().add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(882, 675, -1, -1));

        jLabel67.setFont(new java.awt.Font("Helvetica Neue", 1, 14));
        jLabel67.setText("Description:");
        getContentPane().add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(882, 704, -1, -1));

        jLabel72.setText("<html> &emsp &emsp Directed by Daniel Kwan and Daniel Scheinert, collectively known as Daniels, the film is a hilarious and big-hearted sci-fi action-adventure about an exhausted Chinese American woman (Michelle Yeoh) who can't seem to finish her taxes. <br>                  <strong> <b>  Director: </b> </strong> <br>                 &emsp &emsp Dan Kwan, Daniel Scheinert <br>                  <strong> <b>  Genre: </b> </strong> <br>                 &emsp &emsp Action, Comedy <br>                 <strong> <b>  Length: </b> </strong> <br>                 &emsp &emsp 2h 19min                 </html>");
        getContentPane().add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(882, 728, 518, 166));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1480, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1480, 990));
        pack();
    }


}