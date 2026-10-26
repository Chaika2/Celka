package celestial;

public interface rZ_2 extends rz_3 {
   void id_class(int var1, rfH_2 var2);

   default void id_class(int var1) {
      this.id_class(var1, null);
   }

   default void id_private() {
      this.id_class(0, null);
   }
}
