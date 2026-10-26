package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnB_2 implements MinecraftAccessor {
   private static float[] id_byte;
   public Object[] id_class;
   private static short[] id_protected;
   private static double[] id_throws;
   public static Object[] id_break;
   private static boolean[] id_case;
   private static byte[] id_catch;

   private static void id_byte() {
      id_byte = new float[1];
   }

   public rrnB_2() {
      this.id_case();
   }

   static {
      ntfClinit();
   }

   public Ml_1 id_class() {
      return (Ml_1)this.id_class[0];
   }

   public static void id_class(Ml_1 var0, float var1) {
      rrnB_2 var2 = id_break(var0, var1);
      boolean var3 = ((Qw_1)id_import.id_class[20]).rs != 2 ? true : id_case[1];
      if (var3) {
         rrnE_2.id_class(2.0);
      }

      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(var2);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_class().id_class(var0, (Integer)rrvk_1.id_class[0], (Integer)rrvk_1.id_class[1]);
      if (var3) {
         rrnE_2.id_class(id_const.id_return());
      }

      if ((cb_3)id_import.id_class[57] != null && (gm_3)id_import.id_class[56] != null) {
         rrvT var4 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private();
         var4.w().id_class(var0, var1);
         var4.id_this().id_class(var1);
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -111219804;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5407542977531287059L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-29, 127, 82, -13, -45, 99, -19, 63}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrnB_2 id_break(Ml_1 var0, float var1) {
      ((rrnB_2)id_break[0]).id_class[0] = var0;
      rrnB_2 var10000 = (rrnB_2)id_break[0];
      Float var7 = var1;
      var10000.id_class[1] = var7;
      return (rrnB_2)id_break[0];
   }

   public float id_break() {
      return (Float)this.id_class[1];
   }

   private static void id_throws() {
      id_case = new boolean[]{true, false, false, true, true};
   }

   private static void id_catch() {
      id_catch = new byte[]{2, 2};
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
         var1[1] = 0.0F;
      }
   }

   private static void id_implements() {
      id_protected = new short[]{0, 0, 0, 1, 0, 20, 0, 0, 0, 1, 57, 56, 0, 0, 1};
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{new rrnB_2()};
      id_break = var0;
   }

   private static void id_private() {
      id_throws = new double[]{2.0};
   }
}
