#include <stdio.h>
#define max 30

int main() {
    int n, i, j, k = 0, t, b = 0, min, temp[max], bt[max], wt[max], at[max], pr[max], tat[max];
    float awt = 0, atat = 0;

    printf("Enter the no. of processes:\n");
    scanf("%d", &n);
    printf("Enter burst Time, arrival time & priority of the process:\n");

    for (i = 0; i < n; i++) {
        scanf("%d%d%d", &bt[i], &at[i], &pr[i]);
    }

    // Sort processes by arrival time
    for (i = 0; i < n; i++) {
        for (j = i + 1; j < n; j++) {
            if (at[i] > at[j]) {
                // Swap arrival time
                t = at[j];
                at[j] = at[i];
                at[i] = t;

                // Swap burst time
                t = bt[j];
                bt[j] = bt[i];
                bt[i] = t;

                // Swap priority
                t = pr[j];
                pr[j] = pr[i];
                pr[i] = t;
            }
        }
    }

    // Rest of your code for scheduling algorithms
    for (int j = 0; j < n; j++) { // Changed 'i' to 'j'
        b = b + bt[j];
        min = bt[k];
        for(int i = k; i < n; i++) { // Changed 'i' to 'k'
            min = pr[k];
            if (b < at[i]) {
                if(pr[i] < min){
                    // Swap arrival time
                    t = at[k];
                    at[k] = at[i];
                    at[i] = t;

                    // Swap burst time
                    t = bt[k];
                    bt[k] = bt[i];
                    bt[i] = t;

                    // Swap priority
                    t = pr[k];
                    pr[k] = pr[i];
                    pr[i] = t;
                }
            }
        }
        k++;
    }

    temp[0] = 0;
    printf("process\t burst time\t arrival time \t priority\t waiting time\t turn around time\t");
    for (int i = 0; i < n; i++) {
        wt[i] = 0;
        tat[i] = 0;
        temp[i + 1] = temp[i] + bt[i];
        wt[i] = temp[i] - at[i];
        tat[i] = wt[i] + bt[i];
        awt = awt + wt[i];
        atat = atat + tat[i];
        printf("%d\t%d\t\t%d\t\t%d\t\t%d\t\t%d\n", i + 1, bt[i], at[i], pr[i], wt[i], tat[i]);
    }

    awt = awt / n;
    atat = atat / n;
    printf("Average Waiting Time:%f", awt);
    printf("Average turn Around time%f", atat);

    return 0;
}
