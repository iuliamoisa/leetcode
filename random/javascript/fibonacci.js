/*
the Fibonacci sequence can be calculated more efficiently using iteration or memoization to avoid redundant calculations.
This implementation stores already computed Fibonacci numbers in the memo object, preventing redundant calculations and improving performance, especially for larger values of n
*/

var yourself = {
    fibonacci: function(n, memo = {}) {
        if (n in memo) {
            return memo[n];
        }
        if (n === 0) {
            return 0;
        }
        if (n === 1) {
            return 1;
        }
        
        memo[n] = this.fibonacci(n - 1, memo) + this.fibonacci(n - 2, memo);
        return memo[n];
    }
};
/*
Memoization is an optimization technique used in computer programming to improve the efficiency of functions by caching the results of expensive function calls and returning the cached result when the same inputs occur again.

1. When a function is called with a set of inputs, the function first checks whether the result for those inputs has already been computed and stored.
2. If the result is found in the cache (often implemented using an object or a map), the function returns the cached result without re-computing it.
3. If the result is not found in the cache, the function computes the result as usual, but before returning it, it stores the result in the cache associated with the input arguments.
4. Subsequent calls to the function with the same inputs can then return the cached result directly, avoiding redundant computations.

Memoization is particularly useful for recursive functions or functions with repeated computations, such as the Fibonacci sequence calculation, where the same values are computed multiple times without memoization.
*/
