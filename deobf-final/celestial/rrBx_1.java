package celestial;

import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import java.util.function.LongFunction;

public class rrBx_1 {
   private static final Int2IntMap class_ = rqR_2.class_(new Int2IntOpenHashMap(), var0 -> {
      class_(var0, rrBd_1.BEACH, 16);
      class_(var0, rrBd_1.BEACH, 26);
      class_(var0, rrBd_1.DESERT, 2);
      class_(var0, rrBd_1.DESERT, 17);
      class_(var0, rrBd_1.DESERT, 130);
      class_(var0, rrBd_1.EXTREME_HILLS, 131);
      class_(var0, rrBd_1.EXTREME_HILLS, 162);
      class_(var0, rrBd_1.EXTREME_HILLS, 20);
      class_(var0, rrBd_1.EXTREME_HILLS, 3);
      class_(var0, rrBd_1.EXTREME_HILLS, 34);
      class_(var0, rrBd_1.FOREST, 27);
      class_(var0, rrBd_1.FOREST, 28);
      class_(var0, rrBd_1.FOREST, 29);
      class_(var0, rrBd_1.FOREST, 157);
      class_(var0, rrBd_1.FOREST, 132);
      class_(var0, rrBd_1.FOREST, 4);
      class_(var0, rrBd_1.FOREST, 155);
      class_(var0, rrBd_1.FOREST, 156);
      class_(var0, rrBd_1.FOREST, 18);
      class_(var0, rrBd_1.ICY, 140);
      class_(var0, rrBd_1.ICY, 13);
      class_(var0, rrBd_1.ICY, 12);
      class_(var0, rrBd_1.JUNGLE, 168);
      class_(var0, rrBd_1.JUNGLE, 169);
      class_(var0, rrBd_1.JUNGLE, 21);
      class_(var0, rrBd_1.JUNGLE, 23);
      class_(var0, rrBd_1.JUNGLE, 22);
      class_(var0, rrBd_1.JUNGLE, 149);
      class_(var0, rrBd_1.JUNGLE, 151);
      class_(var0, rrBd_1.MESA, 37);
      class_(var0, rrBd_1.MESA, 165);
      class_(var0, rrBd_1.MESA, 167);
      class_(var0, rrBd_1.MESA, 166);
      class_(var0, rrBd_1.BADLANDS_PLATEAU, 39);
      class_(var0, rrBd_1.BADLANDS_PLATEAU, 38);
      class_(var0, rrBd_1.MUSHROOM, 14);
      class_(var0, rrBd_1.MUSHROOM, 15);
      class_(var0, rrBd_1.NONE, 25);
      class_(var0, rrBd_1.OCEAN, 46);
      class_(var0, rrBd_1.OCEAN, 49);
      class_(var0, rrBd_1.OCEAN, 50);
      class_(var0, rrBd_1.OCEAN, 48);
      class_(var0, rrBd_1.OCEAN, 24);
      class_(var0, rrBd_1.OCEAN, 47);
      class_(var0, rrBd_1.OCEAN, 10);
      class_(var0, rrBd_1.OCEAN, 45);
      class_(var0, rrBd_1.OCEAN, 0);
      class_(var0, rrBd_1.OCEAN, 44);
      class_(var0, rrBd_1.PLAINS, 1);
      class_(var0, rrBd_1.PLAINS, 129);
      class_(var0, rrBd_1.RIVER, 11);
      class_(var0, rrBd_1.RIVER, 7);
      class_(var0, rrBd_1.SAVANNA, 35);
      class_(var0, rrBd_1.SAVANNA, 36);
      class_(var0, rrBd_1.SAVANNA, 163);
      class_(var0, rrBd_1.SAVANNA, 164);
      class_(var0, rrBd_1.SWAMP, 6);
      class_(var0, rrBd_1.SWAMP, 134);
      class_(var0, rrBd_1.TAIGA, 160);
      class_(var0, rrBd_1.TAIGA, 161);
      class_(var0, rrBd_1.TAIGA, 32);
      class_(var0, rrBd_1.TAIGA, 33);
      class_(var0, rrBd_1.TAIGA, 30);
      class_(var0, rrBd_1.TAIGA, 31);
      class_(var0, rrBd_1.TAIGA, 158);
      class_(var0, rrBd_1.TAIGA, 5);
      class_(var0, rrBd_1.TAIGA, 19);
      class_(var0, rrBd_1.TAIGA, 133);
   });

   protected static boolean class_(int var0) {
      return var0 == 44 || var0 == 45 || var0 == 0 || var0 == 46 || var0 == 10 || var0 == 47 || var0 == 48 || var0 == 24 || var0 == 49 || var0 == 50;
   }

   private static void class_(Int2IntOpenHashMap var0, rrBd_1 var1, int var2) {
      var0.put(var2, var1.ordinal());
   }

