class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        s_ptr, t_ptr = 0, 0
        s_len, t_len = len(s), len(t)

        if s_len == 0:
            return True
        
        while t_ptr < t_len:
            if s[s_ptr] == t[t_ptr]:
                s_ptr += 1

                if s_ptr == s_len:
                    return True
            
            t_ptr += 1

        return False