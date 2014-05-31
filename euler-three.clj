(ns euler)

(defn prime-factor [num]
  (loop [n num i 2]
    (cond
     (>= i n) i
     (zero? (mod n i))(recur (/ n i) (inc i))
      :else (recur n (inc i)))))
