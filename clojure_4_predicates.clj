(ns inventory.predicates)

;PREDICATE
(defn should-apply-discount?
  [value-to-be-discounted]
  (if (> value-to-be-discounted 100)
    true
    false))

;WHEN PREDICATE
(defn wshould-apply-discount?
  [value-to-be-discounted]
  (when (> value-to-be-discounted 100)
    true                                                    ;;when just threat the true expression and all the code below will be executed too.
    (println "discount will be applied")))

;DIRECT PREDICATE
(defn dshould-apply-discount?
  [value-to-be-discounted]
  (> value-to-be-discounted 100))

(defn get-discount-percentage []
  (/ 10 100))

(defn apply-discount
  [value]
      (let [percent (get-discount-percentage)]
        (println "value to be discounted: " value)
        (println "discount percent: " percent)
        (if (dshould-apply-discount? value)
          (println (* value percent))
          (println value))))


(apply-discount 10000)