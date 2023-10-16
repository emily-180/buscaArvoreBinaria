
package javatreesaula;

public class JavaTreesAula {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(new Aluno(30, "Athos"));
        tree.add(new Aluno(10, "Marcos"));
        tree.add(new Aluno(20, "Julio"));
        tree.add(new Aluno(70, "Mathos"));
               
        /*tree.add(30);
        tree.add(15);
        tree.add(50);
        tree.add(40);
        tree.add(45);*/
        
        System.out.println("Pre Ordem:");
        tree.preOrder();
        System.out.println("\nPos Ordem:");
        tree.inOrder();
    }
}
