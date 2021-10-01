
class Try {

     public static void main(String[] args) {
        
        // using the rand to generate random numbers

        double rand = Math.random();  // 
        System.out.println("The random value generated from the random method is: " + rand);


        // converting the double to an integer and giving the random a range from 1 to the nth number

        double n = (int)(Math.random()*10)+1;
        System.out.println("this is a random number between 1 and 10: " + n);
    }
}