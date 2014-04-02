

(defn smallest_multiple [low high]
  (def tests '(11 12 13 14 15 16 17 18 19 20))
  (loop [i 20]
    (cond
     (every? #(zero? (mod i %)) tests) i
     :else (recur (+ i 2))
    )
  )

)


(smallest_multiple 1 20)

