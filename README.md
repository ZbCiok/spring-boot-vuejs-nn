## Read and do:
1. /backend/README.md
2. /frontend/README.md

## Install PostgresSQL with: 
DROP TABLE IF EXISTS public.user;

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
