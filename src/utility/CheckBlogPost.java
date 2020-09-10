package utility;

import model.Blog;

public class CheckBlogPost extends OffensiveWordsChecker  implements OffensiveWordsInterface{
	
	String badwords[]= {"2 girls 1 cup","2g1c","5h1t","anal","analprobe","ass hole","ass fuck","bitch","bastard","bdsm","clit","cumdump","date rape","booobs","dickslap","pussy palace","shaved pussy","caca","cacafuego","cahone","camel toe","cameltoe","camgirl","camslut","camwhore","ass fuck"," asshole","suckass","sucked","sucking","sucks","suicide girls","sultry women"};

	@Override
	public boolean checkBlogTitle(Blog blog) {

		// TODO Auto-generated method stub
		// if title has badword it will return false
		for(String badword: this.badwords) {
			if(blog.getBlogTitle().toLowerCase().contains(badword.toLowerCase()))
				return false;
		}
	
		return true;
	}

	@Override
	public boolean checkBlogDescription(Blog blog) {
		// TODO Auto-generated method stub
		// if description has badword it will return false
		for(String badword: this.badwords) {
			if(blog.getBlogDescription().toLowerCase().contains(badword.toLowerCase()))
				return false;
		}
	
		return true;
	}

	@Override
	public boolean checkBlog(Blog blog) {
		// TODO Auto-generated method stub
		
		return (checkBlogDescription(blog) && checkBlogTitle(blog));
	}
	
}