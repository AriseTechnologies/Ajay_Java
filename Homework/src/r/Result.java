package r;


import A.Addition;

import b.Subtraction;
import c.Multiplication;
import d.Division;
import e.Areaofcircle;
import f.Areaofreact;
import g.Simpleinterest;
import h.Average;
import i.Areaoftriangle;  

public class Result {

public static void main(String[] args) {

	Subtraction s=new Subtraction();
	s.sub(12,6);
    Addition a=new Addition();
    a.add(12, 12);
    Multiplication m=new Multiplication();
    m.mult(12, 12);
    Division d=new Division();
    d.div(20, 4);
    Areaofcircle c=new Areaofcircle();
    c.area(5);
    Areaofreact r=new Areaofreact();
    r.area(3, 4);
    Average v=new Average();
    v.avg(8, 6);
    Simpleinterest i=new Simpleinterest();
    i.interest(4,7);
    Areaoftriangle t=new Areaoftriangle();
    t.area(4, 6);
    
}


}
