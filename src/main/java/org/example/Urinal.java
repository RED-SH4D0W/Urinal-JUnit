package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Urinal {
    protected static int[] State;
    public static void main(String[] args) {
        Urinal urinal = new Urinal();
        urinal.getState();
        if (urinal.isValid(State)) System.out.println(urinal.calculateCount());
        else System.out.println(-1);
    }


    void getState(){
        System.out.println("Enter the input: ");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        State = new int[input.length()];
        for(int i =0; i<input.length();i++){
            State[i]=input.charAt(i)-'0';
        }
    }
    boolean isValid(int[] tempx){
        if(!(tempx.length>=0 && tempx.length<=20))
            return false;
        for(int i=0; i<tempx.length; i++){
            if((tempx[i]!=0) && (tempx[i]!=1))
                return false;
            else if(tempx[i]== 1 ){
                    if(i==0)
                        return !(tempx[i + 1] == 1);
                    else if (i==tempx.length-1)
                        return !(tempx[i-1]==1);
                    else if ((tempx[i-1] == 1)||(tempx[i+1] == 1))
                        return false;
            }
        }
        return true;
    }
    public int calculateCount() {
        int count = 0;

        for (int i = 0; i < State.length; i++) {
             {
                 if (State[i] == 0) {
                     int prevIndex = i - 1;
                     int nextIndex = i + 1;
                     if ((prevIndex < 0 || State[prevIndex] == 0) && (nextIndex >= State.length || State[nextIndex] == 0)){
                         State[i] = 1;
                         count++;
                     }
                 }
            }
        }
        return count;
    }
}