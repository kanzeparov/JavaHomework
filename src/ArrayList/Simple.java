package ArrayList;

public interface Simple<E> extends Iterable<E> {
    boolean add(E e); // добавление элемента

    void delete(int index); // удаление элемента

    E get(int index); // получение элемента

    int size(); // получение размера

    void update(int index, E e); // обновление значения по индексу
}
