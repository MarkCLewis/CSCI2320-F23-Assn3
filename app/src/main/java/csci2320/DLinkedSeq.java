package csci2320;

import java.util.Iterator;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;

public class DLinkedSeq<E> implements Seq<E> {
  // Declare your node class for a double linked list here.

  // Put your private data here

  // I'm giving you some helper method to make testing easier.
  @SuppressWarnings("unchecked")
  public static <E> DLinkedSeq<E> of(E... elems) {
    DLinkedSeq<E> ret = new DLinkedSeq<>();
    for (E e: elems) ret.add(e);
    return ret;
  }

  public static DLinkedSeq<Integer> ofInt(int... elems) {
    DLinkedSeq<Integer> ret = new DLinkedSeq<>();
    for (Integer e: elems) ret.add(e);
    return ret;
  }

  @Override
  public boolean equals(Object that) {
    if (that == null || !(that instanceof DLinkedSeq)) return false;
    DLinkedSeq<?> thatSeq = (DLinkedSeq<?>)that;
    if (thatSeq.size() != size()) return false;
    for (Iterator<?> iter1 = thatSeq.iterator(), iter2 = this.iterator(); iter1.hasNext();)
      if (!iter1.next().equals(iter2.next())) return false;
    return true;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("DLinkedSeq(");
    boolean first = true;
    for (E e: this) {
      if (!first) {
        sb.append(", " + e);
      } else {
        sb.append(e.toString());
        first = false;
      }
    }
    sb.append(")");
    return sb.toString();
  }

  @Override
  public Iterator<E> iterator() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'iterator'");
  }

  @Override
  public E get(int index) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'get'");
  }

  @Override
  public void set(int index, E elem) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'set'");
  }

  @Override
  public void add(E elem) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'add'");
  }

  @Override
  public void insert(int index, E elem) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'insert'");
  }

  @Override
  public E remove(int index) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'remove'");
  }

  @Override
  public int size() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'size'");
  }

  @Override
  public <E2> DLinkedSeq<E2> map(Function<E, E2> f) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'map'");
  }

  @Override
  public DLinkedSeq<E> filter(Function<E, Boolean> predicate) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'filter'");
  }

  @Override
  public DLinkedSeq<E> takeWhile(Function<E, Boolean> predicate) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'takeWhile'");
  }

  @Override
  public DLinkedSeq<E> dropWhile(Function<E, Boolean> predicate) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'dropWhile'");
  }

  @Override
  public Optional<E> find(Function<E, Boolean> predicate) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'find'");
  }

  @Override
  public <A> A foldLeft(A zero, BiFunction<A, E, A> f) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'foldLeft'");
  }

  @Override
  public <A> A foldRight(BiFunction<E, A, A> f, A zero) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'foldRight'");
  }

  @Override
  public void mapped(Function<E, E> f) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'mapped'");
  }

  @Override
  public void filtered(Function<E, Boolean> predicate) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'filtered'");
  }

  @Override
  public void keepWhile(Function<E, Boolean> predicate) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'keepWhile'");
  }

  @Override
  public void removeWhile(Function<E, Boolean> predicate) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'removeWhile'");
  }
  
}
