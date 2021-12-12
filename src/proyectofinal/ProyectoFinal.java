
package proyectofinal;

import Interfaz.Interfaz;
import java.awt.EventQueue;
import javax.swing.JFrame;
import Interfaz.*;


public class ProyectoFinal extends JFrame {

    public static Grafo_MA grafo = new Grafo_MA();
    public static Hormiga[] hormigas = new Hormiga[50];
    
        public ProyectoFinal() {

            initUI();
        }

        private void initUI() {

        add(new Surface());

        setTitle("Proyecto I");
        setSize(700, 700);
        setLocationRelativeTo(null);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
        
        
    public static void main(String[] args) {
        
        Interfaz interfaz = new Interfaz();
        interfaz.setVisible(true);
        
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                ProyectoFinal ex = new ProyectoFinal();
                ex.setVisible(false);
            }
        });
        
        
        
        
        /* TO DO
        
            1. El tema de las Hormigas... 
            2. Nueva Simulacion
            3. Ajustar nuevamente Cargar y Guardar grafo (Impemente 3 variables nuevas en el grafo y un metodo)(phi, alfa, beta)
        
            -- Si da tiempo -- 
        
            1. Limites en el grafo (un vertice en el borde)
            2. Un vertice encima de otro
        
        */
        
    }
}
