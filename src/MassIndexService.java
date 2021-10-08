public class MassIndexService<massIndexService> {

    public void calculate(double mass, double growth) {
        double massIndex = mass / (growth * growth);
        System.out.println(massIndex);
    }
}
