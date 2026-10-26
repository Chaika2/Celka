package celestial;

import java.util.Deque;
import java.util.LinkedList;
import java.util.stream.Stream;

public interface C_static {
   LinkedList<C_import> byte_();

   <T> T byte_(C_double<T> var1);

   <E extends Enum<?>> E byte_(Class<E> var1) throws W, Q;

   <T> T byte_(Class<T> var1, T var2) throws Q;

   C_import byte_(int var1) throws Q;

   <E extends Enum<?>> E byte_(Class<E> var1, int var2) throws Q;

   <T, O, D extends C_switch<T, O>> T byte_(D var1, O var2);

   <T, O> T class_(C_switch<T, O> var1);

   <T> T class_(Class<T> var1, int var2) throws Q, W;

   String class_(String var1, int var2) throws Q;

   String class_();

   String[] class_(String var1) throws Q;

   <T> T class_(Class<T> var1, T var2) throws Q;

   <T, O, D extends C_switch<T, O>> T class_(D var1, O var2, T var3);

   <E extends Enum<?>> E class_(Class<E> var1, E var2) throws Q;

   <T, D extends C_double<T>> T class_(D var1, T var2);

   void class_(int var1) throws c_1;

   <T extends C_transient> Stream<String> class_(T var1);

   <T> T class_(C_double<T> var1) throws Q, W;

   <T> T class_(Class<T> var1, T var2, int var3) throws Q;

   <T, D extends C_double<T>> T class_(Class<D> var1);

   <T, O, D extends C_switch<T, O>> T class_(D var1, O var2) throws Q, W;

   String break_(String var1) throws Q;

   <T, D extends C_double<T>> T break_(Class<D> var1, T var2);

   <T, O, D extends C_switch<T, O>> T break_(D var1, O var2, T var3);

   <T, O> T break_(C_switch<T, O> var1) throws W, Q;

   String break_();

   <T, D extends C_double<T>> T break_(D var1) throws Q, W;

   <T, O, D extends C_switch<T, O>> T break_(D var1, O var2) throws W, Q;

   <T> T break_(Class<T> var1) throws Q;

   <T> T break_(Class<T> var1, int var2) throws Q;

   boolean break_(int var1);

   <T, O, D extends C_switch<T, O>> T throws_(D var1, O var2);

   boolean throws_(Class<?> var1, int var2) throws Q;

   C_import throws_() throws Q;

   <T> T throws_(Class<T> var1) throws Q;

   String throws_(int var1) throws Q;

   C_static finally_();

   <E extends Enum<?>> E finally_(Class<E> var1) throws Q;

   boolean catch_(int var1);

   C_import catch_() throws Q;

   <T> T catch_(Class<T> var1) throws W, Q;

   String extends_() throws Q;

   boolean extends_(Class<?> var1) throws Q;

   <T, D extends C_double<T>> T case_(Class<D> var1);

   boolean case_();

   boolean case_(int var1);

   String implements_() throws Q;

   <E extends Enum<?>> E implements_(Class<E> var1) throws W, Q;

   <T, O> T protected_(C_switch<T, O> var1, O var2) throws Q, W;

   <T> T protected_(Class<T> var1) throws Q, W;

   void protected_(int var1) throws x_1;

   <T, D extends C_double<T>> T protected_(D var1);

   Deque<C_import> protected_();

   <E extends Enum<?>> E protected_(Class<E> var1, int var2) throws W, Q;

   void private_(int var1) throws Q;

   C_import private_();

   <E extends Enum<?>> E private_(Class<E> var1) throws Q;

   boolean final_();

   boolean volatile_();

   boolean native_();
}
