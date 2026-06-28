package lesson05_library;

public class Book {
    private String name;
    private String author;
    private boolean isTaken;

    public Book(String name, String author) {
        setName(name);
        setAuthor(author);
    }
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    private void setName(String newName) {
        if (newName!=null && !newName.trim().isEmpty() ) {
            name = newName;
        }
    }
    private void setAuthor(String newAuthor) {
        if (newAuthor != null && !newAuthor.trim().isEmpty()) {
            author = newAuthor;
        }
    }
    public boolean take() {
        if (isTaken) return false;
        isTaken=true;
        return true;
    }
    public boolean returnBook() {
        if (isTaken) {
            isTaken=false;
            return true;
        }
        return false;
    }
}
