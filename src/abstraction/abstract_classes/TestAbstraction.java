package abstraction.abstract_classes;

import java.util.ArrayList;
import java.util.List;

public class TestAbstraction {
    public static void main(String[] args) {

        Samsung s1 = new Samsung("Samsung","black",64, 700);
        Nokia n1 = new Nokia("Nokia", "Blue", 4, 100);
        IPhone i1 = new IPhone("Apple", "Silver", 128, 1000);

        List<Phone> phones = new ArrayList<>();
        phones.add(s1);
        phones.add(n1);
        phones.add(i1);

        System.out.println(s1);
        System.out.println(n1);
        System.out.println(i1);

        int countConvertibles = 0;
        int max = Integer.MIN_VALUE;
        Phone mostExpensivePhone = null;

        for(Phone phone : phones){
            System.out.println(phone);
            if(phone.isConvertible()) countConvertibles++;
            if(phone.price > max) mostExpensivePhone = phone;
        }
        System.out.println(countConvertibles);
        System.out.println("The most expensive phone is = " + mostExpensivePhone.getClass().getSimpleName());

        System.out.println(IPhone.OS);
        System.out.println(Samsung.OS);
        System.out.println(Nokia.OS);

        for (Phone phone : phones) {
            phone.call();
            phone.ring();
            phone.text();

        }
    }
}
