import java.util.Scanner;
import java.util.Random;

public class WelcomeDungeon {
    public static void main(String[] args) {

        //System Objects
        Scanner in = new Scanner(System.in);
        Random rand = new Random();


        // Game Variables
        String[] enemies = {"Skeleton", "Goblin", "Bugbear", "Lich"};
        int maxEnemyHealth = 100;
        int enemyAttackDamage = 20;

        //Player Variables
        int health = 100;
        int attackDamage = 30;
        int numHealthPots = 3; //num of potions our hero starts with
        int healthPotionHealAmount = 25;
        int healthPotionDropChance = 50; //percentage of an enemy dropping a potion

        boolean running = true;


        System.out.println("Welcome to the");
        System.out.println(
                "     _                                        \n" +
                "    | |                                       \n" +
                "  __| |_   _ _ __   __ _  ___  ___  _ __   \n" +
                " / _` | | | | '_ \\ / _` |/ _ \\/ _ \\| '_ \\\n" +
                "| (_| | |_| | | | | (_| |  __/ (_) | | | \\\n" +
                " \\__,_|\\__,_|_| |_|\\__, |\\___|\\___/|_| |_|\n" +
                "                    __/ |                     \n" +
                "                   |___/    ");

        System.out.println("Hero, are you ready to start?");


        if (in.nextLine().equalsIgnoreCase("yes")) {
            System.out.println("What is your name?");
//
            String name = in.nextLine();

            System.out.println("Our hero, " +name+ ", decides to brave their way into the dungeon. As they descend into the overwhelming darkness, they hear an echoing sound ricochet off the damp, stone walls. Something's coming...  " );
        GAME:
        while (running) {
            System.out.println("------------------------------------");


                int enemyHealth = rand.nextInt(maxEnemyHealth);
                String enemy = enemies[rand.nextInt(enemies.length)];
                System.out.println("\t* " + enemy + " appeared! *\n");


                COMBAT:
                while (enemyHealth > 0) {
                    System.out.println("\t" +name+ "'s HP: " + health);
                    System.out.println("\t" + enemy + "'s HP: " + enemyHealth);
                    System.out.println("\n\tWhat would you like to do?");
                    System.out.println("\t1. Attack");
                    System.out.println("\t2. Drink health potion");
                    System.out.println("\t3." +
                            " Run!");
                    System.out.println("\t4. Pray");

                    String input = in.nextLine();
                    if (input.equals("1")) {
                        int damageDealt = rand.nextInt(attackDamage);
                        int damageTaken = rand.nextInt(enemyAttackDamage);

                        enemyHealth -= damageDealt;
                        health -= damageTaken;

                        System.out.println("\t> You strike the " + enemy + " for " + damageDealt + " damage.");
                        System.out.println("\t> You receive " + damageTaken + " amount of damage in retaliation!");

                        if (health < 1) {
                            System.out.println("\t> You have taken too much damage... Tell your mother you love her, you're too weak to go on.");

                            break;
                        }
                    } else if (input.equals("2")) {
                        if (numHealthPots > 0) {
                            health += healthPotionHealAmount;
                            numHealthPots--;
                            System.out.println("\t> You drink a health potion, healing yourself for " + healthPotionHealAmount + " HP."
                                    + "\n\t> You now have " + health + " hp."
                                    + "\n\t> You have " + numHealthPots + " health potions left. \n");

                        } else {
                            System.out.println("\t> You don't have any health potions left! Kill your enemy for a chance to get one.");
                        }
                    } else if (input.equals("3")) {
                        System.out.println("\t> You run away from the " + enemy + "!");
                        continue GAME;

                    } else if (input.equals("4")) {
                        System.out.println("\t> You pray for hope, but no one answers. There's no hope in the Dungeon. The " + enemy + " looks down on you, ready to strike!");

                        continue COMBAT;

                    } else {
                        System.out.println("\t Invalid command. Get it together!");

                    }
                }

                if (health < 1) {
                    System.out.println("You limp out of the dungeon, exhausted from battle.");
                    break;
                }
                System.out.println("------------------------------------");
                System.out.println(" * " + enemy + " was defeated! *");
                System.out.println(" * You have " + health + " HP left.");
                if (rand.nextInt(100) < healthPotionDropChance) {
                    numHealthPots++;
                    System.out.println("* The enemy dropped a health potion!");
                    System.out.println("You have " + numHealthPots + " potion(s.)");

                }
                System.out.println("------------------------------------");
                System.out.println("What would you like to do?");
                System.out.println("1. Continue Fighting");
                System.out.println("2. Exit the Dungeon");

                String input = in.nextLine();

                while (!input.equals("1") && !input.equals("2")) {
                    System.out.println("Invalid command. Focus!");
                    input = in.nextLine();
                }
                if (input.equals("1")) {
                    System.out.println("You continue further into the depths of darkness.");
//                    continue COMBAT;


                } else if (input.equals("2")) {
                    System.out.println("As you exit the dungeon, the sun kisses your face. You made it! You escaped the dungeon!");
                    break;
                }
            }

            System.out.println("***********************");
            System.out.println("**Thanks for Playing!**");
            System.out.println("***********************");
        }
    }
}

