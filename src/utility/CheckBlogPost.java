package utility;

import model.Blog;

public class CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface{

	
	public boolean checkBlogTitle(Blog blog) {
		String badWords[]= {"2 girls 1 cup","2g1c","4r5e","5h1t","5hit",
                "a$$","a$$hole","a_s_s","a2m","a54",
            "a55","a55hole","acrotomophilia","aeolus","ahole",
    "alabama hot pocket","alaskan pipeline","anal","anal impaler","anal leakage",
               "analprobe","anilingus","anus","apeshit",
                "ar5e","areola"};
		String title= blog.getBlogTitle();
		for(String word: badWords)
		{
			if(title.contains(word))
				return false;
		}
		return true;
	}

	
	public boolean checkBlogDescription(Blog blog) {
		String badWords[]= {"2 girls 1 cup","2g1c","4r5e","5h1t","5hit",
                "a$$","a$$hole","a_s_s","a2m","a54",
            "a55","a55hole","acrotomophilia","aeolus","ahole",
    "alabama hot pocket","alaskan pipeline","anal","anal impaler","anal leakage",
               "analprobe","anilingus","anus","apeshit",
                "ar5e","areola"};
		String description= blog.getBlogDescription();
		for(String word: badWords)
		{
			if(description.contains(word))
				return false;
		}
		return true;
		
	}

	
	public boolean checkBlog(Blog blog) {
		if(checkBlogTitle(blog) && checkBlogDescription(blog))
			return true;
		return false;
	}

}

