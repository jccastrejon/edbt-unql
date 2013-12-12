EDBT - Unified query language challenge
=======================================

This is a sample project for the Unified query language (unql) challenge presented during 
the EDBT summer school 2013 (http://edbt-school-2013.imag.fr/). It implements the execution 
of simple queries of the style "select - from - where" over Neo4j and MongoDB data stores.
The language is loosely based on the UnQL project (http://unql.sqlite.org/index.html/wiki?name=UnQL). 

The main idea of this challenge is to extend the basic language with new operators (JOIN, UNION, TRAVERSE, etc.).
You have to decide whether these operators apply both to document and graph data stores, how to express queries
that require data from both data stores, how scalable your solution is, etc.


1. Sample unql Program
----------------------

	[Definitions]
	define "movies" as graph 
	define "blogEntries" as document

	[Connections] 
	connect "movies" url "http://127.0.0.1:7474/db/data"
	connect "blogEntries" url "127.0.0.1"

	[Queries] 
	select "movies.id" "movies.year" from "movies"
	select 'movies.year' from 'movies' where "movies.title='The Matrix'"
	select "blogEntries.date" "blogEntries.content" from "blogEntries" where "blogEntries.author='jccastrejon'"

2. Guide to language extension 
---------------------
	- Visit: https://drive.google.com/file/d/0B2SdlgBOyP0aYmRTUk54eUR6NXc/edit?usp=sharing

## 3. Environment configuration ##

### 3.1 Virtual machine with already configured environment ###
	- Install VirtualBox: https://www.virtualbox.org/wiki/Downloads
	- Download VM image: https://docs.google.com/uc?id=0B2SdlgBOyP0aX3ZLWlo2cjZqMkE&export=download
	- Open VirtualBox and import image (File->Import Appliance)

### 3.2 Manual Configuration ###

#### 3.2.1 Configure Eclipse ####
	- Make sure you have Java JDK 6 installed
	- Download and extract Eclipse Modeling Tools: http://www.eclipse.org/downloads/packages/eclipse-modeling-tools/keplerr
	- Install Acceleo:
		- Add the following update site: (Help->Install New Software->Add..)
			- Acceleo - http://download.eclipse.org/modeling/m2t/acceleo/updates/releases/3.3
		- Working with the Acceleo update site, select 'Acceleo' and click on Finish
	- Install Xtext:
		- Select Help->Install Modeling Components
		- Select 'Xtext' and click on Finish
	- Restart Eclipse
	- Import projects from Git repository

#### 3.2.2 Configure databases ####
	- First time:
		- MongoDB:
			- Download and extract MongoDB 2.4.6: http://www.mongodb.org/downloads
			- Create directory "/data/db" 
				- In Linux, make sure your user can modify the directory: chmod 755 <dir>, chown <user> <dir>
			- Start MongoDB server: <MONGO_HOME>/bin/.mongod
			- Load test data: <MONGO_HOME>/bin/mongo localhost /fr.imag.unql.tests/testData/documents.txt
		- Neo4j:
			- Download and extract Neo4j 1.9.2 (community edition): http://www.neo4j.org/download
			- Replace <NEO4J_HOME>/conf/neo4j.properties file with /fr.imag.unql.tests/testData/neo4j.properties
			- Start Neo4j server: <NEO4J_HOME>/bin/neo4j start
			- Load test data: <NEO4J_HOME>/bin/neo4j-shell -file /fr.imag.unql.tests/testData/graph.txt
	
	- Next times:
		- Start MongoDB server: <MONGO_HOME>/bin/.mongod
		- Start Neo4j server: <NEO4J_HOME>/bin/neo4j start

## 4. Language execution 
	- Make sure the databases are running
	- Select the /fr.imag.unql.transformation.ui/plugin.xml file with right click and choose: Run As->Eclipse Application
	- Create a New Java Project (Right click->New->Java Project)
	- Paste the /fr.imag.unql.tests/testData/test.unql file in the 'src' directory, or create a new 'unql' file and write queries
	- Select the 'unql' file with a right click and choose: EDBT-unql->Execute queries
	- Check the results in the <PROJECT>/src-gen/result.txt file
	- To check errors in the execution open the Error Log (Window->Show View->Error Log)

## 5. Language modification ##

### 5.1 Modify the grammar ###
	- Update the grammar file: /fr.imag.unql/src/fr/imag/Unql.xtext
	- Select the grammar file with right click and choose: Run As->Generate Xtext artifacts 
	- Rebuild projects (Project->Clean...->Clean all projects)

### 5.2 Modify query analysis ###
	- Update Acceleo transformation files:
		- /fr.imag.unql.transformation/src/fr/imag/unql/transformation/QueryTemplate.mtl
		- /fr.imag.unql.transformation/src/fr/imag/unql/transformation/util/UtilTemplate.mtl

### 5.3 Modify db interaction ###
	- Update Java files:
		- /fr.imag.unql.transformation/src/fr/imag/unql/transformation/util/MongoDBUtil.java
		- /fr.imag.unql.transformation/src/fr/imag/unql/transformation/util/Neo4jUtil.java

***
Notes
----------------------
	- Neo4j node auto indexing is enabled. The list of attributes to be indexed can be modified in the neo4j.properties
	- MongoDB queries assume the same name for database and collection

Useful links
----------------------
1. Xtext: 
	* http://www.eclipse.org/Xtext/documentation.html
2. Acceleo: 
	* http://www.eclipse.org/acceleo/
	* http://www.obeonetwork.com/group/acceleo/page/acceleo-3-1-0-user-guide
	* http://help.eclipse.org/indigo/index.jsp?topic=%2Forg.eclipse.acceleo.doc%2Fdoc%2Fhtml%2Focl_operation_reference.html
3. Cypher: 
	* http://docs.neo4j.org/chunked/milestone/cypher-query-lang.html
	* http://www.neo4j.org/learn/cypher
4. MongoDB: 
	* http://docs.mongodb.org/manual/tutorial/query-documents/

