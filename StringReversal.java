package hackerrank;

import java.util.Scanner;

public class StringReversal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        StringBuilder pre = new StringBuilder();
        pre.append(word);
        String post = pre.reverse().toString();
        System.out.println(word + "\n" + post.toString());
        
        if(word.equals(post))
        	System.out.println("Yes");
        else
            System.out.println("No");

	}

}
