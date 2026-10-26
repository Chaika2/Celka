package celestial;

import java.util.Deque;
import java.util.LinkedList;
import java.util.stream.Stream;

public interface C_static {
   LinkedList<C_import> id_byte();

   <T> T id_byte(C_double<T> var1);

   <E extends Enum<?>> E id_byte(Class<E> var1) throws W, Q;

   <T> T id_byte(Class<T> var1, T var2) throws Q;

   C_import id_byte(int var1) throws Q;

   <E extends Enum<?>> E id_byte(Class<E> var1, int var2) throws Q;

   <T, O, D extends C_switch<T, O>> T id_byte(D var1, O var2);

   <T, O> T id_class(C_switch<T, O> var1);

   <T> T id_class(Class<T> var1, int var2) throws Q, W;

   String id_class(String var1, int var2) throws Q;

   String id_class();

   String[] id_class(String var1) throws Q;

   <T> T id_class(Class<T> var1, T var2) throws Q;

   <T, O, D extends C_switch<T, O>> T id_class(D var1, O var2, T var3);

   <E extends Enum<?>> E id_class(Class<E> var1, E var2) throws Q;

   <T, D extends C_double<T>> T id_class(D var1, T var2);

   void id_class(int var1) throws c_1;

   <T extends C_transient> Stream<String> id_class(T var1);

   <T> T id_class(C_double<T> var1) throws Q, W;

   <T> T id_class(Class<T> var1, T var2, int var3) throws Q;

   <T, D extends C_double<T>> T id_class(Class<D> var1);

   <T, O, D extends C_switch<T, O>> T id_class(D var1, O var2) throws Q, W;

   String id_break(String var1) throws Q;

   <T, D extends C_double<T>> T id_break(Class<D> var1, T var2);

   <T, O, D extends C_switch<T, O>> T id_break(D var1, O var2, T var3);

   <T, O> T id_break(C_switch<T, O> var1) throws W, Q;

   String id_break();

   <T, D extends C_double<T>> T id_break(D var1) throws Q, W;

   <T, O, D extends C_switch<T, O>> T id_break(D var1, O var2) throws W, Q;

   <T> T id_break(Class<T> var1) throws Q;

   <T> T id_break(Class<T> var1, int var2) throws Q;

   boolean id_break(int var1);

   <T, O, D extends C_switch<T, O>> T id_throws(D var1, O var2);

   boolean id_throws(Class<?> var1, int var2) throws Q;

   C_import id_throws() throws Q;

   <T> T id_throws(Class<T> var1) throws Q;

   String id_throws(int var1) throws Q;

   C_static id_finally();

   <E extends Enum<?>> E id_finally(Class<E> var1) throws Q;

   boolean id_catch(int var1);

   C_import id_catch() throws Q;

   <T> T id_catch(Class<T> var1) throws W, Q;

   String id_extends() throws Q;

   boolean id_extends(Class<?> var1) throws Q;

   <T, D extends C_double<T>> T id_case(Class<D> var1);

   boolean id_case();

   boolean id_case(int var1);

   String id_implements() throws Q;

   <E extends Enum<?>> E id_implements(Class<E> var1) throws W, Q;

   <T, O> T id_protected(C_switch<T, O> var1, O var2) throws Q, W;

   <T> T id_protected(Class<T> var1) throws Q, W;

   void id_protected(int var1) throws x_1;

   <T, D extends C_double<T>> T id_protected(D var1);

   Deque<C_import> id_protected();

   <E extends Enum<?>> E id_protected(Class<E> var1, int var2) throws W, Q;

   void id_private(int var1) throws Q;

   C_import id_private();

   <E extends Enum<?>> E id_private(Class<E> var1) throws Q;

   boolean id_final();

   boolean id_volatile();

   boolean id_native();
}
