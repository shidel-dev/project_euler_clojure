(ns eulerThree.test (:require [clojure.test :refer :all]))

(load-file "../euler_Three.clj")

(deftest largest_prime_factor
  (is (= 6857 (euler/prime_factor 600851475143 ))))


(run-tests)
