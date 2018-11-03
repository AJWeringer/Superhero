/*-------------------------------------------------------------------------
// AUTHOR: Anthony Weringer
// FILENAME: Lab6
// SPECIFICATION: For class superhero
// FOR: CSE 110- Lab #6
// TIME SPENT: 1 hour
// DATE: 9/15/17
//-----------------------------------------------------------*/

import java.util.Scanner;
public class Lab6 
{
	public static void main(String[] args)
	   {
	        Scanner scan = new Scanner(System.in);
	       // Create a superhero called Spider-Man
	       SuperHero spiderman = new SuperHero("Spider-Man");

	       // Ask the user to enter a superhero name
	       System.out.println("\nWhat is your super hero's name?");
	       String heroName = scan.nextLine();

	       System.out.println("What is their secret identity?");
	       /** 13: Read in the identity */
	       String identity = scan.next();

	       System.out.println("Creating your super hero.......");
	       /** 16: Create the hero called yourHero, who saved 10 people */
	       SuperHero yourHero = new SuperHero(heroName, identity, 10);

	       System.out.println("\nSpider-Man just saved 100 lives!");

	       /** 19: Call recordSave on spiderman with 100 as the input */
	       spiderman.recordSave(100);

	       System.out.println("Oops, Spider-Man was shot dead twice!");

	       /** 22: Kill spiderman twice */
	       spiderman.killHero();
	       spiderman.killHero();

	       System.out.print("Your hero saved a kidnapped kid but was shot once ");

	       /** 26: Kill your hero once */
	       yourHero.killHero();

	       /** 27: Add 1 to your hero's lives saved */
	       yourHero.recordSave();

	       System.out.println("\n\n---- Superhero information ----");
	       /** 30: Store the number of heroes in an int called numHeroes */
	       int numHeroes = SuperHero.getNumberOfHeroes();
	       System.out.println("There are " + numHeroes + " known superheroes.");
	       spiderman.printSuperHeroRecord();
	       yourHero.printSuperHeroRecord();
	       System.out.println();

	   }

	}