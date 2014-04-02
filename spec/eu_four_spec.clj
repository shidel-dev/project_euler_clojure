(ns eulerFour.test (:require [clojure.test :refer :all]))

(load-file "../euler_four.clj")

(deftest largest_prime_factor
  (is (= 906609 (euler/largest_palindrome 100 999))))


(run-tests)
