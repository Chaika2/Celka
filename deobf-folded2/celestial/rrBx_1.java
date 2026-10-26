package celestial;

import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import java.util.function.LongFunction;

public class rrBx_1 {
   private static final Int2IntMap id_class = rqR_2.id_class(new Int2IntOpenHashMap(), var0 -> {
      id_class(var0, rrBd_1.BEACH, 16);
      id_class(var0, rrBd_1.BEACH, 26);
      id_class(var0, rrBd_1.DESERT, 2);
      id_class(var0, rrBd_1.DESERT, 17);
      id_class(var0, rrBd_1.DESERT, 130);
      id_class(var0, rrBd_1.EXTREME_HILLS, 131);
      id_class(var0, rrBd_1.EXTREME_HILLS, 162);
      id_class(var0, rrBd_1.EXTREME_HILLS, 20);
      id_class(var0, rrBd_1.EXTREME_HILLS, 3);
      id_class(var0, rrBd_1.EXTREME_HILLS, 34);
      id_class(var0, rrBd_1.FOREST, 27);
      id_class(var0, rrBd_1.FOREST, 28);
      id_class(var0, rrBd_1.FOREST, 29);
      id_class(var0, rrBd_1.FOREST, 157);
      id_class(var0, rrBd_1.FOREST, 132);
      id_class(var0, rrBd_1.FOREST, 4);
      id_class(var0, rrBd_1.FOREST, 155);
      id_class(var0, rrBd_1.FOREST, 156);
      id_class(var0, rrBd_1.FOREST, 18);
      id_class(var0, rrBd_1.ICY, 140);
      id_class(var0, rrBd_1.ICY, 13);
      id_class(var0, rrBd_1.ICY, 12);
      id_class(var0, rrBd_1.JUNGLE, 168);
      id_class(var0, rrBd_1.JUNGLE, 169);
      id_class(var0, rrBd_1.JUNGLE, 21);
      id_class(var0, rrBd_1.JUNGLE, 23);
      id_class(var0, rrBd_1.JUNGLE, 22);
      id_class(var0, rrBd_1.JUNGLE, 149);
      id_class(var0, rrBd_1.JUNGLE, 151);
      id_class(var0, rrBd_1.MESA, 37);
      id_class(var0, rrBd_1.MESA, 165);
      id_class(var0, rrBd_1.MESA, 167);
      id_class(var0, rrBd_1.MESA, 166);
      id_class(var0, rrBd_1.BADLANDS_PLATEAU, 39);
      id_class(var0, rrBd_1.BADLANDS_PLATEAU, 38);
      id_class(var0, rrBd_1.MUSHROOM, 14);
      id_class(var0, rrBd_1.MUSHROOM, 15);
      id_class(var0, rrBd_1.NONE, 25);
      id_class(var0, rrBd_1.OCEAN, 46);
      id_class(var0, rrBd_1.OCEAN, 49);
      id_class(var0, rrBd_1.OCEAN, 50);
      id_class(var0, rrBd_1.OCEAN, 48);
      id_class(var0, rrBd_1.OCEAN, 24);
      id_class(var0, rrBd_1.OCEAN, 47);
      id_class(var0, rrBd_1.OCEAN, 10);
      id_class(var0, rrBd_1.OCEAN, 45);
      id_class(var0, rrBd_1.OCEAN, 0);
      id_class(var0, rrBd_1.OCEAN, 44);
      id_class(var0, rrBd_1.PLAINS, 1);
      id_class(var0, rrBd_1.PLAINS, 129);
      id_class(var0, rrBd_1.RIVER, 11);
      id_class(var0, rrBd_1.RIVER, 7);
      id_class(var0, rrBd_1.SAVANNA, 35);
      id_class(var0, rrBd_1.SAVANNA, 36);
      id_class(var0, rrBd_1.SAVANNA, 163);
      id_class(var0, rrBd_1.SAVANNA, 164);
      id_class(var0, rrBd_1.SWAMP, 6);
      id_class(var0, rrBd_1.SWAMP, 134);
      id_class(var0, rrBd_1.TAIGA, 160);
      id_class(var0, rrBd_1.TAIGA, 161);
      id_class(var0, rrBd_1.TAIGA, 32);
      id_class(var0, rrBd_1.TAIGA, 33);
      id_class(var0, rrBd_1.TAIGA, 30);
      id_class(var0, rrBd_1.TAIGA, 31);
      id_class(var0, rrBd_1.TAIGA, 158);
      id_class(var0, rrBd_1.TAIGA, 5);
      id_class(var0, rrBd_1.TAIGA, 19);
      id_class(var0, rrBd_1.TAIGA, 133);
   });

   protected static boolean id_class(int var0) {
      return var0 == 44 || var0 == 45 || var0 == 0 || var0 == 46 || var0 == 10 || var0 == 47 || var0 == 48 || var0 == 24 || var0 == 49 || var0 == 50;
   }

   private static void id_class(Int2IntOpenHashMap var0, rrBd_1 var1, int var2) {
      var0.put(var2, var1.ordinal());
   }

