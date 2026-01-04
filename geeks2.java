import java.io.File;

public class geeks2 {
    public static void main(String[]args){
File obj =new File("/Users/nitish/Desktop/FileH.txt");

if(obj.delete()){
    System.out.println("The deleted file is : "+obj.getName());
}
else{
    System.out.println("Failed in deleting file");
}
    }
    
}


//delete a file