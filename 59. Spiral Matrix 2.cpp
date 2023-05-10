class Solution {
public:
    vector<vector<int>> generateMatrix(int n) {
         vector<vector<int>> array(n, vector<int>(n, 0));
         int v=1;
         int l=0,r=n-1,t=0,b=n-1,d=0;
         while(l<=r && t<=b)
         {
             if(d==0)
             {
                 for(int i=l;i<=r;i++)
                 {
                     array[t][i]=v;
                     v++;
                 }
                 d=1;t++;
             }
             else if(d==1)
             {
                 for(int i=t;i<=b;i++)
                 {
                     array[i][r]=v;
                     v++;
                 }
                 d=2;r--;
             }
             else if(d==2)
             {
                 for(int i=r;i>=l;i--)
                 {
                     array[b][i]=v;
                     v++;
                 }
                 d=3;b--;
             }
             else if(d==3)
             {
                 for(int i=b;i>=t;i--)
                 {
                     array[i][l]=v;
                     v++;
                 }
                 d=0;l++;
             }
         }
         return array;
    }
};
