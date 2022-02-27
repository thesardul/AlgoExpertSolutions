import java.util.*;

class Program {
  // This is an input class. Do not edit.
  public static class LinkedList {
    public int value;
    public LinkedList next;

    public LinkedList(int value) {
      this.value = value;
      this.next = null;
    }
  }

  public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
    // Write your code here.
		LinkedList cNode = linkedList;
		while(cNode != null){
			LinkedList nNode = cNode.next;
			while(nNode != null && nNode.value == cNode.value){
				nNode = nNode.next;
			}
			cNode.next = nNode;
			cNode = nNode;
		}
    return linkedList;
  }
}
