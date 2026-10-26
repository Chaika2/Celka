package celestial;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class rrbW_2 {
   private static HU[] id_break = null;
   public static boolean id_class = false;

   private static void id_class(String var0, Properties var1, List<HU> var2) {
      rrbb_3.id_byte("CustomBlockLayers: " + var0);
      id_class("solid", rrxA_2.id_class, var1, var2);
      id_class("cutout", rrxA_2.id_byte, var1, var2);
      id_class("cutout_mipped", rrxA_2.id_break, var1, var2);
      id_class("translucent", rrxA_2.id_protected, var1, var2);
   }

   private static void id_class(String var0, HU var1, Properties var2, List<HU> var3) {
      String var4 = "layer." + var0;
      String var5 = var2.getProperty(var4);
      if (var5 != null) {
         rrMz_1 var6 = new rrMz_1("CustomBlockLayers");
         rrMn_1[] var7 = var6.id_byte(var5);
         if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
               rrMn_1 var9 = var7[var8];
               int var10 = var9.id_class();
               if (var10 > 0) {
                  while (var3.size() < var10 + 1) {
                     var3.add((HU)null);
                  }

                  if (var3.get(var10) != null) {
                     rrbb_3.id_protected("CustomBlockLayers: Block layer is already set, block: " + var10 + ", layer: " + var0);
                  }

                  var3.set(var10, var1);
               }
            }
         }
      }
   }

   public static HU id_class(rRq_1 var0, xc_3 var1, rfH_2 var2) {
      if (id_break == null) {
         return null;
      } else if (var1.id_implements(var0, var2)) {
         return null;
      } else {
         int var3 = var1.id_continue();
         return var3 > 0 && var3 < id_break.length ? id_break[var3] : null;
      }
   }

   public static void id_class() {
      id_break = null;
      id_class = false;
      ArrayList var0 = new ArrayList();
      String var1 = "optifine/block.properties";
      Properties var2 = rrzM_2.id_break(var1, "CustomBlockLayers");
      if (var2 != null) {
         id_class(var1, var2, var0);
      }

      if (rrbb_3.rs()) {
         rrzE_2 var3 = rrxt_3.id_byte();
         if (var3 != null) {
            String var4 = "shaders/block.properties";
            id_class(var4, var3, var0);
         }
      }

      if (!var0.isEmpty()) {
         id_break = var0.toArray(new HU[var0.size()]);
         id_class = true;
      }
   }

   public static boolean id_break() {
      return id_class;
   }
}
