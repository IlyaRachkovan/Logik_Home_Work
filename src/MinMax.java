public class MinMax {
    public void numbers(int a, int b, int c, int d, int e) {

        if (a > b & a > b & a > c & a > d & a > e){
            System.out.println("Largest number is: " + a);
        } else if (b > a & b > c & b > d & b > e){
            System.out.println("Largest number is: " + b);

        }else if (c > a & c > b & c > d & c > e){
            System.out.println("Largest number is: " + c);
        }else if (d > a & d > b & d > c & d > e){
            System.out.println("Largest number is: " + d);
        } else if(e > a & e > b & e > c & e > d){
            System.out.println("Largest number is:" + e);

        }
        if (a < b & a < b & a < c & a < d & a < e){
            System.out.println("Smallest number is: " + a);
        } else if (b < a & b < c & b < d & b < e){
            System.out.println("Smallest number is: " + b);

        }else if (c < a & c < b & c < d & c < e){
            System.out.println("Smallest number is: " + c);
        }else if (d < a & d < b & d < c & d < e){
            System.out.println("Smallest number is: " + d);
        } else if(e < a & e < b & e < c & e < d){
            System.out.println("Smallest number is:" + e);
        }

    }

}
