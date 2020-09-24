package utility;

import model.Blog;

public class CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface{

	String [] offWords={"assbang","assbanged","assbanger","assbangs","assbite","assclown","asscock","asscracker","asses","assface","assfaces","assfuck","assfucker","ass-fucker","assfukka","assgoblin","assh0le","asshat","ass-hat","asshead","assho1e","asshole","assholes","asshopper","ass-jabber","assjacker","asslick","asslicker","assmaster","assmonkey","assmucus","assmucus","assmunch","assmuncher","assnigger","asspirate","ass-pirate","assshit","assshole","asssucker","asswad","asswhole","asswipe","asswipes","auto erotic","autoerotic","axwound","azazel","azz","b!tch","b00bs","b17ch","b1tch","babeland","baby batter","baby juice"};

	
	@Override
	public boolean checkBlogTitle(Blog blog) {
		// TODO Auto-generated method stub
		for(int i=0;i<offWords.length;i++)
		{
			if(blog.getBlogTitle().contains((offWords[i])))
			{
				return true;
			}
		}
		
		return false;
	}

	@Override
	public boolean checkBlogDescription(Blog blog) {
		// TODO Auto-generated method stub
		for(int i=0;i<offWords.length;i++)
		{
			if(blog.getBlogDescription().contains((offWords[i])))
			{
				return true;
			}
		}
		
		return false;
	}
	@Override
	public boolean checkBlog(Blog blog) {
		// TODO Auto-generated method stub
		return (checkBlogDescription(blog) && checkBlogTitle(blog));
	}

	
	 
 }