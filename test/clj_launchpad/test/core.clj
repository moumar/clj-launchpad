(ns clj-launchpad.test.core
  (:require [clojure.test :refer :all])
  (:require [clj-launchpad :refer :all]))

(deftest setup-test
  (testing "if the setup is correct to run tests"
    (is true (< 1 2))))
