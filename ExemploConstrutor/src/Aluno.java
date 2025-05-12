public class Aluno {
    private int ra;
    private String nome;
    private String login;
    private String password;
    //Construtor padrao
    public Aluno(){

    }
    //Recebe dois argumentos
    public Aluno(String login, String password){
        this.login = login;
        this.password = password;
    }

    //REcebe todos os argumentos
    public Aluno(int ra, String nome, String login, String password ){
        this(login, password);
        this.ra = ra;
        this.nome = nome;
    }

    public int getRa() {
        return ra;
    }
    public void setRa(int ra) {
        this.ra = ra;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}