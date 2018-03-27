(defproject gsynj "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [proto-repl "0.3.1"]
                 [hawk "0.2.11"]]
  :main  ^:skip-aot gsynj.core

  :target-path "target/%s"

  :profiles   {:uberjar {:aot :all}
               :dev     {:source-paths ["dev" "src" "test"]
                         :dependencies [[org.clojure/tools.namespace "0.2.11"]]}})
