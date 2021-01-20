package utility;

import model.Blog;

public class CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface{
	String[] offensiveWords={"2 girls 1 cup","2g1c","4r5e","5h1t","5hit","a$$","a$$hole","a_s_s","a2m","a54","a55","a55hole","acrotomophilia","aeolus","ahole","alabama hot pocket","alaskan pipeline","anal","anal impaler","anal leakage","analprobe","anilingus","anus","apeshit","ar5e","areola"};
	
	
	@Override
	public boolean checkBlogTitle(Blog blog) {
		// TODO Auto-generated method stub
		String title=blog.getBlogTitle().toLowerCase();
		for(String word : offensiveWords) {
			if(title.contains(word))
				return false;
		}
		
		return true;
	}

	@Override
	public boolean checkBlogDescription(Blog blog) {
		// TODO Auto-generated method stub
		String title=blog.getBlogDescription().toLowerCase();
		for(String word : offensiveWords) {
			if(title.contains(word))
				return false;
		}
		return true;
	}

	@Override
	public boolean checkBlog(Blog blog) {
		// TODO Auto-generated method stub
		boolean value1=checkBlogTitle(blog);
		boolean value2=checkBlogDescription(blog);
		if(value1 && value2)
			return true;
		
		return false;
	}
	
}