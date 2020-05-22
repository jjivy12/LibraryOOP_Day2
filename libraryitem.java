public class libraryitem {

    private String title;
    private Author author;
    private PublishingCompany publisher;
    private int releaseYear;

    public void libraryItem(String title, Author author, PublishingCompany publisher, int releaseYear) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.releaseYear = releaseYear;
    }

    
}