package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAV {
   private static byte[] id_byte;
   public Object[] id_class;
   private static short[] id_protected;
   public static Object[] id_break;
   private static boolean[] id_throws;
   private static float[] id_case;

   public float id_byte() {
      return (Float)this.id_class[3];
   }

   public rrAV() {
      this.id_case();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8399934829677997262L;
   }

   public static rrAV id_class(an_3 var0, tp_3<?> var1, Ml_1 var2, float var3) {
      ((rrAV)id_break[0]).id_class[0] = var0;
      ((rrAV)id_break[0]).id_class[1] = var1;
      ((rrAV)id_break[0]).id_class[2] = var2;
      rrAV var10000 = (rrAV)id_break[0];
      Float var11 = var3;
      var10000.id_class[3] = var11;
      return (rrAV)id_break[0];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1138379745;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-4, 104, 107, -39, -52, -72, -69, -94}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public tp_3<?> id_class() {
      return (tp_3<?>)this.id_class[1];
   }

   public Ml_1 id_break() {
      return (Ml_1)this.id_class[2];
   }

   private static void id_throws() {
      id_protected = new short[]{0, 0, 0, 1, 0, 2, 0, 3, 0, 0, 1, 2, 3};
   }

   private static void id_finally() {
      id_byte = new byte[]{4, 3};
   }

   private static void id_catch() {
      Object[] var0 = new Object[]{new rrAV()};
      id_break = var0;
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[4];
         Object[] var1 = this.id_class;
         var1[3] = 0.0F;
      }
   }

   private static void id_implements() {
      id_throws = new boolean[]{false, true};
   }

   public an_3 id_protected() {
      return (an_3)this.id_class[0];
   }

   private static void id_private() {
      id_case = new float[1];
   }
}
