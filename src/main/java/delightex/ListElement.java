package delightex;

@SuppressWarnings("WeakerAccess")
public class ListElement<T> {
  public final T value;
  public ListElement<T> next;

  public ListElement(T t) {
    value = t;
  }

  public static <T> ListElement<T> invert(ListElement<T> source) {
    throw new UnsupportedOperationException();
  }
}
