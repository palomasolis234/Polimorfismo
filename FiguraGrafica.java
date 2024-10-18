public abstract class FiguraGrafica {
    
    protected String figura;
    
    public FiguraGrafica(){
        this("cuadrado");
    }
    
    public FiguraGrafica(String figura){
        this.figura = figura;
    }

    public abstract void dibujar (Graphics g);
    
    public abstract void encojer(Graphics g);
    
   public abstract void agrandar(Graphics g);
        
    public abstract void cambiarColor(Graphics g, Color c);
      
    public abstract void mover(Graphics g, String direccion);
        // WTF?
        // Como muevo a un triangulo!!!???
        // Esto no estaba en mi contrato!!!
    }

