/*Student's name and ID:Jana Al Sukhon*/
/*Student ID number: 18110003*/
/*Date: 14/1/2019*/
/*An application for the school of engineering/SCI (HTU) to calculate the students averages and find the letter grades*/

//include the stdio.h library
#include <stdio.h>

//include the stdlib.h library
#include <stdlib.h>

//the function prorotype header to calculate the average
float calculateAverageGrade(float grade1, float grade2, float grade3, float grade4);

//the function prorotype header to find the letter grade
char findLetterGrade(float avgGrade);


//the beginning of the main body
int main()
{
        //declaring variables
        float Grade1;
        float Grade2;
        float Grade3;
        float Grade4;
        float average;
        char  lettergrade;
        char buffer[50];                        //an array to store the data taken line by line from the input_File
        char firstname[30];                     //an array for the student's name
        char secondname[30];                    //an array for the student's family name

        //input_File pointer declaration
        FILE *inputptr;
        //open input_File
        inputptr = fopen("input_File.txt", "r");
        if (inputptr == NULL)
        {
                printf("error!\n");
                //termination
                exit(1);
        }

        //output_File pointer declaration
        FILE *outputptr;
        //open an output file
        outputptr = fopen("output_File.txt", "w");
        if(outputptr == NULL)
        {
                printf("error!\n");
                //termination
                exit(1);
        }

        //fgets is used to get data from the first line in the input_File
        fgets(buffer,50,inputptr);

        //while loop is used to repeat the following process
        while (feof(inputptr)==0)
        //feof means the while loop must stop when the end of the file is reached
        {
                //scan the data in the buffer that was taken from the input_File
                sscanf(buffer,"%s %s %f %f %f %f", firstname, secondname, &Grade1, &Grade2, &Grade3, &Grade4);
                //print the first name of the student in the output_File
                fprintf(outputptr,"%s ", firstname);
                //print the second name of the student in the output_File
                fprintf(outputptr,"%s", secondname);

                fprintf(outputptr,"\tAverage: ");
                //calculate the average by using the function calculateAverageGrade
                average = calculateAverageGrade(Grade1, Grade2, Grade3, Grade4);
                //print the average on the output_File in to 2 decimal places
                fprintf(outputptr,"%0.2f",average);

                fprintf(outputptr,"\tGrade: ");
                //use the function findLetterGrade to find the letter grade
                lettergrade = findLetterGrade(average);
                //print the letter grade on the output_File
                fprintf(outputptr,"%c",lettergrade);
                //print a new line to show the next student's information in a seperate row
                fprintf(outputptr,"\n");
                //get the next line's data from the input file
                fgets(buffer,50,inputptr);
        }

        //closing the input and the output file
        fclose(inputptr);
        fclose(outputptr);
        return 0;
}
//the end of the main body


float calculateAverageGrade(float grade1, float grade2, float grade3, float grade4)
//function body
/*this function takes the value of the grades of the student
 from the input_File and calcultes the average as the following*/
{
        //declaring a variable (avg)
        float avg;
        //calculating avg
        avg = (grade1 + grade2 + grade3 + grade4)/4.0;
        return avg;
}
//end of the calculateAverageGrade function


char findLetterGrade(float avgGrade)
//function body
/*this function takes the value of avgGrade and gives it a corresponding
 letter grade according to its range by using the if statement*/
{
        //declaring a character (mark)
        char mark;
        if(avgGrade >= 0 &&  avgGrade < 50)
        {
                mark = 'U';
        }
        else if(avgGrade >= 50 && avgGrade < 60)
        {
                mark = 'F';
        }
        else if(avgGrade >= 60 && avgGrade < 70)
        {
                mark = 'E';
        }
        else if(avgGrade >= 70 && avgGrade < 80)
        {
                mark = 'C';
        }
        else if(avgGrade >= 80 && avgGrade < 90)
        {
                mark = 'B';
        }
        else if(avgGrade >= 90 && avgGrade <=100)
        {
                mark = 'A';
        }
        else
        {
                mark = '0'; //error (if the avgGrade is less tha 0 or bigger than 100)
        }
        return mark;
}
//end of findLetterGrade function

