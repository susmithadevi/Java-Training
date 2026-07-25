import java.io.IOException;

public class ThrowsDemo {

    static void display() throws IOException{

        throw new IOException("File Error");
    }

    public static void main(String[] args){

        try{

            display();

        }catch(IOException e){

            System.out.println(e.getMessage());
        }
    }
}
