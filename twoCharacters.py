#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'alternate' function below.
#
# The function is expected to return an INTEGER.
# The function accepts STRING s as parameter.
#

def alternate(s):
    # Write your code here
    maxnum = count = 0
    alp = list(set(s))
    
    # find all combinations of characters
    for i in range(len(alp)) :
        for j in range(i+1,len(alp)) :
            l = [alp[i], alp[j]]
            
            if(s.index(alp[i]) < s.index(alp[j])) :
                ind = 0
            else :
                ind = 1
                
            # check for alternate char and increment count
            for char in s :
                if char in l :
                    if char == l[ind]:
                        count +=1
                        # flip the index
                        ind = ind ^ 1
                    else :
                        count = 0
                        break
            
                        
            # store the maximum length
            maxnum = max(maxnum,count)
            count = 0
    
    return maxnum
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    l = int(input().strip())

    s = input()

    result = alternate(s)

    fptr.write(str(result) + '\n')

    fptr.close()
