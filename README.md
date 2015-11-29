# Home Task Week 7

We are going to use third party library org.json to successfully complete current assignment. Please, click on json-20151123.jar with right mouse button and choose "Add as library".

1. Your main target is to implement JSONObject toJsonObject(Object o) method inside JsonSerializer class. When everything will be done you will be able to launch test by using Test class and get serialized object of type Cat.
First of all, take a look at class Cat and realize what field types are used there. Look at the org.geekhub.json.adapters package - it contains different adapters that we can use to convert some complex types like Collection, Map, Date and Color to JSON representation. Some of them already implemented. Take a look at @UseDataAdapter annotation and figure out how it is used inside Cat class.

2. From that point you have to understand how adapters work. It's time to implement some of them that are not implemented yet. Complete with implementation of DateAdapter and CollectionAdapter. Use ColorAdapter and MapAdapter as example to complete this step. Make sure that DataAdapter returns date by using dd/MM/yyyy format and CollectionAdapter returns JSONArray as a representation of Collection.

3. With all adapters implemented apply them to the corresponding fields in Cat and Paw classes.

4. Now it's time to implement JSONObject toJsonObject(Object o) method in JsonSerializer class. It should iterate through all declared fields of corresponding object and extract data from these fields. Use JSONObject to collect all field names and corresponding values. Complex values should be serialized as well, primitive types should go as is. It means that for non primitive types we should call serialize method recursively. For fields that contain specified @UseDataAdapter annotation we should use it default parameter to create an Adapter instance and use it to convert value to JSON.

5. If everything is implemented correctly you should be able to launch example from Test class. If you did not use @Ignore annotation yet you should get StackOverflow exception. Take a close look to Cat class and you will find that it contains Cat myself field that points to current instance. And because you use recursion in JsonSerializer class it breaks for our Cat instance. For such cases we need to use @Ignore annotation. Please, mark myself field with that annotation and make additional implementation in JSONObject toJsonObject(Object o) method in JsonSerializer class. So if we have field marked with @Ignore annotation we should not process it and not include it to JSON.

6. After everything is done you should get output of Cat instance as JSON representation to console. To make sure everything is correct you can validate it at http://jsonlint.com/ by simply copy-paste it to the text area and press Validate button.