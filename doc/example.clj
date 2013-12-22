(require '[metabox.core :refer [box val]])

(def critical-density (box 0.692 {:uncertainty 0.01}))
(val critical-density) ; 0.692
(meta critical-density) ; {:uncertainty 0.01}