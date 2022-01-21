import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Drill07 {

	/*
	 * Takes in a string of the HTML source for a webPage.
	 * Returns a Set<String> containing all of the valid wiki link
	 * titles found in the HTML source.
	 * 
	 * In order for a link to be a valid wikiLink for our case, it must
	 * match the pattern:
	 * <a href="/wiki/Marine_mammal">
	 * and NOT contain the character '#' nor ':'. From the above match, you
	 * would then extract the link name which in this case is:
	 * Marine_mammal
	 * Refer to the testcases for more examples.
	 * 
	 * The fact that the input to this parameter is HTML is largely
	 * irrelevant to this function. It is just a string processing function.
	 * You take in a string, and need to search for matches to a specific
	 * pattern in that string. We went through a brief description of HTML
	 * in class if you are curious.
	 * 
	 * Your first job is to pass all of the tests. This means you either have
	 * a functionally correct algorithm, or are close to one. However, performance
	 * and efficiency will be very important for this PA. After finding a functionally
	 * correct algorithm, spend time designing other approaches to see if
	 * you can determine a more efficient approach. It will pay off when
	 * writing the PA! i.e. do not do anything inefficient, for
	 * instance, you should only go through the string once.
	 */
	public static Set<String> findWikiLinks(String html) {
		Set<String> words=new HashSet<>();
		String str="";
		int ind=0;
		int len=html.length();
		while(ind<len) {
			if(	html.charAt(ind)!=' ') {
				str+=html.charAt(ind);
				ind++;
			}else {
				if(str.startsWith("href=\"/wiki/") && !str.contains(":") && !str.contains("#")) {
					str=str.replace("href=\"/wiki/", "");
					int i=str.indexOf("\"");
					str=str.substring(0,i);
					words.add(str);
					System.out.println(str);

				}
				str="";
				ind++;
			}
		}
		return words;
	}

}
