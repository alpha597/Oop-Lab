import java.util.*;
class Book{
    String title;
    double price;
    String publisher;
    List<String> authors;
    public Book(String t,double p,String publish){
        title =t;
        price =p;
        publisher= publish;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public List<String> getAuthors() {
        return authors;
    }
    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }
    public void printDetails(){
        System.out.println("Name - " +title);
        System.out.println("Authors are: ");
        for(int a=0;a<authors.size();a++){
            System.out.println(authors.get(a));
        }
        System.out.println("Publisher is " +publisher);
    }
}
class pair{
    String name;
    int quantity;
    public pair(String n, int q){
        name =n;
        quantity =q;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
class BookStore{
    String name;
    List<pair> books;
    public BookStore(String s){
        name = s;
    }
    
    public List<pair> getBooks() {
        return books;
    }
    public void setBooks(List<pair> books) {
        this.books = books;
    }
    public void sell( String title,int num){
        for(int a=0;a<books.size();a++){
            pair p = books.get(a);
            if(title.equals(p.name)){
               int k = p.quantity;
               if(k <num){
                System.out.println("Not Available Here");
               } 
               else{
                System.out.println("You have bought the book");
                p.setQuantity(p.getQuantity() - k);;

               }
            }
        }
    }
    
}
class practice{
    public static void main(String[] args) {
        Book b1 = new Book("Macbeth",500,"Oxford");
        List<String> l1 = new ArrayList<>();
        l1.add("Shakespere");
        b1.setAuthors(l1);
        Book b2 = new Book("The Jungle Book",600,"Oxford");
        List<String> l2 = new ArrayList<>();
        l2.add("Rudyard Kipling");
        b2.setAuthors(l2);
        Book b3 = new Book("Harry Potter",500,"Oxford");
        List<String> l3 = new ArrayList<>();
        l3.add("J.K.Rowling");
        b3.setAuthors(l3);
        b1.printDetails();
        b2.printDetails();
        BookStore store = new BookStore("A");
        List<pair> list = new ArrayList<>();
        list.add(new pair("Macbeth",5));
        list.add(new pair("Harry Potter",7));
        store.setBooks(list);
        store.sell("Macbeth",2);
        store.sell("Macbeth",4);
    }
}
