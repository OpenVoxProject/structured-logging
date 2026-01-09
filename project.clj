(defproject org.openvoxproject/structured-logging "1.0.1-SNAPSHOT"
  :description "Write data structures to your logs from clojure."
  :url "https://github.com/openvoxproject/structured-logging"
  :license {:name "Apache License, Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0.html"}
  :dependencies [[org.clojure/clojure "1.11.2"]
                 [net.logstash.logback/logstash-logback-encoder "4.6"]
                 [org.clojure/tools.logging "0.3.1"]
                 [cheshire "5.13.0"]
                 [org.slf4j/slf4j-api "1.7.36"]]
  :deploy-repositories [["releases" {:url "https://clojars.org/repo"
                                     :username :env/CLOJARS_USERNAME
                                     :password :env/CLOJARS_PASSWORD
                                     :sign-releases false}]]
  :lein-release {:scm :git
                 :deploy-via :lein-deploy})
