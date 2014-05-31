 (ns euler)

 (defn even-fibs [limit]
   (loop [prev 0 cur 1 sum 0]
     (if (< prev limit)
       (recur cur (+' cur prev) (if (zero? (mod cur 2)) (+' sum cur) sum))
      sum)))
