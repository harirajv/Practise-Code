#Merge Sort
import math

def merge(arr, p, q, r):
    n1 = q - p + 1
    n2 = r - q
 
    L=[]
    R=[]
    
    for i in range(n1):
        L.append(arr[p + i])
 
    for j in range(n2):
        R.append(arr[q + 1 + j])
 
    i=j=0    
    k = p
        
    while i < n1 and j < n2 :
        if L[i] <= R[j]:
            arr[k] = L[i]
            i += 1
        else:
            arr[k] = R[j]
            j += 1
        k += 1

    #Add remaining elements if any
    while i < n1:
        arr[k] = L[i]
        i += 1
        k += 1
    
    while j < n2:
        arr[k] = R[j]
        j += 1
        k += 1
 
def mergeSort(arr,p,r):
    if p < r:    
        q=math.floor((p+r)/2)        
        mergeSort(arr, p, q)
        mergeSort(arr, q+1, r)
        merge(arr, p, q, r)
 
arr=list(map(int,input().split(' ')))
n = len(arr) 
mergeSort(arr,0,n-1)
print(arr)