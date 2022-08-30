import com.Gender;
import com.Payment;
import com.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Zhumgal", 17, Gender.Male,Payment.NOTPAID);
        Person person1 = new Person("Argen",15,Gender.Male,Payment.PAID);
        Person person2 = new Person("Nuris",14,Gender.Male,Payment.NOTPAID);
        Person person3 = new Person("Nurai",13,Gender.Female,Payment.PAID);

        Person [] Massive = {person,person1,person2,person3};
        for (int i = 0; i <  Massive.length; i++) {
            System.out.println(Massive[i].toString());




        }



    }
}