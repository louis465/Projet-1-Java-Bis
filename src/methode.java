
import java.util.Scanner;

public class methode {
    Scanner sc = new Scanner(System.in);

    /**
     * Display all available game type.
     */
    public void displayAvailableGame() {
        System.out.println("Choix du jeu");
        System.out.println("1 - Challenger");
        System.out.println("2 - Défenseur");
        System.out.println("3 - Duel");
        System.out.println("4 - Quitter");
        System.out.println("A quel mode souhaitez-vous jouer?");
    }

    /**
     * Run asking process for a Game.
     */
    public void runGame() {
        this.displayAvailableGame();
        int nbGame;
        String gameMode = new String("");
        do {
            nbGame = sc.nextInt();
            switch (nbGame) {
                case 1:
                    gameMode = ("challenger");
                    System.out.println("Vous avez choisi le mode: " + gameMode);
                    break;
                case 2:
                    gameMode = ("defenseur");
                    System.out.println("Vous avez choisi le mode: " + gameMode);
                    break;
                case 3:
                    gameMode = ("duel");
                    System.out.println("Vous avez choisi le mode: " + gameMode);
                    break;
                case 4:
                    System.out.println("Une autre fois, au revoir");
                default:
                    System.out.println("Vous n'avez pas choisi de modes parmi ceux proposés");
                    this.displayAvailableGame();

            }
        } while (nbGame < 1 || nbGame > 4);
    }
}