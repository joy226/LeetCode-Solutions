/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function(functions) {
    return function(x) {
        // Apply functions from right to left
        return functions.reduceRight((acc, fn) => fn(acc), x);
    };
};