   private static <T extends rKj_1, C extends rKA<T>> rKV<T> id_class(boolean var0, int var1, int var2, LongFunction<C> var3) {
      rKV var4 = rrBX.INSTANCE.id_class((rKA)var3.apply(1L));
      var4 = rrBv_1.FUZZY.id_class((rKA)var3.apply(2000L), var4);
      var4 = rrBr_1.INSTANCE.id_class((rKA)var3.apply(1L), var4);
      var4 = rrBv_1.NORMAL.id_class((rKA)var3.apply(2001L), var4);
      var4 = rrBr_1.INSTANCE.id_class((rKA)var3.apply(2L), var4);
      var4 = rrBr_1.INSTANCE.id_class((rKA)var3.apply(50L), var4);
      var4 = rrBr_1.INSTANCE.id_class((rKA)var3.apply(70L), var4);
      var4 = rrBN.INSTANCE.id_class((rKA)var3.apply(2L), var4);
      rKV var5 = rrBz_1.INSTANCE.id_class((rKA)var3.apply(2L));
      var5 = id_class(2001L, rrBv_1.NORMAL, var5, 6, var3);
      var4 = rrBB.INSTANCE.id_class((rKA)var3.apply(2L), var4);
      var4 = rrBr_1.INSTANCE.id_class((rKA)var3.apply(3L), var4);
      var4 = rrBb_1.INSTANCE.id_class((rKA)var3.apply(2L), var4);
      var4 = rrBM.INSTANCE.id_class((rKA)var3.apply(2L), var4);
      var4 = rrBO.INSTANCE.id_class((rKA)var3.apply(3L), var4);
      var4 = rrBv_1.NORMAL.id_class((rKA)var3.apply(2002L), var4);
      var4 = rrBv_1.NORMAL.id_class((rKA)var3.apply(2003L), var4);
      var4 = rrBr_1.INSTANCE.id_class((rKA)var3.apply(4L), var4);
      var4 = rrBP.INSTANCE.id_class((rKA)var3.apply(5L), var4);
      var4 = rrBs_1.INSTANCE.id_class((rKA)var3.apply(4L), var4);
      var4 = id_class(1000L, rrBv_1.NORMAL, var4, 0, var3);
      rKV var6 = id_class(1000L, rrBv_1.NORMAL, var4, 0, var3);
      var6 = rrBZ.INSTANCE.id_class((rKA)var3.apply(100L), var6);
      rKV var7 = new rrBS(var0).id_class((rKA)var3.apply(200L), var4);
      var7 = rrPi_1.INSTANCE.id_class((rKA)var3.apply(1001L), var7);
      var7 = id_class(1000L, rrBv_1.NORMAL, var7, 2, var3);
      var7 = rrBE.INSTANCE.id_class((rKA)var3.apply(1000L), var7);
      rKV var8 = id_class(1000L, rrBv_1.NORMAL, var6, 2, var3);
      var7 = rrBh_1.INSTANCE.id_class((rKA)var3.apply(1000L), var7, var8);
      var6 = id_class(1000L, rrBv_1.NORMAL, var6, 2, var3);
      var6 = id_class(1000L, rrBv_1.NORMAL, var6, var2, var3);
      var6 = rrBc_1.INSTANCE.id_class((rKA)var3.apply(1L), var6);
      var6 = rrBm_1.INSTANCE.id_class((rKA)var3.apply(1000L), var6);
      var7 = rrBQ.INSTANCE.id_class((rKA)var3.apply(1001L), var7);

      for (int var9 = 0; var9 < var1; var9++) {
         var7 = rrBv_1.NORMAL.id_class((rKA)var3.apply((long)(1000 + var9)), var7);
         if (var9 == 0) {
            var7 = rrBr_1.INSTANCE.id_class((rKA)var3.apply(3L), var7);
         }

         if (var9 == 1 || var1 == 1) {
            var7 = rrBu_1.INSTANCE.id_class((rKA)var3.apply(1000L), var7);
         }
      }

      var7 = rrBm_1.INSTANCE.id_class((rKA)var3.apply(1000L), var7);
      var7 = rrBW.INSTANCE.id_class((rKA)var3.apply(100L), var7, var6);
      return rrBk_1.INSTANCE.id_class((rKA<T>)var3.apply(100L), var7, var5);
   }

   public static rrBJ id_class(long var0, boolean var2, int var3, int var4) {
      byte var5 = 25;
      rKV var6 = id_class(var2, var3, var4, var2x -> new rKp_1(25, var0, var2x));
      return new rrBJ(var6);
   }

   public static boolean id_class(int var0, int var1) {
      return var0 == var1 ? true : id_class.get(var0) == id_class.get(var1);
   }

   private static <T extends rKj_1, C extends rKA<T>> rKV<T> id_class(long var0, rrBn_1 var2, rKV<T> var3, int var4, LongFunction<C> var5) {
      rKV var6 = var3;

      for (int var7 = 0; var7 < var4; var7++) {
         var6 = var2.id_class((rKA)var5.apply(var0 + (long)var7), var6);
      }

      return var6;
   }

   protected static boolean id_break(int var0) {
      return var0 == 44 || var0 == 45 || var0 == 0 || var0 == 46 || var0 == 10;
   }
}
