(ns eulerThree.test (:require [clojure.test :refer :all]))

(load-file "../euler-Three.clj")

(deftest largest-prime_factor
  (is (= 6857 (euler/prime-factor 600851475143))))


(run-tests)
