import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

class A{
    public static void main(String[] a){
        System.out.println("hello");
        List<Integer> l = Arrays.asList(1,2,3,4,5);
        System.out.println(l.size());
        if(l.size()>3){
            File f = new File("TestCaseFailed.txt");
            if(!f.exists())
				try {
                    System.out.println("Creating  File");
					f.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        }
    }
}