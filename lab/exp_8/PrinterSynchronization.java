public class PrinterSynchronization {

    static class Printer {
        synchronized void printJob(String jobName) {
            System.out.println("Starting: " + jobName);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
            System.out.println("Completed: " + jobName);
        }
    }

    static class Job extends Thread {
        private final Printer printer;
        private final String jobName;

        Job(Printer printer, String jobName) {
            this.printer = printer;
            this.jobName = jobName;
        }

        public void run() {
            printer.printJob(jobName);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Printer printer = new Printer();

        Job j1 = new Job(printer, "Job-1");
        Job j2 = new Job(printer, "Job-2");
        Job j3 = new Job(printer, "Job-3");

        j1.start(); j1.join();
        j2.start(); j2.join();
        j3.start(); j3.join();

        System.out.println("All jobs completed in order.");
    }
}