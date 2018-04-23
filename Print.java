public class BookHtmlFormatter {
   public String print(Book book) {
      StringBuilder builder = new StringBuilder();
      builder.append(book.getClassification() + "<br />");
      builder.append("<table>");
      builder.append("<tr><th>Author</th><th>Title</th>
                          <th>Year</th></tr>");
      builder.append("<tr>");
      builder.append("<td>" + book.getAuthor() + "</td>");
      builder.append("<td>" + book.getTitle()  + "</td>");
      builder.append("<td>" + book.getYear()   + "</td>");
      builder.append("</tr>");
      builder.append("</table>");
      return builder.toString();
   }
}

// BookPrintFormatter.java
import static util.StringUtil.*;

public class BookPrintFormatter {
   public String print(Book book) {
      StringBuilder builder = new StringBuilder();
      builder.append(book.getClassification() + EOL);
      builder.append("Author: " + book.getAuthor() + EOL);
      builder.append("Title:  " + book.getTitle()  + EOL);
      builder.append(book.getYear() + EOL);
      return builder.toString();
   }

}