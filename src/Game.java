public class Game {
    private Menu menu;
    private Board board;
    private Dice dice;

    public Game() {
        this.menu = new Menu();
        menu.gameStart();
        this.board = new Board(10, 7);
        this.dice = new Dice();
    }

    public Character playerCreation() {
        String playerName = menu.retrieveName();
        int playerClass = menu.retrieveCharacterChoice();
        Character character = CharacterFactory.characterCreator(playerName, playerClass);
        return character;
    }

}
