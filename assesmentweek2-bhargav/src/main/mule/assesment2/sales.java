
package assesment2;
public class sales {
public String getproductid(int productid)
{
if(productid>=10001 && productid<=99999)
return "YES";
else
return "NO";
}
public String getAmount(String getamount) {
if(getamount.equals("S")) {
return "$30";
}
else if(getamount.equals("M")) {
return "50$";
}
else {
return "80$";
}
}
}






