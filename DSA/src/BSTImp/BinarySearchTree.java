package BSTImp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node{
    int value;
    Node left;
    Node right;
    Node(int value){
        this.value=value;
    }
}
public class BinarySearchTree {
     Node root;
//    public BinarySearchTree(){
//       // Node newNode=new Node(value);
//       // root=newNode;
//        root=null;
//    }
    public boolean insert(int value){
        Node newNode=new Node(value);
        if(root==null){
            root=newNode;
        return true;
        }
        Node temp=root;
        while(true){
            if(newNode.value==temp.value) return false;
            if(newNode.value<temp.value){
                if(temp.left==null){
                    temp.left=newNode;
                    return true;
                }
                temp=temp.left;
            }
            else{
                if(temp.right==null){
                    temp.right=newNode;
                    return true;
                }
                temp=temp.right;
            }
        }
    }
    public boolean contains(int value){
        if(root==null) return false;
        Node temp=root;
        while(temp!=null) {
            if (value<temp.value) {
                temp = temp.left;
            }
            else if(value> temp.value){
                temp=temp.right;
            }
            else return true;
        }
        return false;
    }



    private boolean rContains(Node currentNode,int value){
        if(currentNode==null) return false;
        if(currentNode.value==value) return true;
        if(value<currentNode.value)  return rContains(currentNode.left, value);
        return rContains(currentNode.right,value);
    }
    public boolean rContains(int value){
        return rContains(root,value);
    }




    private Node rInsert(Node currentNode,int value){
        if(currentNode==null) return new Node(value);
        if(value<currentNode.value){
            currentNode.left=rInsert(currentNode.left,value);
        }
        else{
            currentNode.right=rInsert(currentNode.right,value);
        }
      return currentNode;
    }
    public void rInsert(int value){
        if(root==null)root=new Node(value);
       rInsert(root,value);
    }



    private Node rDeleteNode(Node currentNode,int value)
    {
        if(currentNode==null)return null;
        if(value<currentNode.value){
            currentNode.left=rDeleteNode(currentNode.left,value);
        }
        else if(value>currentNode.value){
            currentNode.right=rDeleteNode(currentNode.right, value);
        }
        else{
            if(currentNode.left==null && currentNode.right==null){
                return null;
            } else if(currentNode.left==null){
                currentNode=currentNode.right;
            }else if(currentNode.right==null){
                currentNode=currentNode.left;
            }else{
                int subMin=minValue(currentNode.right);
                currentNode.value=subMin;
                currentNode.right=rDeleteNode(currentNode.right,subMin);
            }
        }
        return currentNode;
    }
    public void rDeleteNode(int value){
         rDeleteNode(root,value);
    }
    public int minValue(Node currentNode){
            while(currentNode.left!=null){
                currentNode=currentNode.left;
            }
            return currentNode.value;
    }

}
