rainfall
========

My own solution for this twitter interview question.

Text example looks crappy, please see the picture in the below url:
http://programmingpraxis.com/2013/11/15/twitter-puddle/

We have today an interview question from Twitter:

Consider the following picture:

  1|                      
  2|              ___     
  3|             |7 7|_   
  4|    _        |    6|   
  5|   |5|      _|     |   
  6|   | |    _|4      |   
  7|  _| |  _|3        |   
  8| |2  |_|2          |   
  9|_|_________________|___
   |  0 1 2 3 4 5 6 7 8 9   

In this picture we have walls of different heights. This picture is represented by an array of integers, where the value at each index is the height of the wall. The picture above is represented with an array as [2,5,1,2,3,4,7,7,6].

Now imagine it rains. How much water is going to be accumulated in puddles between walls?

  1|                      
  2|              ___     
  3|             |7 7|_   
  4|    _        |    6|   
  5|   |5|* * * *|     |   
  6|   | |* * *|4      |   
  7|  _| |* *|3        |   
  8| |2  |*|2          |   
  9|_|____1____________|___
 10|  0 1 2 3 4 5 6 7 8 9   
 
We count volume in square blocks of 1X1. So in the picture above, everything to the left of index 1 spills out. Water to the right of index 7 also spills out. We are left with a puddle between 1 and 6 and the volume is 10.

Your task is to write a program to compute the volume of water in the puddle; you should strive for an algorithm that completes the task in a single pass. When you are finished, you are welcome to read or run a suggested solution, or to post your own solution or discuss the exercise in the comments below.
