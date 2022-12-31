class Book {
                          int bookId;
                          String title;
                          Float price;
                          String author;
                          public void setBookId(int id)
                          {
                               bookId=id;
                          }
                          public void setTitle(String t)
                          {
                                 title=t;
                          }
                          public void setPrice(float p)
                          {
                                price=p;
                          }
                          public void setAuthor(String str)
                          {
                               author=str;
                          }
                          public int getBookId()
                          {
                               return bookId;
                          }
                          public String getTitle()
                          {
                                return title;
                          }
                          public float getPrice()
                          {
                                return price;
                          }
                          public String getAuthor()
                            {
                                 return author;        
                            }
}
public class BookDetails{
                   public static void main(String[] args) {
                            Book b1=new Book();
                            b1.setBookId(7842);
                            b1.setTitle("Captain America");
                            b1.setPrice(125.65f);
                            b1.setAuthor("Chetan Bhagat");
                            System.out.println("BOOK_ID:"+b1.getBookId());
                            System.out.println("TITLE:"+b1.getTitle());
                            System.out.println("PRICE:"+b1.getPrice()+"/-");
                            System.out.println("AUTHOR:"+b1.getAuthor());
                   }
}
