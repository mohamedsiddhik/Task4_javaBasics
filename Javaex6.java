//6. Java Program to Check if a String is Numeric

public  class Javaex6
{
    public  static  boolean isNumber(String number)
    {
        try {
            Long.parseLong(number);
            System.out.println("This is a valid numeric " + number);
        }
        catch (NumberFormatException e) {
            System.out.println("This is a not valid numeric " + number);
            return  false;
        }
        return  true;
    }

    public static void main(String[] args) {
        System.out.println(isNumber("435"));
    }
}