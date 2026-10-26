package celestial;

import com.google.common.collect.UnmodifiableIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public class dV_2 extends xd_3 implements kd_3 {
   public static final rCN volatile_ = Wt_1.volatile_;
   public static final rCN final_ = Wt_1.final_;
   public static final rCN package_ = Wt_1.package_;
   public static final rCN int_ = Wt_1.int_;
   public static final rCN new_ = rCT.throw_;
   protected static final Map<rpr_3, rCN> continue_ = Wt_1.super_
      .entrySet()
      .stream()
      .filter(var0 -> var0.getKey().final_().protected_())
      .collect(rqR_2.class_());
   protected final rjC_2[] super_;
   protected final rjC_2[] this_;
   private final Object2IntMap<xc_3> else_ = new Object2IntOpenHashMap();

   protected dV_2(float var1, float var2, float var3, float var4, float var5, Jq_1 var6) {
      super(var6);
      this.super_ = this.class_(var1, var2, var5, 0.0F, var5);
      this.this_ = this.class_(var1, var2, var3, 0.0F, var4);
      UnmodifiableIterator var7 = this.abstract_.class_().iterator();

      while (var7.hasNext()) {
         xc_3 var8 = (xc_3)var7.next();
         this.private_(var8);
      }
   }

   protected rjC_2[] class_(float var1, float var2, float var3, float var4, float var5) {
      float var6 = 8.0F - var1;
      float var7 = 8.0F + var1;
      float var8 = 8.0F - var2;
      float var9 = 8.0F + var2;
      rjC_2 var10 = xd_3.class_((double)var6, 0.0, (double)var6, (double)var7, (double)var3, (double)var7);
      rjC_2 var11 = xd_3.class_((double)var8, (double)var4, 0.0, (double)var9, (double)var5, (double)var9);
      rjC_2 var12 = xd_3.class_((double)var8, (double)var4, (double)var8, (double)var9, (double)var5, 16.0);
      rjC_2 var13 = xd_3.class_(0.0, (double)var4, (double)var8, (double)var9, (double)var5, (double)var9);
      rjC_2 var14 = xd_3.class_((double)var8, (double)var4, (double)var8, 16.0, (double)var5, (double)var9);
      rjC_2 var15 = rjw_3.class_(var11, var14);
      rjC_2 var16 = rjw_3.class_(var12, var13);
      rjC_2[] var17 = new rjC_2[]{
         rjw_3.class_(),
         var12,
         var13,
         var16,
         var11,
         rjw_3.class_(var12, var11),
         rjw_3.class_(var13, var11),
         rjw_3.class_(var16, var11),
         var14,
         rjw_3.class_(var12, var14),
         rjw_3.class_(var13, var14),
         rjw_3.class_(var16, var14),
         var15,
         rjw_3.class_(var12, var15),
         rjw_3.class_(var13, var15),
         rjw_3.class_(var16, var15)
      };

      for (int var18 = 0; var18 < 16; var18++) {
         var17[var18] = rjw_3.class_(var10, var17[var18]);
      }

      return var17;
   }

   @Override
   public xc_3 class_(xc_3 var1, rpa_3 var2) {
      switch (var2) {
         case LEFT_RIGHT:
            return var1.class_(volatile_, var1.byte_(package_)).class_(package_, var1.byte_(volatile_));
         case FRONT_BACK:
            return var1.class_(final_, var1.byte_(int_)).class_(int_, var1.byte_(final_));
         default:
            return super.class_(var1, var2);
      }
   }

   @Override
   public xc_3 class_(xc_3 var1, rqd_3 var2) {
      switch (var2) {
         case CLOCKWISE_180:
            return var1.class_(volatile_, var1.byte_(package_))
               .class_(final_, var1.byte_(int_))
               .class_(package_, var1.byte_(volatile_))
               .class_(int_, var1.byte_(final_));
         case COUNTERCLOCKWISE_90:
            return var1.class_(volatile_, var1.byte_(final_))
               .class_(final_, var1.byte_(package_))
               .class_(package_, var1.byte_(int_))
               .class_(int_, var1.byte_(volatile_));
         case CLOCKWISE_90:
            return var1.class_(volatile_, var1.byte_(int_))
               .class_(final_, var1.byte_(volatile_))
               .class_(package_, var1.byte_(final_))
               .class_(int_, var1.byte_(package_));
         default:
            return var1;
      }
   }

   @Override
   public boolean class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return this.this_[this.private_(var1)];
   }

   private static int class_(rpr_3 var0) {
      return 1 << var0.protected_();
   }

   @Override
   public rjC_2 break_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return this.super_[this.private_(var1)];
   }

   @Override
   public rXE throws_(xc_3 var1) {
      return var1.byte_(new_) ? rXG.byte_.class_(false) : super.throws_(var1);
   }

   protected int private_(xc_3 var1) {
      return this.else_.computeIntIfAbsent(var1, var0 -> {
         int var1x = 0;
         if (var0.byte_(volatile_)) {
            var1x |= class_(rpr_3.NORTH);
         }

         if (var0.byte_(final_)) {
            var1x |= class_(rpr_3.EAST);
         }

         if (var0.byte_(package_)) {
            var1x |= class_(rpr_3.SOUTH);
         }

         if (var0.byte_(int_)) {
            var1x |= class_(rpr_3.WEST);
         }

         return var1x;
      });
   }

   @Override
   public boolean a_(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return !var1.byte_(new_);
   }
}
