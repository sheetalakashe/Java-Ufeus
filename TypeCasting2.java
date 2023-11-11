// Type Casting a long datatype to a short datatype

class TypeCasting2{
	public static void main(String args[]){
		long longNum = -32769;
		
		short shortNum = (short)longNum;

		System.out.println("Data of long type typecasted to short:"+shortNum);
	}
}