
public class App {
    public static void main(String[] args) throws Exception {

        Game jogo = new Game();
        Criar cri = new Criar();

        jogo.setID(cri.addID);
        jogo.setNome("Batman : Arkham City");
        jogo.setEditora("Warner Bros");
        cri.criarJogo(jogo);

        Hud hud = new Hud();

        hud.HudTelaOpcoes();
        
    }
}
