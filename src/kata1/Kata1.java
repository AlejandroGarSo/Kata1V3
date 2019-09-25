package kata1;

import java.time.LocalDate;

public class Kata1 {

    public static void main(String[] args) {

        Person person = new Person ("Random", LocalDate.of(1999,10,23));
        System.out.println(person);
    }
    
}
