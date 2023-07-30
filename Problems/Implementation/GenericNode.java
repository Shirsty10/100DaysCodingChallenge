package Problems.Implementation;

import java.util.ArrayList;

public class GenericNode{
  public int data;
  public ArrayList<GenericNode> childrens;

 public GenericNode(int data){
    this.data = data;
    this.childrens = new ArrayList<>();
  }
}
