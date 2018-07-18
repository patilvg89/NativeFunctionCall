
Do you want to call Android function from react native.
Follow below steps.(Check above example)
1. Create module and package in android(remember to use @ReactMethod)
2. Register package in MainApplication.java
3. Create _module.js to export the module name
4. import module to JS file and call android method
