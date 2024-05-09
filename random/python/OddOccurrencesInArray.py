'''
A non-empty array A consisting of N integers is given. The array contains an odd number of elements, and each element of the array can be paired with another element that has the same value, except for one element that is left unpaired.

For example, in array A such that:

  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9
the elements at indexes 0 and 2 have value 9,
the elements at indexes 1 and 3 have value 3,
the elements at indexes 4 and 6 have value 9,
the element at index 5 has value 7 and is unpaired.
Write a function:

def solution(A)

that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.

For example, given array A such that:

  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9
the function should return 7, as explained in the example above.

Write an efficient algorithm for the following assumptions:

N is an odd integer within the range [1..1,000,000];
each element of array A is an integer within the range [1..1,000,000,000];
all but one of the values in A occur an even number of times.
Copyright 2009–2024 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
'''

def solution(A):
  
    result = 0
    for num in A:
        result ^= num  # XOR operation
    
    return result

'''
 --------------------- EXPLANATION  ---------------------

 0 XOR 0 = 0 
 0 XOR 1 = 1
 1 XOR 0 = 1
 1 XOR 1 = 0

If A==B => A XOR B = 0; so 2 inputs of the same value will output 0 
If A=whatever and B=0 => A XOR B = A; so any value XOR 0 will output the value

- result :  will hold the result of the XOR output each time
            firstly, result=0 ; then we get inside the loop:
                                0 ^ num = num
                                
            As we iterate through the array and perform XOR operations with each number, 
            paired numbers will cancel each other out due to the property of XOR. 
            For example, if we have two identical numbers, XORing them will result in 0. 
            Therefore, only the unpaired number will remain in result.

The value of result represents the cumulative XOR of all elements in the array. 
Since XOR is associative and commutative, the order in which the XOR operations are performed does not matter. 
Therefore, the final value of result will be the unpaired element.
Time complexity: O(N) or O(N*log(N))
'''
