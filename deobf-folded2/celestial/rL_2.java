package celestial;

import java.util.stream.Stream;

public interface rL_2 extends rz_3 {
   default void id_class(int var1, xd_3... var2) {
      this.id_class(var1, new ra_3(Stream.of(var2).map(re_3::new).toArray(re_3[]::new)));
   }

   default void id_class(int var1, re_3... var2) {
      this.id_class(var1, new ra_3(var2));
   }

   void id_class(int var1, ra_3 var2);

   default void id_class(xd_3... var1) {
      this.id_class(0, var1);
   }

   default void id_class(re_3... var1) {
      this.id_class(0, var1);
   }

   default void id_class(ra_3 var1) {
      this.id_class(0, var1);
   }

   void id_class(int var1, String... var2);

   default void id_class(String... var1) {
      this.id_class(0, var1);
   }

   default void id_private() {
      this.id_protected();
   }
}
