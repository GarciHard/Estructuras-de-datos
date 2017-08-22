/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author MarcoR
 */
public class Arbol {
    private Nodo raiz;
    
    public void insert(Nodo obj_nodo){
        if(empty()){
            setRaiz(obj_nodo);
        }else{
            Nodo aux= getRaiz();
            do{
            if(obj_nodo.getDescripcion().compareTo(aux.getDescripcion())<0){
                if(aux.getIzq()==null){
                    aux.setIzq(obj_nodo);
                }else{
                    aux=aux.getIzq();
                }
            }else{
                if(aux.getDer()==null){
                    aux.setDer(obj_nodo);
                }else{
                    aux=aux.getDer();
                }
             }
             }while(obj_nodo!=aux.getIzq()&& obj_nodo!=aux.getDer());
         }
    }
    public void inorden(Nodo help){
        if(help!=null){
            inorden(help.getIzq());
            System.out.println(" "+help.getDescripcion());
            inorden(help.getDer());
        }
    }
    
    public void preorden(Nodo help){
        if (help !=null){
            System.out.println(" "+help.getDescripcion());
            preorden(help.getIzq());
            preorden(help.getDer());
        }
    }
    
    public void postorden(Nodo help){
        if (help !=null){
            postorden(help.getIzq());
            postorden(help.getDer());
            System.out.println(" "+help.getDescripcion());
        }
    }
  
    
//    public Nodo delete(String descripcion){
//        Nodo aux=raiz;
//        Nodo padre=null;
//        while (aux!=null && descripcion.compareTo(aux.getDescripcion())!=0){
//            padre=aux;
//            if (descripcion.compareTo(aux.getDescripcion())<0){
//                aux=aux.getIzq();
//            }else{
//                aux=aux.getDer();
//            }
//        }
//        if(aux==null){
//            return aux;
//        }
//        if(aux.getIzq()==null && aux.getDer()==null){//caso 1 hojha
//            if(aux==raiz){//si solo existe la raiz
//                raiz=null;
//            }else{
//                if(aux.getDescripcion().compareTo(padre.getDescripcion())<0){
//                    padre.setIzq(null);
//                }else{
//                    padre.setDer(null);
//                    
//                }
//            }
//            return aux;
//        }
//        if(aux.getIzq()==null || aux.getDer()==null){     //caso 2 un solo hija
//            if(aux==raiz){
//                if(aux.getIzq()!=null){
//                    raiz=aux.getIzq();
//                }else{
//                    raiz=aux.getDer();
//                }
//            }else{
//                if(aux.getIzq()!=null){       //El que se va no es la raiz
//                    if(aux.getDescripcion().compareTo(padre.getDescripcion())<0){     //El aque se va es el izquierdo
//                        padre.setIzq(aux.getIzq());
//                    }else{
//                        padre.setDer(aux.getIzq());
//                    }
//                }else{
//                    if(aux.getDescripcion().compareTo(padre.getDescripcion())<0){
//                        padre.setIzq(aux.getDer());
//                    }else{
//                        padre.setDer(aux.getDer());
//                    }
//                }
//            }
//            return aux;
//        }
//   }

            public boolean empty(){
                if(raiz==null){
                    return true;
                }else{
                return false;
                }
            }
            public Nodo getRaiz(){
                return raiz;
            }
            public void setRaiz(Nodo raiz){
               this.raiz = raiz;
            }
}
