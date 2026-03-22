
public class QueueImpl {

    int currsize = 0;
    int size = 4;
    int Q[] = new int[size];
    int s = -1;
    int e = -1;

    void push(int x) {
        if (currsize == 0) {
            s = 0;
            e = 0;
        }
        else if (currsize == size) {
            System.out.println("cannot push into the queue");
            return;
        } else {
            e = (e + 1) % size;
        }
        Q[e] = x;
        currsize++;
    }

    int poll() {
        if (currsize == 0) {
            System.out.println("cannot pop");
            return -1;
        }
        int ele = Q[s];
        if (currsize == 1) {
            s = -1;
            e = -1;
        } else {
            s = (s + 1) % size;
        }
        currsize--;
        return ele;
    }

    public static void main(String[] args) {
        QueueImpl q = new QueueImpl();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        System.out.println(q.poll());
    }
}
