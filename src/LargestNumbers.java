public class LargestNumbers {

    public void largesNubers (int a, int b, int c, int d) {

        if (a >= b & a >= c & a >= d){

            System.out.println("Largest number is: " + a);

        } else if (b >= a & b >= c & b >= d){

            System.out.println("Largest number is: " + b);

        }else if (c >= a & c >= b  & c >= d){

            System.out.println("Largest number is: " + c);

        }else if (d >= a  & d >= b){
            System.out.println("Largest number is:" + d);
        }


    }
}
