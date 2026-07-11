class Node{
    String url;
    Node next;
    Node prev;

    Node(String url){
        this.url = url;
        this.next = null;
        this.prev = null;
    }
    Node(String url, Node next, Node prev){
        this.url = url;
        this.next = next;
        this.prev = prev;
    }
}
class BrowserHistory {
    Node current ;

    public BrowserHistory(String homepage) {
        current = new Node(homepage);
    }
    
    public void visit(String url) {
        Node site = new Node(url);
        current.next = site;
        site.prev = current;
        current = current.next; 
    }
    
    public String back(int steps) {
        while(steps-- > 0){ 
        if(current.prev != null) current = current.prev;
        else break;
        }

        return current.url;
    }
    
    public String forward(int steps) {
        while(steps-- > 0){
            if(current.next != null) current = current.next;
            else break;
        }
        return current.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna