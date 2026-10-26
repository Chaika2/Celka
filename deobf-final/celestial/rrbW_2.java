package celestial;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class rrbW_2 {
   private static HU[] break_ = null;
   public static boolean class_ = false;

   private static void class_(String var0, Properties var1, List<HU> var2) {
      rrbb_3.byte_("CustomBlockLayers: " + var0);
      class_("solid", rrxA_2.class_, var1, var2);
      class_("cutout", rrxA_2.byte_, var1, var2);
      class_("cutout_mipped", rrxA_2.break_, var1, var2);
      class_("translucent", rrxA_2.protected_, var1, var2);
   }

   private static void class_(String var0, HU var1, Properties var2, List<HU> var3) {
      String var4 = "layer." + var0;
      String var5 = var2.getProperty(var4);
      if (var5 != null) {
         rrMz_1 var6 = new rrMz_1("CustomBlockLayers");
         rrMn_1[] var7 = var6.byte_(var5);
         if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
               rrMn_1 var9 = var7[var8];
               int var10 = var9.class_();
               if (var10 > 0) {
                  while (var3.size() < var10 + 1) {
                     var3.add((HU)null);
                  }

                  if (var3.get(var10) != null) {
                     rrbb_3.protected_("CustomBlockLayers: Block layer is already set, block: " + var10 + ", layer: " + var0);
                  }

                  var3.set(var10, var1);
               }
            }
         }
      }
   }

   public static HU class_(rRq_1 var0, xc_3 var1, rfH_2 var2) {
      if (break_ == null) {
         return null;
      } else if (var1.implements_(var0, var2)) {
         return null;
      } else {
         int var3 = var1.continue_();
         return var3 > 0 && var3 < break_.length ? break_[var3] : null;
      }
   }

   public static void class_() {
      break_ = null;
      class_ = false;
      ArrayList var0 = new ArrayList();
      String var1 = "optifine/block.properties";
      Properties var2 = rrzM_2.break_(var1, "CustomBlockLayers");
      if (var2 != null) {
         class_(var1, var2, var0);
      }

      if (rrbb_3.rs()) {
         rrzE_2 var3 = rrxt_3.byte_();
         if (var3 != null) {
            String var4 = "shaders/block.properties";
            class_(var4, var3, var0);
         }
      }

      if (!var0.isEmpty()) {
         break_ = var0.toArray(new HU[var0.size()]);
         class_ = true;
      }
   }

   public static boolean break_() {
      return class_;
   }
}
