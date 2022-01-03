%dw 2.0
import * from dw::test::Asserts
---
payload must equalTo([
  {
    "account_id": 123,
    "contact": 9182,
    "name": "bhargav",
    "branch": "var"
  }
])