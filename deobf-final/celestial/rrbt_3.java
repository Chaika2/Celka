package celestial;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

public class rrbt_3 {
   private static rrbT_2[] class_ = null;
   private static int break_ = 0;

   private static Pair<rrbT_2[], Integer> byte_() {
      String var0 = "optifine/gui/loading/background";
      String var1 = ".png";
      String[] var2 = rrzM_2.class_(var0, var1);
      HashMap var3 = new HashMap();

      for (int var4 = 0; var4 < var2.length; var4++) {
         String var5 = var2[var4];
         String var6 = rrzX_2.byte_(var5, var0, var1);
         int var7 = rrbb_3.class_(var6, Integer.MIN_VALUE);
         if (var7 == Integer.MIN_VALUE) {
            class_("Invalid dimension ID: " + var6 + ", path: " + var5);
         } else {
            var3.put(var7, var5);
         }
      }

      Set var15 = var3.keySet();
      Integer[] var16 = var15.toArray(new Integer[var15.size()]);
      Arrays.sort(var16);
      if (var16.length <= 0) {
         return new ImmutablePair((rrbT_2[])null, 0);
      } else {
         String var17 = "optifine/gui/loading/loading.properties";
         Properties var18 = rrzM_2.break_(var17, "CustomLoadingScreens");
         int var8 = var16[0];
         int var9 = var16[var16.length - 1];
         int var10 = var9 - var8 + 1;
         rrbT_2[] var11 = new rrbT_2[var10];

         for (int var12 = 0; var12 < var16.length; var12++) {
            Integer var13 = var16[var12];
            String var14 = (String)var3.get(var13);
            var11[var13 - var8] = rrbT_2.class_(var14, var13, var18);
         }

         return new ImmutablePair(var11, var8);
      }
   }

   public static void class_(String var0) {
      rrbb_3.protected_("CustomLoadingScreen: " + var0);
   }

   public static rrbT_2 class_() {
      if (class_ == null) {
         return null;
      } else {
         rqM_2 var0 = ruZ_2.class_;
         if (var0 == null) {
            return null;
         } else {
            int var1 = rrzc_3.class_(var0);
            int var2 = var1 - break_;
            rrbT_2 var3 = null;
            if (var2 >= 0 && var2 < class_.length) {
               var3 = class_[var2];
            }

            return var3;
         }
      }
   }

   public static void break_(String var0) {
      rrbb_3.byte_("CustomLoadingScreen: " + var0);
   }

   public static void break_() {
      class_ = null;
      break_ = 0;
      Pair var0 = byte_();
      class_ = (rrbT_2[])var0.getLeft();
      break_ = (Integer)var0.getRight();
   }
}
