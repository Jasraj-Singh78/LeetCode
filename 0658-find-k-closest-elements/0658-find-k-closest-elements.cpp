class Solution {
public:
    vector<int> findClosestElements(vector<int>& arr, int k, int x) {
        priority_queue<pair<int,int>>mh;
        int n=arr.size();
        for(int i=0;i<n;i++){
            int dis = abs(arr[i]-x);
            mh.push({dis,arr[i]});
            if(mh.size()>k)mh.pop();
        }
        vector<int>ans;
        while(!mh.empty()){
            ans.push_back(mh.top().second);
            mh.pop();

        }
        sort(ans.begin(),ans.end());
        return ans;
    }
};