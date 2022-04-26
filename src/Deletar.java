import java.util.Scanner;

public class Deletar {

    Scanner scan = new Scanner(System.in);
    private long numeroID;

    public void menuDeletar() {

        System.out.print("Digite o ID do jogo que deseja deletar: ");

        numeroID = scan.nextLong();
        deletarJogo(numeroID);
    }

    private void deletarJogo(long id) {

        Criar cri = new Criar();
        Game jogo = new Game();

        for (Game game : cri.listarJogos) {

            if (game.getID() == id) {
                cri.listarJogos.remove(game);
                System.out.println("SUCESSO : jogo deletado");
            }
        }
    }

}
