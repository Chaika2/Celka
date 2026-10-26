package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpQ_2 {
   private static boolean[] id_break;
   public Object[] id_class;
   private static short[] id_byte;
   private static byte[] id_protected;

   public rrNt_1 id_byte() {
      return (rrNt_1)this.id_class[id_byte[6]];
   }

   public rrpQ_2 id_byte(boolean var1) {
      Boolean var6 = var1;
      this.id_class[id_byte[0]] = var6;
      return this;
   }

   public rrpQ_2(rrNt_1 var1) {
      this.id_throws();
      this.id_class[id_byte[10]] = var1;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return id_break[0];
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrpQ_2 var2 = (rrpQ_2)var1;
         return Objects.equals((rrNt_1)this.id_class[id_byte[3]], (rrNt_1)var2.id_class[id_byte[4]]);
      } else {
         return id_break[1];
      }
   }

   @Override
   public int hashCode() {
      Object[] var10000 = new Object[id_break[2]];
      var10000[id_break[3]] = (rrNt_1)this.id_class[id_byte[5]];
      return Objects.hash(var10000);
   }

   public boolean id_class() {
      return (Boolean)this.id_class[id_byte[9]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -854060504;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2419275975293679545L;
   }

   public rrpQ_2 id_class(boolean var1) {
      Boolean var6 = var1;
      this.id_class[id_byte[1]] = var6;
      return this;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{114, 106, -41, -110, -44, -111, 38, 11}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrpQ_2 id_break(boolean var1) {
      Boolean var6 = var1;
      this.id_class[id_byte[2]] = var6;
      return this;
   }

   public boolean id_break() {
      return (Boolean)this.id_class[id_byte[7]];
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[4];
         this.id_class[1] = false;
         this.id_class[2] = false;
         this.id_class[3] = false;
      }
   }

   private static void id_catch() {
      id_byte = new short[]{1, 2, 3, 0, 0, 0, 0, 1, 2, 3, 0};
   }

   private static void id_case() {
      id_break = new boolean[]{true, false, true, false, true, false, false, false};
   }

   public boolean id_protected() {
      return (Boolean)this.id_class[id_byte[8]];
   }

   private static void id_private() {
      id_protected = new byte[]{4, 2, 3};
   }
}
