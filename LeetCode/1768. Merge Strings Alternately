class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        m = max(len(word1), len(word2))
        i = 0
        res = []
        while i != m:
            if i < len(word1):
                res.append(word1[i])
            if i < len(word2):
                res.append(word2[i])
            i+=1
        return ''.join(res)
