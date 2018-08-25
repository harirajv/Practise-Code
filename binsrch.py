#Binary Search

import math

def binsr(a,low,high,e):
    if low<high:
        mid=math.floor((low+high)/2)
        if e<a[mid]:
            return binsr(a,low,mid-1,e)
        elif e>a[mid]:
            return binsr(a,mid+1,high,e)
        elif e==a[mid]:
            return mid
        else:
            return -1

if __name__ == '__main__':
    print("Input array:")
    arr=list(map(int,input().split()))
    print("Input search element:")
    ele=int(input())
    indx=binsr(arr,0,len(arr)-1,ele)
    print(indx+1)