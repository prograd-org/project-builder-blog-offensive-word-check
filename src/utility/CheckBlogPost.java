package utility;

import model.Blog;

public class CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface
{
	//implementing checkBlog method of abstract class
	
	String offensiveWords[]= {"2 girls 1 cup","2g1","4r5e","5h1t","5hit","a$$",
			"a$$hole","a_s_s","a2m","a54","a55","a55hole","acrotomophilia",
			"aeolus","ahole","alabama hot pocket","alaskan pipeline","anal",
			"anal impaler","anal leakage","analprobe","anilingus","anus",
			"apeshit","ar5e","areola","areole","arian"};
	public boolean checkBlog(Blog blog)
	{
		return checkBlogTitle(blog) || checkBlogDescription(blog);
	}
	
	//implementing checkBlogTitle of interface
	public boolean checkBlogTitle(Blog blog)
	{
		String []blogTitleArr=blog.getBlogTitle().split(" ");
		for(String word:blogTitleArr)
		{
			for(String offense:offensiveWords)
			{
				if((word.toLowerCase()).equals(offense))
					return true;
			}
		}
		return false;
	}
	
	//implementing checkBlogDescription of interface
	public boolean checkBlogDescription(Blog blog)
	{
		String []blogDescriptionArr=blog.getBlogDescription().split(" ");
		for(String word:blogDescriptionArr)
		{
			for(String offense:offensiveWords)
			{
				if((word.toLowerCase()).equals(offense))
					return true;
			}
		}
		return false;
	}
}