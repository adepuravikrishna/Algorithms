public class Person {
    private int age;	
  
	public Person(int initialAge) {
  		// Add some more code to run some checks on initialAge
        if(initialAge<1)
            {
            System.out.println("Age is not valid, setting age to 0.");
            age=0;
        }
        else
            age=initialAge;
	}

	public void amIOld() {
        String s;
  		// Write code determining if this person's age is old and print the correct statement:
        if(age<13)
          {
              s="You are young.";
          }
        else if(age>=13&& age<18)
            {
            s="You are a teenager.";
        }
        else
            {
            s = "You are old.";
        }
        System.out.println(s);
	}

	public void yearPasses() {
  		// Increment this person's age.
        age=age+1;
	}
