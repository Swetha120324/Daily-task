CODE:
public class Book {
	String title;
	String author;
public Book() {
	title = "Wings of Fire";
	author = "Abdul kalam";
	System.out.println("the title of the book "+title );
	System.out.println("the author name "+author);
}
public Book(String title,String author) {
	this.title=title;
	this.author=author;
	System.out.println("the title of the book "+title );
	System.out.println("the author name "+author);
} 
public static void main(String[]args) {
	Book b1 = new Book();
	Book b2 = new Book("The art of being alone" ,"Renuka Gaurani");
}
}

OUTPUT:
the title of the book Wings of Fire
the author name Abdul kalam
the title of the book The art of being alone
the author name Renuka Gaurani
