package celestial;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;

public class rrMs_1 {
   private static rrMS[] id_class = new rrMS[0];

   public static void id_class() {
      id_class = new rrMS[0];
      if (rrbb_3.i()) {
         String var0 = "optifine/natural.properties";

         try {
            rqO_2 var1 = new rqO_2(var0);
            if (!rrbb_3.id_byte(var1)) {
               rrbb_3.id_byte("NaturalTextures: configuration \"" + var0 + "\" not found");
               return;
            }

            boolean var2 = rrbb_3.id_protected(var1);
            InputStream var3 = rrbb_3.id_class(var1);
            ArrayList var4 = new ArrayList(256);
            String var5 = rrbb_3.id_break(var3);
            var3.close();
            String[] var6 = rrbb_3.id_class(var5, "\n\r");
            if (var2) {
               rrbb_3.id_byte("Natural Textures: Parsing default configuration \"" + var0 + "\"");
               rrbb_3.id_byte("Natural Textures: Valid only for textures from default resource pack");
            } else {
               rrbb_3.id_byte("Natural Textures: Parsing configuration \"" + var0 + "\"");
            }

            int var7 = 0;
            fJ_2 var8 = rrzJ_2.id_break();

            for (int var9 = 0; var9 < var6.length; var9++) {
               String var10 = var6[var9].trim();
               if (!var10.startsWith("#")) {
                  String[] var11 = rrbb_3.id_class(var10, "=");
                  if (var11.length != 2) {
                     rrbb_3.id_protected("Natural Textures: Invalid \"" + var0 + "\" line: " + var10);
                  } else {
                     String var12 = var11[0].trim();
                     String var13 = var11[1].trim();
                     fj_3 var14 = var8.id_break("minecraft:block/" + var12);
                     if (var14 == null) {
                        rrbb_3.id_protected("Natural Textures: Texture not found: \"" + var0 + "\" line: " + var10);
                     } else {
                        int var15 = var14.id_new();
                        if (var15 < 0) {
                           rrbb_3.id_protected("Natural Textures: Invalid \"" + var0 + "\" line: " + var10);
                        } else {
                           if (var2 && !rrbb_3.id_protected(new rqO_2("textures/block/" + var12 + ".png"))) {
                              return;
                           }

                           rrMS var16 = new rrMS(var13);
                           if (var16.id_class()) {
                              while (var4.size() <= var15) {
                                 var4.add(null);
                              }

                              var4.set(var15, var16);
                              var7++;
                           }
                        }
                     }
                  }
               }
            }

            id_class = var4.toArray(new rrMS[var4.size()]);
            if (var7 > 0) {
               rrbb_3.id_byte("NaturalTextures: " + var7);
            }
         } catch (FileNotFoundException var17) {
            rrbb_3.id_protected("NaturalTextures: configuration \"" + var0 + "\" not found");
            return;
         } catch (Exception var18) {
            var18.printStackTrace();
         }
      }
   }

   public static rrMS id_class(fj_3 var0) {
      if (!(var0 instanceof fj_3)) {
         return null;
      } else {
         int var1 = var0.id_new();
         return var1 >= 0 && var1 < id_class.length ? id_class[var1] : null;
      }
   }

   public static wK_2 id_class(rfH_2 var0, wK_2 var1) {
      fj_3 var2 = var1.id_case();
      if (var2 == null) {
         return var1;
      } else {
         rrMS var3 = id_class(var2);
         if (var3 == null) {
            return var1;
         } else {
            int var4 = rrbO_2.id_class(var1.id_protected());
            int var5 = rrbb_3.id_class(var0, var4);
            int var6 = 0;
            boolean var7 = false;
            if (var3.id_class > 1) {
               var6 = var5 & 3;
            }

            if (var3.id_class == 2) {
               var6 = var6 / 2 * 2;
            }

            if (var3.id_break) {
               var7 = (var5 & 4) != 0;
            }

            return var3.id_class(var1, var6, var7);
         }
      }
   }
}
