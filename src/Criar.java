import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Criar {

    Scanner scan = new Scanner(System.in);

    public static List<Game> listarJogos = new ArrayList<Game>();

    public int resposta = 1;

    public long addID = 1;

    public Boolean criarJogo(Game jogo) {
        try {
            listarJogos.add(jogo);

        } catch (Exception e) {

            System.out.println("\nERRO: Não foi possivel criar o jogo");
            return false;
        }

        System.out.println("\nSUCESSO: Jogo criado");
        return true;
    }

    public void criandoNovoJogo() {

        do{

            Game jogo = new Game();

            addID++;
            jogo.setID(addID);
            System.out.print("\nDigite o nome do jogo: ");
            jogo.setNome(scan.next());
            System.out.print("\nDigite o nome da editora: ");
            jogo.setEditora(scan.next());

            criarJogo(jogo);

            System.out.print("\nDeseja criar mais algum jogo? \n");
            System.out.println("Responda com: 1 para sim e 2 para não");
            resposta = scan.nextInt();

            if (resposta == 1) {
                resposta = 1;
            } else if (resposta == 2) {
                resposta = 2;
            } else {
                System.out.println("\nERRO: Resposta invalida");
                resposta = 2;
            }

        }while (resposta != 2);
    }
}
