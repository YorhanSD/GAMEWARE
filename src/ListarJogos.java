
public class ListarJogos {

    Criar cri = new Criar();

    public void listagem() {

        System.out.println("\nLista de jogos");

        for (Game jogo : cri.listarJogos) {
            System.out.println("\nID : " + jogo.getID());
            System.out.println("Nome : " + jogo.getNome());
            System.out.println("Editora : " + jogo.getEditora());
        }

    }

}
