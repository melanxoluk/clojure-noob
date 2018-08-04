(ns clojure-noob.io-walker.io-walker
  (:import (java.nio.file Files Paths Path FileVisitOption)))


; ~~~ stub to understand that I can define functions

(defn createDirectoryStub [path]
  (str path " created"))


(defn printContent [path]
  (let [stream (Files/walk
                 (Paths/get path (into-array String []))
                 1
                 (into-array FileVisitOption []))]
    (map #(str (.toAbsolutePath %1))
         (iterator-seq (.iterator stream)))))

