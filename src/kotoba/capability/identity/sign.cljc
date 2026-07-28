(ns kotoba.capability.identity.sign
  "Importable contract for identity/sign."
  (:require [kotoba.core.capability-repository :as repository]))

(def manifest
  (repository/repository-manifest "identity/sign"))
