(ns eulerTwo.test (:require [clojure.test :refer :all]))

(load-file "../euler_Two.clj")

(deftest sum_under_5_million
  (is (= 4613732 (euler/even_fibs 5000000))))


(run-tests)
