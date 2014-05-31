(ns eulerTwo.test (:require [clojure.test :refer :all]))

(load-file "../euler-Two.clj")

(deftest sum-under-5-million
  (is (= 4613732 (euler/even-fibs 4000000))))


(run-tests)
