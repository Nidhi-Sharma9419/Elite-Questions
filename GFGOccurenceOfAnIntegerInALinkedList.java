/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}*/
// complete the below function
class Solution
{
    public static int count(Node head, int search_for)
    {
        //code here
        int count=1;
        int good=0;
        Node temp = head;
        while(temp!=null){
            count+=1;
            if(search_for==temp.data){
                good+=1;
            }
            temp = temp.next;
            
        }
        return good;
        
        
        
    }
}
