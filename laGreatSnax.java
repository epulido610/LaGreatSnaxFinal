/*
Ethan Pulido
CS/IS 130
Lab 1
2/22/18

"La Great Snax"


create double variable cost, totalCost, taxRate, totalTax, tip;

calculate total tax, cost * taxRate = totalTax;

cost = 39.95;

totalCost = cost + totalTax + tip;

display "Dining in at La "Great Snax" in Glendale"

display "The Blue Plate Special";
display "Costs" cost
display "Tax" totalTax;
display "Tip" tip;
display "Total" total;

*/

public class laGreatSnax
{

public static void main (String[] args){

double cost, totalCost, taxRate, totalTax, tip;

taxRate = 0.095;
cost = 39.95;
tip = 5.391;

totalTax = taxRate * cost;

totalCost = cost + totalTax + tip;

System.out.println("Dining in at \"La Great Snax\" in Glendale\n");
System.out.println("Costs $" + cost);
System.out.println("Tax $" + totalTax);
System.out.println("Tip $" + tip);
System.out.println("Total $" + totalCost);

}

}

