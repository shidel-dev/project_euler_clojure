(ns eulerOne.test (:require [clojure.test :refer :all]))

(load-file "../euler-one.clj")

(deftest sum-under_1000
  (is (= 233168 (euler/three-five 1000))))


(run-tests)
