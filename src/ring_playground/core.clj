(ns ring-playground.core)

(defn handler [request] {:status 200
                         :headers {"Content-Type" "text/html"}
                         :body "Hello World"})

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
