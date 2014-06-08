(ns euler)

(defn series-largest-product [digits series]
  (apply max
    (map
      #(reduce *
        (->> series
          (drop %)
          (take digits)))

      (range 0
        (-> series
          (count)
          (- digits))))))





