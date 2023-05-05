def maximumSumSubarray (self,k,arr,n):
        currsum=0
        ans=0
        i=0
        j=k
        currsum=sum(arr[0:k])
        ans=currsum
        #window sliding take place
        while(j<n):
            currsum=currsum+arr[j]-arr[i]
            ans=max(ans,currsum)
            i+=1
            j+=1
        return ans 
