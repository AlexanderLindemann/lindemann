package ru.lindemann.se;


public class App 
{
    public static void main( String[] args ){
        int SIZE = 4;
        String[][] arr = new String[SIZE][SIZE];
        try {
            String add [][] = new String[arr.length+1][arr.length+1];
        }catch(MyArraySizeException e){
            System.out.print(e);
        }
    }
}
