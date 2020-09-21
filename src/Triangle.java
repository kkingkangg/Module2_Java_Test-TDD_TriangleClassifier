public class Triangle {
    public static String TriangleClassifier(int side1, int side2, int side3) {
        if (side1<=0 || side2<=0 || side3<=0)
            return "Không có cái tam giác nào mà cái cạnh của nó nhỏ hơn hoặc bằng 0 hết áh";
        else if (side2+side3<side1 || side1+side2<side3 || side1+side3<side2)
            return "Không có cái tam giác nào mà 3 cái cạnh của nó như thế hết áh";
        else {
            if (side1 == side2 && side2 == side3)
                return "Tam giác đều";
            else if (side1 == side2 || side1 == side3 || side2 == side3)
                return "Tam giác cân";
            else if (side1 + side2 > side3 || side1 + side3 > side2 || side2 + side3 > side1)
                return "Tam giác thường";
        }
        return null;
    }
}
