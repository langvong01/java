package Session5.Session10;

abstract class Shape {
    private final float PI = 3.14f;

    /**
     * @return
     */
    public float getPI() {
        return PI;
    }

    abstract void caculate(float val);
}
