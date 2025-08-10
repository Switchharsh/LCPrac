class Solution:
    def compress(self, chars: List[str]) -> int:
        n = len(chars)
        if n <= 1:
            return n
        write_ptr = 0
        read_ptr = 0

        while read_ptr < n:
            current_char = chars[read_ptr]
            count = 0

            while read_ptr < n and chars[read_ptr] == current_char:
                read_ptr += 1
                count += 1

            chars[write_ptr] = current_char
            write_ptr += 1

            if count > 1:
                for digit in str(count):
                    chars[write_ptr] = digit
                    write_ptr += 1
        return write_ptr