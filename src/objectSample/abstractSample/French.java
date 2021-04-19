package objectSample.abstractSample;

class French extends Human {
    public French(String name) {
        super(name);
    }

    @Override
    public void hello() {
        System.out.println("Je m'appelle " + name + ".");
    }
}
