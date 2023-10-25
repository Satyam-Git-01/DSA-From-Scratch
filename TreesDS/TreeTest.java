package TreesDS;

public class TreeTest {
    public static void main(String[] args) {

        CustomTree t=new CustomTree();
        //t.createTree(new int[]{1,2,3,4,5,6,7,8,9});
        // 1 3 8 13 -1 -1 -1 10 14 -1 -1 -1 6 -1 9 20 -1 -1 15 -1 -1
        t.makeTreeDS();
        t.InOrderTraversal();
        System.out.println();
        t.PreOrderTraversal();
        System.out.println();
        t.PostOrderTraversal();
        System.out.println();
        t.LevelOrderTraversal();
    }
}
