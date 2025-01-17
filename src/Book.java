public class Book {
    private String nameBook;
    private int year;
    private String Author;
    public Book(String nameBook, int year, String author){
        this.nameBook = nameBook;
        this.year = year;
        this.Author = author;
    }
    public String getNameBook(){
        return this.nameBook;
    }
    public int getYear(){
        return this.year;
    }
    public String getAuthor(){
        return this.Author;
    }
    public  void setYear(int year){
        this.year = year;
    }
}
