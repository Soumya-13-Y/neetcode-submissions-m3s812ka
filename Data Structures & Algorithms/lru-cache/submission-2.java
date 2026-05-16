class LRUCache {
class Node{
    int key,value;
    Node prev,next;

     Node(int key,int value){
    this.key=key;
    this.value=value;
       }
}
int capacity;
Map<Integer,Node> map;
Node head;
Node tail;


void remove(Node n){
    n.prev.next=n.next;
    n.next.prev=n.prev;
}


void insert(Node n){
   tail.prev.next=n;
   n.prev=tail.prev;
   tail.prev=n;
   n.next=tail;
   tail.prev=n;
}
    public LRUCache(int capacity) {
        this.capacity=capacity;
        map=new HashMap<>();    
         head=new Node(0,0);
         tail=new Node(0,0);
       head.next=tail;
    tail.prev=head;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
Node temp=map.get(key);
remove(temp);
insert(temp);
return temp.value;
        }else{
           return -1;
        }
        
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node temp=map.get(key);
            remove(temp);
            temp.value=value;
            insert(temp);
        }else{
if(map.size()>=capacity){
    map.remove(head.next.key);
    remove(head.next);
}
 Node s=new Node(key,value);
    insert(s);
    map.put(key,s);

        }

        
    }
}
