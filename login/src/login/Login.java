/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import login.add;

/**
 *
 * @author Ranga Hrushikesh.R
 */
class records
{
    public String img_name,category,resolution,address,shot_by;
    int key;
}
public class Login {

node n=new node();
    /**
     * @param args the command line arguments
     */
//int skey;
static add a=new add();
public static void insert1(int key)
{
    //skey=key;
    
    a.insert(key);
}
public static int search1(int key)
{
    int flag=a.search(key);
    return flag;
}
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan;
        int n=0;
        String buffer;
        try {
            scan = new Scanner(new File("E://insert.txt"));
            scan.useDelimiter("\n");
            while(scan.hasNext())
            {
                buffer=scan.next();
                n++;
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("N: "+n);
        records rec[]=new records[30];
        for(int i=0;i<30;i++)
        {
            rec[i]=new records();
        }
        
        try {
            
            Scanner s=new Scanner(new File("E://insert.txt"));
            s.useDelimiter(",");
            int k=0;
            for(int i=0;i<n;i++)
            {
                rec[i].img_name=s.next();
                rec[i].category=s.next();
                rec[i].resolution=s.next();
                rec[i].address=s.next();
                rec[i].shot_by=s.next();
                rec[i].key=s.nextInt();
                k=rec[i].key;
                System.out.println("Key: "+k);
                insert1(k);
                
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        //loginf lf=new loginf();
        //lf.setVisible(true);
      firstpage f1=new firstpage();
            f1.setVisible(true);
    }
    
}
