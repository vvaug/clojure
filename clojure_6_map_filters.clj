(ns inventory.map-filters)

(defn is-odd
  [num]
  (if ( = 0 (mod num 2))
    (+ num 2)
    (+ num 4)))

(defn filter-odd
  [num]
  (if ( = 0 (mod num 2))
    true
    false))

(def numbers [1 2 3 4 5 6 7 8 9 10])

(println "map: " (map is-odd numbers))

(println "filter: " (filter filter-odd numbers))