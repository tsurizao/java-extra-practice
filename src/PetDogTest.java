import java.util.ArrayList;

//11 Create a PetDogTest class, instantiate a PetDog, and verify that the snuggle method works correctly.
public class PetDogTest {
    public static void main(String[] args) {
        PetDog sammy = new PetDog("Sammy", "Dachshund", true);
        System.out.println(sammy.snuggle());
        PetDog mimi = new PetDog("Mimi", "Miniature Schnauzer", true);
        PetDog spot = new PetDog("Spot", "Dalmatian", false);
        PetDog sparky = new PetDog("Sparky", "Pomeranian", true);
        PetDog bella = new PetDog("Bella", "Yorkie", false);

        //12b
        ArrayList<PetDog> dogList = new ArrayList<PetDog>();
        dogList.add(sammy);
        dogList.add(mimi);
        dogList.add(spot);
        dogList.add(sparky);
        dogList.add(bella);
        sammy.allSnuggle(dogList);
    }
}
