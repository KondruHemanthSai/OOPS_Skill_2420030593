package Skill_3;

import java.util.*;
public class UserNameFormatter 
{
    public static void main(String[] args) 
    {
    	Scanner sc =new Scanner(System.in);
        String name = sc.next();
        name.trim();
        name.toLowerCase();
        name.replace("a", "@");
        System.out.println("Formatted Name: " + name);
    }
}

