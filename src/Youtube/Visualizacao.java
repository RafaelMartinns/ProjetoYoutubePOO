
package Youtube;



public class Visualizacao {
    private Usuario espectador;
    private Video filme;
    
    public Visualizacao(Usuario espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.viuMaisUm();
        this.filme.setViews(this.filme.getViews()+1);
    }
    
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }

    
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    
    }
    public void avaliar(float porcentagem){
        int tot=0;
        if (porcentagem<=30) {
            tot=3;
        }else if(porcentagem<=50){
            tot=5;
        }else if(porcentagem <=80){
            tot=8;
        }else if(porcentagem<100){
            tot=90;
        }else{
            tot=10;
        }
        this.filme.setAvaliacao(tot);
    
    }

    public Usuario getEspectador() {
        return espectador;
    }

    public void setEspectador(Usuario espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
    
    public String detalhesVisualizacao(){
        
        return "--Vizualização--\n"
                +this.espectador.nome+"\n"
                + this.filme.getTitulo();
    }
}
