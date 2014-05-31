(ns eulerTwo.test (:require [clojure.test :refer :all]))

(load-file "../euler-six.clj")

(deftest sum-diffrence
  (is (= 25164150 (euler/sum-diff 0 100))))


(run-tests)
