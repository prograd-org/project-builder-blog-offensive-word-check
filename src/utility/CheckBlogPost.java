package utility;

import model.Blog;

public class CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface {

	String[] offensiveWords = {"leather straight jacket",
"4r5e",
"5h1t",
"5hit",
"a$$",
"a$$hole",
"a_s_s",
"a2m",
"a54",
"a55",
"a55hole",
"acrotomophilia",
"aeolus",
"ahole",
"alabama hot pocket",
"alaskan pipeline",
"anal",
"anal impaler",
"anal leakage",
"analprobe",
"anilingus",
"anus",
"apeshit",
"ar5e",
"areola",
"areole"};
	
	
	@Override
	public boolean checkBlogTitle(Blog blog) {
	    
		return wordCheck(blog.getBlogTitle(), offensiveWords);
	}

	@Override
	public boolean checkBlogDescription(Blog blog) {
		
		return wordCheck(blog.getBlogDescription(), offensiveWords);
	}

	@Override
	public boolean checkBlog(Blog blog) {
		
		return (checkBlogTitle(blog) && checkBlogDescription(blog));
	}
	
	public boolean  wordCheck(String x,String[] y) {
		//Split the title or description and store it in array
		String[] st = x.split(" ");
		
		// compare word to with offensive words array
    	for(int i=0;i<st.length;i++) {
    		for(int j = 0; j<y.length ;j++) {
    			if(st[i].equalsIgnoreCase(y[j])) {
    				return false;
    			}
    		}
    	}
    	return true;
	}
	
}
