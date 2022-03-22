public class BmiService {

    public float calculate(int mass, int height) {
        float index = mass / ((float) height * (float) height) * 10_000;
        return index;

    }
}
