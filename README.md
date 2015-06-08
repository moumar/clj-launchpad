# clj-launchpad [![Clojars Project](http://clojars.org/clj-launchpad/latest-version.svg)](http://clojars.org/clj-launchpad)

Novation Launchpad library for clojure

## Usage

Starting out with `clj-launchpad` is fairly easy. We will walk you through a basic scenario that you can adopt to your needs.

We will use [leiningen][] start a demo project. The following command creates a new Clojure project in the `clj-launchpad-demo` directory

```sh
> lein new app clj-launchpad-demo
Generating a project called clj-launchpad-demo based on the 'app' template.
```

In the newly created directory there is a `project.clj`. Open it and add `clj-launchpad` as a dependency. Check [Clojars][clojars/clj-launchpad] for the latest version. Modify the `project.clj` to suit your needs.

```clojure
(defproject clj-launchpad-demo "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [clj-launchpad "0.2.0]]
  :main ^:skip-aot clj-launchpad-demo.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
```

Plug in your Launchpad and fire up a repl.

```sh
> lein repl
```

Require `clj-launchpad` and `open` a connection to your Launchpad.

```clojure
clj-launchpad-demo.core=> (require '[clj-launchpad :refer :all])
nil
clj-launchpad-demo.core=> (def lpad (open))
```

The `lpad` Var can be used to control the Launchpad. See the [API][api] page for details on what you can do with it.

## License

Copyright (C) 2012 Moumar

Distributed under the Eclipse Public License, the same as Clojure.

[leiningen]: http://leiningen.org/
[clojars/clj-launchpad]: https://clojars.org/clj-launchpad
[api]: https://github.com/moumar/clj-launchpad/wiki/API
