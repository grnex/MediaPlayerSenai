package model;


public class Playlist {
    public int IdPlaylist;
    public String NomePlaylist;


    public Playlist (int IdPlaylist, String NomePlaylist){
        this.IdPlaylist = IdPlaylist;
        this.NomePlaylist = NomePlaylist;
    }

    public void CriarPlaylist () {
        System.out.println("Teste CriarPlaylist: ");

    }

    public void TocarAleatorio () {
        System.out.println(" Teste TocarAleatorio: ");

    }

    public void CriarPlaylitInteligente () {
        System.out.println(" Teste CriarPlaylistInteligente: ");

    }

}
