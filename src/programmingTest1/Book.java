package programmingTest1;

public class Book {
	private String name;
	private int numberOfPages;
	private int currentPage;
	
	// default constructor
	public Book() {
		this.name = "No Name Yet";
		this.numberOfPages = 0;
		this.currentPage = 0;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public String getname() {
		return name;
	}
	
	public void setNumberOfPages(int newNumberOfPages) {
		if (newNumberOfPages > 0 && newNumberOfPages >= this.currentPage) {
			this.numberOfPages = newNumberOfPages;
        }
	}
	
	public int getNumberOfPages() {
		return numberOfPages;
	}
	
	public void setCurrentPage(int newCurrentPage) {
		if (newCurrentPage > 0 && newCurrentPage <= this.numberOfPages) {
            this.currentPage = newCurrentPage;
        }
	}
	
	public int getCurrentPage() {
		return currentPage;
	}
	
}
