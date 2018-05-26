/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios4;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author turupawn
 */
public class Exercises
{
    static int getSum(ArrayList<Integer> list)
    {

int x = 0;
for(int i=0; i<list.size(); i++)
{
    x=list.get(i)+x ;
}
        return x;
    }
    
    
    
    
    static boolean exists(ArrayList<String> list, String value)
    {
        boolean r=false;
        if (list.contains(value))
        {
          r=true;
        }
        return r;
    }
    
    static ArrayList<Integer> sort(ArrayList<Integer> list)
    {
        ArrayList<Integer> answer = new ArrayList<>();
        Collections.sort(list);
        return list;
    }
}
