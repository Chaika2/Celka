package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCy_1 {
   private static boolean[] id_break;
   public Object[] id_class;
   private static short[] id_byte;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
      }
   }

   public rrCy_1() {
      this.id_byte();
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrCy_1 var2 = (rrCy_1)var1;
         return Objects.equals((rfl_3)this.id_class[id_byte[0]], (rfl_3)var2.id_class[id_byte[1]]);
      } else {
         return id_break[1];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hashCode((rfl_3)this.id_class[id_byte[2]]);
   }

   public rfl_3 id_class() {
      return (rfl_3)this.id_class[id_byte[3]];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{113, -28, 49, -66, 23, 107, -82, 105}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(rfl_3 var1) {
      this.id_class[id_byte[4]] = var1;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6307308944059457293L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -652160680;
   }

   private static void id_break() {
      id_byte = new short[5];
   }

   private static void id_protected() {
      id_break = new boolean[]{true, false, true};
   }
}
