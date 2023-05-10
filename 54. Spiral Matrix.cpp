class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        vector<int> list;
        int row=matrix.size();
        if(row==0)
            return list;
        int col=matrix[0].size();
        int l=0;
        int r=col-1;
        int t=0;
        int b=row-1;
        int d=0;
        while(l<=r && t<=b)
        {
            if(d==0)
            {
                for(int i=l;i<=r;i++)
                {
                    list.push_back(matrix[t][i]);
                }
                d=1;
                t++;
            }
            else if(d==1)
            {
                for(int i=t;i<=b;i++)
                {
                    list.push_back(matrix[i][r]);
                }
                d=2;
                r--;
            }
            else if(d==2)
            {
                for(int i=r;i>=l;i--)
                {
                    list.push_back(matrix[b][i]);
                }
                d=3;
                b--;
            }
            else if(d==3)
            {
                for(int i=b;i>=t;i--)
                {
                    list.push_back(matrix[i][l]);
                }
                d=0;
                l++;
            }
        }
        return list;
    }
};
