void InorderMorrisTraversal(Node root){
    Node CurrNode = root;
    if(CurrNode.left == null){
        answer.add(CurrNode);
        CurrNode = CurrNode.right;
        
    }
    else{
        Node temp = CurrNode.left;
        while(temp.right!= null && temp.right !=CurrNode){
            temp = temp.right;
        }
        if(temp.right==null){
            temp.right = CurrNode;
            //answer.add(CurrNode);
            CurrNode = CurrNode.left;
        }
        else{
            answer.add(CurrNode);
            temp.right=null;
            CurrNode = CurrNode.right;
        }
    }
}
