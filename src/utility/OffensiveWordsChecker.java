package utility;

import model.Blog;
import model.User;

//To achieve this, lets create a abstract class OffensiveWordsChecker.*
//Create an abstract method public abstract boolean checkBlog(Blog blog).*

public abstract class OffensiveWordsChecker{
	public abstract boolean checkBlog(Blog blog);
}

