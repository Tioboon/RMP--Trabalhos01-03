public class Bounds {
    public Vector2 center;
    public Vector2 size;
    public Vector2 min;
    public Vector2 max;

    public Bounds(float perimeter, float area){
        size = new Vector2(perimeter - area, perimeter/2 + area - perimeter);
    }

    public float GetPerimeter(){
        return 2 * (size.x + size.y);
    }

    public float GetArea(){
        return size.x * size.y;
    }

    public String GetValueMsg(){
        return "X: " + size.x + " Y: " + size.y;
    }
}
