package celestial;

import java.util.Locale;

public class II extends rqO_2 {
   private final String protected_;

   public II(String var1, String var2) {
      this(class_(var1 + "#" + var2));
   }

   public II(rqO_2 var1, String var2) {
      this(var1.toString(), var2);
   }

   public II(String var1) {
      this(class_(var1));
   }

   protected II(String[] var1) {
      super(var1);
      this.protected_ = var1[2].toLowerCase(Locale.ROOT);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 instanceof II && super.equals(var1)) {
         II var2 = (II)var1;
         return this.protected_.equals(var2.protected_);
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return super.toString() + "#" + this.protected_;
   }

   @Override
   public int hashCode() {
      return 31 * super.hashCode() + this.protected_.hashCode();
   }

   protected static String[] class_(String var0) {
      String[] var1 = new String[]{null, var0, ""};
      int var2 = var0.indexOf(35);
      String var3 = var0;
      if (var2 >= 0) {
         var1[2] = var0.substring(var2 + 1, var0.length());
         if (var2 > 1) {
            var3 = var0.substring(0, var2);
         }
      }

      System.arraycopy(rqO_2.break_(var3, ':'), 0, var1, 0, 2);
      return var1;
   }

   public String class_() {
      return this.protected_;
   }
}
