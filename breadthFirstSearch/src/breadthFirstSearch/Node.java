package breadthFirstSearch;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Node {
    public String stationName;
    Node leftChild;
    Node rightChild;

    public Node(String stationName, Node firstChild, Node secondChild){
        this.stationName = stationName;
        this.leftChild = firstChild;
        this.rightChild = secondChild;
    }

    public ArrayList<Node> getChildren(){
        ArrayList<Node> childNodes = new ArrayList<>();
        if(this.leftChild != null)
        {
            childNodes.add(leftChild);
        }
        if(this.rightChild != null) {
            childNodes.add(rightChild);
        }
        return childNodes;
    }

    public boolean removeChild(Node n){
        return false;
    }

	public void setChildren(ArrayList<Node> arrayList) {
		// TODO Auto-generated method stub
		
	}

}