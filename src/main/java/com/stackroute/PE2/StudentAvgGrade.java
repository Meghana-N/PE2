/**
 * a program, which reads number of students and n grades as input
 * (of int between 0 and 100, inclusive) and displays the average, minimum and
 * maximum.Your program shall check for valid input. You should keep all the grades
 * in an int[] and use a method for each of the computations.
 *  Output:
 * Enter the number of students: 4
 * Enter the grade for student 1: 86
 * Enter the grade for student 2: 65
 * Enter the grade for student 3: 98
 * Enter the grade for student 4: 77
 * The average is 81.50
 * The minimum is 65
 * The maximum is 98
 */
package com.stackroute.PE2;

public class StudentAvgGrade {

    /*
    This method will compute Minimum of Student Grades
     */
    public int studentMin(int number,int studentArray[])
    {
        int minStudent=studentArray[0];
       for( int i=1; i<number; i++)
       {
           if( (studentArray[i] > 100) || (studentArray[i] < 1) )
           {
               return -1;
           }

           if( minStudent > studentArray[i] )
           {
               minStudent =studentArray[i];

           }
       }
       return minStudent;
    }

    /*
    This method will compute Maximum of Student Grades
     */
    public int studentMax(int number,int studentArray[])
    {
        int maxStudent=studentArray[0];
        for( int i=1; i<number; i++)
        {
            if( (studentArray[i] > 100) || (studentArray[i] < 1) )
            {
                return -1;
            }

            if( maxStudent < studentArray[i])
            {
                maxStudent =studentArray[i];
            }
        }
        return maxStudent;
    }

    /*
    This method will compute Average of Student Grades
     */
    public String studentAvg(int number,int studentArray[])
    {
        double avgStudent;
        double sum=0;
        for( int i=0; i<number ;i++ )
        {
            if( (studentArray[i] > 100) || (studentArray[i] < 1) )
            {
                return "-1";
            }
            sum=sum+studentArray[i];
        }
        avgStudent=sum/number;
        return Double.toString(avgStudent)+"0";
    }

}
