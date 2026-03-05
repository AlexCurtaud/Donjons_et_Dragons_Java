import Characters.Wizard;
import DefensiveEquipment.Potion;
import Gameplay.Game;

public class Main {
    public static void main(String [] args) {
//        Game game = new Game();
//        game.gameRunning();
        int j = 20, i = 0;
            try {
                System.out.println(" =>" + (1 / 0));
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("action faite systématiquement");
            }
        }
    }