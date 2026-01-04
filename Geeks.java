import java.io.FileWriter;
import java.io.IOException;
public class Geeks{
    public static void main(String[]args){
        try{
FileWriter Writer=new FileWriter("/Users/nitish/Desktop/FileH.txt");

Writer.write("Files lets see");
Writer.close();
System.out.println("Written Successfully");
    }

    catch(IOException e){
        System.out.println("An error has occured");
    
e.printStackTrace();
    }

    }
}


//Writing a file