(ns too-hot.core-test
  (:require [clojure.test :refer :all]
            [too-hot.core :refer :all]))

(deftest temperature-conversion-test
  (testing "temperature convertsion"
    (is (zero? (fahrenheit->celsius 32)))
    (is (= 100 (fahrenheit->celsius 212)))
    (is (= 40 (fahrenheit->celsius 104)))
    (is (= 104 (celsius->fahrenheit 40)))
    (is (= (celsius->fahrenheit -40) (fahrenheit->celsius -40)))))
