package celestial;

import java.util.Locale;

public class II extends rqO_2 {
   private final String id_protected;

   public II(String var1, String var2) {
      this(id_class(var1 + "#" + var2));
   }

   public II(rqO_2 var1, String var2) {
      this(var1.toString(), var2);
   }

   public II(String var1) {
      this(id_class(var1));
   }

   protected II(String[] var1) {
      super(var1);
      this.id_protected = var1[2].toLowerCase(Locale.ROOT);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 instanceof II && super.equals(var1)) {
         II var2 = (II)var1;
         return this.id_protected.equals(var2.id_protected);
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return super.toString() + "#" + this.id_protected;
   }

   @Override
   public int hashCode() {
      return 31 * super.hashCode() + this.id_protected.hashCode();
   }

   protected static String[] id_class(String var0) {
      String[] var1 = new String[]{null, var0, ""};
      int var2 = var0.indexOf(35);
      String var3 = var0;
      if (var2 >= 0) {
         var1[2] = var0.substring(var2 + 1, var0.length());
         if (var2 > 1) {
            var3 = var0.substring(0, var2);
         }
      }

      System.arraycopy(rqO_2.id_break(var3, ':'), 0, var1, 0, 2);
      return var1;
   }

   public String id_class() {
      return this.id_protected;
   }
}
