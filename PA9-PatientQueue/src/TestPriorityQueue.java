
public class TestPriorityQueue {

    public static void main(String[] args) {
        PatientQueue pq = new PatientQueue();
        Patient p = new Patient("Anat", 4);
        pq.enqueue(p);

        Patient p2 = new Patient("Ben", 9);
        pq.enqueue(p2);

        Patient p3 = new Patient("Sasha", 8);
        pq.enqueue(p3);

        Patient p4 = new Patient("Wu", 7);
        pq.enqueue(p4);
        Patient p5 = new Patient("Rein", 6);
        pq.enqueue(p5);
        Patient p6 = new Patient("Ford", 2);
        pq.enqueue(p6);
        Patient p7 = new Patient("Eve", 3);
        pq.enqueue(p7);

        // Patient p8 = new Patient("e", 1);
        // pq.enqueue(p8);
        System.out.println(pq);

        pq.dequeue();
        System.out.println(pq);
        pq.dequeue();
        System.out.println(pq);
        pq.dequeue();
        System.out.println(pq);
        pq.dequeue();
        System.out.println(pq);

    }

}
