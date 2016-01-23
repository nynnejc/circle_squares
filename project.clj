(defproject first-clojure.clj "0.0.1-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [quil "2.2.6" :exclusions [org.clojure/clojure]]]
  :main first-clojure.clj.core)


(defn draw-rect []
  ;; Draw the rectangle
  (background 255 255 255 200)
  (fill (mod (frame-count) 255) 0 30 220)
  (no-stroke)
  (rect 100 100 200 200)
  (if (mouse-pressed?) (fill 255 255 0 120) (fill 20 20 255 170))
  (mouse-x)
  (mouse-y)
  (ellipse (mouse-x) (mouse-y) 200 200)
  )
(defsketch rectangletry
  :title "Rectangletry"
  :setup setup
  :draw draw-rect
  :size [400 400]
  )



#_(
(nth [-2 -3 -4 -5 -6] 2)

(def pet {:animal "cat"})
(assoc pet :animal "dog")
pet

({:animal "cat" } :animal)

(str "words" " more words " 5)
(update-in pet [:animal] str "bird" "fish")

(def keyvals {:key "value" :key2 {:key3 "value2"}})

(def friends [{:Jazbo "Danish"} {:Julia "Icelandic"} {:Dylan "New Zeelander"}])

(:Jazbo (first friends)))
