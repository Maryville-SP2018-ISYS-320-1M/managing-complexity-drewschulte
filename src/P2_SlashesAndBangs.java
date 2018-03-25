/*
  	ISYS 320
  	Name(s):
  	Date: 
*/



/* 2. Create a table below (just using text) that outlines your analysis of the figure. That is, how many
 * of each character on each line? What expression captures the relationship between the line number and
 * how many of the character is printed on each line? Choose your headings based on how you can break down
 * the figure.
  
Line Number		| HEADING		| HEADING		| HEADING		| HEADING		| HEADING		|	
* line 1 = 22 bangs
 * line 2 = 2 backslashes then 18 bangs then 2 backslashes
 * line 3 = 4 backslahses then 14 bangs then 4 backslashes
 * line 4 = 6 backslahses then 10 bangs then 6 backslashes
 * line 5 = 8 backslahses then 6 bangs then 8 backslashes
 * line 6 = 10 backslahses then 2 bangs then 10 backslashes




*/

/* 3. Using your analysis from above, in pseudocode describe the algorithm for how to draw the figure
 * 
 
 
 
 
 
 */

public class P2_SlashesAndBangs {

	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 2 * i - 2; j++) {
				System.out.print("\\");
			}
			for (int j = 1; j <= 26 - 4 * i;j++) {
				System.out.print("!");
			}
			for (int j = 1; j <= 2 * i - 2;j++) {
				System.out.print("/");
			}
			System.out.println();
			
		}
	}
}


