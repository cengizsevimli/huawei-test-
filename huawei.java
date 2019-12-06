class IsDivisible 
{ 
    // Function to find out if number is divisible by 3, 5 or 15  
    static string checkDivisibility(int number) 
    { 
        if (number % 15 == 0 ){
            string str = "the value will be divided to 15";
            return str;
        }

        else if (number % 3 == 0){
            string str = "the value will be divided to 3";
            return str;
        }

        else if (number % 5 == 0){
            string str = "the value will be divided to 5";
            return str;
        }
        else {
            string str = "the value will not be divided to 3/5/15";
            return str;
        }

    } 
  
    // main function 
    public static void main (String[] args)  
    { 
        int number = "1332"; 
        checkDivisibility(number); 
        System.out.println(str); 
    } 
}  