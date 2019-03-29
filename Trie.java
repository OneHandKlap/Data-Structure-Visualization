/**
 * <h> Trie this!</h>
 * the Trie.java program demonstrates iterator behaviour through multi-parameter sorting of Java Tree-set data structure
 * @author P. Aboud - onehandklap
 * @since 2019-28-03
 */

import java.util.*;

public class Trie implements Comparable<Trie>{//Simple object that extends comparable, ie. can be sorted numerically
    
    //Two parameters by which to sort, primary is String, second is the int.
    String name;
    int index;

    //Simple constructor
    public Trie(String n, int i){

        name=n;
        index=i;
    }

    //Simple display method which will be used to show which object the iterator is handling
    public String display(){
        return "Letter: "+this.name+" ,"+this.index;
    }

    public int compareTo(Trie e){
        
        //If the strings of two Trie objects are equal, their int values will be evaluated to estabilsh precedence
        if(this.name.compareTo(e.name)==0){
            if(this.index<e.index){
                return -1;
            }
            if(this.index==e.index){
                return 0;
            }
            else{
                return 1;
            }
        }
        else{
            return this.name.compareTo(e.name);
        }
    }
    public static void main(String[]args){

        TreeSet<Trie> tree = new TreeSet<Trie>();   //Initialize empty treeset of type Trie
        Trie a = new Trie("A", 1); 
        Trie b = new Trie("B", 1);
        Trie e = new Trie("C", 2);
        Trie f = new Trie("D", 1);
        Trie g = new Trie("D", 2);
        Trie c = new Trie("B", 2);
        Trie d = new Trie("C", 1);
        //Create and add a bunch of Tries
        tree.add(a);
        tree.add(b);
        tree.add(c);
        tree.add(d);
        tree.add(e);
        tree.add(f);
        tree.add(g);
        //Initialize an iterator
        Iterator<Trie> iter = tree.iterator();
        //Send iterator through the tree, and display each Trie object
        while(iter.hasNext()){
            System.out.println(iter.next().display());
        }

    }



}