import java.util.Arrays;

public class Main {
    // Pass by reference, pass by value
    public static void changeObject(DerivedClass obj) {
        obj = new DerivedClass();
        obj.name = "Ahmet";
        obj.num = 10;
    }

    public static void asd(String str) {
        str = "asdasd";
    }

    public static void main(String[] args) {
//        String str = "ahmet";
//        asd(str);
//        System.out.println(str);

//        DerivedClass derivedObject = new DerivedClass();
//
//        derivedObject.name = "Mehmet";
//        derivedObject.num = 5;
//
//        changeObject(derivedObject);
//
//        System.out.println(derivedObject);

        int arr[] = {1, 2, 3};
        changeElementOfArray(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void changeElementOfArray(int[] array) {
        array[0] = 5;
    }
}

/*
Object (toString)
  |
  |
BaseClass
  |
  |
Derived Class
 */