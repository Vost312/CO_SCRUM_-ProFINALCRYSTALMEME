/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceisw;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author rabaj
 */
public class Scrum extends javax.swing.JFrame {

    /**
     * Creates new form Scrum
     */
    public Scrum() {
        initComponents();
         getContentPane().setBackground(new Color (0,61,121));
        ImageIcon imagen1=new ImageIcon(getClass().getResource("/imagenes/scrum-head.png"));
        Icon fondo1=new ImageIcon(imagen1.getImage().getScaledInstance(dorado2.getWidth(), dorado2.getHeight(), Image.SCALE_DEFAULT));
        dorado2.setIcon(fondo1);
        this.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        dorado2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SCRUM");
        setResizable(false);

        jTextArea1.setBackground(new java.awt.Color(213, 159, 15));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("------------------------------------------¿QUÉ ES UNA METODOLOGÍA ÁGIL?----------------------------------------\n\nLas metodologías agiles son, en cuestion, la gestión que permiten adaptar la forma\nde trabajo al contexto y naturaleza de un proyecto,\nbasándose en la flexibilidad y la inmediatez,\ny teniendo en cuenta las exigencias del mercado y los clientes.\nLos pilares fundamentales de las metodologías ágiles son el trabajo colaborativo y en equipo.\n\n--------------------------------------------------¿QUÉ ES SCRUM?-------------------------------------------------------\n\nScrum es un marco de trabajo en el que equipos cross-funcionales pueden crear productos\no desarrollar proyectos de una forma iterativa e incremental. El desarrollo se estructura\nen ciclos de trabajo llamados Sprints. Al principio de cada Sprint, un Equipo cross-funcional\n(de en torno a siete personas) selecciona elementos (peticiones del cliente) de una lista priorizada.\nEl equipo acuerda un objetivo colectivo respecto a lo que creen que podrán entregar al final del\nSprint, algo que sea tangible y que estará “terminado” por completo.\n\nTodos los días el Equipo se reúne brevemente para inspeccionar su progreso y ajustar los siguientes\npasos necesarios para completar el trabajo pendiente. Al final del Sprint, el Equipo revisa el Sprint\ncon los diferentes Stakeholders (interesados e involucrados en el producto) y realiza una demos-\ntración de lo que han desarrollado.\n\nScrum enfatiza un producto “funcionando” al final del Sprint que esté realmente “terminado\".\nEn el caso del software, esto significa un sistema que está integrado, testado, con la\ndocumentación de usuario generada y potencialmente entregable.\n\n\n---------------------------------------ROLES QUE SE MANEJAN EN SCRUM-------------------------------------------\n\nEn Scrum existen tres roles: Dueño de Producto, Equipo y ScrumMaster. Todos ellos forman lo que \nse conoce como el Equipo Scrum.\n\n+PRODUCT OWNER: Es responsable de maximizar el retorno de inversión\n(ROI por las siglas en ingles ) a base de identificar las funcionalidades de producto, trasladarlas\na una lista priorizada, decidir cuáles deberían estar al principio de la lista para el siguiente Sprint,\ny repriorizar y refinar continuamente dicha lista. El Dueño de Producto es responsable a nivel\nganancias y pérdidas del producto, asumiendo que se trata de un producto comercial. Es importante\nhacer notar que, en Scrum, hay una y sólo una persona que sirve como Dueño de Producto y ejerce\nla autoridad final como tal, y él o ella es responsable del valor del trabajo realizado.\n\n\n+DEVELOPMENT TEAM: Es el que construye lo que el Dueño de Producto indica\npor ejemplo, una aplicación o un sitio Web. El Equipo en Scrum es “cross-funcional” – engloba toda\nla experiencia y conocimiento necesarios para desarrollar un producto potencialmente entregable en\ncada Sprint – y es “auto-organizado” (auto-gestionado), con un amplio margen de autonomía y\nresponsabilidad. El Equipo decide cuántos elementos (del conjunto que ofrece el Dueño de Producto)\nva a desarrollar durante el Sprint y cuál es la mejor manera de lograr dicho objetivo.  \n\n\n+SCRUM MASTER: Es el que ayuda al área de producto a aprender y aplicar Scrum para obtener valor\nde negocio. El ScrumMaster hace todo lo que esté en su mano para ayudar al Equipo, al Dueño de\nProducto y a la organización a tener éxito. El ScrumMaster no es el jefe de los miembros del Equipo,\ncomo tampoco es un jefe de proyecto, líder de equipo o representante del equipo. En su lugar,\nel ScrumMaster sirve al Equipo; ayuda a eliminar impedimentos, protege al Equipo de interferencias\nexternas y les ayuda a adoptar prácticas de desarrollo modernas. El o ella forma, entrena y guía al\nDueño de Producto, al Equipo y al resto de la organización en el uso correcto de Scrum.\n\n\n---------------------------------------HERRAMIENTAS PARA ESTA METODOLOGÍA--------------------------------\n\nTrello y GitHub junto con GitBash\n");
        jScrollPane1.setViewportView(jTextArea1);

        dorado2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 61, 121)));

        jButton1.setBackground(new java.awt.Color(213, 159, 15));
        jButton1.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 61, 121));
        jButton1.setText("Menú Principal");
        jButton1.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton1.setMinimumSize(new java.awt.Dimension(135, 31));
        jButton1.setPreferredSize(new java.awt.Dimension(135, 31));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
                    .addComponent(dorado2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dorado2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PaginaPrincipal pag = new PaginaPrincipal();
        pag.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Scrum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Scrum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Scrum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Scrum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Scrum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dorado2;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
