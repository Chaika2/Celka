package celestial;

import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public enum rrBh_1 implements rrBC, rrBT {
   INSTANCE;

   private static final Logger LOGGER = LogManager.getLogger();
   private static final Int2IntMap field_242940_c = rqR_2.class_(new Int2IntOpenHashMap(), var0 -> {
      var0.put(1, 129);
      var0.put(2, 130);
      var0.put(3, 131);
      var0.put(4, 132);
      var0.put(5, 133);
      var0.put(6, 134);
      var0.put(12, 140);
      var0.put(21, 149);
      var0.put(23, 151);
      var0.put(27, 155);
      var0.put(28, 156);
      var0.put(29, 157);
      var0.put(30, 158);
      var0.put(32, 160);
      var0.put(33, 161);
      var0.put(34, 162);
      var0.put(35, 163);
      var0.put(36, 164);
      var0.put(37, 165);
      var0.put(38, 166);
      var0.put(39, 167);
   });

   @Override
   public int class_(rKC var1, rKj_1 var2, rKj_1 var3, int var4, int var5) {
      int var6 = var2.class_(this.class_(var4 + 1), this.break_(var5 + 1));
      int var7 = var3.class_(this.class_(var4 + 1), this.break_(var5 + 1));
      if (var6 > 255) {
         LOGGER.debug("old! {}", var6);
      }

      int var8 = (var7 - 2) % 29;
      if (!rrBx_1.break_(var6) && var7 >= 2 && var8 == 1) {
         return field_242940_c.getOrDefault(var6, var6);
      } else {
         if (var1.class_(3) == 0 || var8 == 0) {
            int var9 = var6;
            if (var6 == 2) {
               var9 = 17;
            } else if (var6 == 4) {
               var9 = 18;
            } else if (var6 == 27) {
               var9 = 28;
            } else if (var6 == 29) {
               var9 = 1;
            } else if (var6 == 5) {
               var9 = 19;
            } else if (var6 == 32) {
               var9 = 33;
            } else if (var6 == 30) {
               var9 = 31;
            } else if (var6 == 1) {
               var9 = var1.class_(3) == 0 ? 18 : 4;
            } else if (var6 == 12) {
               var9 = 13;
            } else if (var6 == 21) {
               var9 = 22;
            } else if (var6 == 168) {
               var9 = 169;
            } else if (var6 == 0) {
               var9 = 24;
            } else if (var6 == 45) {
               var9 = 48;
            } else if (var6 == 46) {
               var9 = 49;
            } else if (var6 == 10) {
               var9 = 50;
            } else if (var6 == 3) {
               var9 = 34;
            } else if (var6 == 35) {
               var9 = 36;
            } else if (rrBx_1.class_(var6, 38)) {
               var9 = 37;
            } else if ((var6 == 24 || var6 == 48 || var6 == 49 || var6 == 50) && var1.class_(3) == 0) {
               var9 = var1.class_(2) == 0 ? 1 : 4;
            }

            if (var8 == 0 && var9 != var6) {
               var9 = field_242940_c.getOrDefault(var9, var6);
            }

            if (var9 != var6) {
               int var10 = 0;
               if (rrBx_1.class_(var2.class_(this.class_(var4 + 1), this.break_(var5 + 0)), var6)) {
                  var10++;
               }

               if (rrBx_1.class_(var2.class_(this.class_(var4 + 2), this.break_(var5 + 1)), var6)) {
                  var10++;
               }

               if (rrBx_1.class_(var2.class_(this.class_(var4 + 0), this.break_(var5 + 1)), var6)) {
                  var10++;
               }

               if (rrBx_1.class_(var2.class_(this.class_(var4 + 1), this.break_(var5 + 2)), var6)) {
                  var10++;
               }

               if (var10 >= 3) {
                  return var9;
               }
            }
         }

         return var6;
      }
   }
}
