import java.util.*;
class Router {

     private class Packet{
        int source;
        int destination;
        int timestamp;

        public Packet(int source,int destination,int timestamp) {
            this.source=source;
            this.destination=destination;
            this.timestamp=timestamp;
        }
    }
    int memoryLimit;
    Set<Packet> set = new HashSet<>();
    Queue<Packet> queue = new LinkedList<>();

    public Router(int memoryLimit) 
    {
        this.memoryLimit=memoryLimit;
    }
    
    public boolean addPacket(int source, int destination, int timestamp) {
        Packet newPacket = new Packet(source, destination, timestamp);
        
        // This check will now work correctly
        if (set.contains(newPacket)) {
            return false; // Packet is a duplicate, do not add
        }

        // If queue is full, remove the oldest packet
        if (queue.size() >= memoryLimit) {
            Packet oldestPacket = queue.remove();
            set.remove(oldestPacket);
        }

        // Add the new packet
        queue.add(newPacket);
        set.add(newPacket);
        return true;
    }
    
    public int[] forwardPacket() {
        if(queue.isEmpty())
        return new int[]{};

        Packet toForward = queue.remove();
        set.remove(toForward);
        return new int[]{toForward.source,toForward.destination,toForward.timestamp};
        
    }
    
    public int getCount(int destination, int startTime, int endTime) {
        int count=0;
        for(Packet packet:queue){
            if(packet.destination==destination && startTime<=packet.timestamp && packet.timestamp<=endTime)
            count++;
        }
        return count;
    }
}

/**
 * Your Router object will be instantiated and called as such:
 * Router obj = new Router(memoryLimit);
 * boolean param_1 = obj.addPacket(source,destination,timestamp);
 * int[] param_2 = obj.forwardPacket();
 * int param_3 = obj.getCount(destination,startTime,endTime);
 */