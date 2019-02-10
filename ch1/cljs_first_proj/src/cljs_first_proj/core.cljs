(ns cljs-first-proj.core
  (:require [clojure.browser.repl :as repl]))

(defonce conn
  (repl/connect "http://localhost:9000/repl"))


;;(js/alert "*** Hello World! ***")

;;(+ 1 2)

