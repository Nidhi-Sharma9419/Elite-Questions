void PreOrderMorisTraversal(Node root){
    Node CurrNode.data = root;
    if(CurrNode.left == null){
        answer.add(CurrNode.data);
        CurrNode = CurrNode.right;
    }
    else{
        Node temp = CurrNode.left;
        while(temp.right!=null && temp.right!= CurrNode){
            temp = temp.right;
        }
        if (temp.right == null){
            temp.right = CurrNode;
            answer.add(CurrNode.data);
            CurrNode = CurrNode.left;
        }
        else{
            temp.right = null;
            CurrNode = CurrNode.right;
        }
    }
}
