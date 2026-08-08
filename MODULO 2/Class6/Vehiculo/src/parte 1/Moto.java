class Moto extends vehiculo {


    public Moto(String marca) {
        super(marca);
    }

    public void acelerar() {
        System.out.println(marca + " está acelerando.");
    }
    public void hacerCaballito() {
        System.out.println(marca + " hace un caballito!");
    }
}

