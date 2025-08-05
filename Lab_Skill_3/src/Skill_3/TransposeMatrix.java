package Skill_3;
import java.util.Scanner;

public class TransposeMatrix 
{

	public static void main(String[] args) 
	{
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter rows and coloumns: ");
	        int r = sc.nextInt();
	        int c = sc.nextInt();

	        int[][] mat = new int[r][c];

	        System.out.println("Enter matrix:");
	        for (int i = 0; i < r; i++)
	        {
	            for (int j = 0; j < c; j++)
	            {
	                mat[i][j] = sc.nextInt();
	            }
	        }

	        System.out.println("Transpose:");
	        for (int i = 0; i < c; i++) 
	        {
	            for (int j = 0; j < r; j++) 
	            {
	            System.out.print(mat[j][i] + " ");
	            }
	            System.out.println();
	        }
	    }
}