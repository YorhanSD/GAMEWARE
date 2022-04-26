import java.util.Scanner;

public class Hud {

    Scanner scan = new Scanner(System.in);
    ListarJogos lj = new ListarJogos();
    Editar edit = new Editar();
    Criar cri = new Criar();
    Deletar del = new Deletar();
    Game jogo = new Game();

    private int numeroSelecionado;
    private int resposta;

    public void HudTelaOpcoes() {
        do {
            System.out.println("\n==========GAMEWARE==========\n");

            System.out.println("(1) Criar Novo Jogo");
            System.out.println("(2) Editar Jogo");
            System.out.println("(3) Ver Jogos");
            System.out.println("(4) Deletar Jogo");
            System.out.println("(5) Sair\n");

            System.out.print("Digite o numero da opcao desejada: \n");
            numeroSelecionado = scan.nextInt();

            switch (numeroSelecionado) {
                case 1:
                    cri.criandoNovoJogo();
                    break;
                case 2:
                    edit.menuEditar();
                    break;
                case 3:
                    lj.listagem();
                    break;
                case 4:
                    del.menuDeletar();
                break;
                case 5:
                    System.exit(0);
                break;
            }

            System.out.print("\nDeseja voltar ao menu inicial? \n");
            System.out.println("Responda com: 1 para sim e 2 para não");
            resposta = scan.nextInt();

        } while (resposta != 2);
    }
}
