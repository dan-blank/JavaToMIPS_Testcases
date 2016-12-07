
class A {
	public static void main(String[] args){
		
	}
}

class BaseType {
}

class SubType extends BaseType {
}

class OriginBehavior {
    public BaseType test(int a, BaseType c) {
        return new BaseType();
    }
}

class SpecificBehavior extends OriginBehavior {
    public SubType test(int a, SubType c) {
        return new SubType();
    }
}

