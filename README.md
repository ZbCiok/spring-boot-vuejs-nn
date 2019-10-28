## Install PostgreSQL

```python
see: * backend/src/main/resources *

CREATE TABLE public.user
(
  id integer,
  login character varying,
  type character varying,
  avatar_url character varying,
  created_at timestamp with time zone,
  request_count integer,
  calculations numeric,
  CONSTRAINT unique_user_1 PRIMARY KEY (id)
)
```
## Read and do:
1. /backend/README.md
2. /frontend/README.md

## mvn spring-boot:run

## nn.html



