import java.lang.reflect.Type;

public class cardholder<E> {
    private String name;
    private int libraryCard;
    private overduelist<E> overdueBooks;

    public cardholder(String name, int libraryCard, overduelist<E> overdueBooks, Type overdueType) {
        this.name = name;
        this.libraryCard = libraryCard;
        this.overdueBooks = overdueBooks;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getLibraryCard() {
        return libraryCard;
    }

    public overduelist<E> isOverdueBooks() {
        return overdueBooks;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setLibraryCard(int card) {
        this.libraryCard = card;
    }

    public void setOverdueBooks(overduelist<E> overdueBooks) {
        this.overdueBooks = overdueBooks;
    }

    public String toString() {
        if (overdueBooks != null) {
            return "Hello " + this.name + ". Please return " + this.overdueBooks + " or late fee applies.";
        } else {
            return "Hello " + this.name + "! Please come again.";
        }
    }
}