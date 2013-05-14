(ns plugin-bootstrap.core
  (:require
    [plugin-jquery.core :as jquery]))

(def css
  [:link {:rel "stylesheet"
          :href "/plugins/bootstrap/css/bootstrap.min.css"}])

(def css-debug
  [:link {:rel "stylesheet"
          :href "/plugins/bootstrap/css/bootstrap.css"}])

(def css-responsive
  [:link {:rel "stylesheet"
          :href "/plugins/bootstrap/css/bootstrap-responsive.min.css"}])

(def css-responsive-debug
  [:link {:rel "stylesheet"
          :href "/plugins/bootstrap/css/bootstrap-responsive.css"}])

(def css-font-awesome
  [:link {:rel "stylesheet"
          :href "/plugins/font-awesome/css/font-awesome.min.css"}])

(def css-font-awesome-debug
  [:link {:rel "stylesheet"
          :href "/plugins/font-awesome/css/font-awesome.css"}])

(def js
  (list jquery/js
        [:script {:src "/plugins/bootstrap/js/bootstrap.min.js"}]))

(def js-debug
  (list jquery/js
        [:script {:src "/plugins/bootstrap/js/bootstrap.js"}]))
