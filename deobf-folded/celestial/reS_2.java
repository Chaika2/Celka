package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Set;

public class reS_2 extends rUO<rDv_1> {
   public static boolean id_byte(rKl_1 var0, rfH_2 var1) {
      return id_throws(var0, var1) || var0.id_class(var1, var0x -> var0x.id_class(rls_3.id_super));
   }

   public reS_2(Codec<rDv_1> var1) {
      super(var1);
   }

   private rjp_3 id_class(rRg_1 var1, rfi_3 var2, Set<rfH_2> var3, Set<rfH_2> var4) {
      ArrayList var5 = Lists.newArrayList();
      rjd_3 var6 = new rjd_3(var2.id_protected(), var2.id_throws(), var2.id_case());
      byte var7 = 6;

      for (int var8 = 0; var8 < 6; var8++) {
         var5.add(Sets.newHashSet());
      }

      rfw_3 var21 = new rfw_3();

      for (rfH_2 var10 : Lists.newArrayList(var4)) {
         if (var2.id_break(var10)) {
            var6.id_class(var10.b_() - var2.id_class, var10.c_() - var2.id_break, var10.d_() - var2.id_byte, true, true);
         }
      }

      for (rfH_2 var24 : Lists.newArrayList(var3)) {
         if (var2.id_break(var24)) {
            var6.id_class(var24.b_() - var2.id_class, var24.c_() - var2.id_break, var24.d_() - var2.id_byte, true, true);
         }

         for (rpr_3 var14 : rpr_3.values()) {
            var21.id_class(var24, var14);
            if (!var3.contains(var21)) {
               xc_3 var15 = var1.id_byte(var21);
               if (var15.id_break(rCT.N)) {
                  ((Set)var5.get(0)).add(var21.id_int());
                  id_break(var1, var21, var15.id_class(rCT.N, Integer.valueOf(1)));
                  if (var2.id_break(var21)) {
                     var6.id_class(var21.b_() - var2.id_class, var21.c_() - var2.id_break, var21.d_() - var2.id_byte, true, true);
                  }
               }
            }
         }
      }

      for (int var23 = 1; var23 < 6; var23++) {
         Set var25 = (Set)var5.get(var23 - 1);
         Set var26 = (Set)var5.get(var23);

         for (rfH_2 var28 : var25) {
            if (var2.id_break(var28)) {
               var6.id_class(var28.b_() - var2.id_class, var28.c_() - var2.id_break, var28.d_() - var2.id_byte, true, true);
            }

            for (rpr_3 var17 : rpr_3.values()) {
               var21.id_class(var28, var17);
               if (!var25.contains(var21) && !var26.contains(var21)) {
                  xc_3 var18 = var1.id_byte(var21);
                  if (var18.id_break(rCT.N)) {
                     int var19 = var18.id_byte(rCT.N);
                     if (var19 > var23 + 1) {
                        xc_3 var20 = var18.id_class(rCT.N, Integer.valueOf(var23 + 1));
                        id_break(var1, var21, var20);
                        if (var2.id_break(var21)) {
                           var6.id_class(var21.b_() - var2.id_class, var21.c_() - var2.id_break, var21.d_() - var2.id_byte, true, true);
                        }

                        var26.add(var21.id_int());
                     }
                  }
               }
            }
         }
      }

      return var6;
   }

   public final boolean id_class(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rDv_1 var5) {
      HashSet var6 = Sets.newHashSet();
      HashSet var7 = Sets.newHashSet();
      HashSet var8 = Sets.newHashSet();
      rfi_3 var9 = rfi_3.id_class();
      boolean var10 = this.id_class(var1, var3, var4, var6, var7, var9, var5);
      if (var9.id_class <= var9.id_protected && var10 && !var6.isEmpty()) {
         if (!var5.id_protected.isEmpty()) {
            ArrayList var11 = Lists.newArrayList(var6);
            ArrayList var12 = Lists.newArrayList(var7);
            var11.sort(Comparator.comparingInt(rja_3::c_));
            var12.sort(Comparator.comparingInt(rja_3::c_));
            var5.id_protected.forEach(var6x -> var6x.id_class(var1, var3, var11, var12, var8, var9));
         }

         rjp_3 var13 = this.id_class(var1, var9, var6, var8);
         rrPl_1.id_class(var1, 3, var13, var9.id_class, var9.id_break, var9.id_byte);
         return true;
      } else {
         return false;
      }
   }

