package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrHc_1 {
   private static byte[] id_break;
   private static short[] id_byte;
   private static boolean[] id_protected;
   public Object[] id_class;

   public String id_byte() {
      return (String)this.id_class[id_byte[12]];
   }

   public rrHc_1(String var1, String var2, String var3) {
      this.id_protected();
      this.id_class[id_byte[9]] = var1;
      this.id_class[1] = var2;
      this.id_class[2] = var3;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrHc_1 var2 = (rrHc_1)var1;
         return Objects.equals((String)this.id_class[id_byte[0]], (String)var2.id_class[id_byte[1]])
               && Objects.equals((String)this.id_class[1], (String)var2.id_class[1])
               && Objects.equals((String)this.id_class[2], (String)var2.id_class[2])
            ? true
            : id_protected[3];
      } else {
         return id_protected[1];
      }
   }

   @Override
   public String toString() {
      return "AutoAuthModule.AccountData(login=" + this.id_byte() + ", server=" + this.id_break() + ", password=" + this.id_class() + ")";
   }

   @Override
   public int hashCode() {
      Object[] var10000 = new Object[3];
      var10000[id_protected[4]] = (String)this.id_class[id_byte[6]];
      var10000[1] = (String)this.id_class[1];
      var10000[2] = (String)this.id_class[2];
      return Objects.hash(var10000);
   }

   public String id_class() {
      return (String)this.id_class[2];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -339820176;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7908379082467027634L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-13, -22, -62, 22, -88, -12, -2, 11}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public String id_break() {
      return (String)this.id_class[1];
   }

   private static void id_throws() {
      id_break = new byte[]{3, 2, 3};
   }

   private static void id_catch() {
      id_byte = new short[]{0, 0, 1, 1, 2, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2};
   }

   private static void id_case() {
      id_protected = new boolean[]{true, false, true, false, false, true};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
      }
   }
}
