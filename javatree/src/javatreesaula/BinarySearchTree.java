
package javatreesaula;


public class BinarySearchTree<T extends Comparable<T>>{
    Node raiz=null;
    private int comparacoes = 0; 
    
    public void add(T novoDado){
        Node<T> novoNo = new Node<T>(novoDado);
        raiz = inserir(raiz, novoNo);
    }
    
    private Node<T> inserir (Node<T> raiz, Node<T> novo){
        if(raiz == null){
            comparacoes++; 
            return novo;
        }
        if(novo.dado.compareTo(raiz.dado)>0){
            comparacoes++;
            raiz.direita = inserir(raiz.direita, novo);
        }
        else 
            raiz.esquerda = inserir(raiz.esquerda, novo);
        return raiz; //retorna a raiz atualizada
    }
    
    public int getComparacoes() {
        return comparacoes;
    }
    
    public void preOrder(){
        preOrder(raiz);
    }
    
    private void preOrder(Node<T> raiz){
        if(raiz!=null){
            System.out.print(raiz.dado+", ");
            preOrder(raiz.esquerda);
            preOrder(raiz.direita);
        }
    }
    
    public void inOrder(){
        inOrder(raiz);
    }
  
    private void inOrder(Node<T> raiz){
        if(raiz!=null){
            inOrder(raiz.esquerda);
            System.out.print(raiz.dado+", ");
            inOrder(raiz.direita);
        }
    }
    
    public void posOrder(){
        posOrder(raiz);
    }

    private void posOrder(Node<T> raiz){
        if(raiz!=null){
            System.out.print(raiz.dado+", ");
            posOrder(raiz.esquerda);            
            posOrder(raiz.direita);
        }
    }
}
