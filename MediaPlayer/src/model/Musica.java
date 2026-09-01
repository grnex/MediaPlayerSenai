package model;

public class Musica {
    public int IdMusica;
    public String Artista;
    public String NomeMusica;
    public String GeneroMusica;
    public int ContadorMusica;


    public Musica (int IdMusica, String Artista, String NomeMusica, String GeneroMusica, int ContadorMusica) {
        this.IdMusica = IdMusica;
        this.Artista = Artista;
        this.NomeMusica = NomeMusica;
        this.GeneroMusica = GeneroMusica;
        this.ContadorMusica = ContadorMusica;
    }



    public void CriarMusica() {
        System.out.println("Teste CriarMusica");
    }
}
