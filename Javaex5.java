//5. Java Program to Differentiate String == operator and equals() method

//.Equals

public  class Javaex5
{
    public static void main(String[] args) {
        String m1 = "Mohamed";
        String m2 = "mohamed";
        String m3 = "Siddhik";
        String m4 = new String(m1);
        System.out.println("----------dot equals()----------");
        System.out.println(m1.equals(m2));
        System.out.println(m1.equals(m3));
        System.out.println(m1.equals(m4));
        System.out.println(m1.equalsIgnoreCase(m2));

        System.out.println("---------- == Operator ------------");
        String m5 = "mohamed";
        System.out.println(m1 == m2);
        System.out.println(m1 == m3);
        System.out.println(m1 == m4);
        System.out.println(m2 == m5);

    }
}