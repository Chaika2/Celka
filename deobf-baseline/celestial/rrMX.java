package celestial;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class rrMX {
   private static IJ id_class = null;
   private static IJ id_break = null;
   private static IJ id_byte = null;
   private static IJ id_protected = null;
   private static IJ id_throws = null;
   private static IJ id_case = null;
   private static List id_catch = null;
   private static List id_private = null;
   private static List id_implements = null;
   private static List id_finally = null;
   private static List id_extends = null;
   private static List id_native = null;
   private static IJ id_volatile = null;
   private static IJ id_final = null;
   private static IJ id_package = null;
   private static IJ id_int = null;
   private static IJ id_new = null;
   private static IJ id_continue = null;
   private static final Random id_super = new Random();

   private static List id_class(IJ var0) {
      return var0 == null ? null : var0.id_class((xc_3)null, (rpr_3)null, id_super);
   }

   static IJ id_class(String var0, List var1) {
      Ip_1 var2 = rrbb_3.id_float();
      if (var2 == null) {
         return null;
      } else {
         rqO_2 var3 = new rqO_2("blockstates/" + var0 + "_leaves.json");
         if (!rrbb_3.id_protected(var3)) {
            return null;
         } else {
            rqO_2 var4 = new rqO_2("models/block/" + var0 + "_leaves.json");
            if (!rrbb_3.id_protected(var4)) {
               return null;
            } else {
               II var5 = new II(var0 + "_leaves", "normal");
               IJ var6 = var2.id_class(var5);
               if (var6 != null && var6 != var2.id_break()) {
                  List var7 = var6.id_class((xc_3)null, (rpr_3)null, id_super);
                  if (var7.size() == 0) {
                     return var6;
                  } else if (var7.size() != 6) {
                     return null;
                  } else {
                     for (wK_2 var9 : var7) {
                        List var10 = var6.id_class((xc_3)null, var9.id_protected(), id_super);
                        if (var10.size() > 0) {
                           return null;
                        }

                        var10.add(var9);
                     }

                     var7.clear();
                     var1.add(var0 + "_leaves");
                     return var6;
                  }
               } else {
                  return null;
               }
            }
         }
      }
   }

   public static IJ id_class(IJ var0, xc_3 var1) {
      if (!rrbb_3.id_static()) {
         return var0;
      } else {
         List var2 = var0.id_class(var1, (rpr_3)null, id_super);
         if (var2 == id_catch) {
            return id_volatile;
         } else if (var2 == id_private) {
            return id_final;
         } else if (var2 == id_implements) {
            return id_package;
         } else if (var2 == id_finally) {
            return id_int;
         } else if (var2 == id_extends) {
            return id_new;
         } else {
            return var2 == id_native ? id_continue : var0;
         }
      }
   }

   public static void id_class() {
      ArrayList var0 = new ArrayList();
      id_class = id_class("acacia", var0);
      id_break = id_class("birch", var0);
      id_byte = id_class("dark_oak", var0);
      id_protected = id_class("jungle", var0);
      id_throws = id_class("oak", var0);
      id_case = id_class("spruce", var0);
      id_catch = id_class(id_class);
      id_private = id_class(id_break);
      id_implements = id_class(id_byte);
      id_finally = id_class(id_protected);
      id_extends = id_class(id_throws);
      id_native = id_class(id_case);
      id_volatile = id_break(id_class);
      id_final = id_break(id_break);
      id_package = id_break(id_byte);
      id_int = id_break(id_protected);
      id_new = id_break(id_throws);
      id_continue = id_break(id_case);
      if (var0.size() > 0) {
         rrbb_3.id_byte("Enable face culling: " + rrbb_3.id_class(var0.toArray()));
      }
   }

   public static boolean id_class(xc_3 var0, xc_3 var1) {
      if (var0 == var1) {
         return true;
      } else {
         xd_3 var2 = var0.id_break();
         xd_3 var3 = var1.id_break();
         return var2 == var3;
      }
   }

   private static IJ id_break(IJ var0) {
      if (var0 == null) {
         return null;
      } else if (var0.id_class((xc_3)null, (rpr_3)null, id_super).size() > 0) {
         rrbb_3.id_protected("SmartLeaves: Model is not cube, general quads: " + var0.id_class((xc_3)null, (rpr_3)null, id_super).size() + ", model: " + var0);
         return var0;
      } else {
         rpr_3[] var1 = rpr_3.VALUES;

         for (int var2 = 0; var2 < var1.length; var2++) {
            rpr_3 var3 = var1[var2];
            List var4 = var0.id_class((xc_3)null, var3, id_super);
            if (var4.size() != 1) {
               rrbb_3.id_protected("SmartLeaves: Model is not cube, side: " + var3 + ", quads: " + var4.size() + ", model: " + var0);
               return var0;
            }
         }

         IJ var12 = rrJT.id_break(var0);
         List[] var13 = new List[var1.length];

         for (int var14 = 0; var14 < var1.length; var14++) {
            rpr_3 var5 = var1[var14];
            List var6 = var12.id_class((xc_3)null, var5, id_super);
            wK_2 var7 = (wK_2)var6.get(0);
            wK_2 var8 = new wK_2((int[])var7.id_class().clone(), var7.id_byte(), var7.id_protected(), var7.id_case(), var7.id_throws());
            int[] var9 = var8.id_class();
            int[] var10 = (int[])var9.clone();
            int var11 = var9.length / 4;
            System.arraycopy(var9, 0 * var11, var10, 3 * var11, var11);
            System.arraycopy(var9, 1 * var11, var10, 2 * var11, var11);
            System.arraycopy(var9, 2 * var11, var10, 1 * var11, var11);
            System.arraycopy(var9, 3 * var11, var10, 0 * var11, var11);
            System.arraycopy(var10, 0, var9, 0, var10.length);
            var6.add(var8);
         }

         return var12;
      }
   }
}
