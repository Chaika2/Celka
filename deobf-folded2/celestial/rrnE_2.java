package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnE_2 implements MinecraftAccessor {
   private static double[] id_byte;
   private static boolean[] id_protected;
   private static short[] id_throws;
   public static Object[] id_class;
   public Object[] id_break;
   private static float[] id_case;
   private static byte[] id_catch;

   private static void id_byte() {
      id_protected = new boolean[]{false, true, true};
   }

   public rrnE_2() {
      this.id_private();
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -782906388;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{25, -99, -42, 32, 83, -121, -30, -114}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static void id_class(double var0) {
      ((Hh_1)id_import.id_class[16]).id_class(id_const, var0);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2648504740233290170L;
   }

   public static void id_class(Ml_1 var0, float var1) {
      rrnE_2 var2 = id_break(var0, var1);
      id_class(2.0);
      ((rrjU_2)rrjU_2.staticFieldsf70af72d4e3133959ed8b9ae51cf5789[0]).id_class(var2);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(var2);
      id_class(id_const.id_return());
   }

   public Ml_1 id_class() {
      return (Ml_1)this.id_break[0];
   }

   public float id_break() {
      return (Float)this.id_break[1];
   }

   public static rrnE_2 id_break(Ml_1 var0, float var1) {
      ((rrnE_2)id_class[0]).id_break[0] = var0;
      rrnE_2 var10000 = (rrnE_2)id_class[0];
      Float var7 = var1;
      var10000.id_break[1] = var7;
      return (rrnE_2)id_class[0];
   }

   private static void id_throws() {
      id_throws = new short[]{0, 0, 0, 1, 0, 0, 0, 16, 0, 1};
   }

   private static void id_catch() {
      id_catch = new byte[]{2};
   }

   private static void id_case() {
      Object[] var0 = new Object[]{new rrnE_2()};
      id_class = var0;
   }

   private static void id_implements() {
      id_byte = new double[]{2.0};
   }

   private static void id_protected() {
      id_case = new float[1];
   }

   private void id_private() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
         Object[] var1 = this.id_break;
         var1[1] = 0.0F;
      }
   }
}
