package day03typecastingwrapperscanner;

public class TypeCasting01 {

    public static void main(String[] args) {

        byte age=23;

        int newAge = age;

        long population = 1234;
        int newPopulation = (int) population;

        short asd = 254;
        double aff = asd;
        float azxc =123.99f;
        byte ads= (byte) azxc;
        System.out.println(ads);

        int number= 515;
        byte newNumber = (byte) number ;

        System.out.println(newNumber);



    }
}
