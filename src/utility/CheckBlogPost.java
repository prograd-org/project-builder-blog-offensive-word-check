package utility;

import java.util.Arrays;

import model.Blog;

public class CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface{
	String [] offensive_words = {"bloody hell" , "bull shit" , "crabs" , "crack" ,"cracker","crap","crappy","dammit", "damn" ,
			"domination","drunk","dummy","facial" ,"gay","gays","god","god damn","godamn","he11","hell","how to kill","how to murder",
			"kafir","kill","murder"};
	public boolean checkBlog(Blog blog) {
		if(this.checkBlogTitle(blog) && this.checkBlogDescription(blog)) {
			return true;
		}
		return false;
	}
	public boolean checkBlogTitle(Blog blog) {
		String [] title = blog.getBlogTitle().split("");
		for(int i=0;i<title.length;i++) {
			if(Arrays.asList(this.offensive_words).contains(title[i])) {
				return false;
			}
		}
		return true;
	}
	 public boolean checkBlogDescription(Blog blog) {
		 String [] description = blog.getBlogDescription().split("");
			for(int i=0;i<description.length;i++) {
				if(Arrays.asList(this.offensive_words).contains(description[i])) {
					return false;
				}
			}
			return true;
	 }
}