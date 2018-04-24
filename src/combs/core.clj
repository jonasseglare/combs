(ns combs.core
  (:require [clojure.math.combinatorics :as combo]))

(defn list-all [items]
  (transduce
   (comp (map combo/subsets)
         cat)
   conj
   #{}
   (combo/permutations items)))
