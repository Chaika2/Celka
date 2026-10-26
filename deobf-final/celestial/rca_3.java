package celestial;

import java.io.DataOutput;
import java.io.IOException;
import java.util.Objects;

public class rca_3 implements rcZ_2 {
   public static final rcv_3<rca_3> class_ = new rci_3();
   private static final rca_3 break_ = new rca_3("");
   private final String byte_;

   private rca_3(String var1) {
      Objects.requireNonNull(var1, "Null string not allowed");
      this.byte_ = var1;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof rca_3 && Objects.equals(this.byte_, ((rca_3)var1).byte_);
   }

   @Override
   public String toString() {
      return break_(this.byte_);
   }

   @Override
   public int hashCode() {
      return this.byte_.hashCode();
   }

   public static rca_3 class_(String var0) {
      return var0.isEmpty() ? break_ : new rca_3(var0);
   }

   @Override
   public byte class_() {
      return 8;
   }

   @Override
   public rgP_2 class_(String var1, int var2) {
      String var3 = break_(this.byte_);
      String var4 = var3.substring(0, 1);
      rVi_1 var5 = new rgN_2(var3.substring(1, var3.length() - 1)).class_(throws_);
      return new rgN_2(var4).class_(var5).break_(var4);
   }

   @Override
   public void class_(DataOutput var1) throws IOException {
      var1.writeUTF(this.byte_);
   }

   public static String break_(String var0) {
      StringBuilder var1 = new StringBuilder(" ");
      char var2 = 0;

      for (int var3 = 0; var3 < var0.length(); var3++) {
         char var4 = var0.charAt(var3);
         if (var4 == '\\') {
            var1.append('\\');
         } else if (var4 == '"' || var4 == '\'') {
            if (var2 == 0) {
               var2 = (char)(var4 == '"' ? 39 : 34);
            }

            if (var2 == var4) {
               var1.append('\\');
            }
         }

         var1.append(var4);
      }

      if (var2 == 0) {
         var2 = '"';
      }

      var1.setCharAt(0, var2);
      var1.append(var2);
      return var1.toString();
   }

   @Override
   public rcv_3<rca_3> break_() {
      return class_;
   }

   public rca_3 protected_() {
      return this;
   }

   @Override
   public String native_() {
      return this.byte_;
   }
}
