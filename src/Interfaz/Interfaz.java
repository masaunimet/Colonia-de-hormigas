
package Interfaz;

import java.awt.EventQueue;
import javax.swing.JOptionPane;
import proyectofinal.ProyectoFinal;
import static proyectofinal.ProyectoFinal.grafo;
import Interfaz.Surface;
import proyectofinal.Archivo;
import proyectofinal.Grafo_MA;
import proyectofinal.Hormiga;
import static proyectofinal.ProyectoFinal.hormigas;
import proyectofinal.Vertice;

public class Interfaz extends javax.swing.JFrame {

    
    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        eliminarCiudad = new javax.swing.JButton();
        nuevaSimulacion = new javax.swing.JButton();
        eliminarCamino = new javax.swing.JButton();
        guardarGrafo = new javax.swing.JButton();
        cargarGrafo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cambiarValores = new javax.swing.JToggleButton();
        agregarCiudad = new javax.swing.JButton();
        agregarCamino = new javax.swing.JButton();
        mostrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eliminarCiudad.setText("Eliminar Ciudad");
        eliminarCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarCiudadActionPerformed(evt);
            }
        });
        jPanel1.add(eliminarCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 130, -1));

        nuevaSimulacion.setText("Nueva Simulacion");
        nuevaSimulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaSimulacionActionPerformed(evt);
            }
        });
        jPanel1.add(nuevaSimulacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, -1, -1));

        eliminarCamino.setText("Eliminar Camino");
        eliminarCamino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarCaminoActionPerformed(evt);
            }
        });
        jPanel1.add(eliminarCamino, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 130, -1));

        guardarGrafo.setText("Guardar Grafo");
        guardarGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarGrafoActionPerformed(evt);
            }
        });
        jPanel1.add(guardarGrafo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 130, -1));

        cargarGrafo.setText("Cargar Grafo");
        cargarGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarGrafoActionPerformed(evt);
            }
        });
        jPanel1.add(cargarGrafo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 130, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("PROYECTO I");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        cambiarValores.setText("Cambiar Valores");
        cambiarValores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarValoresActionPerformed(evt);
            }
        });
        jPanel1.add(cambiarValores, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 130, -1));

        agregarCiudad.setText("Agregar Ciudad");
        agregarCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarCiudadActionPerformed(evt);
            }
        });
        jPanel1.add(agregarCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 130, -1));

        agregarCamino.setText("Agregar Camino");
        agregarCamino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarCaminoActionPerformed(evt);
            }
        });
        jPanel1.add(agregarCamino, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 130, -1));

        mostrar.setText("Mostrar Grafo");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });
        jPanel1.add(mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 410, -1));

        jLabel2.setText("Hecho por: Tony Cunsolo y Yoselyn Morle");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void cambiarValoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarValoresActionPerformed
        
        try{
           
            int alfa = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo valor de alpha (Predeterminado: 1): "));
            int beta = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el nuevo valor de beta (Predeterminado: 2): "));
            double phi = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el nuevo valor de phi (Predeterminado: 0.1): "));
            grafo.setAlfa(alfa);
            grafo.setBeta(beta);
            grafo.setPhi(phi);
            
        }catch(Exception e){
        
            JOptionPane.showMessageDialog(null, "Error. Asegurese de ingresar un numero valido");
        }
        
        
    }//GEN-LAST:event_cambiarValoresActionPerformed

    private void eliminarCaminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarCaminoActionPerformed
        
        if (grafo.getNumVertices() != 0) {
           
            try{
           
                String name = JOptionPane.showInputDialog(null,"Ingrese el nombre de la Ciudad nro 1: ").toLowerCase();
                String name2 = JOptionPane.showInputDialog(null,"Ingrese el nombre de la Ciudad nro 2: ").toLowerCase();
            
                int p = grafo.ObtenerPosicionVertice(name);
                int d = grafo.ObtenerPosicionVertice(name2);
            
                if (p == -1 || d == -1) {
                
                    JOptionPane.showMessageDialog(null, "La ciudad o ciudades ingresadas no existen");
                }
                else{
            
                    grafo.EliminarArista(p, d);
            }
          
            }
            catch(Exception e){
            
                JOptionPane.showMessageDialog(null, "Error. Ingrese un numero valido");
            }
        }
        else{
        
            JOptionPane.showMessageDialog(null, "No hay Caminos para eliminar");
        }
        
        
        
        
    }//GEN-LAST:event_eliminarCaminoActionPerformed

    private void agregarCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarCiudadActionPerformed
        
        try{
        
            String name = JOptionPane.showInputDialog(null,"Ingrese el nombre de la Ciudad: ").toUpperCase();
            
            if (name.equals("")) {
                
                JOptionPane.showMessageDialog(null, "Error. Ingrese un nombre valido");
            }
            else{
            
                grafo.InsertaVertice(name);
            }
        }
        catch(Exception e){
        
            JOptionPane.showMessageDialog(null, "Error. Ingrese un nombre valido");
        }
    }//GEN-LAST:event_agregarCiudadActionPerformed

    private void agregarCaminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarCaminoActionPerformed
        
        
        if (grafo.getNumVertices() != 0) {
            
            try{
            
                int value = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la distancia entre las ciudades: "));
                String name = JOptionPane.showInputDialog(null,"Ingrese el nombre de la Ciudad nro 1: ").toLowerCase();
                String name2 = JOptionPane.showInputDialog(null,"Ingrese el nombre de la Ciudad nro 2: ").toLowerCase();
            
                int p = grafo.ObtenerPosicionVertice(name);
                int d = grafo.ObtenerPosicionVertice(name2);
            
                if (p == -1 || d == -1) {
                
                    JOptionPane.showMessageDialog(null, "La ciudad o ciudades ingresadas no existen");
                }
                else{
            
                    grafo.InsertaArista(p, d, value);
                }
          
            }
            catch(Exception e){
            
                JOptionPane.showMessageDialog(null, "Error. Ingrese un numero valido");
            }
            
        }
        else{
        
            JOptionPane.showMessageDialog(null, "No hay Ciudades en el grafo. No se pueden agregar caminos");
        }
        
    }//GEN-LAST:event_agregarCaminoActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed

        // TO DO NO APARECEN EN POSICIONES ALEATORIAS
        
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                ProyectoFinal ex = new ProyectoFinal();
                ex.setVisible(true);
            }
        });

    }//GEN-LAST:event_mostrarActionPerformed

    private void eliminarCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarCiudadActionPerformed
        
        if (grafo.getNumVertices() != 0) {
            
            grafo.EliminarCiudad(JOptionPane.showInputDialog("Ingrese el nombre de la ciudad a eliminar: "));
        }
        else{
        
            JOptionPane.showMessageDialog(null, "No hay Ciudades para eliminar");
        }
        
        
        
    }//GEN-LAST:event_eliminarCiudadActionPerformed

    private void nuevaSimulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaSimulacionActionPerformed
        
        if (grafo.getNumVertices() < 4) {
            
            JOptionPane.showMessageDialog(null, "Debe existir un minimo de 4 vertices para Iniciar una simulacion");
        }
        else{
        
            try{
            
                grafo.IniciarFeromonas();
        
                int numHormigas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de Hormigas (Max 50): ")) ;
            
                if (numHormigas > 50) {
                
                    JOptionPane.showMessageDialog(null, "El numero maximo de hormigas es 50.");
                
                }
                else{
            
                    for (int i = 0; i < numHormigas; i++) {
                    
                        hormigas[i] = new Hormiga(grafo);
                    
                    }
                
                    for (int i = 0; i < numHormigas; i++) {
                    
                        while(hormigas[i].isDestino() != true){
                    
                            int posI = hormigas[i].getPosicion();
                            int posA = hormigas[i].getPosA();
                            hormigas[i].SiguientePosicion(posI, posA);
                        }
                    
                        System.out.println(hormigas[i].ImprimirRecorrido());
                        System.out.println(hormigas[i].ImprimirDistanciaRecorrida());
                    
                    }
                    
                    System.out.println("La mejor ruta es: ");
                    
                    int [] perfecto =grafo.dijkistra();
                    
                    Vertice [] temp = grafo.getVertices();
                
                    for (int i = 0; i < perfecto.length; i++) {
                        
                        if(i ==perfecto.length-1){
                        
                            System.out.print(temp[perfecto[i]].getDato());
                            break;
                        }
                        
                        if(perfecto[i] != -1){
                        
                            System.out.print(temp[perfecto[i]].getDato()+", ");
                        }
                    }
                }
            }catch(Exception e){
        
                JOptionPane.showMessageDialog(null, "Error. Inserte un numero entero valido");
            
            }
        }
        
    }//GEN-LAST:event_nuevaSimulacionActionPerformed

    private void cargarGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarGrafoActionPerformed
        
        Archivo archivo = new Archivo();
        
        Grafo_MA temp = new Grafo_MA();
        
        String ruta =JOptionPane.showInputDialog(null, "Coloque la direccion del archivo a cargar");
        
        temp = archivo.CargarGrafo(ruta);
        
        if(temp ==null){
        
            JOptionPane.showMessageDialog(null, "El archivo no se ha encontrado o no funciona para este programa");
        }
        else{
            
            grafo = temp;
            JOptionPane.showMessageDialog(null, "La operacion se ha realizado con exito");
        }
        
        
    }//GEN-LAST:event_cargarGrafoActionPerformed

    private void guardarGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarGrafoActionPerformed
        
        if(grafo.getNumVertices()>=4){
        
            String nombre =JOptionPane.showInputDialog(null, "Que nombre quiere ponerle al archivo.txt?");
            
            Archivo archivo = new Archivo();
            
            archivo.GuardarGrafo(nombre, grafo);
            
            JOptionPane.showMessageDialog(null, "El txt se ha guardado en 'test\\'");
        }
        else{
        
            JOptionPane.showMessageDialog(null, "El grafo necesita m??s vertices");
        }
    }//GEN-LAST:event_guardarGrafoActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarCamino;
    private javax.swing.JButton agregarCiudad;
    private javax.swing.JToggleButton cambiarValores;
    private javax.swing.JButton cargarGrafo;
    private javax.swing.JButton eliminarCamino;
    private javax.swing.JButton eliminarCiudad;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton guardarGrafo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton mostrar;
    private javax.swing.JButton nuevaSimulacion;
    // End of variables declaration//GEN-END:variables
}
