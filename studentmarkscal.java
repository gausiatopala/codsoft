import java.util.Scanner;

    public class studentmarkscal{
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            
            System.out.print("Enter the number of subjects: ");
            int numSubjects = sc.nextInt();
    
          
            int[] marks = new int[numSubjects];
            int totalMarks = 0;
    
           
            for (int i = 0; i < numSubjects; i++) {
                System.out.print("Enter marks for subject " + (i + 1) + ": ");
                marks[i] = sc.nextInt();
                totalMarks += marks[i];
            }
    
           
            System.out.println("Total Marks: " + totalMarks);
    
            
            double averagePercentage = (totalMarks / (double) (numSubjects * 100)) * 100;
            System.out.println("Average Percentage: " + averagePercentage + "%");
    
            String grade;
            if (averagePercentage >= 90) {
                grade = "A";
            } else if (averagePercentage >= 80) {
                grade = "B";
            } else if (averagePercentage >= 70) {
                grade = "C";
            } else if (averagePercentage >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }
            System.out.println("Grade: " + grade);
    
           
            sc.close();
        }
    }
    

