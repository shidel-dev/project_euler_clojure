(ns eulerOne.test (:require [clojure.test :refer :all]))

(load-file "../euler_one.clj")

(deftest no-matches
  (is (= 233168 (euler/three_five 1000))))


(run-tests)
