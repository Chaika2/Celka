package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class bb_3 implements D {
   private static boolean[] id_class;
   private static short[] id_break;
   private static byte[] id_protected;
   public Object[] id_byte;

   public C_class id_byte() {
      return (C_class)this.id_byte[id_break[7]];
   }

   public bb_3(C_class var1, bM_2 var2) {
      this.id_catch();
      this.id_byte[id_break[0]] = var1;
      this.id_byte[1] = var2;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7621457038902490479L;
   }

   public void id_class(boolean var1) {
      Boolean var6 = var1;
      this.id_byte[2] = var6;
      if ((Boolean)this.id_byte[2]) {
         ((bM_2)this.id_byte[1]).id_break(this);
      } else {
         ((bM_2)this.id_byte[1]).id_byte(this);
      }
   }

   public void id_class(rVi_1 var1) {
      ((bM_2)this.id_byte[1]).id_class(this, var1);
   }

   public void id_class() {
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -426340028;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{7, -24, -125, -29, 56, 126, 95, 67}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public bM_2 id_break() {
      return (bM_2)this.id_byte[1];
   }

   private static void id_throws() {
      id_protected = new byte[]{3, 2};
   }

   private void id_catch() {
      if (this.id_byte == null) {
         this.id_byte = new Object[3];
         Object[] var1 = this.id_byte;
         var1[2] = id_class[0];
      }
   }

   private static void id_case() {
      id_break = new short[]{0, 1, 1, 2, 2, 1, 1, 0, 1, 2};
   }

   public boolean id_protected() {
      return (Boolean)this.id_byte[2];
   }

   private static void id_private() {
      id_class = new boolean[1];
   }
}
