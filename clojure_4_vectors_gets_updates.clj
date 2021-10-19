(ns inventory.vectors-gets-updates)

(def prices [150.00, 1200.00, 5000.00])
;using vector as a function
;index goes as parameter and the vector will return the value
;of that index
(prices 0)

(println (prices 0))
(println (get prices 0))
;(println (prices 3))  IndexOutOfBoundsException
(println (get prices 3))  ;get evicts the IndexOutOfBoundsException returning "nil" when accessing an index without value
(println (get prices 3 0)) ;if nil, assumes 0 as default value
(println (get prices 0, 9999)) ;if nil, assumes 9999 as default value if non nil, get the value on this index

(println (conj prices 1000.00)) ;Lists are immutables, so, the conj just add a value and shows it but doesnt change the list. NOTHING CAN CHANGE OUR LIST.

(def prices-two (conj prices 1000.00)) ;as lists as immutables, we can define a new list receiving the result of the conj to add a value.

(println(prices-two, 3))

;updating values inside a list.

;inc => receive an argument and sum +1
;dec => receive an argument and sub -1
;ex:

(println(inc 1)) ;2

(update prices 0 inc)  ;extract the value of the index 0 of the list and use the inc "increment" function to sum +1 to the value

(println(update prices 0 inc)) ;151.0
                               ;our list is immutable, so the update function changes a value and return it but the original instance is not modified.

(def prices-three (update prices 0 inc));

(println (prices-three 0))

(defn sum
  [value]
  (+ value 10))

(println(update prices 0 sum)) ;160.0
