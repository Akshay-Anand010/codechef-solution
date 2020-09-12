t=int(input())
for _ in range(t):
    n=int(input())
    a=list(map(int,input().split()))
    len1=len(set(a))
    if 0 in set(a):
        len1-=1
    print(len1,end='\n')