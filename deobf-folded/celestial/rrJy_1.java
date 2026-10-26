package celestial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class rrJy_1 {
   private static final float id_class = 1.0E-6F;
   private static final Random id_break = new Random(0L);

   private static void id_class(List<wK_2> var0, fj_3 var1, fj_3 var2) {
      ArrayList var3 = new ArrayList();

      for (Object var5 : var0) {
         if (((wK_2)var5).id_case() == var1) {
            var5 = new rrJl_1((wK_2)var5, var2);
         }

         var3.add(var5);
      }

      var0.clear();
      var0.addAll(var3);
   }

   public static void id_class(rje_3 var0) {
      var0.id_break(id_class(var0.id_class()), id_class(var0.id_break()), id_class(var0.id_byte()));
   }

   private static float id_class(float var0) {
      if (var0 > -1.0E-6F && var0 < 1.0E-6F) {
         return 0.0F;
      } else {
         return var0 > 0.999999F && var0 < 1.000001F ? 1.0F : var0;
      }
   }

   public static rfl_3 id_class(rfl_3 var0, Jp_1 var1, rfH_2 var2) {
      int var3 = var2.b_();
      int var4 = var2.d_();
      long var5 = (long)(var3 * 3129871) ^ (long)var4 * 116129781L;
      var5 = var5 * var5 * 42317861L + var5 * 11L;
      double var7 = ((double)((float)(var5 >> 16 & 15L) / 15.0F) - 0.5) * 0.5;
      double var9 = ((double)((float)(var5 >> 24 & 15L) / 15.0F) - 0.5) * 0.5;
      double var11 = 0.0;
      if (var1 == Jp_1.XYZ) {
         var11 = ((double)((float)(var5 >> 20 & 15L) / 15.0F) - 1.0) * 0.2;
      }

      return var0.id_protected(var7, var11, var9);
   }

   public static IJ id_class(String var0, fj_3 var1, fj_3 var2) {
      if (var1 != null && var2 != null) {
         Ip_1 var3 = rrbb_3.id_float();
         if (var3 == null) {
            return null;
         } else {
            II var4 = new II(var0, "");
            IJ var5 = var3.id_class(var4);
            if (var5 != null && var5 != var3.id_break()) {
               IJ var6 = rrJT.id_break(var5);
               rpr_3[] var7 = rpr_3.VALUES;

               for (int var8 = 0; var8 < var7.length; var8++) {
                  rpr_3 var9 = var7[var8];
                  List var10 = var6.id_class((xc_3)null, var9, id_break);
                  id_class(var10, var1, var2);
               }

               List var11 = var6.id_class((xc_3)null, (rpr_3)null, id_break);
               id_class(var11, var1, var2);
               return var6;
            } else {
               return null;
            }
         }
      } else {
         return null;
      }
   }

   public static IJ id_class(fj_3 var0, int var1) {
      ArrayList var2 = new ArrayList();
      rpr_3[] var3 = rpr_3.VALUES;
      HashMap var4 = new HashMap();

      for (int var5 = 0; var5 < var3.length; var5++) {
         rpr_3 var6 = var3[var5];
         ArrayList var7 = new ArrayList();
         var7.add(id_class(var6, var0, var1));
         var4.put(var6, var7);
      }

      IF var8 = IF.id_class;
      return new IR(var2, var4, true, true, true, var0, Ik_1.id_class, var8);
   }

   public static IJ id_class(IJ var0, IJ var1) {
      ArrayList var2 = new ArrayList();
      var2.addAll(var0.id_class((xc_3)null, (rpr_3)null, id_break));
      var2.addAll(var1.id_class((xc_3)null, (rpr_3)null, id_break));
      rpr_3[] var3 = rpr_3.VALUES;
      HashMap var4 = new HashMap();

      for (int var5 = 0; var5 < var3.length; var5++) {
         rpr_3 var6 = var3[var5];
         ArrayList var7 = new ArrayList();
         var7.addAll(var0.id_class((xc_3)null, var6, id_break));
         var7.addAll(var1.id_class((xc_3)null, var6, id_break));
         var4.put(var6, var7);
      }

      boolean var11 = var0.id_class();
      boolean var12 = var0.id_protected();
      fj_3 var13 = var0.id_throws();
      Ik_1 var8 = var0.id_case();
      IF var9 = var0.id_catch();
      return new IR(var2, var4, var11, var12, true, var13, var8, var9);
   }

   public static wK_2 id_class(rpr_3 var0, fj_3 var1, int var2) {
      rje_3 var3 = new rje_3(0.0F, 0.0F, 0.0F);
      rje_3 var4 = new rje_3(16.0F, 16.0F, 16.0F);
      wD_2 var5 = new wD_2(new float[]{0.0F, 0.0F, 16.0F, 16.0F}, 0);
      IG var6 = new IG(var0, var2, "#" + var0.id_class(), var5);
      If_1 var7 = If_1.X0_Y0;
      Object var8 = null;
      boolean var9 = true;
      rqO_2 var10 = var1.id_finally();
      Ih_1 var11 = new Ih_1();
      return var11.id_class(var3, var4, var6, var1, var0, var7, (IM)var8, var9, var10);
   }

   public static IJ id_class(String var0, String var1, String var2) {
      fJ_2 var3 = rrbb_3.rF();
      fj_3 var4 = var3.id_break(var1);
      fj_3 var5 = var3.id_break(var2);
      return id_class(var0, var4, var5);
   }

   public static IJ id_class(String var0, int var1) {
      fj_3 var2 = rrbb_3.rF().id_break(var0);
      return id_class(var2, var1);
   }
}
