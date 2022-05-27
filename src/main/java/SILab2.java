import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SILab2 {

    public static List<String> function(List<String> list) {//A
        if (list.size() <= 0) {//B
            throw new IllegalArgumentException("List length should be greater than 0");//B.1
        }
        int n = list.size();//B.2
        int rootOfN = (int) Math.sqrt(n);//C
        if (rootOfN * rootOfN  != n)//D
        {
            throw new IllegalArgumentException("List length should be a perfect square");//D.1
        }
        List<String> numMines = new ArrayList<>();//D.2
        for (int i = 0; i < n; i++)
        //E.1 - i=0
        //E.2 - i < n
        //E.3 - i++
        {
            if (!list.get(i).equals("#"))//F
            {
                int num = 0;//G
                if ( (i % rootOfN != 0 && list.get(i - 1).equals("#")) || (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#")) )//H
                {
                    if ( (i % rootOfN != 0 && list.get(i - 1).equals("#")) && (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#")) )//I
                    {
                        num += 2;//J
                    }
                    else
                    {
                        num  += 1;//K
                    }
                }
                if (i - rootOfN >= 0 && list.get(i - rootOfN).equals("#"))//L
                {
                    num++;//M
                }
                if (i + rootOfN < n && list.get(i + rootOfN).equals("#"))//N
                {
                    num++;//O
                }
                numMines.add(String.valueOf(num));//P
            }
            else
            {
                numMines.add(list.get(i));//Q
            }
        }
        return numMines;//R
    }//END

    public static void main(String[] args) {
        //System.out.println(Arrays.asList("0", "#", "0", "0", "0", "#", "0", "#", "#"));

        List<String> mines = function(Arrays.asList("0", "#", "0", "0", "0", "#", "0", "#", "#"));
        List<String> rezultat = Arrays.asList("1", "#", "2", "0", "3", "#", "1", "#", "#");

        int isti=0;
        if (mines.equals(rezultat))
            isti=1;


        System.out.println("Isti= " + isti);
    //public static List<String> function(List<String> list)
    }
}