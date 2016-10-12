import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by B on 12.10.2016.
 */
public class ScanFile {

    public static int[] scanFile(String fileName){
        Scanner sc= null;
        try {
            sc = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<Integer> list = new ArrayList<>();
        while (sc.hasNext()){
            list.add(sc.nextInt());
        }
        int dots[] = new int[list.size()];
        for(int i=0; i<list.size();i++)
            dots[i]=list.get(i);
        return dots;
    }


}
