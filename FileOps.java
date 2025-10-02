import java.io.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class FileOps {
    public static void main(String[] args)  {
   try{
    File file=new File("FilePath");
    if(file.createNewFile())
    {
        System.out.println("Create New File");
        } else  {
        System.out.println("File already exists");
    }
        System.out.println("File props : "+file.canRead()+file.canWrite());

    FileWriter writer = new FileWriter("FilePath");

BufferedWriter bufferedWriter=new BufferedWriter(writer);
bufferedWriter.write("How are you");
bufferedWriter.close();
       System.out.println("Text Written Successfully");
FileReader fileReader=new FileReader("FilePath");
       BufferedReader reader=new BufferedReader(fileReader);
       String line=null;
       while ((line = reader.readLine()) != null)
       {
           System.out.println("Reading :"+ line);
       }
       reader.close();
   } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}