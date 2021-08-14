/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import view.VistaRequerimientosReto4;
import util.JDBCUtilities;
import view.VistaConstructoraGui;
/**
 *
 * @author messe
 */
public class Main {

    /**
     * @param args the command line arguments
     */
            
    public static void main(String[] args) {
        // TODO code application logic here
        // Requerimiento 1 reto 3
        
        System.out.println(VistaRequerimientosReto4.requerimiento1());

        // Requerimiento3 - Reto 4
        
        System.out.println(VistaRequerimientosReto4.requerimiento3());

        // Requerimiento4 - Reto3
        
        System.out.println(VistaRequerimientosReto4.requerimiento4());
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaConstructoraGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaConstructoraGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaConstructoraGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaConstructoraGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        VistaConstructoraGui ventana = new VistaConstructoraGui();
        ventana.setVisible(true);
    }
   

        /* Create and display the form */
        
}
