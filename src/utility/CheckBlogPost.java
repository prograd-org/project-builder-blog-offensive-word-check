package utility;

import model.Blog;

public class CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface{
	
		String bad_word_array[]={"shit","fuck","fag","fucker","Lezzian","nigger","a$$hole","a_s_s","a2m","scank","a55","bitch","a55hole","acrotomophilia","aeolus","ahole","alaskan pipeline","wh00r","whore","anal leakage","cabron","yed","spic","apeshit","ar5e","areola","areole","arian"};
	    
	    public boolean checkBlogTitle(Blog blog) {
			// TODO Auto-generated method stub
			String title=blog.getBlogTitle();
			String title_array[]=title.trim().split("\\s+");
			
			for(int i=0;i<title_array.length;i++)
			{
				for(int j=0;j<bad_word_array.length;j++)
				{
					if(title_array[i]==bad_word_array[j])
					{
						return false;		
					}
				}
			}
			
			return true;
       }
	
		@Override
		public boolean checkBlogDescription(Blog blog) {
			// TODO Auto-generated method stub
			String desc=blog.getBlogDescription();
			String desc_array[]=desc.trim().split("\\s+");
			
			for(int i=0;i<desc_array.length;i++)
			{
				for(int j=0;j<bad_word_array.length;j++)
				{
					if(desc_array[i]==bad_word_array[j])
					{
						return false;		
					}
				}
			}
			
			return false;
		}
	
		@Override
		public boolean checkBlog(Blog blog) {
			// TODO Auto-generated method stub
			if(checkBlogDescription(blog)==true||checkBlogTitle(blog)==true)
				return true;
			else
				return false;
		}
		
		
		
}