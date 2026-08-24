class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        unordered_map<int,int>mp;
        for(int ele : nums){
            mp[ele]++;
        }
        //Pair element min-heap
        priority_queue<pair<int,int>,vector<pair<int,int>>,greater<pair<int,int>>>mnh;
        for(auto it : mp){
            int element = it.first;
            int freq = it.second;
            mnh.push({freq,element});
            if(mnh.size()>k)mnh.pop();
        }
        vector<int>ans;
        while(!mnh.empty()){
            ans.push_back(mnh.top().second);
            mnh.pop();
        }
        return ans;
    }
};