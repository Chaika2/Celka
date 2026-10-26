package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rD_2 extends rK_2 {
   public Object[] id_break;
   private static short[] id_byte;
   private static byte[] id_protected;

   @Override
   public PX id_byte() {
      this.id_case();
      return (PX)this.id_break[id_byte[4]];
   }

   public rD_2(rK_2 var1, rK_2 var2) {
      super(var2);
      this.id_case();
      this.id_break[1] = var1;
      PX var8 = ((rK_2)this.id_break[1]).id_byte();
      this.id_break[id_byte[2]] = var8;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 496327860325629408L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{76, -48, 12, -53, 72, 99, 117, -18}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -659182227;
   }

   @Override
   public PX id_break(PX var1) {
      this.id_case();
      PX var6;
      PX var10000 = var6 = super.id_break(var1);
      this.id_break[id_byte[3]] = var6;
      return var10000;
   }

   private static void id_throws() {
      id_protected = new byte[]{2};
   }

   private void id_case() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
         Object[] var1 = this.id_break;
      }
   }

   private static void id_protected() {
      id_byte = new short[]{1, 1, 0, 0, 0};
   }
}
