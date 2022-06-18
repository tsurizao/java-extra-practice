//11. Create a PetDogTest class, instantiate a PetDog, and verify that the snuggle method works correctly.
public class PetDogTest {
    public static void main(String[] args) {
        PetDog sammy = new PetDog("Sammy", "Dachshund", true);
        System.out.println(sammy.snuggle());
    }
}
