package celestial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class rrJT {
   private static final Random id_class = new Random(0L);

   public static wK_2 id_class(wK_2 var0) {
      return new wK_2((int[])var0.id_class().clone(), var0.id_byte(), var0.id_protected(), var0.id_case(), var0.id_throws());
   }

   public static List id_class(List<wK_2> var0) {
      ArrayList var1 = new ArrayList();

      for (wK_2 var3 : var0) {
         wK_2 var4 = id_class(var3);
         var1.add(var4);
      }

      return var1;
   }

   public static void id_class(int[] var0, String var1) {
      int var2 = var0.length / 4;
      rrbb_3.id_byte(var1 + "Length: " + var0.length + ", step: " + var2);

      for (int var3 = 0; var3 < 4; var3++) {
         int var4 = var3 * var2;
         float var5 = Float.intBitsToFloat(var0[var4 + 0]);
         float var6 = Float.intBitsToFloat(var0[var4 + 1]);
         float var7 = Float.intBitsToFloat(var0[var4 + 2]);
         int var8 = var0[var4 + 3];
         float var9 = Float.intBitsToFloat(var0[var4 + 4]);
         float var10 = Float.intBitsToFloat(var0[var4 + 5]);
         rrbb_3.id_byte(var1 + var3 + " xyz: " + var5 + "," + var6 + "," + var7 + " col: " + var8 + " u,v: " + var9 + "," + var10);
      }
   }

   private static void id_class(String var0, List<wK_2> var1, String var2) {
      for (wK_2 var4 : var1) {
         id_class(var0, var4, var2);
      }
   }

   public static void id_class(String var0, wK_2 var1, String var2) {
      rrbb_3.id_byte(
         var2
            + "Quad: "
            + var1.getClass().getName()
            + ", type: "
            + var0
            + ", face: "
            + var1.id_protected()
            + ", tint: "
            + var1.id_byte()
            + ", sprite: "
            + var1.id_case()
      );
      id_class(var1.id_class(), "  " + var2);
   }

   public static void id_class(IJ var0) {
      if (var0 != null) {
         rrbb_3.id_byte(
            "Model: "
               + var0
               + ", ao: "
               + var0.id_class()
               + ", gui3d: "
               + var0.id_break()
               + ", builtIn: "
               + var0.id_protected()
               + ", particle: "
               + var0.id_throws()
         );
         rpr_3[] var1 = rpr_3.VALUES;

         for (int var2 = 0; var2 < var1.length; var2++) {
            rpr_3 var3 = var1[var2];
            List var4 = var0.id_class((xc_3)null, var3, id_class);
            id_class(var3.id_class(), var4, "  ");
         }

         List var5 = var0.id_class((xc_3)null, (rpr_3)null, id_class);
         id_class("General", var5, "  ");
      }
   }

   public static IJ id_break(IJ var0) {
      List var1 = id_class(var0.id_class((xc_3)null, (rpr_3)null, id_class));
      rpr_3[] var2 = rpr_3.VALUES;
      HashMap var3 = new HashMap();

      for (int var4 = 0; var4 < var2.length; var4++) {
         rpr_3 var5 = var2[var4];
         List var6 = var0.id_class((xc_3)null, var5, id_class);
         List var7 = id_class(var6);
         var3.put(var5, var7);
      }

      return new IR(var1, var3, var0.id_class(), var0.id_break(), true, var0.id_throws(), var0.id_case(), var0.id_catch());
   }
}
