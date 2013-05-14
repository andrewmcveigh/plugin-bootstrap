(defproject com.andrewmcveigh/plugin-bootstrap "0.1.1"
  :description "Twitter Bootstrap and Font Awsome packaged as a Servlet 3.0
               plugin. With a couple of clojure/hiccup helpers."
  :url "http://github.com/andrewmcveigh/plugin-bootstrap"
  :license {:name "Apache License, Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [com.andrewmcveigh/plugin-jquery "0.1.0"]]
  :repositories [["snapshots" {:url "https://clojars.org/repo/" :creds :gpg}]
                 ["releases" {:url "https://clojars.org/repo/" :creds :gpg}]])
