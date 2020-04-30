package utility;

import model.Blog;

public class CheckBlogPost  extends OffensiveWordsChecker implements OffensiveWordsInterface{
    String[] offensiveWords={"2 girls 1 cup","2g1c","4r5e","5h1t","5hit","a$$","a$$hole","a_s_s","a2m","a54","a55","a55hole","acrotomophilia","aeolus","ahole","alabama hot pocket","alaskan pipeline","anal","anal impaler","anal leakage","analprobe","anilingus","anus","apeshit","ar5e","areola"};
	int offensivetitle=0;
	int offensivedescription=0;
    @Override
	public boolean checkBlogTitle(Blog blog) {
		String title=blog.getBlogTitle();
		for(int i=0;i<offensiveWords.length;i++) {
			if(title.matches(offensiveWords[i])) {
				offensivetitle++;
			}
			}
		if(offensivetitle>=1) {
			return false;
		}
		else {
			return true;
		}
		}
		
	@Override
	public boolean checkBlogDescription(Blog blog) {
		String description=blog.getBlogDescription();
		
		for(int i=0;i<offensiveWords.length;i++) {
			if(description.matches(offensiveWords[i])) {
				offensivedescription++;
			}
			}
		if(offensivedescription>=1) {
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public boolean checkBlog(Blog blog) {
		
		if(checkBlogTitle(blog) && checkBlogDescription(blog)) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
