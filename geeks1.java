import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class geeks1 {
    public static void main(String[]args){
try{
    File obj=new File("/Users/nitish/Desktop/FileH.txt");
    Scanner Reader=new Scanner(obj);

    while(Reader.hasNextLine()){
        String data=Reader.nextLine();
        System.out.println(data);
    }
    Reader.close();
}
catch(FileNotFoundException e){
    System.out.println("An error has occured");
    e.printStackTrace();
}


    }
}

//Read a file
