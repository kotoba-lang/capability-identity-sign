(ns kotoba.capability.identity.sign-test
  (:require [clojure.test :refer [deftest is]]
            [kotoba.capability.identity.sign :as capability]
            [kotoba.core.capability-repository :as repository]))

(deftest manifest-conforms
  (is (= [] (repository/validate-manifest capability/manifest))))
