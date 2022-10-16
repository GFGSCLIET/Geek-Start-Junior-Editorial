#include <stdio.h>

int main() {
    int n;
    scanf("%d",&n);
    char str[2*n];
    for(int i=0;i<2*n;i++) 
    {
        scanf("%c",&str[i]);    
        // printf("%c",str[i]);
    }
    int score[n];
    for(int i=0;i<n;i++) scanf("%d",&score[i]);
    int nob= 0,sum = 0;
    for(int i=0;i<2*n;i++){
        // printf("%d",sum);
        if(str[i]=='V'){
            nob++;
            sum += score[i/2];
        }
    }
    if(sum!=0) printf("%d %0.2f",sum, (float)sum/nob*100);
    else printf("0 0.00");
    return 0;
}
