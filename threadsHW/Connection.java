package threadsHW;

//Mock Connection class to simulate database connections
class Connection {
 private final int id;

 public Connection(int id) {
     this.id = id;
 }

 public int getId() {
     return id;
 }
}