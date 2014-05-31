(ns eulerFour.test (:require [clojure.test :refer :all]))

(load-file "../euler-five.clj")

(deftest largest-prime-factor
  (is (= 232792560 (euler/smallest-multiple 1 20))))


(run-tests)
