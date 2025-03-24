// PARTNER NAME: Jon Zotara		
// PARTNER NAME:
// CS111 SECTION #: 1270	
// DATE: 3/12/25

public class Main
{

	/**
	 * ALGORITHM:
	 * - Add total funds to taco stand
	 * - Order supplies
	 * - Print status of stand (when it opens)
	 * - Print welcome message
	 * - Take customer order
	 * - Print status of stand (when its closed)
	 */
	public static void main(String[] args)
	{
		//DECLARATION + INITIALIZATION SECTION
		TacoStand.initialize();

		//INPUT + CALCULATION + OUTPUT SECTION
		TacoStand.addTotalFunds(20);
		TacoStand.orderSupplies(15);

		System.out.println("OPENING UP THE STAND...");
		System.out.println( TacoStand.getStatus() +"\n\n");

		Main.printWelcome();
		System.out.println("\n");
		
		Main.takeOrder();
		//call takeOrder more times if you'd like! (once everything works once though!)

		System.out.println("--------CART IS CLOSED---------\n\n" + TacoStand.getStatus());
	}

	/**
	 * Outputs welcome message to start program that user sees
	 */
	public static void printWelcome()
	{
		UtilityBelt.printCentered(50, "Welcome to MCC Taco Stand!");
		UtilityBelt.printCentered(50, "┈┈┈┈╭╯╭╯╭╯┈┈┈┈┈");
		UtilityBelt.printCentered(50, "┈┈┈╱▔▔▔▔▔╲▔╲┈┈┈");
		UtilityBelt.printCentered(50, "┈┈╱┈╭╮┈╭╮┈╲╮╲┈┈");
		UtilityBelt.printCentered(50, "┈┈▏┈▂▂▂▂▂┈▕╮▕┈┈");
		UtilityBelt.printCentered(50, "┈┈▏┈╲▂▂▂╱┈▕╮▕┈┈");
		UtilityBelt.printCentered(50, "┈┈╲▂▂▂▂▂▂▂▂╲╱┈┈");
		//ascii art credit:
		//https://mizbizbby.tumblr.com/post/12937794639/happy-taco-ascii-art-for-taco-thursday
	}
	
	/**
	 * Prints menu and prompts user for input for kind of taco and number in order. If tacos are available,
	 * will update total funds and confirm order with user, otherwise error message given
	 */
	public static void takeOrder() 
	{
		//DECLARATION + INITIALIZATION SECTION
		int option, numTacosOrdered;

		//INPUT SECTION
		TacoStand.printMenu();
		option = UtilityBelt.readInt("Enter choice> ", 1, 4);
		numTacosOrdered = UtilityBelt.readInt("Enter number of tacos you want> ", 1, 50);

		//CALCULATION + OUTPUT SECTION
		if (TacoStand.areTacosAvailable(option, numTacosOrdered)) {
			TacoStand.updateTotalFunds(option, numTacosOrdered);
			Main.printConfirmation(numTacosOrdered, option);
		} else {
			System.out.println("We don't have that many tacos, sorry! Try again :(");
		}
	}

	/**
	 * Prints confirmation message that varies based on number of tacos in order
	 * 
	 * @param numTacos
	 */

	 //modified method in order to print out the proper amount of taco emojis, and to make the proper amount of cleared lines.
	public static void printConfirmation(int numTacos, int tacoOption) 
	{	
			System.out.println("Here you go, buen provecho!");
			if (numTacos == 1){
				System.out.print("🌮");
			} else if (numTacos == 2) {
				System.out.print("🌮🌮");
			} else if (numTacos == 3) {
				System.out.print("🌮🌮🌮");
			} else if (numTacos == 4) {
				System.out.print("🌮🌮🌮🌮");
			} else if (numTacos == 5) {
				System.out.print("🌮🌮🌮🌮🌮");
			} else if (numTacos == 6) {
				System.out.print("🌮🌮🌮🌮🌮🌮");
			} else if (numTacos == 7) {
				System.out.print("🌮🌮🌮🌮🌮🌮🌮");
			} else {
				System.out.print("🌮🌮🌮🌮🌮🌮🌮🌮");
			}
			System.out.println();
			System.out.println();
			}
		}

	
