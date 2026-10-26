package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTl_1 extends rrTC {
   private static short[] id_protected;
   private static byte[] id_throws;
   public Object[] id_byte;

   public rrTl_1(rrTC var1, rrTC var2) {
      super(var2);
      this.id_private();
      this.id_byte[1] = var1;
      PX var8 = ((rrTC)this.id_byte[1]).id_throws();
      this.id_byte[id_protected[2]] = var8;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-64, -36, 67, -103, 87, 110, -39, 36}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3338598128255283821L;
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1102986369;
   }

   @Override
   public PX id_break(PX var1) {
      this.id_private();
      PX var6;
      PX var10000 = var6 = super.id_break(var1);
      this.id_byte[id_protected[3]] = var6;
      return var10000;
   }

   @Override
   public PX id_throws() {
      this.id_private();
      return (PX)this.id_byte[id_protected[4]];
   }

   private static void id_catch() {
      id_protected = new short[]{1, 1, 0, 0, 0};
   }

   private static void id_case() {
      id_throws = new byte[]{2};
   }

   private void id_private() {
      if (this.id_byte == null) {
         this.id_byte = new Object[2];
         Object[] var1 = this.id_byte;
      }
   }
}
