(defn apply_discount "Applying discount of 10.0%" [value-to-be-discounted] 
    (let [discount-tax (/ 10 100)
          discount (* value-to-be-discounted discount-tax)
          value-with-discount (- value-to-be-discounted discount)]
      (println "applying the discount")
      (println "discount tax " discount-tax)
      (println "discount " discount)
      (println "value with discount " value-with-discount)
      (if ( > value-with-discount 1000)
        (println "discount applied but the final value is still expensive: " value-with-discount) ;;true
        (println "discount applied")))) ;;false

;;call custom function passing param
(apply_discount 1000)