private Node invertTree(Node currentNode){
        if(currentNode == null)return null;
        Node temp = currentNode.left;
        currentNode.left = invertTree(currentNode.right);
        currentNode.right = invertTree(temp);
        
        return currentNode;
    }
