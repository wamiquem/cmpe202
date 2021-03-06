For lab1, to implement the gumball machine models I am setting up the accepted coins and cost of the machine in the constructor. We have to specifically instantiate every gumball machine models that we need and all machine that we need to implement needs to be setup all together. In order to add or remove a model, or to setup new steps of gumball disposition, we need to edit the Main file. There is no way to select a model as needed. Also, to implement slot model, many classes needs to be changed.

For this lab, the implementation is done with Aspectj and FeatureIDE. Using Aspectj, various aspects exists for different kind of models and costs and the GumballMachine class remains same. To add a new model and cost another aspect can be created. Using FeatureIDE, we can specify the required model and cost of the machine in the default.config file as and when needed. Based on the selected feature, all required classes and aspects will be in the package and other features will be moved out of the package which can be again moved back as and when needed. Also, we can add constraint to the feature model so that that are no conflicts and only features as per the constraint are selected.

Below are screenshots of output of different models of gumball constrained using FeatureIDE:

### Crank Model - Cost 25:
![alt text](https://github.com/wamiquem/cmpe202/blob/master/lab10/output/crank_cost25_output.png "Crank Model - Cost 25")

### Crank Model - Cost 50:
![alt text](https://github.com/wamiquem/cmpe202/blob/master/lab10/output/crank_cost50_output.png "Crank Model - Cost 50")

### Slot Model - Cost 25:
![alt text](https://github.com/wamiquem/cmpe202/blob/master/lab10/output/slot_cost25_output.png "Slot Model - Cost 25")

### Slot Model - Cost 50:
![alt text](https://github.com/wamiquem/cmpe202/blob/master/lab10/output/slot_cost50_output.png "Slot Model - Cost 50")
