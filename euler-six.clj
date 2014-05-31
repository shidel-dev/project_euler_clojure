(ns euler)

(defn sum-of-squares [number-range]
  (reduce + (map #(* % %) number-range)))

(defn square-of-sums [number-range]
  (let [sum (reduce + number-range)]
    (* sum sum)))

(defn sum-diff [lower-limit, upper-limit]
  (let [number-range (range lower-limit (inc upper-limit))]
    (- (square-of-sums number-range) (sum-of-squares number-range))))

(euler/sum-diff 0 100)
