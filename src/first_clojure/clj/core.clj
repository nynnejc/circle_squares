(ns first-clojure.clj.core
  (:require [quil.core :refer :all]))

(defn setup []
  (smooth))

(defn draw []
  (background 355)
  (fill 192)
  (ellipse 100 100 30 30))

(defsketch example ()
  :title "Example"
  :setup setup
  :draw draw
;  :size [200 200])

(defn -main [& args])
;
(defn total-bill
  "Given subtotal of bill, return total after tax."
  [subtotal]
  (* 1.08 subtotal))

(defn total-with-tip
  "Given subtotal, return total after tax and tip."
  [subtotal tip-pct]
  (* 1.08 subtotal (+ 1 tip-pct)))

(total-with-tip 12.50 0.18)

(defn share-per-person
  [subtotal tip-pcp number-persons]
  (/ (total-with-tip subtotal tip-pcp) number-persons))


;how to add 7 to any given number using a defn function
(defn add-7 [x]
  (+ x 7))
(add-7 14)
  

;how to multiply any two numbers using a defn function
 (defn multiply-by [ x y]
   (* x y))
 (multiply-by 2 10)
 
 ;reduce
 (def bills [10 15 16 12 17 14])
 
 (defn average [bills]
   (/ (reduce + bills) (count bills)))