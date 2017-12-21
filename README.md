# mongodb-with-springboot

To Start Mongo DB : cd to mongodb bin folder and execute this below command : mention dbpath and port no is optional

mongod --dbpath I:\Servers\data --port 27017

Recover Mongo DB  Data after an Unexpected Shutdown : execute this below command to rapair
mongod --dbpath D:\mongodb\data --repair

And connect Mongo Database : mongo from bin folder

Execute below command to restore mono table from Dump :

mongorestore --db Gen --drop dump/Gen

## Commonly used commands
mongo -> to connect mongodb , mongo command prompt 
show dbs  -> Show all the databases
use <database-name> -> use particular database
show collections  -> show all the collection for a database
db.<collection-name>.find() - > display all the data for a collection
