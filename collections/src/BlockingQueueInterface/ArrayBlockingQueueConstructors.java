package BlockingQueueInterface;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueConstructors {
	public static void main(String[] args) {
		ArrayBlockingQueue bq = new ArrayBlockingQueue(10);
		System.out.println(bq.remainingCapacity());
		ArrayBlockingQueue bq1 = new ArrayBlockingQueue(10, true);
		// fair if true then queue accesses for threads blockedon insertion or removal,
		// are processed in FIFO order;if false the access order is unspecified.
		System.out.println(bq.remainingCapacity());
		ArrayBlockingQueue bq2 = new ArrayBlockingQueue(10, true, bq1);// capacity,fair,collection
		System.out.println(bq2.remainingCapacity());
	}
}
