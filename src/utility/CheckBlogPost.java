package utility;
//Create a class called CheckBlogPost which extends OffensiveWordsChecker and also implements OffensiveWordsInterface

import model.Blog;

public class CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface{
	String[] badwords = {"bastard","bastardo","bastards","bastinado",
			"batty boy",
			"bawdy",
			"bbw",
			"bdsm",
			"beaner",
			"beaners",
			"beardedclam",
			"beastial",
			"beastiality",
			"beatch",
			"beaver",
			"beaver cleaver",
			"beaver lips",
			"beef curtain",
			"beef curtain",
			"beef curtains",
			"beeyotch",
			"bellend",
			"bender",
			"beotch",
			"bescumber",
			"bestial",
			"bestiality",
			"bi+ch",};
	
	@Override
	public boolean checkBlogTitle(Blog blog) {
		// TODO Auto-generated method stub
		String[] title = blog.getBlogTitle().split(" ");
		for(int i=0; i<title.length ; i++) {
			String titleWord = title[i];
			for(int j=0; j<badwords.length; j++) {
				String bad = badwords[i]; 
				if(titleWord.equals(bad)) {
					return false;
				}
			}
		}
		
		return true;
	}

	@Override
	public boolean checkBlogDescription(Blog blog) {
		// TODO Auto-generated method stub
		String[] blogWords = blog.getBlogDescription().split(" ");
		for(int i=0; i<blogWords.length ; i++) {
			String blogWord = blogWords[i];
			for(int j=0; j<badwords.length; j++) {
				String bad = badwords[i]; 
				if(blogWord.equals(bad)) {
					return false;
				}
			}
		}
		
		return true;
	}

	@Override
	public boolean checkBlog(Blog blog) {
		//The checkBlog(Blog blog) method in turn should invoke checkBlogTitle(Blog blog) and checkBlogDescription(Blog blog).*
		//The checkBlog method should return true if there are no offensive words otherwise it should return false
		if(checkBlogTitle(blog) && checkBlogDescription(blog)) {
			return true;
		}
		else
			return false;
	}
	
}