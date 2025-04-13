public record Record(String evento, double precio) {
    public void mostrarInformacion(){
        System.out.println("Entrada-" + evento + "-Precio:$"+ precio);

    }
}
