package edu.nvcc.Zhonglin;
import java.util.Scanner;

public class PersonDriver {
    public static void main(String[] args){
        /**
         * prompt users to enter a person's name
         */
        System.out.println("Enter a person's name ");
        Scanner scanner=new Scanner(System.in);
        Person person1=new Person();
        person1.setName(scanner.next());
        /**
         * prompt users to enter his or her age
         */
        System.out.println("Enter his or her age ");
        person1.setAge(scanner.nextInt());
        /**
         * prompt users to enter another person's name
         */
        System.out.println("Enter another person's name ");
        Person person2=new Person();
        person2.setName(scanner.next());
        /**
         * prompt users to enter another person's age
         */
        System.out.println("Enter his or her age ");
        person2.setAge(scanner.nextInt());
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        /**
         * test if person1 and person2 have the same name and are the same age
         */
        if(person1.getName().equals(person2.getName())&&person1.getAge()==person2.getAge()){
            System.out.println(person1.getName()+" and "+person2.getName()+" have the same name and are the same age.");
        }
        /**
         * test if person1 and person2 have the same name
         */
        else if(person1.getName().equals(person2.getName())){
            System.out.println(person1.getName()+" and "+person2.getName()+" have the same name. ");
            /**
             * compare person1's age and person2's age
             */
            if(person1.getAge()>person2.getAge()){
                System.out.println(person1.getName()+" is older than "+person2.getName()+" . ");
            }
            else System.out.println(person1.getName()+" is younger than "+person2.getName()+" . ");
        }
        /**
         * compare person1's age and person2's age
         */
        else if(person1.getAge()>person2.getAge()){
            System.out.println(person1.getName()+" is older than "+person2.getName()+" . ");
        }
            else System.out.println(person1.getName()+" is younger than "+person2.getName()+" . ");

    }
}

