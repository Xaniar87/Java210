import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * TODO: You will have to implement memoization somewhere in this class.
 */
public class WikiScraper {
			
	/*
	 * TODO: Comment this function
	 */
	public static Set<String> findWikiLinks(String link) {
		String html = fetchHTML(link);
		Set<String> links = scrapeHTML(html);
		return links;
	}
	
	/*
	 * TODO: Comment this function. What does it do at
	 * a high level. I don't expect you to read/understand
	 * the StringBuffer and while loop. But from the spec
	 * and your understanding of this assignment, what is
	 * the purpose of this function.
	 */
	private static String fetchHTML(String link) {
		StringBuffer buffer = null;
		try {
			URL url = new URL(getURL(link));
			InputStream is = url.openStream();
			int ptr = 0;
			buffer = new StringBuffer();
			while ((ptr = is.read()) != -1) {
			    buffer.append((char)ptr);
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		return buffer.toString();
	}
	
	/*
	 * TODO: Comment this function. What does it do.
	 */
	private static String getURL(String link) {
		return "https://en.wikipedia.org/wiki/" + link;
	}
	
	/*
	 * TODO: Fill this in with your code from the drill. Change
	 * this comment to accurately document this function.
	 */
	private static Set<String> scrapeHTML(String html) {
		return null;
	}
	
}
