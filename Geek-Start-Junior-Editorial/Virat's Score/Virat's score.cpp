#include <iostream> 
using namespace std; 
int main() { 
    int n; 
    cin>>n; 
    char str[n]; 
    for(int i=0;i<n;i++) cin>>str[i]; 
    int score[n]; 
    for(int i=0;i<n;i++) cin>>score[i]; 
    int nob= 0,sum = 0; 
    for(int i=0;i<n;i++){ 
        if(str[i]=='V'){ 
            nob++; 
            sum += score[i]; 
        } 
    } 
    if(sum!=0)printf("%d %0.2f",sum, (float)sum/nob*100); 
    else cout<<0<<" "<<"0.00"; 
    return 0; 
}
