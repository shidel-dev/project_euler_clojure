(ns eulerFour.test (:require [clojure.test :refer :all]))

(load-file "../euler-four.clj")

(deftest largest-prime-factor
  (is (= 906609 (euler/largest-palindrome 100 999))))


(run-tests)
