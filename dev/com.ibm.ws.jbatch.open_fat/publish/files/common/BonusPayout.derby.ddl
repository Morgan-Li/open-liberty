-- DROP TABLE "BONUSPAYOUT"."ACCOUNT";

CREATE TABLE "BONUSPAYOUT"."ACCOUNT"  (
		  "ACCTNUM" INTEGER NOT NULL, 
		  "BALANCE" INTEGER NOT NULL,		 
		  "INSTANCEID" BIGINT NOT NULL,		  
		  "ACCTCODE" VARCHAR(30) )  
		 ; 
		 
ALTER TABLE "BONUSPAYOUT"."ACCOUNT"
	ADD CONSTRAINT "ACCOUNT_PK" PRIMARY KEY
		("ACCTNUM", "INSTANCEID");		 
                 
-- COMMIT WORK;


-- DISCONNECT;