package utility;

import model.Blog;

public class CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface{
	String[] offensiveWords = { "cunillingus","cunnilingus","cunt","cuntlick ","cuntlicker ","cuntlicking ","cunts","cyalis","cyberfuc","cyberfuck ","cyberfucked ","cyberfucker","cyberfuckers","cyberfucking ","d1ck","damn","dick","dickhead","dildo","dildos","dink","dinks","dirsa","dlck","dog-fucker","doggin" };
	
	
	@Override
	public boolean checkBlog(Blog blog) {
		// TODO Auto-generated method stub
		if(checkBlogTitle(blog)&&checkBlogDescription(blog)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean checkBlogTitle(Blog blog) {
		// TODO Auto-generated method stub
		String[] title=(blog.getBlogTitle()).split(" ");
		
		for(int i=0;i<title.length;i++) {
			for(int j=0;j<offensiveWords.length;j++) {
				if(title[i].equals(offensiveWords[j])) {
					return false;
					}
				}
			}
		
		
		return true;
	}

	@Override
	public boolean checkBlogDescription(Blog blog) {
		
		String[] description=(blog.getBlogTitle()).split(" ");
		for(int i=0;i<description.length;i++) {
			for(int j=0;j<offensiveWords.length;j++) {
				if(description[i].equals(offensiveWords[j])) {
					return false;
					}
				}
			}
		
		return true;
	}

		
}