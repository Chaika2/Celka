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
   private rqO_2 class_;
   private final List<int[]> break_;
   private final int byte_;
   private final int protected_;

   public uZ_2(rqO_2 var1, int var2, int var3, List<int[]> var4) {
      this.class_ = new rqO_2(var1.byte_(), "textures/" + var1.break_());
      this.class_ = rrWv_1.break_(this.class_);
      this.break_ = var4;
      this.byte_ = var2;
      this.protected_ = var3;
   }

   private int class_(fN_2 var1, int var2, int var3, int var4, int var5) {
      int var6;
      for (var6 = var2 - 1; var6 >= 0; var6--) {
         int var7 = var4 * var2 + var6;

         for (int var8 = 0; var8 < var3; var8++) {
            int var9 = var5 * var3 + var8;
            if ((var1.break_(var7, var9) & 255) > 16) {
               return var6 + 1;
            }
         }
      }

      return var6 + 1;
   }

   @Override
   public uc_3 class_(rAL var1) {
      try {
         um_3 var30;
         try (rAF var2 = var1.class_(this.class_)) {
            fN_2 var3 = fN_2.class_(fc_3.RGBA, var2.break_());
            int var4 = var3.class_();
            int var5 = var3.break_();
            int var6 = var4 / this.break_.get(0).length;
            int var7 = var5 / this.break_.size();
            float var8 = (float)this.byte_ / (float)var7;
            Int2ObjectOpenHashMap var9 = new Int2ObjectOpenHashMap();
            Properties var10 = rrWv_1.class_(this.class_);
            Int2ObjectMap var11 = rrWv_1.class_(var10);
            Float var12 = (Float)var11.get(32);
            boolean var13 = rrWv_1.class_(var10, "blend", false);
            float var14 = rrWv_1.class_(var10, "offsetBold", -1.0F);
            if (var14 < 0.0F) {
               var14 = var6 > 8 ? 0.5F : 1.0F;
            }

            for (int var15 = 0; var15 < this.break_.size(); var15++) {
               int var16 = 0;

               for (int var20 : this.break_.get(var15)) {
                  int var21 = var16++;
                  if (var20 != 0 && var20 != 32) {
                     float var22 = (float)this.class_(var3, var6, var7, var21, var15);
                     Float var23 = (Float)var11.get(var20);
                     if (var23 != null) {
                        var22 = var23 * ((float)var6 / 8.0F);
                     }

                     uv_3 var24 = (uv_3)var9.put(
                        var20, new uv_3(var8, var3, var21 * var6, var15 * var7, var6, var7, (int)(0.5 + (double)(var22 * var8)) + 1, this.protected_)
                     );
                     if (var24 != null) {
                        um_3.class_.warn("Codepoint '{}' declared multiple times in {}", Integer.toHexString(var20), this.class_);
                     }

                     uv_3 var25 = (uv_3)var9.get(var20);
                     var25.implements_ = var14;
                  }
               }
            }

            um_3 var29 = new um_3(var3, var9);
            var29.protected_ = var13;
            if (var12 != null) {
               var29.throws_ = var12;
            }

            var30 = var29;
         }

         return var30;
      } catch (IOException var28) {
         throw new RuntimeException(var28.getMessage());
      }
   }

   public static uZ_2 class_(JsonObject var0) {
      int var1 = rpY_2.class_(var0, "height", 8);
      int var2 = rpY_2.extends_(var0, "ascent");
      if (var2 > var1) {
         throw new JsonParseException("Ascent " + var2 + " higher than height " + var1);
      } else {
         ArrayList var3 = Lists.newArrayList();
         JsonArray var4 = rpY_2.volatile_(var0, "chars");

         for (int var5 = 0; var5 < var4.size(); var5++) {
            String var6 = rpY_2.class_(var4.get(var5), "chars[" + var5 + "]");
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
            return new uZ_2(new rqO_2(rpY_2.case_(var0, "file")), var1, var2, var3);
         } else {
            throw new JsonParseException("Expected to find data in chars, found none.");
         }
      }
   }
}
