package celestial;

import java.util.stream.Stream;

public interface rL_2 extends rz_3 {
   default void class_(int var1, xd_3... var2) {
      this.class_(var1, new ra_3(Stream.of(var2).map(re_3::new).toArray(re_3[]::new)));
   }

   default void class_(int var1, re_3... var2) {
      this.class_(var1, new ra_3(var2));
   }

   void class_(int var1, ra_3 var2);

   default void class_(xd_3... var1) {
      this.class_(0, var1);
   }

   default void class_(re_3... var1) {
      this.class_(0, var1);
   }

   default void class_(ra_3 var1) {
      this.class_(0, var1);
   }

   void class_(int var1, String... var2);

   default void class_(String... var1) {
      this.class_(0, var1);
   }

   default void private_() {
      this.protected_();
   }
}
