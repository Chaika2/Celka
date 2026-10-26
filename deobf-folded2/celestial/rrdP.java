package celestial;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class rrdP {
   private static int[] id_class = null;
   private static boolean id_break;

   private static void id_class(InputStream var0, String var1, List<Integer> var2) {
      if (var0 != null) {
         try {
            var0 = rrdT.id_class(var0, var1, true);
            rrzE_2 var3 = new rrzE_2();
            var3.load(var0);
            var0.close();
            rrbb_3.id_byte("[Shaders] Parsing item mappings: " + var1);
            rrMz_1 var4 = new rrMz_1("Shaders");

            for (String var6 : var3.keySet()) {
               String var7 = var3.getProperty(var6);
               String var8 = "item.";
               if (!var6.startsWith(var8)) {
                  rrbb_3.id_protected("[Shaders] Invalid item ID: " + var6);
               } else {
                  String var9 = rrzX_2.id_protected(var6, var8);
                  int var10 = rrbb_3.id_class(var9, -1);
                  if (var10 < 0) {
                     rrbb_3.id_protected("[Shaders] Invalid item alias ID: " + var10);
                  } else {
                     int[] var11 = var4.id_package(var7);
                     if (var11 != null && var11.length >= 1) {
                        for (int var12 = 0; var12 < var11.length; var12++) {
                           int var13 = var11[var12];
                           id_class(var2, var13, var10);
                        }
                     } else {
                        rrbb_3.id_protected("[Shaders] Invalid item ID mapping: " + var6 + "=" + var7);
                     }
                  }
               }
            }
         } catch (IOException var14) {
            rrbb_3.id_protected("[Shaders] Error reading: " + var1);
         }
      }
   }

   private static int[] id_class(List<Integer> var0) {
      int[] var1 = new int[var0.size()];

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = (Integer)var0.get(var2);
      }

      return var1;
   }

   private static void id_class(List<Integer> var0, int var1, int var2) {
      while (var0.size() <= var1) {
         var0.add(-1);
      }

      var0.set(var1, var2);
   }

   public static void id_class() {
      if (id_break) {
         id_break = false;
         id_class(rrdZ.id_protected());
      }
   }

   public static void id_class(rrxi_3 var0) {
      id_break();
      if (var0 != null) {
         if (rrxr_3.Bx.id_byte() && QY.id_instanceof().F() == null) {
            rrbb_3.id_byte("[Shaders] Delayed loading of item mappings after resources are loaded");
            id_break = true;
         } else {
            ArrayList var1 = new ArrayList();
            String var2 = "/shaders/item.properties";
            InputStream var3 = var0.id_class(var2);
            if (var3 != null) {
               id_class(var3, var2, var1);
            }

            if (var1.size() > 0) {
               id_class = id_class(var1);
            }
         }
      }
   }

   public static int id_class(int var0) {
      if (id_class == null) {
         return -1;
      } else {
         return var0 >= 0 && var0 < id_class.length ? id_class[var0] : -1;
      }
   }

   public static void id_break() {
      id_class = null;
   }
}
