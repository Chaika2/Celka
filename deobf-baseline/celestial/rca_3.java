package celestial;

import java.io.DataOutput;
import java.io.IOException;
import java.util.Objects;

public class rca_3 implements rcZ_2 {
   public static final rcv_3<rca_3> id_class = new rci_3();
   private static final rca_3 id_break = new rca_3("");
   private final String id_byte;

   private rca_3(String var1) {
      Objects.requireNonNull(var1, "Null string not allowed");
      this.id_byte = var1;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof rca_3 && Objects.equals(this.id_byte, ((rca_3)var1).id_byte);
   }

   @Override
   public String toString() {
      return id_break(this.id_byte);
   }

   @Override
   public int hashCode() {
      return this.id_byte.hashCode();
   }

   public static rca_3 id_class(String var0) {
      return var0.isEmpty() ? id_break : new rca_3(var0);
   }

   @Override
   public byte id_class() {
      return 8;
   }

   @Override
   public rgP_2 id_class(String var1, int var2) {
      String var3 = id_break(this.id_byte);
      String var4 = var3.substring(0, 1);
      rVi_1 var5 = new rgN_2(var3.substring(1, var3.length() - 1)).id_class(id_throws);
      return new rgN_2(var4).id_class(var5).id_break(var4);
   }

   @Override
   public void id_class(DataOutput var1) throws IOException {
      var1.writeUTF(this.id_byte);
   }

   public static String id_break(String var0) {
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
   public rcv_3<rca_3> id_break() {
      return id_class;
   }

   public rca_3 id_protected() {
      return this;
   }

   @Override
   public String id_native() {
      return this.id_byte;
   }
}
