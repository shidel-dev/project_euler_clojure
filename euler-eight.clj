(ns euler)

(defn series-largest-product [digits series]
   (map #(reduce *(take digits (drop % series)))(range 0 (- (count series) digits))))