   @Override
   protected void id_class(rRY var1, rfH_2 var2, xc_3 var3) {
      id_break(var1, var2, var3);
   }

   private int id_class(rKl_1 var1, int var2, rfH_2 var3, rDv_1 var4) {
      rfw_3 var5 = new rfw_3();

      for (int var6 = 0; var6 <= var2 + 1; var6++) {
         int var7 = var4.id_private.id_class(var2, var6);

         for (int var8 = -var7; var8 <= var7; var8++) {
            for (int var9 = -var7; var9 <= var7; var9++) {
               var5.id_class(var3, var8, var6, var9);
               if (!id_byte(var1, var5) || !var4.id_finally && id_case(var1, var5)) {
                  return var6 - 2;
               }
            }
         }
      }

      return var2;
   }

   private boolean id_class(rKH var1, Random var2, rfH_2 var3, Set<rfH_2> var4, Set<rfH_2> var5, rfi_3 var6, rDv_1 var7) {
      int var8 = var7.id_catch.id_class(var2);
      int var9 = var7.id_case.id_class(var2, var8, var7);
      int var10 = var8 - var9;
      int var11 = var7.id_case.id_class(var2, var10);
      rfH_2 var12;
      if (!var7.id_throws) {
         int var13 = var1.id_class(rKv_1.OCEAN_FLOOR, var3).c_();
         int var14 = var1.id_class(rKv_1.WORLD_SURFACE, var3).c_();
         if (var14 - var13 > var7.id_implements) {
            return false;
         }

         int var15;
         if (var7.id_extends == rKv_1.OCEAN_FLOOR) {
            var15 = var13;
         } else if (var7.id_extends == rKv_1.WORLD_SURFACE) {
            var15 = var14;
         } else {
            var15 = var1.id_class(var7.id_extends, var3).c_();
         }

         var12 = new rfH_2(var3.b_(), var15, var3.d_());
      } else {
         var12 = var3;
      }

      if (var12.c_() < 1 || var12.c_() + var8 + 1 > 256) {
         return false;
      } else if (!id_private(var1, var12.id_break())) {
         return false;
      } else {
         OptionalInt var16 = var7.id_private.id_byte();
         int var17 = this.id_class(var1, var8, var12, var7);
         if (var17 < var8 && (!var16.isPresent() || var17 < var16.getAsInt())) {
            return false;
         } else {
            List var18 = var7.id_catch.id_class(var1, var2, var17, var12, var4, var6, var7);
            var18.forEach(var8x -> var7.id_case.id_class(var1, var2, var7, var17, var8x, var9, var11, var5, var6));
            return true;
         }
      }
   }

   public static void id_break(rRY var0, rfH_2 var1, xc_3 var2) {
      var0.id_class(var1, var2, 19);
   }

   public static boolean id_throws(rKl_1 var0, rfH_2 var1) {
      return id_protected(var0, var1) || id_implements(var0, var1) || id_catch(var0, var1);
   }

   private static boolean id_catch(rKl_1 var0, rfH_2 var1) {
      return var0.id_class(var1, var0x -> var0x.id_class(xu_3.id_try));
   }

   private static boolean id_case(rKl_1 var0, rfH_2 var1) {
      return var0.id_class(var1, var0x -> var0x.id_class(xu_3.BD));
   }

   private static boolean id_implements(rKl_1 var0, rfH_2 var1) {
      return var0.id_class(var1, var0x -> {
         QP var1x = var0x.id_byte();
         return var1x == QP.id_catch;
      });
   }

   public static boolean id_protected(rKl_1 var0, rfH_2 var1) {
      return var0.id_class(var1, var0x -> var0x.id_catch() || var0x.id_class(rls_3.id_void));
   }

   private static boolean id_private(rKl_1 var0, rfH_2 var1) {
      return var0.id_class(var1, var0x -> {
         xd_3 var1x = var0x.id_break();
         return id_break(var1x) || var1x == xu_3.PS;
      });
   }
}
