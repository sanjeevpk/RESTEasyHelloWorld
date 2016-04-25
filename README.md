# RESTEasyHelloWorld

This is a sample maven based web application for RESTEasy implementation of JAX-RS hello world application.

Just compile and build the application and deploy with JBOSS(as we are depending on Jboss RESTEasy implementation) and then hit http://localhost:8080/RESTEasyHelloWorld/api/hello in the browser URL, you should be able to see "Hello from REST web services!" message on that URL as a response.

Also for getting list of products, I have added one more rest resource i.e. http://localhost:8080/RESTEasyHelloWorld/api/products which will give a JSON response of the products.

That's it. Very simple isn't it!
