 (ns euler)

 (defn even_fibs [limit]
   (loop [prev 0 cur 1 sum 0]
     (if (< prev limit)
       (recur cur (+' cur prev) (if (zero? (mod cur 2)) (+' sum cur) sum))
      sum)))

 (even_fibs 4000000)

