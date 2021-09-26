package net.stream;

import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.joor.Reflect;

public class Stream extends PrintStream {
  private String prefix = "[HH:mm:ss]";
  
  public Stream() {
    super(System.out);
    System.setOut(this);
  }
  
  public void print(String contents) {
    if (contents == null)
      contents = "null"; 
    Reflect.on(this).call("write", new Object[] { getPrefix() + " " + contents });
  }
  
  public Stream setPrefix(String contents) {
    this.prefix = contents;
    return this;
  }
  
  private String getPrefix() {
    SimpleDateFormat simpleDataFormat = new SimpleDateFormat(this.prefix);
    Date date = new Date();
    return simpleDataFormat.format(date);
  }
}
