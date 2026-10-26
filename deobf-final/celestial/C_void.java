package celestial;

public interface C_void {
   <T> T class_(Class<T> var1, C_import var2) throws W;

   <T, S> C_long<T, S> class_(Class<T> var1, Class<S> var2);

   <T, S> T class_(Class<T> var1, Class<S> var2, C_import var3, S var4) throws W;

   <T> C_float<T> class_(Class<T> var1);

   L<C_abstract> class_();
}
