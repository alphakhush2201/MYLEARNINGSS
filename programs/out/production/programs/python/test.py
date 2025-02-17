t = int(input("Enter number of test cases: "))
for _ in range(t):
    n, k = map(int, input().split())
    l = list(map(int, input().split()))
    
    # basic difference
    initial_sum = sum(abs(l[i] - l[i + 1]) for i in range(n - 1))
    max_sum = initial_sum

    # checking the max diff by trying putting 1 and k at each value 
    for i in range(n):
        current = l[i]
        
        # Checking for 1
        if current != 1:
            temp = initial_sum
            if i > 0:
                temp -= abs(l[i] - l[i - 1])
                temp += abs(1 - l[i - 1])
            if i < n - 1:
                temp -= abs(l[i] - l[i + 1])
                temp += abs(1 - l[i + 1])
            max_sum = max(max_sum, temp)
        
        # Checkiing for K
        if current != k:
            temp = initial_sum
            if i > 0:
                temp -= abs(l[i] - l[i - 1])
                temp += abs(k - l[i - 1])
            if i < n - 1:
                temp -= abs(l[i] - l[i + 1])
                temp += abs(k - l[i + 1])
            max_sum = max(max_sum, temp)
    
    print(max_sum)
