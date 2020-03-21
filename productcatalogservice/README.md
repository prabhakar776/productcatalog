# Getting Started

For getting started this application make use of this application in your local machime, you would need to do following steps,
1) After downloading the GIF file, extract the file to some location in your local machine.
2) Open STS or Eclipse(with Spring boot plugins).
3) Import this project to your IDE.
4) Modify the application.properties file located under /src/main/resource folder with the h2 database details as per your local machine
and save it.
5)Go to ProductCatalogServiceApplication.java under src/main/java folder and com.example.demo package right click on this file and Run As --> Spring Boot App

 Observe for "Started ProductCatalogServiceApplication in x.x seconds (JVM running for X.XX)" message in console, once this message appeared in close means the application started successfully.
 
 
 Below are list of end points to access this application, 
 
 To find list of products 
 
 HTTP GET : http://localhost:{port}/product/search/findall
 
 TO add new product
 
 HTTP POST 	http://llocalhost:{post}/product/add
 
 Add below headers,
 
 Key : Content-Type  Value : application/json
 
 Go to body section --> select raw 
 
 {
	"supplier":"Levis",
	"brand":"Levis",
	"productType":"Shirt",
	"color":"while",
	"price":20,
	"size":34 
	
}
 
Similarly you can add different combination of data means, different brand, suppliers, productTypes, color, price and sizes.

To fetch products by price,

HTTP GET http://localhost:{port}/product/search/findbyprice
  
To fetch products by Brand,

HTTP GET http://localhost:{port}/product/search/findbybrand

To fetch products by color,

HTTP GET http://localhost:{port}/product/search/findbycolor

To fetch products by size,

HTTP GET http://localhost:{port}/product/search/findbysize

To get a count of products by supplier,

HTTP POST http://localhost:{port}/product/search/countbyseller/{suppliername}

To delete a product by ID,

HTTP POST http://localhost:{port}/product/delete/{id}

To delete a product by supplier,

HTTP POST http://localhost:{port}/deletebysupplier/{suppliername}")
