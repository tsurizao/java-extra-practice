import java.util.ArrayList;

//6. Create a PetDog class that inherits from Pet.
public class PetDog extends Pet implements Companion {

    //    7 In PetDog, create a boolean instance variable, trained.
    private boolean trained;

    //    8 Write a constructor for PetDog that sets its name, type, and trained properties.
    public PetDog() {
    }

    public PetDog(String name, String type, boolean trained) {
        this.setName(name);
        this.setType(type);
        this.trained = trained;
    }

    public void setTrained(boolean isTrained) {
        this.trained = isTrained;
    }

    //9 Write an instance method in PetDog  called isTrained that returns the boolean value of the trained property.
    public boolean isTrained() {
        return trained;
    }

    public String snuggle() {
        return getName() + " wants to snuggle.";
    }

    //12b In your PetDog class, create a static method named allSnuggle. It should accept an ArrayList of PetDog objects and output the result of calling the snuggle method on all of them. Create an ArrayList with at least three PetDog instances in the PetDogTest class. Call the allSnuggle method and pass it the ArrayList. Verify that the allSnuggle method works correctly.
    public static void allSnuggle(ArrayList<PetDog> dogsList) {
        for (PetDog petDog : dogsList) {
            System.out.println(petDog.snuggle());
        }
    }
}
