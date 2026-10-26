package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Pi_1 {
   private static byte[] id_break;
   private static short[] id_byte;
   public Object[] id_class;
   private static boolean[] id_protected;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
      }
   }

   public Pi_1(iB_2 var1, rjG_2 var2) {
      this.id_byte();
      this.id_class[id_byte[5]] = var1;
      this.id_class[1] = var2;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         Pi_1 var2 = (Pi_1)var1;
         return Objects.equals((iB_2)this.id_class[id_byte[0]], (iB_2)var2.id_class[id_byte[1]]);
      } else {
         return id_protected[1];
      }
   }

   @Override
   public int hashCode() {
      Object[] var10000 = new Object[1];
      var10000[id_protected[3]] = (iB_2)this.id_class[id_byte[2]];
      return Objects.hash(var10000);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{116, -85, -8, 103, 37, 32, -69, -36}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6114049577812694849L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1673216064;
   }

   public rjG_2 id_class() {
      return (rjG_2)this.id_class[1];
   }

   public iB_2 id_break() {
      return (iB_2)this.id_class[id_byte[3]];
   }

   private static void id_throws() {
      id_protected = new boolean[]{true, false, true, false};
   }

   private static void id_case() {
      id_byte = new short[]{0, 0, 0, 0, 1, 0, 1};
   }

   private static void id_protected() {
      id_break = new byte[]{2};
   }
}
