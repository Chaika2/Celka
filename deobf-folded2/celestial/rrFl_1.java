package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrFl_1<T> {
   private static short[] id_class;
   private static float[] id_break;
   private static boolean[] id_protected;
   public Object[] id_byte;

   public abstract Collection<T> id_byte();

   public rrFl_1() {
      this.id_class();
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -444828764;
   }

   public abstract void id_class(Ml_1 var1, float var2, float var3);

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8471020242253777620L;
   }

   public abstract float id_class(T var1);

   private void id_class() {
      if (this.id_byte == null) {
         this.id_byte = new Object[1];
         Object[] var1 = this.id_byte;
         var1[0] = 0.0F;
      }
   }

   public void id_class(float var1) {
      this.id_break((Float)this.id_byte[0] + var1);
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{122, 89, -126, -84, -86, 41, 79, 58}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_protected = new boolean[]{true, false};
   }

   public void id_break(float var1) {
      Float var6 = var1;
      this.id_byte[0] = var6;
   }

   public void id_throws() {
   }

   public float id_finally() {
      return (Float)this.id_byte[0];
   }

   private static void id_catch() {
      id_break = new float[1];
   }

   private static void id_case() {
      id_class = new short[3];
   }

   public abstract float id_protected();
}
