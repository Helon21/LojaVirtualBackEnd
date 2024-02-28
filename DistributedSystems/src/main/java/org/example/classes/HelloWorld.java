package org.example.classes;

public class HelloWorld {

    private String name;

    public static int helloCounter = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void HelloWorld(String name){
        
        //o método construtor devolve uma instanciação da classe;
        //this só é usado quando há algo ambíguo, como this.name = name; aqui temos dois names;
    }

    public void sayHello(){
        System.out.println("Hello " + name + "!");
    }


}
