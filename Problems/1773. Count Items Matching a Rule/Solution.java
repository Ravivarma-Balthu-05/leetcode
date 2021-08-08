class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int n = items.size();
        int c=0;
        for(int i=0;i<n;i++){
            String str1= "type";
            String str2 = "color";
            String str3 = "name";
            if(ruleKey.equals(str1)){
                String str= items.get(i).get(0);
                if(ruleValue.equals(str)){
                    c++;
                }
                
            }
            else if(ruleKey.equals(str2)){
                 String str= items.get(i).get(1);
                if(ruleValue.equals(str)){
                    c++;
                }
            }
            else if(ruleKey.equals(str3)){
                 String str= items.get(i).get(2);
                if(ruleValue.equals(str)){
                    c++;
                }
            }            
        }      
        return c;
    }
}
