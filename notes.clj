(println "This is a text in Clojure")

(def product-total 20)

(println "There is a total of " product-total "products")

(def product-price 100)

(def total-price (* product-total product-price) )     ;; expr def1, def2   => function invocation as parameter to another function

(println "Unit price of the product " product-price)
(println "Total products " product-total)
(println "Total price " total-price)

;; Lists

(def names ["Victor" "Willians" "Bruno" "Felipe" "Gustavo"])

names           ;;if we call a List without a function block, it executes because it isn't a function

(names 0)       ;;if we call this form, it executes because it is a function, a function that returns the value of the index 0.
(count names)   ;;function that counts the total elements inside the list. We called the count FUNCTION passing as parameter our list
(conj names "Erica") ;;function conj add new value to the list, but the list is immutable. The conj just add the value and return it

(def names (conj names, "Erica")) ;;if you cant modify a list (because it's immutable), you can re-define it adding the value with conj
                                  ;;passing the conj function (adding the value) to the def function defining the list again

;;

;; Defining my custom function

(defn print-message [] ;;all functions we have to declare the in parameters with an array [] in our case, we are not receiving any parameter, so it will be empty []
  (println "-----------------------")  ;;first instruction
  (println "Welcome to the Clojure!")  ;;second instruction
)