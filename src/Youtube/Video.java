
package Youtube;



public class Video implements AcoesVideo{
    
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    private int totAvaliacao;
    
    public String detalhesVideo(){
        
        return "---"+this.titulo+"---\n"
                + this.views+" views\n"
                + this.curtidas+" curtidas\n"
                + "Avaliação: "+this.avaliacao+ "\n"
                + "Reproduzindo: "+ this.reproduzindo;
    }
    
    @Override
    public void play() {
        if (this.reproduzindo==false) {
            this.reproduzindo=true;
            this.views++;
            System.out.println("Assistindo...");
        }else {
            System.out.println("Ja está reproduzindo!");
        }
        
        
    }

    @Override
    public void pause() {
        if (this.reproduzindo) {
            this.reproduzindo=false;
            System.out.println("Pausado.");
        }else {
            System.out.println("Ja está pausado!");
        }
    }

    @Override
    public void like() {
        this.curtidas++;
        System.out.println("Curtido!");
    }

    public Video(String titulo) {
        this.titulo = titulo;
        
    }
    
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.totAvaliacao+=avaliacao;
        
        
        this.avaliacao= (totAvaliacao/this.views);
       
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    public int getTotAvaliacao() {
        return totAvaliacao;
    }

    public void setTotAvaliacao(int totAvaliacao) {
        this.totAvaliacao = totAvaliacao;
    }
    
    
}
