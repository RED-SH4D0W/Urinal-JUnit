package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Urinal {
    static Urinal urinal = new Urinal();
    public static void main(String[] args) {
        urinal.getState();
    }
    protected static int[] State;

    void getState(){
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        State = new int[input.length()];
        for(int i =0; i<input.length();i++){
            State[i]=input.charAt(i)-'0';
        }
    System.out.println(Arrays.toString(State));
    }
    boolean isValid(int[] tempx){
        if(!(tempx.length>=0 && tempx.length<=20))
            return false;
        for(int i=0; i<tempx.length; i++){
            if(tempx[i]!=0 && tempx[i]!=1) return false;
            if(tempx[i]== 0 ){
                    int prevIndex = i - 1;
                    int nextIndex = i + 1;
                    if ((prevIndex < 0 || tempx[prevIndex] == 0) && (nextIndex >= tempx.length || tempx[nextIndex] == 0))
                        return true;
            }
        }
        return false;
    }
}