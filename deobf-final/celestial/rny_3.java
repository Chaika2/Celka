package celestial;

import java.util.function.Supplier;
import javax.management.MBeanAttributeInfo;

final class rny_3 {
   final String class_;
   final Supplier<Object> break_;
   private final String byte_;
   private final Class<?> protected_;

   rny_3(String var1, Supplier<Object> var2, String var3, Class<?> var4) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
   }

   MBeanAttributeInfo class_() {
      return new MBeanAttributeInfo(this.class_, this.protected_.getSimpleName(), this.byte_, true, false, false);
   }
}
