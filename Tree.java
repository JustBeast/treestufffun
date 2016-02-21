
public class Tree {
    Node root;
    
    public void add(int value) {
        if (root == null) {
            root = new Node(value);
        }
        else {
            add(value, root);
        }
    }
    
    private void add(int value, Node n) {
        if (value <= n.value) {
            if (n.left == null) {
                n.left = new Node(value);
            }
            else {
                add(value, n.left);
            }
        }
        else {
            if (n.right == null) {
                n.right = new Node(value);
            }
            else {
                add(value, n.right);
            }
        }
    }
    
    public Node RightMost(Node n) {
        if(n.right == null) {
        	return n;
        }
        else {
        	return rightMost(n.right);
        }
    }
    
    public void remove(int value) {
        
    }
    public Node remov
    
    public boolean contains(int value) {
        return contains(value, root);
    }
    
    public boolean contains(int value, Node n) {
        if (n == null) {
            return false;
        }
        if (n.value == value) {
            return true;
        }
        if (value <= n.value) {
            return contains(value, n.left);
        }
        else {
            return contains(value, n.right);
        }
    }
    
    public int count(int value) {
        return count(value, root);
    }
    
    private int count(int value, Node n) {
        if (n == null) {
            return 0;
        }
        if (n.value == value) {
            return 1 + count(value, n.left); 
        }
        if (value < n.value) {
            return count(value, n.left);
        }
        else {
            return count(value, n.right);
        }
    }
    
    public int height() {
        return height(root);
    }
    
    public int height(Node n) {
        if (n == null) {
            return 0;
        }
        int leftHeight = height(n.left);
        int rightHeight = height(n.right);
        
        if (leftHeight > rightHeight) {
            return 1 + leftHeight;
        }
        else {
            return 1 + rightHeight;
        }       
    }
    
    
    public void print() {
        print(root);
    }
    
    private void print(Node n) {
        // If this is a real node
        if (n != null) {
            print(n.left);
            System.out.println(n.value);
            print(n.right);
        }
    }
}
