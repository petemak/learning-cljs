(require 'cljs.build.api)

(cljs.build.api/watch "src"
                      {:main 'cljs-first-proj.core
                       :output-to "out/main.js"})
