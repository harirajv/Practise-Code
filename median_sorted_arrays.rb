# Finds median of two sorted arrays of unequal size
# Time complexity O(log(min(m,n))) m,n => input array size
# @param {Integer[]} nums1
# @param {Integer[]} nums2
# @return {Float}
def find_median_sorted_arrays(nums1, nums2)
  a, b = [nums1, nums2].sort_by(&:size)
  m, n = a.size, b.size
  median_pos = (m + n - 1) / 2
  i = (0...m).bsearch { |i| median_pos-i-1 < 0 || a[i] >= b[median_pos-i-1] } || m
  nextfew = (a[i..i+1] + b[median_pos-i..median_pos-i+1]).sort
  (nextfew[0] + nextfew[1 - (m+n)%2]) / 2.0
end
