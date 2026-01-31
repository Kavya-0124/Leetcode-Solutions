class Solution {
public:
    char nextGreatestLetter(vector<char>& letters, char target) {
        int size = letters.size();

        for(int itr = 0; itr < size; itr++){
            if(letters[itr]>target)
                return letters[itr];
        }
        return letters[0];
    }
};