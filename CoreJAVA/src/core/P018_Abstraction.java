package core;
abstract class CompanyData{
	abstract public void workingHours();
	public static void rules() {
		System.out.println("rules decided by company");
	}
}
class HR extends CompanyData{

	public void workingHours() {
		System.out.println("HR working hours : 8 hrs");
	}
	
}
class Accounting extends CompanyData{

	public void workingHours() {
		System.out.println("accounting working hours : 7 hrs");
	}
	
}
class Marketing extends CompanyData{
	public void workingHours() {
		System.out.println("Marketing working hours : 10 hrs");
	}
	
}
class Developers extends CompanyData{
	public void workingHours() {
		System.out.println("accounting working hours : 24 hrs");
	}
	
}
public class P018_Abstraction {
	public static void main(String[] args) {
		HR h = new HR();
		h.workingHours();
		HR.rules();
		h.rules();
		
		Accounting a = new Accounting();
		a.workingHours();
		Accounting.rules();
		a.rules();
		
		
		Marketing m = new Marketing();
		m.workingHours();
		
		Developers d = new Developers();
		d.workingHours();
		
	}
}
