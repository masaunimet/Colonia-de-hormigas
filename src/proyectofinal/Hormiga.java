
package proyectofinal;

import javax.swing.JOptionPane;

public class Hormiga {
    
    private int numero_hormigas;
    private Grafo_MA grafo;
    private int[] recorrido;
    private int posicion;
    private int ciudadesVisitadas;
    private int distancia_recorrida;
    private int posA;
    private boolean destino;
        
    // Constructor
    
    public Hormiga (Grafo_MA grafo){

        this.grafo = grafo;
        
        this.posicion = grafo.getCiudadI();
        
        recorrido = new int[grafo.getNumVertices()];
        
        this.ciudadesVisitadas = 1;
        
        this.distancia_recorrida = 0;
        
        this.posA = -1;
        
        this.destino = false;
    }
    
    // Getters and Setters

    public int getNumero_hormigas() {
        return numero_hormigas;
    }

    public void setNumero_hormigas(int numero_hormigas) {
        this.numero_hormigas = numero_hormigas;
    }

    public Grafo_MA getGrafo() {
        return grafo;
    }

    public void setGrafo(Grafo_MA grafo) {
        this.grafo = grafo;
    }

    public int[] getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(int[] recorrido) {
        this.recorrido = recorrido;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getCiudadesVisitadas() {
        return ciudadesVisitadas;
    }

    public void setCiudadesVisitadas(int ciudadesVisitadas) {
        this.ciudadesVisitadas = ciudadesVisitadas;
    }

    public int getDistancia_recorrida() {
        return distancia_recorrida;
    }

    public void setDistancia_recorrida(int distancia_recorrida) {
        this.distancia_recorrida = distancia_recorrida;
    }

    public int getPosA() {
        return posA;
    }

    public void setPosA(int posA) {
        this.posA = posA;
    }

    public boolean isDestino() {
        return destino;
    }

    public void setDestino(boolean destino) {
        this.destino = destino;
    }
    
    
    
    // Metodos y Funciones
    
    public double CalcularProbabilidad(int p, int d){
            // Calcular probabilidad de pasar de Vertice Posicion a Vertice Destino
            double prob, sum = 0.00;

            int alfa = grafo.getAlfa();

            int beta = grafo.getBeta();

            for (int i = 0; i < grafo.getNumVertices(); i++) {

                if (grafo.getMatrizAdy()[p][i]) {

                    sum += ((double) Math.pow(grafo.getFeromonas()[p][i], alfa) * (double) Math.pow(((double) 1)/(double) grafo.getAristasvalor()[p][i] , beta) );
                }

            }

            prob = (double) Math.pow(grafo.getFeromonas()[p][d], alfa) * (double) Math.pow(((double)1/(double)grafo.getAristasvalor()[p][d]), beta) / sum;

            return prob;
        }

    public void SiguientePosicion(int p,int j){ // p = vertice en donde esta, j = vertice anterior
            
            
            //el camino siguiente de la hormiga sin que pueda repetir el anterior camino
          
                double [] probabilidades = new double[grafo.getNumVertices()];

                double num = Math.random();

                for (int i = p; i < grafo.getNumVertices(); i++) {

                    if(i != j){

                        if(grafo.getMatrizAdy()[p][i] ){

                            if(probabilidades[0] == 0.0){

                                probabilidades [i] = CalcularProbabilidad(p, i);
                            }

                            else{

                                probabilidades [i] = probabilidades [i-1] +CalcularProbabilidad(p, i);
                            }
                        }
                    }
                }

                for (int i = 0; i < grafo.getNumVertices(); i++) {

                    if(( 0 < num ) && ( num <= probabilidades[i])){

                        distancia_recorrida += grafo.getAristasvalor()[i][this.getPosicion()];
                        
                        posA = this.getPosicion();
                        
                        this.setPosicion(i);
                    
                        recorrido[ciudadesVisitadas] = i;
                    
                        ciudadesVisitadas++;
                        
                        
                        
                        if (this.getPosicion() == grafo.getCiudadF()) {
                            
                            this.setDestino(true);
                        }
                    }
                }
              
        }
    
    public String ImprimirRecorrido(){
    
        Vertice [] vertices = grafo.getVertices();
        
        String trayectoria = "" + Integer.toString(grafo.getCiudadI());
        
        for (int i = 0; i < ciudadesVisitadas; i++) {
            
            int index_vertice = recorrido[i];
            
            trayectoria += vertices[index_vertice].getDato() + ", ";
            
        }
        
        return trayectoria;
    }
    
    public int ImprimirDistanciaRecorrida(){
        
        return distancia_recorrida;
        
    }
}
