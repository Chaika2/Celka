package celestial;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class uZ_2 implements uu_3 {
   private rqO_2 id_class;
   private final List<int[]> id_break;
   private final int id_byte;
   private final int id_protected;

   public uZ_2(rqO_2 var1, int var2, int var3, List<int[]> var4) {
      this.id_class = new rqO_2(var1.id_byte(), "textures/" + var1.id_break());
      this.id_class = rrWv_1.id_break(this.id_class);
      this.id_break = var4;
      this.id_byte = var2;
      this.id_protected = var3;
   }

   private int id_class(fN_2 var1, int var2, int var3, int var4, int var5) {
      int var6;
      for (var6 = var2 - 1; var6 >= 0; var6--) {
         int var7 = var4 * var2 + var6;

         for (int var8 = 0; var8 < var3; var8++) {
            int var9 = var5 * var3 + var8;
            if ((var1.id_break(var7, var9) & 255) > 16) {
               return var6 + 1;
            }
         }
      }

      return var6 + 1;
   }

   @Override
   public uc_3 id_class(rAL var1) {
      try {
         um_3 var30;
         try (rAF var2 = var1.id_class(this.id_class)) {
            fN_2 var3 = fN_2.id_class(fc_3.RGBA, var2.id_break());
            int var4 = var3.id_class();
            int var5 = var3.id_break();
            int var6 = var4 / this.id_break.get(0).length;
            int var7 = var5 / this.id_break.size();
            float var8 = (float)this.id_byte / (float)var7;
            Int2ObjectOpenHashMap var9 = new Int2ObjectOpenHashMap();
            Properties var10 = rrWv_1.id_class(this.id_class);
            Int2ObjectMap var11 = rrWv_1.id_class(var10);
            Float var12 = (Float)var11.get(32);
            boolean var13 = rrWv_1.id_class(var10, "blend", false);
            float var14 = rrWv_1.id_class(var10, "offsetBold", -1.0F);
            if (var14 < 0.0F) {
               var14 = var6 > 8 ? 0.5F : 1.0F;
            }

            for (int var15 = 0; var15 < this.id_break.size(); var15++) {
               int var16 = 0;

               for (int var20 : this.id_break.get(var15)) {
                  int var21 = var16++;
                  if (var20 != 0 && var20 != 32) {
                     float var22 = (float)this.id_class(var3, var6, var7, var21, var15);
                     Float var23 = (Float)var11.get(var20);
                     if (var23 != null) {
                        var22 = var23 * ((float)var6 / 8.0F);
                     }

                     uv_3 var24 = (uv_3)var9.put(
                        var20, new uv_3(var8, var3, var21 * var6, var15 * var7, var6, var7, (int)(0.5 + (double)(var22 * var8)) + 1, this.id_protected)
                     );
                     if (var24 != null) {
                        um_3.id_class.warn("Codepoint '{}' declared multiple times in {}", Integer.toHexString(var20), this.id_class);
                     }

                     uv_3 var25 = (uv_3)var9.get(var20);
                     var25.id_implements = var14;
                  }
               }
            }

            um_3 var29 = new um_3(var3, var9);
            var29.id_protected = var13;
            if (var12 != null) {
               var29.id_throws = var12;
            }

            var30 = var29;
         }

         return var30;
      } catch (IOException var28) {
         throw new RuntimeException(var28.getMessage());
      }
   }

   public static uZ_2 id_class(JsonObject var0) {
      int var1 = rpY_2.id_class(var0, "height", 8);
      int var2 = rpY_2.id_extends(var0, "ascent");
      if (var2 > var1) {
         throw new JsonParseException("Ascent " + var2 + " higher than height " + var1);
      } else {
         ArrayList var3 = Lists.newArrayList();
         JsonArray var4 = rpY_2.id_volatile(var0, "chars");

         for (int var5 = 0; var5 < var4.size(); var5++) {
            String var6 = rpY_2.id_class(var4.get(var5), "chars[" + var5 + "]");
            int[] var7 = var6.codePoints().toArray();
            if (var5 > 0) {
               int var8 = ((int[])var3.get(0)).length;
               if (var7.length != var8) {
                  throw new JsonParseException(
                     "Elements of chars have to be the same length (found: " + var7.length + ", expected: " + var8 + "), pad with space or \\u0000"
                  );
               }
            }

            var3.add(var7);
         }

         if (!var3.isEmpty() && ((int[])var3.get(0)).length != 0) {
            return new uZ_2(new rqO_2(rpY_2.id_case(var0, "file")), var1, var2, var3);
         } else {
            throw new JsonParseException("Expected to find data in chars, found none.");
         }
      }
   }
}
