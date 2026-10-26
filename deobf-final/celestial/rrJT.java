package celestial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class rrJT {
   private static final Random class_ = new Random(0L);

   public static wK_2 class_(wK_2 var0) {
      return new wK_2((int[])var0.class_().clone(), var0.byte_(), var0.protected_(), var0.case_(), var0.throws_());
   }

   public static List class_(List<wK_2> var0) {
      ArrayList var1 = new ArrayList();

      for (wK_2 var3 : var0) {
         wK_2 var4 = class_(var3);
         var1.add(var4);
      }

      return var1;
   }

   public static void class_(int[] var0, String var1) {
      int var2 = var0.length / 4;
      rrbb_3.byte_(var1 + "Length: " + var0.length + ", step: " + var2);

      for (int var3 = 0; var3 < 4; var3++) {
         int var4 = var3 * var2;
         float var5 = Float.intBitsToFloat(var0[var4 + 0]);
         float var6 = Float.intBitsToFloat(var0[var4 + 1]);
         float var7 = Float.intBitsToFloat(var0[var4 + 2]);
         int var8 = var0[var4 + 3];
         float var9 = Float.intBitsToFloat(var0[var4 + 4]);
         float var10 = Float.intBitsToFloat(var0[var4 + 5]);
         rrbb_3.byte_(var1 + var3 + " xyz: " + var5 + "," + var6 + "," + var7 + " col: " + var8 + " u,v: " + var9 + "," + var10);
      }
   }

   private static void class_(String var0, List<wK_2> var1, String var2) {
      for (wK_2 var4 : var1) {
         class_(var0, var4, var2);
      }
   }

   public static void class_(String var0, wK_2 var1, String var2) {
      rrbb_3.byte_(
         var2
            + "Quad: "
            + var1.getClass().getName()
            + ", type: "
            + var0
            + ", face: "
            + var1.protected_()
            + ", tint: "
            + var1.byte_()
            + ", sprite: "
            + var1.case_()
      );
      class_(var1.class_(), "  " + var2);
   }

   public static void class_(IJ var0) {
      if (var0 != null) {
         rrbb_3.byte_(
            "Model: " + var0 + ", ao: " + var0.class_() + ", gui3d: " + var0.break_() + ", builtIn: " + var0.protected_() + ", particle: " + var0.throws_()
         );
         rpr_3[] var1 = rpr_3.VALUES;

         for (int var2 = 0; var2 < var1.length; var2++) {
            rpr_3 var3 = var1[var2];
            List var4 = var0.class_((xc_3)null, var3, class_);
            class_(var3.class_(), var4, "  ");
         }

         List var5 = var0.class_((xc_3)null, (rpr_3)null, class_);
         class_("General", var5, "  ");
      }
   }

   public static IJ break_(IJ var0) {
      List var1 = class_(var0.class_((xc_3)null, (rpr_3)null, class_));
      rpr_3[] var2 = rpr_3.VALUES;
      HashMap var3 = new HashMap();

      for (int var4 = 0; var4 < var2.length; var4++) {
         rpr_3 var5 = var2[var4];
         List var6 = var0.class_((xc_3)null, var5, class_);
         List var7 = class_(var6);
         var3.put(var5, var7);
      }

      return new IR(var1, var3, var0.class_(), var0.break_(), true, var0.throws_(), var0.case_(), var0.catch_());
   }
}
