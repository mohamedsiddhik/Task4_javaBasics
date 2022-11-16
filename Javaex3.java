//3. Java Program to Check if An Array Contains a Given Value

import java.util.Arrays;

public  class Javaex3
{
    public static void main(String[] args) {
        String[] Menu ={"Idly","Dhosa","Pongal","Poori"};
        String order = "Idly";

        boolean search = Arrays.stream(Menu).anyMatch(element -> element.equals(order));

        if (search)
        {
            System.out.println(order +  " is here");
        }
        else {
            System.out.println(order + " is not here");
        }
    }
}