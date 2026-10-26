package celestial;

import java.util.function.Supplier;
import javax.management.MBeanAttributeInfo;

final class rny_3 {
   final String id_class;
   final Supplier<Object> id_break;
   private final String id_byte;
   private final Class<?> id_protected;

   rny_3(String var1, Supplier<Object> var2, String var3, Class<?> var4) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
   }

   MBeanAttributeInfo id_class() {
      return new MBeanAttributeInfo(this.id_class, this.id_protected.getSimpleName(), this.id_byte, true, false, false);
   }
}
