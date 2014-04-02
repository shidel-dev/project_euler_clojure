(ns eulerFour.test (:require [clojure.test :refer :all]))

(load-file "../euler_five.clj")

(deftest largest_prime_factor
  (is (= 232792560 (euler/smallest_multiple 1 20))))


(run-tests)
