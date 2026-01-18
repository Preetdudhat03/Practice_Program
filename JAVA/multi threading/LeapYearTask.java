// A class that implements Runnable interface
/*static class LeapYearTask implements Runnable {

    // The start and end year for the task
    private int startYear;
    private int endYear;

    // The count of leap years for the task
    private int count;

    // The constructor that takes the start and end year
    public LeapYearTask(int startYear, int endYear) {
        this.startYear = startYear;
        this.endYear = endYear;
        this.count = 0;
    }

    // The run method that executes the task
    @Override
    public void run() {
        // Loop through the range of years
        for (int year = startYear; year <= endYear; year++) {
            // Check if the year is a leap year
            if (isLeapYear(year)) {
                // Print the leap year
                System.out.println(year + " is a leap year");
                // Increment the count
                count++;
            }
        }
        // Print the count for the task
        System.out.println("Thread " + Thread.currentThread().getName() + " found " + count + " leap years");
    }

    // A method that returns the count of leap years for the task
    public int getCount() {
        return count;
    }

    // A method that checks if a year is a leap year
    public boolean isLeapYear(int year) {
        // A year is a leap year if it is divisible by 4
        // except if it is divisible by 100
        // unless it is divisible by 400
        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }
}

// The main method
public static void main(String[] args) throws InterruptedException {
    // The total count of leap years
    int totalCount = 0;

    // Create three tasks for three threads
    LeapYearTask task1 = new LeapYearTask(1970, 1989);
    LeapYearTask task2 = new LeapYearTask(1990, 2009);
    LeapYearTask task3 = new LeapYearTask(2010, 2030);

    // Create three threads for three tasks
    Thread thread1 = new Thread(task1, "T1");
    Thread thread2 = new Thread(task2, "T2");
    Thread thread3 = new Thread(task3, "T3");

    // Start the threads
    thread1.start();
    thread2.start();
    thread3.start();

    // Wait for the threads to finish
    thread1.join();
    thread2.join();
    thread3.join();

    // Add the counts of the tasks
    totalCount = task1.getCount() + task2.getCount() + task3.getCount();

    // Print the total count
    System.out.println("Total count of leap years is " + totalCount);
}*/
class LeapYearCounter implements Runnable {
    private int startYear;
    private int endYear;
    private static int totalLeapYears = 0;
    private int threadLeapYears = 0;

    public LeapYearCounter(int startYear, int endYear) {
        this.startYear = startYear;
        this.endYear = endYear;
    }
    public void run() {
        for (int year = startYear; year <= endYear; year++) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                threadLeapYears++;
                totalLeapYears++;
                System.out.println(Thread.currentThread().getName() + ": " + year);
            }
        }
        System.out.println(Thread.currentThread().getName() + " Leap Year Count: " + threadLeapYears);
    }

    public static int getTotalLeapYears() {
        return totalLeapYears;
    }
}

public class LeapYearTask {
    public static void main(String[] args) {
        int startYear = 1970;
        int endYear = 2030;
        int threadCount = 3;
        int yearsPerThread = (endYear - startYear + 1) / threadCount;

        Thread[] threads = new Thread[threadCount];
        LeapYearCounter[] counters = new LeapYearCounter[threadCount];

        for (int i = 0; i < threadCount; i++) {
            int threadStartYear = startYear + i * yearsPerThread;
            int threadEndYear = threadStartYear + yearsPerThread - 1;
            counters[i] = new LeapYearCounter(threadStartYear, threadEndYear);
            threads[i] = new Thread(counters[i]);
            threads[i].start();
        }

        for (int i = 0; i < threadCount; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Total Leap Year Count: " + LeapYearCounter.getTotalLeapYears());
    }
}