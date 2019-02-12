(ns pgbk-prj.core
  (:require [clojure.browser.repl :as repl]
            [weasel.repl :as wrepl]))

 
;; (defonce conn (wrepl/connect "http://localhost:9000/repl"))


(when-not (wrepl/alive?)
  (wrepl/connect "ws://localhost:9001"))


(js/alert "*** Hello World! ***")
