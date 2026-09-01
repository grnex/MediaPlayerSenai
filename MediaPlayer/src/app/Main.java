package app;
import model.Funcionalidades;
import model.Musica;
import model.Playlist;
import model.Usuario;
import java.util.Scanner;


public class Main {
    public static  void main (String[] args) {
        Musica musica = new Musica (1,"Billie Elish","ABCD" , "POP", 0);
        Playlist playlist1 = new Playlist(1,"Playlist do amor");
        Usuario usuario1 = new Usuario(1,"Gustavo Rodrigues", "senha123", "Gustavo@gmail.com");
        Funcionalidades funcionalidades = new Funcionalidades();



        funcionalidades.Tocar();
        funcionalidades.Pausar();
        funcionalidades.Pesquisar();

        funcionalidades.SalvarMusica();
        funcionalidades.RepetirMusica();
        funcionalidades.PularMusica();
        funcionalidades.VoltarMusica();

        funcionalidades.TocarPlaylist();
        funcionalidades.SalvarPlaylist();
        funcionalidades.ExportarPlaylist();
        funcionalidades.RepetirPlaylist();

        playlist1.CriarPlaylist();

        System.out.println("Usuario cadastrado \nNome: " + usuario1.NomeUsuario + " Email: " + usuario1.EmailUsuario);
        System.out.println("Musica Cadastrada \nNome da musica: " + musica.NomeMusica  + "\nArtista: " + musica.Artista);
        System.out.println("Playlist Cadastrada \nNome: " + playlist1.NomePlaylist);

    }
}