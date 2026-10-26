package celestial;

public interface rRV<T> {
   void id_class(rfH_2 var1, T var2, int var3, rYr_1 var4);

   default void id_class(rfH_2 var1, T var2, int var3) {
      this.id_class(var1, (T)var2, var3, rYr_1.NORMAL);
   }

   boolean id_class(rfH_2 var1, T var2);

   boolean id_break(rfH_2 var1, T var2);
}
