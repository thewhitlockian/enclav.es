(defproject the-known-net "0.0.1"
    :description "An experimental online meta-community."
    :plugins [[lein-ring "0.8.2"]]
    :dependencies
      [[org.clojure/clojure "1.4.0"]
            [ring "1.1.8"]
            [hiccup "1.0.2"]
            [sandbar/sandbar "0.4.0-SNAPSHOT"]
            [compojure "1.1.5"]
            [korma "0.3.0-RC2"] 
            [clj-style "1.0.1"]]
    :dev-dependencies
      [[lein-run "1.0.0-SNAPSHOT"]]
    :ring {:handler the-known-net.core/app
           :auto-reload? true
           :auto-refresh? true}
    :jvm-opts ["-Xmx2g" "-XX:+UseConcMarkSweepGC"]
    :main the-known-net.core)


