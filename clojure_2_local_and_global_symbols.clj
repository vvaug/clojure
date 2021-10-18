(defn apply_discount "Applying discount of 10.0%" [value-to-be-discounted] 
;;(def discount-percentage 0.10)
;;using def key, we are defining a new symbol in a global context and we can accidentally override
;;some existing symbol so the best practice is use the "let" key to define a symbol locally.
;;  (let  [discount-percentage 0.10])
;; let only exists locally between (), so below the code won't recognize the discount-percentage symbol
;;so we have to encapsulate the logic inside de let
    (let [discount-percentage 0.10]
      (println "applying the discount")
      (* value-to-be-discounted (- 1 discount-percentage))
    )
)

;;call custom function passing param
(apply_discount 1000)