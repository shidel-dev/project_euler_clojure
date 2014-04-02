(ns euler)

(defn largest_palindrome [minN maxN]
  (apply max
     (for [i (reverse (range minN (+ 1 maxN)))
           j (reverse (range minN (+ 1 maxN)))
           :when (is_palindrome (* i j))]
             (* i j)
      )
   )
)

(defn is_palindrome [num]
  (def num_str (str num))
  (= num_str (clojure.string/reverse num_str))
)




(largest_palindrome 100 999)


