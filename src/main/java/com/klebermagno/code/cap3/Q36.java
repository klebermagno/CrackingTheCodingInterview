package com.klebermagno.code.cap3;

/**
 * Animal Shelter:
 * An animal shelter, which holds only dogs and cats,
 * operates on a strictly"first in, first out" basis.
 * People must adopt either the"oldest" (based on arrival time)
 * of all animals at the shelter, or they can select whether
 * they would prefer a dog or a cat (and will receive the oldest animal of that type).
 * They cannot select which specific animal they would like.
 * Create the data structures to maintain this system and implement
 * operations such as enqueue, dequeueAny, dequeueDog, and dequeueCat.
 * You may use the built-in Linked list data structure.
 *
 */


import java.util.ArrayList;
import java.util.List;


/**
 * Abrigo de animais:
 * Um abrigo de animais, que abriga apenas cães e gatos,
 * opera estritamente em uma base de "primeiro a entrar, primeiro a sair".
 * As pessoas devem adotar o "mais velho" (com base na hora de chegada)
 * de todos os animais no abrigo, ou podem escolher se preferem um cachorro ou
 * um gato (e receberão o animal mais velho desse tipo).
 * Eles não podem selecionar qual animal específico eles gostariam.
 * Crie as estruturas de dados para manter esse sistema e implementar
 * operações como enqueue, dequeueAny, dequeueDog e dequeueCat.
 * Você pode usar a estrutura de dados de lista vinculada embutida.
 */
public class Q36 {

    int count;
    List<Animal> cats = new ArrayList();
    List<Animal> dogs = new ArrayList();
    int cout = 0;
    public void enqueue(Animal animal){
        this.count++;
        animal.order =  this.count;
        if(Animal.Type.CAT == animal.type){
            cats.add(animal);
        }else {
            dogs.add(animal);
        }

    }
    public Animal dequeueAny(){
        int order = cats.get(0).order.compareTo(dogs.get(0).order);
        System.out.println("Cat: "+cats.get(0).order);
        System.out.println("Dog: "+dogs.get(0).order);
        if(order<0){
            return cats.remove(0);
        }else{
            return dogs.remove(0);
        }
    }
    public Animal dequeueCat(){
        if(cats.size()==0){
            System.out.println("Don't have more cats!");
            return null;
        }
        return cats.remove(0);
    }
    public Animal dequeueDog(){
        if(dogs.size()==0){
            System.out.println("Don't have more dogs!");
            return null;
        }
        return dogs.remove(0);
    }

    public static class Animal {
        static enum Type{
            CAT,
            DOG}
        Type type;
        String name;
        Integer order;
        Animal(Type t, String name){
            this.type = t;
            this.name =name;
        }
    }

    public static void main(String[] args){
        Q36 q = new Q36();
        Animal animal = new Animal(Animal.Type.CAT,"cat1");
        q.enqueue(animal);
        animal = new Animal(Animal.Type.CAT,"cat2");
        q.enqueue(animal);
        animal = new Animal(Animal.Type.DOG,"dog1");
        q.enqueue(animal);
        animal = new Animal(Animal.Type.DOG,"dog2");
        q.enqueue(animal);
        assertEqual("cat1",q.dequeueAny().name);
        assertEqual("cat2",q.dequeueAny().name);
        assertEqual("dog1",q.dequeueDog().name);
        assertEqual("dog1",q.dequeueCat().name);
    }

    private static void assertEqual(Object expected, Object parameter) {
        if(expected.equals(parameter)){
            System.out.println("Success!");
        }else{
            System.out.println("Fail! Expected: " + expected + " but received: " + parameter );
        }
    }
}
