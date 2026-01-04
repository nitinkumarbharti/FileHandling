import java.io.FileWriter;
import java.io.IOException;
public class write {
    public static void main(String[]args){
try{
    FileWriter Writer =new FileWriter("myFile.txt");
    Writer.write("Files in java are so so good and now i know how to write them");
    Writer.write("Okay okay how are you??");
    Writer.close();
    System.out.println("Successfully written");
}
catch(IOException e){
System.out.println("Error occured");
e.printStackTrace();
}
    }
}