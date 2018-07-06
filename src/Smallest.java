/**
 * Created by Ilya on 06.07.2018.
 */
public class Smallest {
    public void number(int one, int two, int three, int four) {
        if (one < two & one < three & one < four){
            System.out.println("Smallest number is: " + one);
        } else if(two < one & two < three & two < four){
            System.out.println("Smallest number is: " + two);
        } else if (three < one & three < two & three < four){
            System.out.println("Smallest number is: " + three);
        } else {
            System.out.println("Smallest number is: " + four);
        }
    }
}
