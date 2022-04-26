import java.util.Scanner;

public class Editar {

    Scanner scan = new Scanner(System.in);
    private long numeroID;
    private int continuar;
    private int escolha;

    public void menuEditar() {

        System.out.print("Digite o ID do jogo que deseja editar: ");

        numeroID = scan.nextLong();
        editarJogo(numeroID);
    }

    public Boolean editarJogo(long id) {

        Criar cri = new Criar();
        //Game jogo = new Game();

        for (Game game : cri.listarJogos) {
            try {

                if (game.getID() == id) {

                    System.out.println("Nome : " + game.getNome());
                    System.out.println("Editora : " + game.getEditora());

                    menuEdicao(game);
                }

            } catch (Exception e) {
                System.out.println("ERRO: O ID digitado não existe");
                return false;
            }
        }

        return true;
    }

    public void menuEdicao(Game editarJogo) {
     
        //editarJogo = new Game();
    do{

        System.out.println("\n||=MENU=DE=EDICAO=||\n");

        System.out.println(" 1 --> Novo Nome");
        System.out.println(" 2 --> Nova Editora");

        System.out.println("Escolha uma das opcoes: ");
        escolha = scan.nextInt();
    
        switch(escolha){

            case 1:

            System.out.println("Digite o novo nome: ");
            editarJogo.setNome(scan.next());
            System.out.println("\nSUCESSO: Jogo editado");

            break;

            case 2:
            
            System.out.println("Digite a nova editora: ");
            editarJogo.setEditora(scan.next());
            System.out.println("\nSUCESSO: Jogo editado");

            break;
        }

        System.out.println("Voce deseja continuar a edicao: ");
        System.out.println(" 1 --> SIM");
        System.out.println(" 2 --> NÃO");
        continuar = scan.nextInt();

    }while(continuar != 2);

    }
}
