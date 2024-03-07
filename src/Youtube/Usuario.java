
package Youtube;

public class Usuario extends Pessoa{
    
    private String login;
    private int totAssistido;

    public Usuario(String nome, int idade, String sexo,String login) {
        super(nome, idade, sexo);
        this.login=login;
    }
    
    public String detalhesUsuario(){
        
        return "-----\n"
                +this.nome+"\n"
                + this.idade+ " anos\n"
                + this.sexo+"\n"
                +"Login: "+this.login+"\n"
                +"Total de videos assistidos: "+ this.totAssistido;
    }

    @Override
    public void ganharExp() {
        this.experiencia+=5;
    }
    
    public void viuMaisUm(){
        this.totAssistido++;
        this.ganharExp();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
    
    
}
