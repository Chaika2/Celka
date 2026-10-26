package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class rij_3 extends rrrZ<rUo_1> {
   static final String[] else_ = new String[]{
      "ruined_portal/portal_1",
      "ruined_portal/portal_2",
      "ruined_portal/portal_3",
      "ruined_portal/portal_4",
      "ruined_portal/portal_5",
      "ruined_portal/portal_6",
      "ruined_portal/portal_7",
      "ruined_portal/portal_8",
      "ruined_portal/portal_9",
      "ruined_portal/portal_10"
   };
   static final String[] synchronized_ = new String[]{"ruined_portal/giant_portal_1", "ruined_portal/giant_portal_2", "ruined_portal/giant_portal_3"};

   public rij_3(Codec<rUo_1> var1) {
      super(var1);
   }

   private static int class_(Random var0, int var1, int var2) {
      return var0.nextInt(var2 - var1 + 1) + var1;
   }

   @Override
   public rrrv_1<rUo_1> class_() {
      return rig_3::new;
   }

   static int class_(Random var0, rKd_1 var1, riI_2 var2, boolean var3, int var4, int var5, rfi_3 var6) {
      int var7;
      if (var2 == riI_2.IN_NETHER) {
         if (var3) {
            var7 = class_(var0, 32, 100);
         } else if (var0.nextFloat() < 0.5F) {
            var7 = class_(var0, 27, 29);
         } else {
            var7 = class_(var0, 29, 100);
         }
      } else if (var2 == riI_2.IN_MOUNTAIN) {
         int var8 = var4 - var5;
         var7 = break_(var0, 70, var8);
      } else if (var2 == riI_2.UNDERGROUND) {
         int var17 = var4 - var5;
         var7 = break_(var0, 15, var17);
      } else if (var2 == riI_2.PARTLY_BURIED) {
         var7 = var4 - var5 + class_(var0, 2, 8);
      } else {
         var7 = var4;
      }

      ImmutableList var18 = ImmutableList.of(
         new rfH_2(var6.class_, 0, var6.byte_),
         new rfH_2(var6.protected_, 0, var6.byte_),
         new rfH_2(var6.class_, 0, var6.case_),
         new rfH_2(var6.protected_, 0, var6.case_)
      );
      List var9 = var18.stream().map(var1x -> var1.class_(var1x.b_(), var1x.d_())).collect(Collectors.toList());
      rKv_1 var10 = var2 == riI_2.ON_OCEAN_FLOOR ? rKv_1.OCEAN_FLOOR_WG : rKv_1.WORLD_SURFACE_WG;
      rfw_3 var11 = new rfw_3();

      int var12;
      for (var12 = var7; var12 > 15; var12--) {
         int var13 = 0;
         var11.class_(0, var12, 0);

         for (rRq_1 var15 : var9) {
            xc_3 var16 = var15.byte_(var11);
            if (var16 != null && var10.throws_().test(var16)) {
               if (++var13 == 3) {
                  return var12;
               }
            }
         }
      }

      return var12;
   }

   static boolean class_(rfH_2 var0, rYG var1) {
      return var1.class_(var0) < 0.15F;
   }

   private static int break_(Random var0, int var1, int var2) {
      return var1 < var2 ? class_(var0, var1, var2) : var2;
   }
}
