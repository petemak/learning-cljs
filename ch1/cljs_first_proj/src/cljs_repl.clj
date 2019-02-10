(require '[cljs.repl])
(require '[cljs.build.api])
(require '[cljs.repl.browser])


;; Build from "src" directory and
;; output to the "out" directory
(cljs.build.api/build "src"
                      {:main 'cljs-first-proj.core
                       :output-to "out/main.js"
                       :verbose true})


;; Create a new browser evaluation environment
;; and start REPL
(cljs.repl/repl (cljs.repl.browser/repl-env)
                :watch "src"
                :output-dir "out")
