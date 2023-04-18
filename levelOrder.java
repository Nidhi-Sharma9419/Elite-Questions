package Tree;
import java.lang.reflect.Array;
import java.util.*;
import java.util.ArrayList;
class Binary3 {
    public List<Integer> levelOrder(Node root) {

        Queue<Node> queue = new LinkedList<Node>();
        List<Integer> wrapList = new List<Integer>();

        if(root == null) return wrapList;

        queue.offer(root);
        while(!queue.isEmpty()){

            if(queue.peek().left != null)
                queue.offer(queue.peek().left);

            if(queue.peek().right != null)
                queue.offer(queue.peek().right);

            wrapList.add(queue.poll().val);
        }
        return wrapList;
    }
}
