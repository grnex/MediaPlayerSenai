package app;

import java.util.Scanner;

public class Main {

    enum EstadoPlayer {
        PARADO,
        CARREGANDO,
        TOCANDO,
        PAUSADO,
    }

    static EstadoPlayer estadoAtual = EstadoPlayer.PARADO;

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n=== Sonora ===");
            System.out.println("Estado atual: " + estadoAtual);
            System.out.println("-------");
            System.out.println("[1] Selecionar Musica");
            System.out.println("[2] Iniciar Musica");
            System.out.println("[3] Pausar Musica");
            System.out.println("[4] Parar Musica");
            System.out.println("[5] Mostrar Estado");
            System.out.println("[0] Sair");
            System.out.println("-------");
            System.out.print("Escolha uma opcao: ");

            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    selecionarMusica();
                    break;

                case 2:
                    reproduzir();
                    break;

                case 3:
                    pausar();
                    break;

                case 4:
                    parar();
                    break;

                case 5:
                    mostrarEstado();
                    break;

                case 0:
                    System.out.println("Encerrando o sistema");
                    break;

                default:
                    System.out.println("Opcao invalida");
                    break;
            }

        } while (opcao != 0);

        leia.close();
    }


    static void selecionarMusica() {

        if (estadoAtual == EstadoPlayer.PARADO) {

            estadoAtual = EstadoPlayer.CARREGANDO;

            System.out.println("Carregando musica...");

            mostrarEstado();

        } else {
            System.out.println("Não é possível selecionar uma música nesse estado.");
        }
    }


    static void musicaCarregada() {

        if (estadoAtual == EstadoPlayer.CARREGANDO) {

            estadoAtual = EstadoPlayer.TOCANDO;

            System.out.println("Musica iniciada...");

            mostrarEstado();
        }
    }


    static void reproduzir() {

        if (estadoAtual == EstadoPlayer.CARREGANDO) {

            musicaCarregada();

        } else if (estadoAtual == EstadoPlayer.PAUSADO) {

            estadoAtual = EstadoPlayer.TOCANDO;

            System.out.println("Continuando musica...");

            mostrarEstado();

        } else if (estadoAtual == EstadoPlayer.TOCANDO) {

            System.out.println("A musica já está tocando.");

        } else {

            System.out.println("Selecione uma musica primeiro.");
        }
    }


    static void pausar() {

        if (estadoAtual == EstadoPlayer.TOCANDO) {

            estadoAtual = EstadoPlayer.PAUSADO;

            System.out.println("Musica pausada.");

            mostrarEstado();

        } else {

            System.out.println("Não é possível pausar nesse estado.");
        }
    }


    static void parar() {

        if (estadoAtual == EstadoPlayer.TOCANDO
                || estadoAtual == EstadoPlayer.PAUSADO) {

            estadoAtual = EstadoPlayer.PARADO;

            System.out.println("Musica parada.");

            mostrarEstado();

        } else {

            System.out.println("Não existe musica tocando para parar.");
        }
    }


    static void mostrarEstado() {

        System.out.println("Estado atual do player: " + estadoAtual);
    }
}