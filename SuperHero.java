/*-------------------------------------------------------------------------
// AUTHOR: Anthony Weringer
// FILENAME: SuperHero
// SPECIFICATION: SUperhero class
// FOR: CSE 110- Lab #6
// TIME SPENT: 1.5 hours
// DATE: 9/15/17
//-----------------------------------------------------------*/
import java.util.Scanner;

public class SuperHero 
{
	/*Instance variables below*/
	private static int numberOfHeroes;
	   private String heroName;
	   private String secretIdentity;
	   private int numberOfLifeChances;
	   private int numberOfPeopleSaved;

	   /*Two constructors below*/
	   public SuperHero(String initHeroName, String initSecretIdentity,
	           int initPeopleSaved) {
	       numberOfHeroes++; /*Additional hero created*/
	       numberOfLifeChances = 2; /*Start hero with two lives*/
	       heroName = initHeroName;
	       secretIdentity = initSecretIdentity;
	       numberOfPeopleSaved = initPeopleSaved;
	   }

	   public SuperHero(String initHeroName) {
	       numberOfHeroes++; /*Additional hero created*/
	       numberOfLifeChances = 2; /*Start hero with two lives*/
	       heroName = initHeroName;
	       secretIdentity = "Unknown";
	       numberOfPeopleSaved = 0;
	   }

	   /*getNumberOfHeroes()*/
	   public static int getNumberOfHeroes() {
	       return numberOfHeroes;
	   }

	   /*recordSave()*/
	   public void recordSave() {
	       numberOfPeopleSaved++;
	   }

	   /*Second recordSave below*/
	   public void recordSave(int num) {
	       numberOfPeopleSaved += num;
	   }

	   /*killHero()*/
	   public void killHero() {
	       if (numberOfLifeChances == 0) {
	           /*Hero is dead message*/
	           System.out.println("The Hero is Dead.. :(");
	       } else {
	           /*Decrease numberOfLifeChances by 1*/
	           numberOfLifeChances--;
	       }
	   }

	   /*printSuperHeroRecord()*/
	   public void printSuperHeroRecord() {
	       System.out.println("Name: " + heroName + "\nSecret Identity: "
	               + secretIdentity + "\nStatus: "
	               + ((numberOfLifeChances == 0) ? "Dead" : "Alive")
	               + "\nPeople Saved: " + numberOfPeopleSaved);
	   }
	}