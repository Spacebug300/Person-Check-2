package spacebug300;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class PersonChecker2Main {
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random rand = new Random();
    
    System.out.println("Person Checker 2. Coded by Spacebug300");
    System.out.println("This person checker will ask you a series of questions to determine if the entity you are describing is a person or not.");
    System.out.println("Press ENTER to continue...");
    input.nextLine();
     ;
    
    int personPts = 0;
    
    System.out.println("What is the entity's name?");
    String name = input.nextLine();
    String nameCheck = name.toLowerCase();
    HashMap<String, String> ianpaRegister = new HashMap<String, String>();
    ianpaRegister.put("adrian", "HIGH LEVELS OF MENTAL INACTIVITY AND/OR LACKING BASIC DESCISION MAKING SKILLS");
    
    
    if (nameCheck.equals("adrian")) {
    		System.out.println("The entity under the name of '" + name + "' is listed in the IANPA servers as '" + ianpaRegister.get(nameCheck) + "'.\nCAUTION! do not persue or communicate with this entity at all costs.\nThis non-person tries to fit in but shows no personly charateristics and no sign of any type of inteligence and no signs of empathetic behaviour.");
    		System.exit(0);
    }
    
    
    //first question
    System.out.println("Question #1 (ENTER NUMBER TO SELECT OPTION)");
    System.out.println("Select body shape:");
    System.out.println("1) Un-natural / geometric");
    System.out.println("2) Arthropod");
    System.out.println("3) Humanoid");
    System.out.println("4) Fish-like");
    System.out.println("5) Four leg walker");
    System.out.println("6) Other");
    int body = input.nextInt();
    
    switch (body) {
      case 1: personPts += 2;
      break;
      case 2: personPts += 4;
      break;
      case 3: personPts += 10;
      break;
      case 4: personPts += 2;
      break;
      case 5: personPts += 4;
      break;
      case 6: personPts += 2;
      break;
      default: System.out.println("ERROR: Invalid choice. Did you enter the correct number?"); System.exit(0);
      break;
    }
    
    //second question
    System.out.println("Question #2");
    System.out.println("Select eye color:");
    System.out.println("1) Blue");
    System.out.println("2) Brown");
    System.out.println("3) Hazel");
    System.out.println("4) Green");
    System.out.println("5) Red");
    System.out.println("6) Other");
    int eyes = input.nextInt();
    
    switch (eyes) {
      case 1: personPts += 7;
      break;
      case 2: personPts += 10;
      break;
      case 3: personPts += 3;
      break;
      case 4: personPts += 3;
      break;
      case 5: personPts += 1;
      break;
      case 6: personPts += 1;
      break;
      default: System.out.println("ERROR: Invalid choice. Did you enter the correct number?"); System.exit(0);
      break;
    }
    
    //Third question
    System.out.println("Question #3");
    System.out.println("Select skin cover:");
    System.out.println("1) Bare");
    System.out.println("2) Fur");
    System.out.println("3) Scales");
    System.out.println("4) Quills");
    System.out.println("5) Nonexistent");
    System.out.println("6) Other");
    int skin = input.nextInt();
    
    switch (skin) {
      case 1: personPts += 10;
      break;
      case 2: personPts += 8;
      break;
      case 3: personPts += 3;
      break;
      case 4: personPts += 3;
      break;
      case 5: personPts += -8;
      break;
      case 6: personPts += 0;
      break;
      default: System.out.println("ERROR: Invalid choice. Did you enter the correct number?"); System.exit(0);
      break;
    }  
    
    //Fourth question
    System.out.println("Question #4");
    System.out.println("Select hair color:");
    System.out.println("1) Blonde");
    System.out.println("2) No hair");
    System.out.println("3) Brown");
    System.out.println("4) White / grey");
    System.out.println("5) Black");
    System.out.println("6) Red");
    System.out.println("7) Other");
    int hair = input.nextInt();
      
    switch (hair) {
      case 1: personPts += 7;
      break;
      case 2: personPts += 5;
      break;
      case 3: personPts += 8;
      break;
      case 4: personPts += 6;
      break;
      case 5: personPts += 10;
      break;
      case 6: personPts += 4;
      break;
      case 7: personPts -= -10;
      break;
      default: System.out.println("ERROR: Invalid choice. Did you enter the correct number?"); System.exit(0);
      break;
    }
    
    System.out.println("You have answered all of the questions!");
    
    personPts = personPts - rand.nextInt(8);
    int randomizer = rand.nextInt(6);
    
    if (randomizer == 3) {
    		personPts = personPts - rand.nextInt(20);
    }
    
    System.out.println("Your person score is: " + personPts);
    
    if (personPts < 40 && personPts > 38) {
      System.out.println("Entity under the name of '" + name + "' is a pure person!");
      System.exit(0);
    } else if (personPts <= 38 && personPts > 35) {
    		System.out.println("Entity under the name of '" + name + "' is a quasi-person!");
    		System.out.println("The entity may function like a person, look like one, smell like one, and do things like one; but do not count on it being a person.");
    		System.exit(0);
    } else if (personPts <= 35 && personPts > 30) {
    		System.out.println("Entity under the name of '" + name + "' is a semi person!");
    		System.out.println("The entity may function like a person, but do it might commit unpersonly activities when not observed.");
    		System.exit(0);
    } else if (personPts <= 30 && personPts > 20) {
    		System.out.println("Entity under the name of '" + name + "' is probably not a person!");
  			System.out.println("The entity is probably not a person. Adviced to stay away from it as it is highly volatile. It may demonstrate personly characteristics but be cautious around this entity.");
  			System.exit(0);
    } else if (personPts <= 20  && personPts > 10) {
    		System.out.println("Entity under the name of '" + name + "' is highly unlikely to be a person!");
			System.out.println("The chances of this entity being a person are minimal. In the event of emergency regarding this entity; attempt to mimick its behaviour as best as you can in order for it to assume you are of its kind.");
			System.exit(0);
    } else if (personPts <= 10) {
    		System.out.println("--WARNING--");
    		System.out.println("The entity under the name of '" + name + "' is NOT A PERSON!");
			System.out.println("Exercise extreme caution around this entity, it is not a person therefore its behaviour is highly volatile. Please contact the IANPA (international anti non-person Association) to report this entity.");
			System.exit(0);
    } else {
    		System.out.println("ERROR: Unable to calculate results.");
    }
    
  }
}
