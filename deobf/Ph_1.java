package celestial;

import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Ph_1 implements MinecraftAccessor {
   private static double[] id_class;
   private static float[] id_break;
   private static boolean[] id_byte;
   private static short[] id_protected;

   private static void id_byte() {
      id_byte = new boolean[]{false, false, false, true, false, true};
   }

   private Ph_1() {
   }

   static {
      ntfClinit();
   }

   public static an_3 id_class(PX var0, float var1, boolean var2, Predicate<an_3> var3) {
      return id_class(((cb_3)id_import.id_class[57]).id_new(1.0F), ((cb_3)id_import.id_class[57]).id_byte(var0.id_protected(), var0.id_throws()), var0, var1, var2, var3);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2473134615690766259L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-19, 108, 103, -110, 35, -22, 70, 11}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 5808968;
   }

   public static an_3 id_class(an_3 var0, rjU_2 var1, PX var2, float var3, boolean var4) {
      return id_class((an_3)var0, var1, var2, var3, var4, (Predicate)null);
   }

   public static rjU_2 id_class(an_3 var0) {
      return new rjU_2(var0.rx(), var0.re() + (double)var0.id_byte(iM_2.CROUCHING), var0.BO());
   }

   public static rjG_2 id_class(rjU_2 var0, rjU_2 var1, rjS_2 var2, boolean var3) {
      return ((gm_3)id_import.id_class[56]).id_class(new rjB_2(var0, var1, var2, rjs_3.NONE, (cb_3)id_import.id_class[57]), var3);
   }

   private static void id_class() {
      id_break = new float[]{1.0F, 1.0F};
   }

   public static rjG_2 id_class(an_3 var0, PX var1, double var2, boolean var4, Predicate<xc_3> var5) {
      rjU_2 var6;
      if (var4) {
         var6 = id_class(var0);
      } else {
         var6 = var0.id_new(1.0F);
      }

      rjU_2 var7 = PJ.id_class(var1);
      rjU_2 var8 = var6.id_break(var7.id_break * var2, var7.id_byte * var2, var7.id_protected * var2);
      rjB_2 var9 = new rjB_2(var6, var8, rjS_2.OUTLINE, rjs_3.NONE, var0);
      var9.id_class(var5);
      return ((rYB)var0.id_throws[7]).id_class(var9);
   }

   public static an_3 id_class(an_3 var0, rjU_2 var1, PX var2, float var3, boolean var4, Predicate<xc_3> var5) {
      if (var0 == null) {
         return null;
      } else {
         Object var6 = var4 ? null : PJ.id_class(var2, (double)var3, false, var5);
         double var7 = (double)(var3 * var3);
         if (var6 != null) {
            var7 = ((rjG_2)var6).id_case().id_case(var1);
         }

         rjU_2 var9 = PJ.id_class(var2);
         rjU_2 var10 = var1.id_break(var9.id_break * (double)var3, var9.id_byte * (double)var3, var9.id_protected * (double)var3);
         rfo_3 var11 = rhj_3.id_class((cb_3)id_import.id_class[57], var0, var1, var10, var7);
         if (var11 == null) {
            return null;
         } else {
            an_3 var12 = var11.id_class();
            rjU_2 var13 = var11.id_case();
            double var14 = var1.id_case(var13);
            if (var14 < var7 || var6 == null) {
               var6 = var11;
            }

            return ((rjG_2)var6).id_byte() == rjM_2.ENTITY ? var12 : null;
         }
      }
   }

   public static rjG_2 id_class(an_3 var0, PX var1, double var2) {
      return id_class(var0, var1, var2, false);
   }

   public static rjG_2 id_class(an_3 var0, PX var1, double var2, boolean var4) {
      return id_class(var0, var1, var2, var4, (var0x) -> 1);
   }

   public static an_3 id_class(rjU_2 var0, rjU_2 var1, PX var2, float var3, boolean var4, Predicate<an_3> var5) {
      rjG_2 var6 = var4 ? null : PJ.id_class(var2, (double)var3, false);
      double var7 = (double)(var3 * var3);
      if (var6 != null) {
         var7 = var6.id_case().id_implements(var0);
      }

      rjU_2 var9 = var0.id_break(var1.id_break * var7, var1.id_byte * var7, var1.id_protected * var7);
      rfl_3 var10 = ((cb_3)id_import.id_class[57]).rN().id_break(var1.id_class(var7)).id_class((double)1.0F);
      rfo_3 var11 = rhj_3.id_class((cb_3)id_import.id_class[57], var0, var9, var10, (var1x) -> var1x.id_native() || !var1x.rY() || var5 != null && !var5.test(var1x) ? false : true, var7);
      return var11 == null ? null : var11.id_class();
   }

   private static void id_break() {
      id_class = new double[]{(double)1.0F};
   }

   // $FF: synthetic method
   private static void ntfClinit() {
      id_byte();
      id_class();
      id_protected();
      id_break();
   }

   private static void id_protected() {
      id_protected = new short[]{7, 56, 57, 57, 57, 57, 57, 57};
   }
}
