//6. Create a PetDog class that inherits from Pet.
public class PetDog extends Pet {

    //    7. In PetDog, create a boolean instance variable, trained.
    private boolean trained;

    //    8. Write a constructor for PetDog that sets its name, type, and trained properties.
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

    //9. Write an instance method in PetDog  called isTrained that returns the boolean value of the trained property.
    public boolean isTrained() {
        return trained;
    }
}
