package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrvR_1 extends rrvj_1 {
   public Object[] id_byte;
   private static short[] id_protected;
   private static float[] id_native;
   private static byte[] id_volatile;

   public rrvR_1(String var1, AnimValue var2, AnimValue var3) {
      super(var1, () -> id_native[1], () -> id_native[0]);
      this.id_throw();
      this.id_byte[id_protected[0]] = var2;
      this.id_byte[1] = var3;
   }

   static {
      ntfClinit();
   }

   private static void B() {
      id_volatile = new byte[]{2};
   }

   private static void s() {
      id_native = new float[2];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1887564283;
   }

   @Override
   public void id_class(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      this.id_throw();
      super.id_class(var1, var2, var3, var4, var5);
      ((AnimValue)this.id_byte[id_protected[2]]).id_break(this.id_goto());
      ((AnimValue)this.id_byte[1]).id_break(this.id_while());
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6275630762978964419L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{35, -7, -100, -28, -71, 0, 100, -109}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public abstract float id_goto();

   @Override
   public float id_implements() {
      this.id_throw();
      return ((AnimValue)this.id_byte[id_protected[4]]).id_byte();
   }

   private void id_throw() {
      if (this.id_byte == null) {
         this.id_byte = new Object[2];
         Object[] var1 = this.id_byte;
      }
   }

   public AnimValue id_try() {
      this.id_throw();
      return (AnimValue)this.id_byte[id_protected[6]];
   }

   public abstract float id_while();

   public AnimValue id_public() {
      this.id_throw();
      return (AnimValue)this.id_byte[1];
   }

   private static void E() {
      id_protected = new short[]{0, 1, 0, 1, 0, 1, 0, 1};
   }

   @Override
   public float ao_() {
      this.id_throw();
      return ((AnimValue)this.id_byte[1]).id_byte();
   }
}
