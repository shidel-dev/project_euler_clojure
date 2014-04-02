(ns eulerOne.test (:require [clojure.test :refer :all]))

(load-file "../euler_one.clj")

(deftest sum_under_1000
  (is (= 233168 (euler/three_five 1000))))


(run-tests)
