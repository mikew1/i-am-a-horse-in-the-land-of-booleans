(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (nil? x) (false? x))
    false true))

(defn abs [x]
  (if (< x 0) (- x) x))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0)
    true false))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 3 n) "fizz"
    (divides? 5 n) "buzz"
    :else ""
    ))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))   ; complement is a h.ord. fn.

(defn generic-doublificate [x]
  (cond
    (number? x)   (* x 2)
    (empty? x)    nil
    (or (list? x) (vector? x)) (* (count x) 2)
    :else true
    ))

(defn leap-year? [year]
    (and (divides? 4 year)
        (or (not (divides? 100 year)) (divides? 400 year))))
        ; correct, but likely a clearer way to write this

; '_______'
