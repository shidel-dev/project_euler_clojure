(ns euler)

(defn even_fibs [limit]
  (loop [prev 0 cur 1 sum 0]
    (def new_cur (+' cur prev))
    (println new_cur)
      (if (< new_cur limit)
        (if (zero? (mod new_cur 2))
          (recur cur new_cur (+ sum new_cur))
        (recur cur new_cur sum))
      sum)
  )
)

(even_fibs 100)
