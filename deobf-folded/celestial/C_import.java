package celestial;

public interface C_import {
   String id_byte();

   <T> T id_byte(Class<T> var1) throws W;

   <T, S> boolean id_class(Class<T> var1, Class<S> var2, S var3);

   <T> boolean id_class(Class<T> var1);

   int id_class();

   <T, S> T id_break(Class<T> var1, Class<S> var2, S var3) throws W;

   String id_break();

   <E extends Enum<?>> E id_break(Class<E> var1) throws W;
}
