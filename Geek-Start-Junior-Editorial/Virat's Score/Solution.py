n = int(input())
s = list(map(str, input().split()))
scores  = list(map(int, input().split()))
score = 0
nob  = 0
for i in range(len(s)):
    if(s[i]=='V'):
        nob+= 1
        score += scores[i]
if(score==0):
    print('0 0.00')
else:
    print(score, '%.2f' % (score/nob * 100))
