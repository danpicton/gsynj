(ns gsynj.core
  (:require [clojure.java.shell :refer [sh]]
            [hawk.core :as hawk]))

(def test (hawk/watch! [{:paths ["~/googledrive2.test"]
                         :filter hawk/modified?
                         :handler (fn [ctx e]
                                    (println "event: " e)
                                    (println "context: " ctx)
                                    (sh "notify-send" "file-edited")
                                    ctx)}]))
(hawk/stop! test)
