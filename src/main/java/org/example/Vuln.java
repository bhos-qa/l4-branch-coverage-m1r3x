package org.example;


//Buffer Overflow
public class Vuln
{
        public static void main(String[] args)

        {

                int importantData =1;

                int[]  buffer = new int[10];


                for (int i =0; i < 15; i++)

                        buffer[i] = 7;

                System.out.println("after buffer overflow ");

                System.out.println("Important data  = "+importantData);

        }

}