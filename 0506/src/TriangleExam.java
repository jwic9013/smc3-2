
public class TriangleExam {

	public static void main(String[] args) {
		Triangle T = new Triangle(10.2,17.3);
		System.out.println(T.Tri());
		T.Triang(7.5,9.2);
		System.out.println(T.Tri());
		
	}

}
class Triangle{
	double a,b;
	public Triangle(double a, double b){
		this.a=a;
		this.b=b;
	}
	public double Tri(){
		return (a*b)/2;
	}
	public void Triang(double a, double b){
		this.a=a;
		this.b=b;
	}
}