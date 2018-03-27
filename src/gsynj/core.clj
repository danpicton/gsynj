(ns gsynj.core
  (:require [clojure.java.shell :refer [sh]]
            [hawk.core :as hawk])
  (:gen-class))

(defn watch-kpdb []
  (hawk/watch! [{:paths ["/path/to/sync.me"]
                 :handler (fn [ctx e]
                            (println "event: " e)
                            (println "context: " ctx)
                            (sh "rclone" "copy" "/path/to/sync.me" "gdrive:/target/path/")
                            (sh "notify-send" "sync.me synced")
                            ctx)}]))
(defn -main [& args]
  (watch-kpdb))

;(hawk/stop! watch-kpdb)
