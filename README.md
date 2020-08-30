# Predicting records size with neural networks in key-value stores under heterogeneous multiget workloads

### Author
* **Laritza Cabrera Alba** 

##### This repository contains the input and output data used for the master thesis.
  
### Structure:

`databases:` The input used to test the algorithms. 

- this folder contains a list of files with names as *"38kb-groupX.XX-trialX-keys.csv"* with the key values used as input to the algorithms.

- you can also find a list of files with names as *"38kb-groupX.XX-trialX-sizes.csv"* with the size of the different records used as input to the algorithms; the size is given in KB.

`neural_network_results:` The output of each experiment obtained from the neural network predictor algorithm.

- this folder contains a list of files with names as *"38kb-groupX.XX-trialX.txt"* with the output corresponding to the different input files.

`code/src:` Source code for BloomFilter & Murmur3.

- this folder contains the file “BloomFilter.java” (BloomFilter implementation).
- you can also find the file “MurmurHash.java” (Murmur3 hash implementation).