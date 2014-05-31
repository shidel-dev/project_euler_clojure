(ns euler)

(defn largest-palindrome [minN maxN]
  (apply max
     (for [i (reverse (range minN (+ 1 maxN)))
           j (reverse (range minN (+ 1 maxN)))
           :when (is-palindrome (* i j))]
             (* i j))))

(defn is-palindrome [num]
  (def num-str (str num))
  (= num-str (clojure.string/reverse num-str)))


