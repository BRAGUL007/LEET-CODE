class Solution:
    def diagonalSum(self, mat: List[List[int]]) -> int:
        
       
        n = len(mat)
        total = 0

        for i in range(n):
            # Primary diagonal
            total += mat[i][i]

            # Secondary diagonal
            total += mat[i][n - 1 - i]

        # If n is odd, middle element was counted twice
        if n % 2 == 1:
            total -= mat[n // 2][n // 2]

        return total