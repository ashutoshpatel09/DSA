class Solution {
    public double[] convertTemperature(double celsius) {
       double Kelvin = celsius + 273.15;
        double Fahrenheit = celsius * 1.80 + 32.00;
        double arr[] =new double[2];
        int i =0;
      
            arr[i]=Kelvin;
            arr[i+1]=Fahrenheit;
        return arr;
        
    }
}