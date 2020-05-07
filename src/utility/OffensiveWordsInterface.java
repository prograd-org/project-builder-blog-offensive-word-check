/*
 * Progression - 2
Create an Interface - public interface OffensiveWordsInterface.
Create two methods boolean checkBlogTitle(Blog blog) and boolean checkBlogDescription(Blog blog).
 */
package utility;

import model.Blog;

public interface OffensiveWordsInterface{
	
	boolean checkBlogTitle(Blog blog);
	
	boolean checkBlogDescription(Blog blog);
}