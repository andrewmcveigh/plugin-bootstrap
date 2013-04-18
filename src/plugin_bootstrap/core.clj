(ns plugin-bootstrap.core
  (:require
    [plugin-jquery.core :as jquery]))

(def css
  [:link {:rel "stylesheet"
          :href "/plugins/bootstrap/css/bootstrap.min.css"}])

(def css-debug
  [:link {:rel "stylesheet"
          :href "/plugins/bootstrap/css/bootstrap.css"}])

(def js
  (list jquery/js
        [:script {:src "/plugins/bootstrap/js/bootstrap.min.js"}]))

(def js-debug
  (list jquery/js
        [:script {:src "/plugins/bootstrap/js/bootstrap.js"}]))
