UPDATE "mendixsystem$attribute"
 SET "entity_id" = '2846ed65-7a9e-42a7-9c28-18f5b9014dbc', 
"attribute_name" = 'Current_Status', 
"column_name" = 'current_status', 
"type" = 40, 
"length" = 10, 
"default_value" = 'Inprogress', 
"is_auto_number" = false
 WHERE "id" = '0ce1c30c-d7a6-44d1-9fe3-dd8185d6b42f';
ALTER TABLE "ccgprojecttracking$employee" ADD CONSTRAINT "uniq_ccgprojecttracking$employee_emp_gid" UNIQUE ("emp_gid");
ALTER TABLE "ccgprojecttracking$employee" ADD CONSTRAINT "uniq_ccgprojecttracking$employee_emp_id" UNIQUE ("emp_id");
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_ccgprojecttracking$employee_emp_gid', 
'b31af98b-1bb0-450c-9ef0-706c48f5c6dd', 
'c7bc962c-58ac-4155-868c-34a3197209f6');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_ccgprojecttracking$employee_emp_id', 
'b31af98b-1bb0-450c-9ef0-706c48f5c6dd', 
'b1bb156a-22a3-4ffe-85ae-ee8c16d84da4');
CREATE TABLE "ccgprojecttracking$projectdetails_businesscoordinator" (
	"ccgprojecttracking$projectdetailsid" BIGINT NOT NULL,
	"ccgprojecttracking$employeeid" BIGINT NOT NULL,
	PRIMARY KEY("ccgprojecttracking$projectdetailsid","ccgprojecttracking$employeeid"),
	CONSTRAINT "uniq_ccgprojecttracking$projectdetails_businesscoordinator_ccgprojecttracking$projectdetailsid" UNIQUE ("ccgprojecttracking$projectdetailsid"));
CREATE INDEX "idx_ccgprojecttracking$projectdetails_businesscoordinator_ccgprojecttracking$employee_ccgprojecttracking$projectdetails" ON "ccgprojecttracking$projectdetails_businesscoordinator" ("ccgprojecttracking$employeeid" ASC,"ccgprojecttracking$projectdetailsid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('3da03e02-1f8f-4d89-ac40-47642a010644', 
'CCGProjectTracking.ProjectDetails_BusinessCoordinator', 
'ccgprojecttracking$projectdetails_businesscoordinator', 
'7e5a92cd-6a2a-45e7-877f-3e27f7e39873', 
'b31af98b-1bb0-450c-9ef0-706c48f5c6dd', 
'ccgprojecttracking$projectdetailsid', 
'ccgprojecttracking$employeeid', 
'idx_ccgprojecttracking$projectdetails_businesscoordinator_ccgprojecttracking$employee_ccgprojecttracking$projectdetails');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_ccgprojecttracking$projectdetails_businesscoordinator_ccgprojecttracking$projectdetailsid', 
'3da03e02-1f8f-4d89-ac40-47642a010644', 
'3e9827c2-e597-3045-9448-e6980a780dae');
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20211215 17:41:13';
