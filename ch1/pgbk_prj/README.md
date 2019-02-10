# pgbk_prj

Live coding ClojureSript with PiggiebAck ans Weasel

## Usage
All dependencies are set in _project.clj_

To launch nREPL and connect to the browser:

1) Require build api
(require 'cljs.build.api)

2) Bild src
user> (cljs.build.api/build "src"
                            {:main 'pgbk-prj.core
                             :output-to "out/main.js"
                             :verbose true})


3) Require browser environemt and
(require 'cljs.repl.browser)

4) Load browser environment
(def env (cljs.repl.browser/repl-env))


5) Require Piggieback
(require 'cemerick.piggieback)

6) start cljs repl with Piggieback
user> (cemerick.piggieback/cljs-repl env)
To quit, type: :cljs/quit
nil
cljs.user>


7) Type in JS code and will be compiled int _out/main.js_band automatically
   evaluated in the browser
 (js/alert "*** Hello World from Piggieback! ***")



## License

Copyright © 2019 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
