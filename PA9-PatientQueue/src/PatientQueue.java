import java.util.ArrayList;

public class PatientQueue {
    int size;
    ArrayList<Patient> arr = new ArrayList<>();
    public PatientQueue() {
        arr.add(null);
        size = 0;
    }

    public void enqueue(Patient p) {
        arr.add(p);
        size++;
        bubbleUp();
    }

    private void bubbleUp() {
        if (size > 1) {
            int indParent = size / 2;
            int indChild = size;

            while (indParent > 0) {
                // System.out.println("arr.get(indParent): " +
                // arr.get(indParent)
                // + " arr.get(indChild): " + arr.get(indChild));

                if (arr.get(indChild).priority < arr.get(indParent).priority) {
                    Patient buff = arr.get(indChild);
                    arr.set(indChild, arr.get(indParent));
                    arr.set(indParent, buff);
                    indChild = indParent;
                    indParent = indChild / 2;
                } else {
                    return;
                }
            }
        }
    }

    public Patient dequeue() {
        Patient p = arr.get(1);
        arr.set(1, arr.get(size));
        arr.set(size, null);
        size--;
        bubbleDown();
        return p;
    }

    private void bubbleDown() {
        if (size > 1) {
            int indParent = 1;
            int indChild = 2;
            if (size > 2 && arr.get(3).priority < arr.get(2).priority) {
                indChild = 3;
            }
            while (indChild < size) {
                if (arr.get(indChild).priority < arr.get(indParent).priority) {
                    Patient buff = arr.get(indChild);
                    arr.set(indChild, arr.get(indParent));
                    arr.set(indParent, buff);
                    indParent = indChild;
                    indChild = indChild * 2;
                    if (size > indChild && arr.get(indChild + 1).priority < arr
                            .get(indChild).priority) {
                        indChild += 1;
                    }
                } else {
                    return;
                }
            }
        }
    }
    public String toString() {
        String str = "{";
        for (Patient p : arr) {
            if (p != null) {
                str += "<" + p + ">; ";
            }

        }
        return str + "}";
    }

}
