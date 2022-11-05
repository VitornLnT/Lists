import java.util.*;

class ExemploList {
    public static void main(String[] args) {
        System.out.println("Crie uma lista e adicione sete notas: ");

        List<Double> notas = new ArrayList<>();

        notas.add(7.0);
        notas.add(9.3);
        notas.add(8.1);
        notas.add(0.2);
        notas.add(6.5);
        notas.add(5.2);
        notas.add(8.0);

        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 8.0: " + notas.indexOf(8d));

        System.out.println("Adicione na lista a nota 8.5 na posição 4: ");
        notas.add(4,8.5);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.2 por 6.0: ");
        notas.set(6, 6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 8.5 esta na lista: " + notas.contains(8.5));
        System.out.println("Confira se a nota 8.5 esta na lista: " + notas.contains(1.8));

        System.out.println("Exiba as notas na ordem que foram informadas: ");
        for (Double nota : notas)
            System.out.println(nota);

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;

        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " +(soma/notas.size()));

        System.out.println("Remova a nota 0.2: ");
        notas.remove(0.2);
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiva a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
            }
        System.out.println(notas);


        System.out.println("Apague toda a lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());


    }
}