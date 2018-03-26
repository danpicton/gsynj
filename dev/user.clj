(ns user
  (:require [clojure.tools.namespace.repl :as tnr]
            [proto-repl.saved-values]))

(defn start
  []
  ; (println "I'm starting now")
  (println "Start completed"))

(defn reset []
  (tnr/refresh :after 'user/start))

(println "gsynj dev/user.clj loaded.")
