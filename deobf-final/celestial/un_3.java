package celestial;

import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class un_3 implements uc_3 {
   static final Logger class_ = LogManager.getLogger();
   private final rAL break_;
   private final byte[] byte_;
   private final String protected_;
   private final Map<rqO_2, fN_2> throws_ = Maps.newHashMap();

   public un_3(rAL var1, byte[] var2, String var3) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;

      for (int var4 = 0; var4 < 256; var4++) {
         int var5 = var4 * 256;
         rqO_2 var6 = this.break_(var5);

         try (
            rAF var7 = this.break_.class_(var6);
            fN_2 var8 = fN_2.class_(fc_3.RGBA, var7.break_());
         ) {
            if (var8.class_() == 256 && var8.break_() == 256) {
               for (int var9 = 0; var9 < 256; var9++) {
                  byte var10 = var2[var5 + var9];
                  if (var10 != 0 && class_(var10) > break_(var10)) {
                     var2[var5 + var9] = 0;
                  }
               }
               continue;
            }
         } catch (IOException var15) {
         }

         Arrays.fill(var2, var5, var5 + 256, (byte)0);
      }
   }

   private static int class_(byte var0) {
      return var0 >> 4 & 15;
   }

   @Override
   public IntSet class_() {
      IntOpenHashSet var1 = new IntOpenHashSet();

      for (int var2 = 0; var2 < 65535; var2++) {
         if (this.byte_[var2] != 0) {
            var1.add(var2);
         }
      }

      return var1;
   }

   private fN_2 class_(rqO_2 var1) {
      try {
         fN_2 var3;
         try (rAF var2 = this.break_.class_(var1)) {
            var3 = fN_2.class_(fc_3.RGBA, var2.break_());
         }

         return var3;
      } catch (IOException var7) {
         class_.error("Couldn't load texture {}", var1, var7);
         return null;
      }
   }

   @Override
   public uJ_2 class_(int var1) {
      if (var1 >= 0 && var1 <= 65535) {
         byte var2 = this.byte_[var1];
         if (var2 != 0) {
            fN_2 var3 = this.throws_.computeIfAbsent(this.break_(var1), this::class_);
            if (var3 != null) {
               int var4 = class_(var2);
               return new ul_3(var1 % 16 * 16 + var4, (var1 & 0xFF) / 16 * 16, break_(var2) - var4, 16, var3);
            }
         }

         return null;
      } else {
         return null;
      }
   }

   @Override
   public void close() {
      this.throws_.values().forEach(fN_2::close);
   }

   private static int break_(byte var0) {
      return (var0 & 15) + 1;
   }

   private rqO_2 break_(int var1) {
      rqO_2 var2 = new rqO_2(String.format(this.protected_, String.format("%02x", var1 / 256)));
      return new rqO_2(var2.byte_(), "textures/" + var2.break_());
   }
}
