package utility;

import model.Blog;



//class extends offensivewords and implements offensive wordinterface
public class CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface
{
	//Selecting 25 offensive words from the file(Resources) and store it in an array.
	String a[]= {"ass hole","ass fuck","bitch","bastard","bdsm","clit","cumdump","date rape","booobs","dickslap","pussy palace","shaved pussy","caca","cacafuego","cahone","camel toe","cameltoe","camgirl","camslut","camwhore","ass fuck"," ass hole","suckass","sucked","sucking","sucks","suicide girls","sultry women"};

	@Override
	//The checkBlogTitle(Blog blog) should check if the blog title contains any offensive words.
	public boolean checkBlogTitle(Blog blog) 
	{
		String title=blog.getBlogTitle();
		for(int i=0;i<25;i++)
		{
			if(title.equalsIgnoreCase(a[i]))
			{
	//Return true if there are no offensive words else false if it contains any offensive words.		
				return true;
			}
		}
	
		return false;
	}

	@Override
	public boolean checkBlogDescription(Blog blog)
	{
		String description=blog.getBlogDescription();
		for(int i=0;i<25;i++)
			{
			if(description.equalsIgnoreCase(a[i]))
				return true;
		}
	     return false;
	}

	@Override
	
	public boolean checkBlog(Blog blog)
	{
		if((checkBlogTitle(blog))||(checkBlogDescription(blog)))
			return false;
		return true;
	}
	
}