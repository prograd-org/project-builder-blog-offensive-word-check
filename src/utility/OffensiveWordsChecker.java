/*
 * Progression - 1
We will check if the blog title and description contains any offensive word or not.
Your task is to make sure that the title and description does not contain any offensive words.
To achieve this, lets create a abstract class OffensiveWordsChecker.
Create an abstract method public abstract boolean checkBlog(Blog blog)
 */
package utility;

import model.Blog;

public abstract class  OffensiveWordsChecker{
	public abstract boolean checkBlog(final Blog blog);
	
	
}