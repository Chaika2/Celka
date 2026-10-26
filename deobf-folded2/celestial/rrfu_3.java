package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfu_3 implements MinecraftAccessor {
   private static byte[] id_byte;
   private static short[] id_protected;
   private static float[] id_throws;
   public static Object[] id_class;
   private static String[] id_case;
   private static boolean[] id_catch;
   public Object[] id_break;

   private static void id_byte() {
      id_throws = new float[]{0.0F, 255.0F, 0.0F, 255.0F, 0.0F, 255.0F, 0.0F, 255.0F};
   }

   public static void id_byte(Object var0) {
      if ((cb_3)id_import.id_class[57] != null) {
         ((cq_3)id_import.id_class[19]).id_throws().id_break(id_break(var0).id_break());
      }
   }

   rrfu_3() {
      this.id_case();
      rVa_1 var5 = (rVa_1)id_class[2];
      this.id_break[2] = var5;
      rVa_1 var6 = (rVa_1)id_class[2];
      this.id_break[3] = var6;
      rVa_1 var7 = (rVa_1)id_class[3];
      this.id_break[4] = var7;
      rVa_1 var8 = (rVa_1)id_class[3];
      this.id_break[5] = var8;
   }

   static {
      ntfClinit();
   }

   private static int[] id_class(int var0) {
      return new int[]{var0 >> 16 & 0xFF, var0 >> 8 & 0xFF, var0 & 0xFF, var0 >> 24 & 0xFF};
   }

   private static int id_class(int var0, int var1, float var2) {
      int[] var3 = id_class(var0);
      int[] var4 = id_class(var1);
      float var5 = (float)var3[0] + (float)(var4[0] - var3[0]) * var2;
      float var6 = (float)var3[1] + (float)(var4[1] - var3[1]) * var2;
      float var7 = (float)var3[2] + (float)(var4[2] - var3[2]) * var2;
      float var8 = (float)var3[3] + (float)(var4[3] - var3[3]) * var2;
      return ColorHelper.id_class(
         (int)rfU_2.id_class(var5, 0.0F, 255.0F),
         (int)rfU_2.id_class(var6, 0.0F, 255.0F),
         (int)rfU_2.id_class(var7, 0.0F, 255.0F),
         (int)rfU_2.id_class(var8, 0.0F, 255.0F)
      );
   }

   public static void id_class(Module var0, String var1, float var2) {
      rVi_1 var3 = new rgN_2("Подождите ").id_break(rgF_2.RED + String.format("%.1fс", var2)).id_break(" до использования " + var1);
      id_class(id_break(var0).id_break(rgF_2.GRAY).id_class(var3));
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(new rrtx_3(var0.id_case(), var3, 2000));
   }

   private static rVa_1 id_class(rVa_1 var0, rVa_1 var1, float var2) {
      return new rVa_1(id_class(var0.id_class(), var1.id_class(), var2));
   }

   public static void id_class(rVi_1 var0) {
      if ((cb_3)id_import.id_class[57] != null) {
         PP.a_.id_class(var0);
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2414556194390501828L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{47, 106, -106, -74, -58, 32, 109, -53}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static String id_class(Module var0) {
      return var0.id_final() + ": ";
   }

   public static NotificationStyle id_class(Object var0) {
      return id_class().id_byte().id_class().id_class(rrfy_3.id_class(var0).toString());
   }

   public static NotificationStyle id_class() {
      return new NotificationStyle();
   }

   private static void id_break() {
      id_byte = new byte[]{2, 2, 2, 3, 3, 3, 4, 16, 8, 2, 3, 24, 2, 3, 6, 4};
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 602320318;
   }

   public static NotificationStyle id_break(Object var0) {
      NotificationStyle var1 = id_class().id_byte().id_break((String)id_class[0]);
      return var1.id_class(rrfy_3.id_class(var0).toString());
   }

   public static rVe_1 id_break(Module var0) {
      return new rVe_1(var0.id_final() + ": ");
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{"Celestial", new rVa_1(-4934476), new rVa_1(-4934476), new rVa_1(-4934476)};
      id_class = var0;
   }

   rVe_1 id_catch() {
      rVe_1 var1 = new rVe_1("");
      if ((String)this.id_break[0] != null) {
         int var2 = ((String)this.id_break[0]).length();
         var1.id_class(new rgN_2("(").id_class(rgc_3.id_class.id_class((rVa_1)id_class[1])));

         for (int var3 = 0; var3 < var2; var3++) {
            var1.id_class(
               new rgN_2(String.valueOf(((String)this.id_break[0]).charAt(var3)))
                  .id_class(rgc_3.id_class.id_class(id_class((rVa_1)this.id_break[2], (rVa_1)this.id_break[3], (float)var3 / (float)var2)))
            );
         }

         var1.id_class(new rgN_2(")").id_class(rgc_3.id_class.id_class((rVa_1)id_class[1])));
         var1.id_class(" » ");
      }

      if ((String)this.id_break[1] != null) {
         int var4 = ((String)this.id_break[1]).length();

         for (int var5 = 0; var5 < var4; var5++) {
            var1.id_class(
               new rgN_2(String.valueOf(((String)this.id_break[1]).charAt(var5)))
                  .id_class(rgc_3.id_class.id_class(id_class((rVa_1)this.id_break[4], (rVa_1)this.id_break[5], (float)var5 / (float)var4)))
            );
         }
      }

      return var1;
   }

   private void id_case() {
      if (this.id_break == null) {
         this.id_break = new Object[6];
      }
   }

   private static void id_implements() {
      id_protected = new short[]{
         2, 2, 2, 3, 3, 4, 3, 5, 57, 19, 57, 0, 2000, 0, 0, 0, 1, 0, 2, 3, 1, 1, 1, 1, 4, 5, 255, 255, 255, 255, 180, 180, 180, 180, 180, 180, 180, 180, 180
      };
   }

   private static void id_protected() {
      id_case = new String[]{
         new String("Подождите "),
         new String("%.1fс"),
         new String(""),
         new String("("),
         new String(")"),
         new String(" » "),
         new String("Impact"),
         new String("Celestial")
      };
   }

   private static void id_private() {
      id_catch = new boolean[]{true, false, true, false, false, false, false, false, false, true, true, true, false, true, false, true};
   }
}
