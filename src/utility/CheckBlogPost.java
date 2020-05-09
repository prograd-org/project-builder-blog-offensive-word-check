/*
 * Progression - 3
Create a class called CheckBlogPost which extends OffensiveWordsChecker and also implements OffensiveWordsInterface.
Implement checkBlog(Blog blog) method.
The checkBlog(Blog blog) method in turn should invoke checkBlogTitle(Blog blog) and checkBlogDescription(Blog blog).
The checkBlog method should return true if there are no offensive words otherwise it should return false.
You need to use the google offensive word list which is located in your project directory under resources - full-list-of-bad-words_text-file_2018_07_30.txt
Use it for your reference of bad words.
Select 25 offensive words from the file and store it in an array.
You can compare the offensive words with the array and return the output.SS
 */
package utility;

import model.Blog;

public class CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface{
	
	String arr[] = {"boner","boners","bong","boob","boobies","boobs","booby","booger","bookie","boong","booobs",
			"booaoobs","booooobs","booooooobs","bootee","bootie","booty","booty call","booze","boozer",
			"boozy","bosom","bosomy","breasts","Breeder","brotherfucker"};

	
	@Override
	public boolean checkBlogTitle(Blog blog) {
		String b_title = blog.getBlogTitle();
	
		// TODO Auto-generated method stub
		for (int i=0 ; i<arr.length;i++) {
			if(b_title.matches(arr[i])){
				return false;
		}
		}
		return true;
	}

	@Override
	public boolean checkBlogDescription(Blog blog) {
		// TODO Auto-generated method stub
		String b_description = blog.getBlogTitle();
		
		for(int i= 0; i<arr.length; i++) {
			
			if(b_description.matches(arr[i])) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean checkBlog(Blog blog) {
		// TODO Auto-generated method stub
		
		
		if(checkBlogTitle(blog)==true && checkBlogDescription(blog)== true) {
			return true;
		}
		return false;
	}
	
}