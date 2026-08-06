class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer>set=new HashSet<>();
        List<Integer>list=new ArrayList<>();
        for(int n:nums){
            if(set.contains(n)){
                list.add(n);
            }else{
                set.add(n);
            }
        }
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        int[] a =new int[list.size()];
        for(int i=0;i<list.size();i++){
            a[i]=list.get(i);
        }
        return a;
    }
}