package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvm_1 {
   private static byte[] id_break;
   public Object[] id_class;
   private static boolean[] id_byte;
   private static short[] id_protected;

   public String id_byte() {
      return (String)this.id_class[id_protected[4]];
   }

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-25, 126, 51, -98, -8, 77, 20, -104}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrvm_1(String var1, String var2, KeyBind var3) {
      this.id_catch();
      this.id_class[id_protected[9]] = var1;
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
         rrvm_1 var2 = (rrvm_1)var1;
         return (KeyBind)this.id_class[2] == (KeyBind)var2.id_class[2] ? true : id_byte[3];
      } else {
         return id_byte[1];
      }
   }

   @Override
   public int hashCode() {
      Object[] var10000 = new Object[1];
      var10000[id_byte[5]] = (KeyBind)this.id_class[2];
      return Objects.hash(var10000);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5027303227820135303L;
   }

   public KeyBind id_class() {
      return (KeyBind)this.id_class[2];
   }

   public rrvm_1 id_class(KeyBind var1) {
      this.id_class[2] = var1;
      return this;
   }

   public void id_class(String var1) {
      this.id_class[id_protected[7]] = var1;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1568634155;
   }

   public String id_break() {
      return (String)this.id_class[1];
   }

   public void id_break(String var1) {
      this.id_class[1] = var1;
   }

   private static void id_throws() {
      id_byte = new boolean[]{true, false, true, false, true, false};
   }

   private void id_catch() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_case() {
      id_protected = new short[]{2, 2, 2, 2, 0, 1, 2, 0, 1, 0, 1, 2};
   }

   private static void id_protected() {
      id_break = new byte[]{3};
   }
}
