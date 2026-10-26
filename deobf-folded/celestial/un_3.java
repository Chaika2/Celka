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
   static final Logger id_class = LogManager.getLogger();
   private final rAL id_break;
   private final byte[] id_byte;
   private final String id_protected;
   private final Map<rqO_2, fN_2> id_throws = Maps.newHashMap();

   public un_3(rAL var1, byte[] var2, String var3) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;

      for (int var4 = 0; var4 < 256; var4++) {
         int var5 = var4 * 256;
         rqO_2 var6 = this.id_break(var5);

         try (
            rAF var7 = this.id_break.id_class(var6);
            fN_2 var8 = fN_2.id_class(fc_3.RGBA, var7.id_break());
         ) {
            if (var8.id_class() == 256 && var8.id_break() == 256) {
               for (int var9 = 0; var9 < 256; var9++) {
                  byte var10 = var2[var5 + var9];
                  if (var10 != 0 && id_class(var10) > id_break(var10)) {
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

   private static int id_class(byte var0) {
      return var0 >> 4 & 15;
   }

   @Override
   public IntSet id_class() {
      IntOpenHashSet var1 = new IntOpenHashSet();

      for (int var2 = 0; var2 < 65535; var2++) {
         if (this.id_byte[var2] != 0) {
            var1.add(var2);
         }
      }

      return var1;
   }

   private fN_2 id_class(rqO_2 var1) {
      try {
         fN_2 var3;
         try (rAF var2 = this.id_break.id_class(var1)) {
            var3 = fN_2.id_class(fc_3.RGBA, var2.id_break());
         }

         return var3;
      } catch (IOException var7) {
         id_class.error("Couldn't load texture {}", var1, var7);
         return null;
      }
   }

   @Override
   public uJ_2 id_class(int var1) {
      if (var1 >= 0 && var1 <= 65535) {
         byte var2 = this.id_byte[var1];
         if (var2 != 0) {
            fN_2 var3 = this.id_throws.computeIfAbsent(this.id_break(var1), this::id_class);
            if (var3 != null) {
               int var4 = id_class(var2);
               return new ul_3(var1 % 16 * 16 + var4, (var1 & 0xFF) / 16 * 16, id_break(var2) - var4, 16, var3);
            }
         }

         return null;
      } else {
         return null;
      }
   }

   @Override
   public void close() {
      this.id_throws.values().forEach(fN_2::close);
   }

   private static int id_break(byte var0) {
      return (var0 & 15) + 1;
   }

   private rqO_2 id_break(int var1) {
      rqO_2 var2 = new rqO_2(String.format(this.id_protected, String.format("%02x", var1 / 256)));
      return new rqO_2(var2.id_byte(), "textures/" + var2.id_break());
   }
}
