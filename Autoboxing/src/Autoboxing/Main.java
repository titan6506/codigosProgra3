package Autoboxing;



public class Main {

    public static void main(String[] args) {

        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40;
        float f = 50.0f;
        double d = 60.00;
        char c = 'a';
        boolean b2 = true;


        //autoboxing: convirtiendo primitivas en objetos

        Byte byteobj = b;
        Short shortObj = s;
        Integer intObj = i;
        Long longObj = l;
        Float floatObject = f;
        Double doubleObject = d;
        Character charObj = c;
        Boolean boolObj = b2;

        //Imprimiendo objetos

        System.out.println("Imprimiendo los valores de los objetos");
        System.out.println("Byte object" +byteobj);
        System.out.println("Short object" +shortObj);
        System.out.println("Integer object" +intObj);
        System.out.println("Long object" +longObj);
        System.out.println("Float object" +floatObject);
        System.out.println("Double object" +doubleObject);
        System.out.println("Character object" +charObj);
        System.out.println("Boolean object" +boolObj);

        
        //Unboxing: convirtiendo de objetos a primitivas

        byte bytevalue= byteobj;
        short shortvalue=shortObj;
        int intvalue = intObj;
        long longvalue=longObj;
        float floatvalue=floatObject;
        double doublevalue= doubleObject;
        char charvalue = charObj;
        boolean booleanvalue = boolObj;

        //imprimiendo primitivas

        System.out.println("Imprimiendo los valores de las primitivas");
        System.out.println("byte value" +bytevalue);
        System.out.println("short value" +shortvalue);
        System.out.println("int value" +intvalue);
        System.out.println("long value" + longvalue);
        System.out.println("float value" + floatvalue);
        System.out.println("double value" +doublevalue);
        System.out.println("char value" +charvalue);
        System.out.println("boolean value" + booleanvalue);
    }
}
