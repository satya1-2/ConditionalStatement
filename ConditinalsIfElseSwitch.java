package com.company;
import java.util.Scanner;

public class ConditinalsIfElseSwitch {
    public static void main(String[] args) {
    /*   Scanner sc=new Scanner(System.in);
        System.out.println("enter your age");
       int age=sc .nextInt();

        if(age==18) {
            System.out.println("you can drive");
        }
            else{
                System.out.println("you can not drive");
            }
        }
    }*/


//  using logical and relational operators in if else
//  and && uses
        /*boolean a= true;
    boolean b= false;
    if(a&&b) {
        System.out.println("yes");
    }
        else {
        System.out.println("no");
    }}}*/

//logical or ||operators use in conditions
     /*   boolean a=true;
        boolean b= false;
         if(a||b) {
        System.out.println("yes");
    }
        else{
            System.out.println("no");
        }
    }}*/

//  for logical not ! operators using in conditnals
     /*   boolean a = true;
        boolean b = false;
        System.out.print("not (a) is " );
        System.out.println(!a);
        System.out.print("not (b) is " );
        System.out.println(!b);
    }}*/

//if, else if, if conditions
     /*   Scanner sc=new Scanner(System.in);
        System.out.println("enter your age");
        int age=sc .nextInt();
if(age>56){
    System.out.println("you are experienced");
    }
else if(age>46){
    System.out.println("you are semi experienced");
    }
else if(age>36){
    System.out.println("you are little bit experienced");
    }
else{
    System.out.println("you are not experienced");}
    }}*/

// switch case use
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your age");
        int age=sc .nextInt();
switch(age){
    case 18:
        System.out.println("you are adult");
        break;//
    case 23:
        System.out.println("you are going to married");
        break;
        case 25:
            System.out.println("enjoy your married life");
            break;
    default:
        System.out.println("all condition fail then print thiss");
    }
    }}