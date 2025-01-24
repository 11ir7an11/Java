class book1
{
    String title,author,publisher;
    int price;
    book1(String title,String author)
    {
        this.title=title;
        this.author=author;
    }
    book1(String title, String author, int price)
    {
        this.title=title;
        this.author=author;
        this.price=price;
    }
    book1(String title, String author, int price, String publisher)
    {
        this.title=title;
        this.author=author;
        this.price=price;
        this.publisher=publisher;
    }
}
class testclass3
{
    public static void main(String args[])
    {
        book1 b1 = new book1("Harry Potter","J.K Rowling");
        book1 b2 = new book1("Harry Potter","J.K Rowling",2999);
        book1 b3 = new book1("Harry Potter","J.K Rowling",2999,"H and C");
        System.out.println("Title : "+b1.title+" ,Author : "+b1.author);
        System.out.println("Title : "+b2.title+" ,Author : "+b2.author+" ,Price : "+b2.price);
        System.out.println("Title : "+b3.title+" ,Author : "+b3.author+" ,Price : "+b3.price+" ,Publisher : "+b3.publisher);
    }
}