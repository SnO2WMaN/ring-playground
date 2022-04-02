(ns ring-playground.core
  (:use ring.adapter.jetty))

(defn handler [request] {:status 200
                         :headers {"Content-Type" "text/html"}
                         :body "Hello world"})

#_{:clj-kondo/ignore [:unresolved-symbol]}
(run-jetty handler {:port 8080})