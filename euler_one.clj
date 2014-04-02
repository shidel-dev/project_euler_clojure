(ns euler)

(defn three_five [limit]
  (loop [sum 0 i 1]
    (cond
      (= i limit) sum
      (or (zero? (mod i 3))(zero? (mod i 5))) (recur  (+' sum i) (inc i))
      :else (recur sum (inc i))
    )
  )
)
