package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAU {
   private static boolean[] id_byte;
   private static float[] id_protected;
   private static byte[] id_throws;
   public static Object[] id_class;
   public Object[] id_break;
   private static short[] id_case;

   public float id_byte() {
      return (Float)this.id_break[2];
   }

   public rrAU() {
      this.id_protected();
   }

   static {
      ntfClinit();
   }

   public static void id_class(Ml_1 var0, rjV_2 var1, float var2) {
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(id_break(var0, var1, var2));
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2088496454;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-87, -25, -73, 64, 86, -121, -10, -91}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 924459958944856133L;
   }

   public rjV_2 id_class() {
      return (rjV_2)this.id_break[1];
   }

   public static rrAU id_break(Ml_1 var0, rjV_2 var1, float var2) {
      ((rrAU)id_class[0]).id_break[0] = var0;
      ((rrAU)id_class[0]).id_break[1] = var1;
      rrAU var10000 = (rrAU)id_class[0];
      Float var9 = var2;
      var10000.id_break[2] = var9;
      return (rrAU)id_class[0];
   }

   public Ml_1 id_break() {
      return (Ml_1)this.id_break[0];
   }

   private static void id_throws() {
      id_case = new short[]{0, 0, 0, 1, 0, 2, 0, 0, 0, 1, 2};
   }

   private static void id_catch() {
      id_throws = new byte[]{3, 2};
   }

   private static void id_case() {
      id_protected = new float[1];
   }

   private static void id_implements() {
      Object[] var0 = new Object[]{new rrAU()};
      id_class = var0;
   }

   private void id_protected() {
      if (this.id_break == null) {
         this.id_break = new Object[3];
         Object[] var1 = this.id_break;
         var1[2] = 0.0F;
      }
   }

   private static void id_private() {
      id_byte = new boolean[]{false, true};
   }
}
