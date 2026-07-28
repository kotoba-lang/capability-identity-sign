# capability-identity-sign

Atomic authority package for `identity/sign`.

- imports: `#{:sign}`
- effects: `#{:secret :crypto}`
- default policy: `:approval-required`
- provider status: `contract-only`

Importing this package does not grant runtime authority. Tamaki must
request it explicitly and Kototama must admit the sealed envelope.

```sh
clojure -M:test
```
