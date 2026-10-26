package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class riC_2 {
   private static final rqO_2[] class_ = new rqO_2[]{
      new rqO_2("underwater_ruin/warm_1"),
      new rqO_2("underwater_ruin/warm_2"),
      new rqO_2("underwater_ruin/warm_3"),
      new rqO_2("underwater_ruin/warm_4"),
      new rqO_2("underwater_ruin/warm_5"),
      new rqO_2("underwater_ruin/warm_6"),
      new rqO_2("underwater_ruin/warm_7"),
      new rqO_2("underwater_ruin/warm_8")
   };
   private static final rqO_2[] break_ = new rqO_2[]{
      new rqO_2("underwater_ruin/brick_1"),
      new rqO_2("underwater_ruin/brick_2"),
      new rqO_2("underwater_ruin/brick_3"),
      new rqO_2("underwater_ruin/brick_4"),
      new rqO_2("underwater_ruin/brick_5"),
      new rqO_2("underwater_ruin/brick_6"),
      new rqO_2("underwater_ruin/brick_7"),
      new rqO_2("underwater_ruin/brick_8")
   };
   private static final rqO_2[] byte_ = new rqO_2[]{
      new rqO_2("underwater_ruin/cracked_1"),
      new rqO_2("underwater_ruin/cracked_2"),
      new rqO_2("underwater_ruin/cracked_3"),
      new rqO_2("underwater_ruin/cracked_4"),
      new rqO_2("underwater_ruin/cracked_5"),
      new rqO_2("underwater_ruin/cracked_6"),
      new rqO_2("underwater_ruin/cracked_7"),
      new rqO_2("underwater_ruin/cracked_8")
   };
   private static final rqO_2[] protected_ = new rqO_2[]{
      new rqO_2("underwater_ruin/mossy_1"),
      new rqO_2("underwater_ruin/mossy_2"),
      new rqO_2("underwater_ruin/mossy_3"),
      new rqO_2("underwater_ruin/mossy_4"),
      new rqO_2("underwater_ruin/mossy_5"),
      new rqO_2("underwater_ruin/mossy_6"),
      new rqO_2("underwater_ruin/mossy_7"),
      new rqO_2("underwater_ruin/mossy_8")
   };
   private static final rqO_2[] throws_ = new rqO_2[]{
      new rqO_2("underwater_ruin/big_brick_1"),
      new rqO_2("underwater_ruin/big_brick_2"),
      new rqO_2("underwater_ruin/big_brick_3"),
      new rqO_2("underwater_ruin/big_brick_8")
   };
   private static final rqO_2[] case_ = new rqO_2[]{
      new rqO_2("underwater_ruin/big_mossy_1"),
      new rqO_2("underwater_ruin/big_mossy_2"),
      new rqO_2("underwater_ruin/big_mossy_3"),
      new rqO_2("underwater_ruin/big_mossy_8")
   };
   private static final rqO_2[] catch_ = new rqO_2[]{
      new rqO_2("underwater_ruin/big_cracked_1"),
      new rqO_2("underwater_ruin/big_cracked_2"),
      new rqO_2("underwater_ruin/big_cracked_3"),
      new rqO_2("underwater_ruin/big_cracked_8")
   };
   private static final rqO_2[] private_ = new rqO_2[]{
      new rqO_2("underwater_ruin/big_warm_4"),
      new rqO_2("underwater_ruin/big_warm_5"),
      new rqO_2("underwater_ruin/big_warm_6"),
      new rqO_2("underwater_ruin/big_warm_7")
   };

   private static void class_(rrPt_1 var0, rfH_2 var1, rqd_3 var2, List<rrrn_1> var3, Random var4, rin_3 var5, boolean var6, float var7) {
      if (var5.break_ == rip_3.WARM) {
         rqO_2 var8 = var6 ? break_(var4) : class_(var4);
         var3.add(new ril_3(var0, var8, var1, var2, var7, var5.break_, var6));
      } else if (var5.break_ == rip_3.COLD) {
         rqO_2[] var12 = var6 ? throws_ : break_;
         rqO_2[] var9 = var6 ? catch_ : byte_;
         rqO_2[] var10 = var6 ? case_ : protected_;
         int var11 = var4.nextInt(var12.length);
         var3.add(new ril_3(var0, var12[var11], var1, var2, var7, var5.break_, var6));
         var3.add(new ril_3(var0, var9[var11], var1, var2, 0.7F, var5.break_, var6));
         var3.add(new ril_3(var0, var10[var11], var1, var2, 0.5F, var5.break_, var6));
      }
   }

   private static void class_(rrPt_1 var0, Random var1, rqd_3 var2, rfH_2 var3, rin_3 var4, List<rrrn_1> var5) {
      int var6 = var3.b_();
      int var7 = var3.d_();
      rfH_2 var8 = rrPl_1.class_(new rfH_2(15, 0, 15), rpa_3.NONE, var2, rfH_2.protected_).break_(var6, 0, var7);
      rfi_3 var9 = rfi_3.class_(var6, 0, var7, var8.b_(), 0, var8.d_());
      rfH_2 var10 = new rfH_2(Math.min(var6, var8.b_()), 0, Math.min(var7, var8.d_()));
      List var11 = class_(var1, var10.b_(), var10.d_());
      int var12 = rfU_2.class_(var1, 4, 8);

      for (int var13 = 0; var13 < var12; var13++) {
         if (!var11.isEmpty()) {
            int var14 = var1.nextInt(var11.size());
            rfH_2 var15 = (rfH_2)var11.remove(var14);
            int var16 = var15.b_();
            int var17 = var15.d_();
            rqd_3 var18 = rqd_3.class_(var1);
            rfH_2 var19 = rrPl_1.class_(new rfH_2(5, 0, 6), rpa_3.NONE, var18, rfH_2.protected_).break_(var16, 0, var17);
            rfi_3 var20 = rfi_3.class_(var16, 0, var17, var19.b_(), 0, var19.d_());
            if (!var20.class_(var9)) {
               class_(var0, var15, var18, var5, var1, var4, false, 0.8F);
            }
         }
      }
   }

   private static rqO_2 class_(Random var0) {
      return rqR_2.class_(class_, var0);
   }

   public static void class_(rrPt_1 var0, rfH_2 var1, rqd_3 var2, List<rrrn_1> var3, Random var4, rin_3 var5) {
      boolean var6 = var4.nextFloat() <= var5.byte_;
      float var7 = var6 ? 0.9F : 0.8F;
      class_(var0, var1, var2, var3, var4, var5, var6, var7);
      if (var6 && var4.nextFloat() <= var5.protected_) {
         class_(var0, var4, var2, var1, var5, var3);
      }
   }

   private static List<rfH_2> class_(Random var0, int var1, int var2) {
      ArrayList var3 = Lists.newArrayList();
      var3.add(new rfH_2(var1 - 16 + rfU_2.class_(var0, 1, 8), 90, var2 + 16 + rfU_2.class_(var0, 1, 7)));
      var3.add(new rfH_2(var1 - 16 + rfU_2.class_(var0, 1, 8), 90, var2 + rfU_2.class_(var0, 1, 7)));
      var3.add(new rfH_2(var1 - 16 + rfU_2.class_(var0, 1, 8), 90, var2 - 16 + rfU_2.class_(var0, 4, 8)));
      var3.add(new rfH_2(var1 + rfU_2.class_(var0, 1, 7), 90, var2 + 16 + rfU_2.class_(var0, 1, 7)));
      var3.add(new rfH_2(var1 + rfU_2.class_(var0, 1, 7), 90, var2 - 16 + rfU_2.class_(var0, 4, 6)));
      var3.add(new rfH_2(var1 + 16 + rfU_2.class_(var0, 1, 7), 90, var2 + 16 + rfU_2.class_(var0, 3, 8)));
      var3.add(new rfH_2(var1 + 16 + rfU_2.class_(var0, 1, 7), 90, var2 + rfU_2.class_(var0, 1, 7)));
      var3.add(new rfH_2(var1 + 16 + rfU_2.class_(var0, 1, 7), 90, var2 - 16 + rfU_2.class_(var0, 4, 8)));
      return var3;
   }

   private static rqO_2 break_(Random var0) {
      return rqR_2.class_(private_, var0);
   }
}
