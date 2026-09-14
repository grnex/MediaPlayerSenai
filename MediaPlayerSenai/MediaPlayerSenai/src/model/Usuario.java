package model;

public class Usuario {
    public int IdUsuario;
    public String NomeUsuario;
    public String SenhaUsuario;
    public String EmailUsuario;

    public Usuario (int IdUsuario, String NomeUsuario, String SenhaUsuario, String EmailUsuario) {
        this.IdUsuario = IdUsuario;
        this.NomeUsuario =  NomeUsuario;
        this.SenhaUsuario = SenhaUsuario;
        this.EmailUsuario = EmailUsuario;
    }

    public void CadastrarUsuario (){
        System.out.println("Teste CadastrarUsuario");
    }

}


