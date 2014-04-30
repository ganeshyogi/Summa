/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package summa;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
/**
 *
 * @author root
 */
public class Summa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        //BufferedReader ip=new BufferedReader(new FileReader(new File("/root/Desktop/chelian/_lobs/flist.txt")));
                ArrayList<String> Dept=new ArrayList<String>();
        String flist="";
        String file[]=new File("/root/Desktop/chelian/_lobs/").list();
        Arrays.sort(file);
        //System.out.println(file+"");
        for(int i=file.length-1;i>=0;i--)
        {
        System.out.println(file[i]);    
        }
//        while((flist=ip.readLine())!=null)
//        {
//            Dept.add(flist);
//        }
//
//     Comparator comparator = Collections.reverseOrder();
//     Collections.sort(Dept,comparator);
//     System.out.println(Dept);
     
        
    }
}
