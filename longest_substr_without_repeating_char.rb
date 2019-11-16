# @param {String} s
# @return {Integer}
def length_of_longest_substring(s)
    max = head = 0
    hash = {}
    s.length.times do |i|
        head = hash[s[i]] + 1 if hash[s[i]] && head <= hash[s[i]]
        max = i - head + 1 if (i - head + 1) > max
        hash[s[i]] = i
    end
    max
end
