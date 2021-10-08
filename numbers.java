public static int randInt(int min, int max) {
    return new Random().nextInt((max - min) + 1) + min;
}
     
public static double randDouble(Double min, Double max) {
    return min + Math.random() * (max - min);
}
