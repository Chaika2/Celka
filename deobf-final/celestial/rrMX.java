package celestial;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class rrMX {
   private static IJ class_ = null;
   private static IJ break_ = null;
   private static IJ byte_ = null;
   private static IJ protected_ = null;
   private static IJ throws_ = null;
   private static IJ case_ = null;
   private static List catch_ = null;
   private static List private_ = null;
   private static List implements_ = null;
   private static List finally_ = null;
   private static List extends_ = null;
   private static List native_ = null;
   private static IJ volatile_ = null;
   private static IJ final_ = null;
   private static IJ package_ = null;
   private static IJ int_ = null;
   private static IJ new_ = null;
   private static IJ continue_ = null;
   private static final Random super_ = new Random();

   private static List class_(IJ var0) {
      return var0 == null ? null : var0.class_((xc_3)null, (rpr_3)null, super_);
   }

   static IJ class_(String var0, List var1) {
      Ip_1 var2 = rrbb_3.float_();
      if (var2 == null) {
         return null;
      } else {
         rqO_2 var3 = new rqO_2("blockstates/" + var0 + "_leaves.json");
         if (!rrbb_3.protected_(var3)) {
            return null;
         } else {
            rqO_2 var4 = new rqO_2("models/block/" + var0 + "_leaves.json");
            if (!rrbb_3.protected_(var4)) {
               return null;
            } else {
               II var5 = new II(var0 + "_leaves", "normal");
               IJ var6 = var2.class_(var5);
               if (var6 != null && var6 != var2.break_()) {
                  List var7 = var6.class_((xc_3)null, (rpr_3)null, super_);
                  if (var7.size() == 0) {
                     return var6;
                  } else if (var7.size() != 6) {
                     return null;
                  } else {
                     for (wK_2 var9 : var7) {
                        List var10 = var6.class_((xc_3)null, var9.protected_(), super_);
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

   public static IJ class_(IJ var0, xc_3 var1) {
      if (!rrbb_3.static_()) {
         return var0;
      } else {
         List var2 = var0.class_(var1, (rpr_3)null, super_);
         if (var2 == catch_) {
            return volatile_;
         } else if (var2 == private_) {
            return final_;
         } else if (var2 == implements_) {
            return package_;
         } else if (var2 == finally_) {
            return int_;
         } else if (var2 == extends_) {
            return new_;
         } else {
            return var2 == native_ ? continue_ : var0;
         }
      }
   }

   public static void class_() {
      ArrayList var0 = new ArrayList();
      class_ = class_("acacia", var0);
      break_ = class_("birch", var0);
      byte_ = class_("dark_oak", var0);
      protected_ = class_("jungle", var0);
      throws_ = class_("oak", var0);
      case_ = class_("spruce", var0);
      catch_ = class_(class_);
      private_ = class_(break_);
      implements_ = class_(byte_);
      finally_ = class_(protected_);
      extends_ = class_(throws_);
      native_ = class_(case_);
      volatile_ = break_(class_);
      final_ = break_(break_);
      package_ = break_(byte_);
      int_ = break_(protected_);
      new_ = break_(throws_);
      continue_ = break_(case_);
      if (var0.size() > 0) {
         rrbb_3.byte_("Enable face culling: " + rrbb_3.class_(var0.toArray()));
      }
   }

   public static boolean class_(xc_3 var0, xc_3 var1) {
      if (var0 == var1) {
         return true;
      } else {
         xd_3 var2 = var0.break_();
         xd_3 var3 = var1.break_();
         return var2 == var3;
      }
   }

   private static IJ break_(IJ var0) {
      if (var0 == null) {
         return null;
      } else if (var0.class_((xc_3)null, (rpr_3)null, super_).size() > 0) {
         rrbb_3.protected_("SmartLeaves: Model is not cube, general quads: " + var0.class_((xc_3)null, (rpr_3)null, super_).size() + ", model: " + var0);
         return var0;
      } else {
         rpr_3[] var1 = rpr_3.VALUES;

         for (int var2 = 0; var2 < var1.length; var2++) {
            rpr_3 var3 = var1[var2];
            List var4 = var0.class_((xc_3)null, var3, super_);
            if (var4.size() != 1) {
               rrbb_3.protected_("SmartLeaves: Model is not cube, side: " + var3 + ", quads: " + var4.size() + ", model: " + var0);
               return var0;
            }
         }

         IJ var12 = rrJT.break_(var0);
         List[] var13 = new List[var1.length];

         for (int var14 = 0; var14 < var1.length; var14++) {
            rpr_3 var5 = var1[var14];
            List var6 = var12.class_((xc_3)null, var5, super_);
            wK_2 var7 = (wK_2)var6.get(0);
            wK_2 var8 = new wK_2((int[])var7.class_().clone(), var7.byte_(), var7.protected_(), var7.case_(), var7.throws_());
            int[] var9 = var8.class_();
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
