package utility;

import model.Blog;

public class CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface{

	String [] offensive_words = {"blumpkin","bodily","asswhole","asses","fucker","assh0le","bookie","bosomy","booooobs","bugger","bullshits","climax","dumass","fagots","flaps","fuckhole","fuckmeat","gtfo","jack-off","lmfao","lmao","lezzie","niggah"};
	
	
	@Override
	public boolean checkBlogTitle(Blog blog) {
		// TODO Auto-generated method stub
		boolean isValid = false;
		
		for (String word : offensive_words) {
			if(blog.getBlogTitle().contains(word)) {
				isValid = false;
				return isValid;
			}
			else {
				isValid = true;
			}
	}
		return isValid;
		}

	@Override
	public boolean checkBlogDescription(Blog blog) {
		// TODO Auto-generated method stub
		boolean isValid = false;
		
		for (String word : offensive_words) {
			if(blog.getBlogDescription().contains(word)) {
				isValid = false;
				return isValid;
			}
			else {
				isValid = true;
			}
	}
		return isValid;
	}

	@Override
	public boolean checkBlog(Blog blog) {
		// TODO Auto-generated method stub
		boolean title = checkBlogTitle(blog);
		boolean blogDescription = checkBlogDescription(blog);
		
		System.out.println(title);
		System.out.println(blogDescription);
		
		if(title && blogDescription) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
}