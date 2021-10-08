public class StdoutToFile {
  
  /**
   * This example class shows how to activate a debugging file output of usual System.out.print of java.
   * You may need this if never understood how to use the Logger class :x
   */
  public static void main(String[] args) {
    
    try {
      File outputFile = File.createTempFile("debug", ".log", new File("."));
      PrintStream output = new PrintStream(new BufferedOutputStream(new FileOutputStream(outputFile)), true);
      System.setOut(output);
      System.setErr(output);
      
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    System.out.println("this is now in a temporary file located where your project is started.");
    
  }
}
