; ~~~
; if - nc

(if true
  "will returns"
  "will not returns")

(if false
  "will not returns"
  "will returns")

(if false
  "you will receive nil here")

(if "string and values are always true"
  "will returns"
  "will not returns")

(if nil
  "will not returns"
  "nil is always false")


; ~~~
; do - do several things

(if true
  (do (println "will executed")
      "returned value")
  (do (println "will not executed")
      "will not return value"))


; ~~~
; when could makes things easier to execute several lines

(when true
  (println "success")
  "returned value")


; ~~~
; nil check

(nil? 1) ; false
(nil? nil) ; true


; ~~~
; check equality

(= 1 2) ; false
(= nil nil) ; true


; ~~~
; or & and are returns values
; -- very uncommon behavior as for me

; or returns first true or last value
(or false nil :first :second) ; :first - is first true

; and returns first false or last true value
(and :first nil false) ; nil - is first false


; ~~~
; I found there is too boring to rewrite basic syntax constructions from book
; and finish with writing syntax here for continue with creating some functions
; Before I found listing with very short intro about clojure constructions
; with little amount of comments: https://learnxinyminutes.com/docs/clojure/
; and decided duplicate it new file to persist that I accomplished it