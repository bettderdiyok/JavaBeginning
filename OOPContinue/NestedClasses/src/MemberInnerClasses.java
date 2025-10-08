public class MemberInnerClasses { //outer class
    private int privateVariable = 1;
    int defaultVariable = 2;
    protected int protectedVariable = 3;
    public int publicVariable = 4;

    private void privateMethod(){
        PrintStringArray variable = new PrintStringArray();
        System.out.println(variable.privateVariableInternal);
        System.out.println(variable.protectedVariableInternal);
        System.out.println(variable.defaultVariableInternal);
        System.out.println(variable.publicVariableInternal);
    }
    void defaultMethod(){}
    protected void protectedMethod(){}
    public void publicMethod(){}


    class PrintStringArray{ //inner class
        private int privateVariableInternal = 1;
        int defaultVariableInternal = 2;
        protected int protectedVariableInternal = 3;
        public int publicVariableInternal = 4;
        void printStringArray(String[] array) {
            System.out.println(privateVariable);
            System.out.println(defaultVariable);
            System.out.println(protectedVariable);
            System.out.println(publicVariable);
            int number;
            privateMethod();
            defaultMethod();
            publicMethod();
            protectedMethod();
            for (String str:array) {
                System.out.println(str);
            }
            privateVariable = 5;
        }
        private int x = MemberInnerClasses.this.privateVariable;



    }
}