   private static <T extends rKj_1, C extends rKA<T>> rKV<T> class_(boolean var0, int var1, int var2, LongFunction<C> var3) {
      rKV var4 = rrBX.INSTANCE.class_((rKA)var3.apply(1L));
      var4 = rrBv_1.FUZZY.class_((rKA)var3.apply(2000L), var4);
      var4 = rrBr_1.INSTANCE.class_((rKA)var3.apply(1L), var4);
      var4 = rrBv_1.NORMAL.class_((rKA)var3.apply(2001L), var4);
      var4 = rrBr_1.INSTANCE.class_((rKA)var3.apply(2L), var4);
      var4 = rrBr_1.INSTANCE.class_((rKA)var3.apply(50L), var4);
      var4 = rrBr_1.INSTANCE.class_((rKA)var3.apply(70L), var4);
      var4 = rrBN.INSTANCE.class_((rKA)var3.apply(2L), var4);
      rKV var5 = rrBz_1.INSTANCE.class_((rKA)var3.apply(2L));
      var5 = class_(2001L, rrBv_1.NORMAL, var5, 6, var3);
      var4 = rrBB.INSTANCE.class_((rKA)var3.apply(2L), var4);
      var4 = rrBr_1.INSTANCE.class_((rKA)var3.apply(3L), var4);
      var4 = rrBb_1.INSTANCE.class_((rKA)var3.apply(2L), var4);
      var4 = rrBM.INSTANCE.class_((rKA)var3.apply(2L), var4);
      var4 = rrBO.INSTANCE.class_((rKA)var3.apply(3L), var4);
      var4 = rrBv_1.NORMAL.class_((rKA)var3.apply(2002L), var4);
      var4 = rrBv_1.NORMAL.class_((rKA)var3.apply(2003L), var4);
      var4 = rrBr_1.INSTANCE.class_((rKA)var3.apply(4L), var4);
      var4 = rrBP.INSTANCE.class_((rKA)var3.apply(5L), var4);
      var4 = rrBs_1.INSTANCE.class_((rKA)var3.apply(4L), var4);
      var4 = class_(1000L, rrBv_1.NORMAL, var4, 0, var3);
      rKV var6 = class_(1000L, rrBv_1.NORMAL, var4, 0, var3);
      var6 = rrBZ.INSTANCE.class_((rKA)var3.apply(100L), var6);
      rKV var7 = new rrBS(var0).class_((rKA)var3.apply(200L), var4);
      var7 = rrPi_1.INSTANCE.class_((rKA)var3.apply(1001L), var7);
      var7 = class_(1000L, rrBv_1.NORMAL, var7, 2, var3);
      var7 = rrBE.INSTANCE.class_((rKA)var3.apply(1000L), var7);
      rKV var8 = class_(1000L, rrBv_1.NORMAL, var6, 2, var3);
      var7 = rrBh_1.INSTANCE.class_((rKA)var3.apply(1000L), var7, var8);
      var6 = class_(1000L, rrBv_1.NORMAL, var6, 2, var3);
      var6 = class_(1000L, rrBv_1.NORMAL, var6, var2, var3);
      var6 = rrBc_1.INSTANCE.class_((rKA)var3.apply(1L), var6);
      var6 = rrBm_1.INSTANCE.class_((rKA)var3.apply(1000L), var6);
      var7 = rrBQ.INSTANCE.class_((rKA)var3.apply(1001L), var7);

      for (int var9 = 0; var9 < var1; var9++) {
         var7 = rrBv_1.NORMAL.class_((rKA)var3.apply((long)(1000 + var9)), var7);
         if (var9 == 0) {
            var7 = rrBr_1.INSTANCE.class_((rKA)var3.apply(3L), var7);
         }

         if (var9 == 1 || var1 == 1) {
            var7 = rrBu_1.INSTANCE.class_((rKA)var3.apply(1000L), var7);
         }
      }

      var7 = rrBm_1.INSTANCE.class_((rKA)var3.apply(1000L), var7);
      var7 = rrBW.INSTANCE.class_((rKA)var3.apply(100L), var7, var6);
      return rrBk_1.INSTANCE.class_((rKA<T>)var3.apply(100L), var7, var5);
   }

   public static rrBJ class_(long var0, boolean var2, int var3, int var4) {
      byte var5 = 25;
      rKV var6 = class_(var2, var3, var4, var2x -> new rKp_1(25, var0, var2x));
      return new rrBJ(var6);
   }

   public static boolean class_(int var0, int var1) {
      return var0 == var1 ? true : class_.get(var0) == class_.get(var1);
   }

   private static <T extends rKj_1, C extends rKA<T>> rKV<T> class_(long var0, rrBn_1 var2, rKV<T> var3, int var4, LongFunction<C> var5) {
      rKV var6 = var3;

      for (int var7 = 0; var7 < var4; var7++) {
         var6 = var2.class_((rKA)var5.apply(var0 + (long)var7), var6);
      }

      return var6;
   }

   protected static boolean break_(int var0) {
      return var0 == 44 || var0 == 45 || var0 == 0 || var0 == 46 || var0 == 10;
   }
}
