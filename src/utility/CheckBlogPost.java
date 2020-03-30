package utility;

import model.Blog;

/*
Create a class called CheckBlogPost which extends OffensiveWordsChecker and also implements OffensiveWordsInterface.
Implement checkBlog(Blog blog) method.
The checkBlog(Blog blog) method in turn should invoke checkBlogTitle(Blog blog) and checkBlogDescription(Blog blog).
The checkBlog method should return true if there are no offensive words otherwise it should return false.
You need to use the google offensive word list which is located in your project directory under resources - full-list-of-bad-words_text-file_2018_07_30.txt
Use it for your reference of bad words.
Select 25 offensive words from the file and store it in an array.
You can compare the offensive words with the array and return the output.
*/

public class CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface{
	String[] offensiveWords= {"babeland","apeshit","ar5e","areola", "a55hole","acrotomophilia","aeolus","ahole","alabama hot pocket","	alaskan pipeline","anal","anal impaler","anal leakage","analprobe","anilingus"," aryan","ass", "ass fuck", " ass fuck"," ass hole","areole","arian", "arrse", "arse"," arsehole"};
	
	@Override
	public boolean checkBlogTitle(Blog blog) {
		for(int i=0;i<offensiveWords.length;i++) {
			if(blog.getBlogTitle()==offensiveWords[i])
				return false;
		}
		return true;
	}

	@Override
	public boolean checkBlogDescription(Blog blog) {
		for(String offensivewords : offensiveWords) {
			if (blog.getBlogDescription().contains(offensivewords))
	            return false;
		}
		return true;
	}

	@Override
	public boolean checkBlog(Blog blog) {
		if(checkBlogTitle(blog) && checkBlogDescription(blog))
			return true;
		return false;
	}
	
}