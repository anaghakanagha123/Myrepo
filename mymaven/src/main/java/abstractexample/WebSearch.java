package abstractexample;

public class WebSearch extends Google {
	
	public void searchResult() {
		System.out.println("search result from websearch...");
	}
	public void webSearch() {
		System.out.println("web result from websearch...");
		
	}

	public static void main(String[] args) {
		Google ggl=new WebSearch();
		ggl.search();
		ggl.searchResult();
		ggl.webSearch();
		
		SearchImage srch=new SearchImage();
		srch.webSearch();
		srch.searchResult();
		srch.search();
	}

}
