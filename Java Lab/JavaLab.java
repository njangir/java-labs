// Q 1   Given  pairs of rectangles, where each pair denotes the length  and breadth of the  rectangle. The task is to return the maximum area of the rectangle.

// N = 3
// rect[] = {{1,2},
//   {3,4},
//   {5,6}}


// 30 

// 1. Total area of Rect. 1 = 1 * 2 = 2 
// 2. Total area of Rect. 2 = 3 * 4 = 12 
// 3. Total area of Rect. 3 = 5 * 6 = 30 
// 4. Out of all rectangles, Rectangle 3 has the maximum area.

// Your task is to complete the function () which returns maximum area. Use () function in Rectangle class.

class Rectangle {
    int length;
    int breadth;
    public Rectangle(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public int getArea(){
        return length*breadth;
    }
}

public class JavaLab{

    static int maxArea(int[][] a, int N){
        int max = 0;
        for (int j[] : a) {
            Rectangle rectTemp = new Rectangle(j[0], j[1]);
            max = Math.max(rectTemp.getArea(), max);
        }
        return max;
    }
    public static void main(String[] args){
        int N = 3;
        int[][] rect = {{1,2},{3,4},{5,6}};
        System.out.println(maxArea(rect, N));
    }
}