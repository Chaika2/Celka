package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;

public class Wu_1 extends xd_3 {
   public static final rCu_1<rCY> volatile_ = rCT.S;
   public static final rCu_1<rCY> final_ = rCT.B;
   public static final rCu_1<rCY> package_ = rCT.s;
   public static final rCu_1<rCY> int_ = rCT.E;
   public static final rCm_1 new_ = rCT.H;
   public static final Map<rpr_3, rCu_1<rCY>> continue_ = Maps.newEnumMap(
      ImmutableMap.of(rpr_3.NORTH, volatile_, rpr_3.EAST, final_, rpr_3.SOUTH, package_, rpr_3.WEST, int_)
   );
   private static final rjC_2 super_ = xd_3.class_(3.0, 0.0, 3.0, 13.0, 1.0, 13.0);
   private static final Map<rpr_3, rjC_2> this_ = Maps.newEnumMap(
      ImmutableMap.of(
         rpr_3.NORTH,
         xd_3.class_(3.0, 0.0, 0.0, 13.0, 1.0, 13.0),
         rpr_3.SOUTH,
         xd_3.class_(3.0, 0.0, 3.0, 13.0, 1.0, 16.0),
         rpr_3.EAST,
         xd_3.class_(3.0, 0.0, 3.0, 16.0, 1.0, 13.0),
         rpr_3.WEST,
         xd_3.class_(0.0, 0.0, 3.0, 13.0, 1.0, 13.0)
      )
   );
   private static final Map<rpr_3, rjC_2> else_ = Maps.newEnumMap(
      ImmutableMap.of(
         rpr_3.NORTH,
         rjw_3.class_(this_.get(rpr_3.NORTH), xd_3.class_(3.0, 0.0, 0.0, 13.0, 16.0, 1.0)),
         rpr_3.SOUTH,
         rjw_3.class_(this_.get(rpr_3.SOUTH), xd_3.class_(3.0, 0.0, 15.0, 13.0, 16.0, 16.0)),
         rpr_3.EAST,
         rjw_3.class_(this_.get(rpr_3.EAST), xd_3.class_(15.0, 0.0, 3.0, 16.0, 16.0, 13.0)),
         rpr_3.WEST,
         rjw_3.class_(this_.get(rpr_3.WEST), xd_3.class_(0.0, 0.0, 3.0, 1.0, 16.0, 13.0))
      )
   );
   private final Map<xc_3, rjC_2> synchronized_ = Maps.newHashMap();
   private static final rje_3[] return_ = new rje_3[16];
   private final xc_3 public_;
   private boolean goto_ = true;

   @Override
   public boolean byte_(xc_3 var1) {
      return this.goto_;
   }

   public static int byte_(int var0) {
      rje_3 var1 = return_[var0];
      return rfU_2.throws_(var1.class_(), var1.break_(), var1.byte_());
   }

   public Wu_1(Jq_1 var1) {
      super(var1);
      this.extends_(
         this.abstract_
            .break_()
            .class_(volatile_, rCY.NONE)
            .class_(final_, rCY.NONE)
            .class_(package_, rCY.NONE)
            .class_(int_, rCY.NONE)
            .class_(new_, Integer.valueOf(0))
      );
      this.public_ = this.continue_().class_(volatile_, rCY.SIDE).class_(final_, rCY.SIDE).class_(package_, rCY.SIDE).class_(int_, rCY.SIDE);
      UnmodifiableIterator var2 = this.new_().class_().iterator();

      while (var2.hasNext()) {
         xc_3 var3 = (xc_3)var2.next();
         if (var3.byte_(new_) == 0) {
            this.synchronized_.put(var3, this.implements_(var3));
         }
      }
   }

   static {
      for (int var0 = 0; var0 <= 15; var0++) {
         float var1 = (float)var0 / 15.0F;
         float var2 = var1 * 0.6F + (var1 > 0.0F ? 0.4F : 0.3F);
         float var3 = rfU_2.class_(var1 * var1 * 0.7F - 0.5F, 0.0F, 1.0F);
         float var4 = rfU_2.class_(var1 * var1 * 0.6F - 0.7F, 0.0F, 1.0F);
         return_[var0] = new rje_3(var2, var3, var4);
      }
   }

   @Override
   public int class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rpr_3 var4) {
      if (this.goto_ && var4 != rpr_3.DOWN) {
         int var5 = var1.byte_(new_);
         if (var5 == 0) {
            return 0;
         } else {
            return var4 != rpr_3.UP && !this.class_(var2, var1, var3).byte_(continue_.get(var4.case_())).break_() ? 0 : var5;
         }
      } else {
         return 0;
      }
   }

   protected static boolean class_(xc_3 var0, rpr_3 var1) {
      if (var0.class_(xu_3.ra)) {
         return true;
      } else if (var0.class_(xu_3.BS)) {
         rpr_3 var2 = var0.byte_(WZ.p);
         return var2 == var1 || var2.case_() == var1;
      } else {
         return var0.class_(xu_3.bK) ? var1 == var0.byte_(kR_2.volatile_) : var0.implements_() && var1 != null;
      }
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return this.synchronized_.get(var1.class_(new_, Integer.valueOf(0)));
   }

   private void class_(rYB var1, Random var2, rfH_2 var3, rje_3 var4, rpr_3 var5, rpr_3 var6, float var7, float var8) {
      float var9 = var8 - var7;
      if (!(var2.nextFloat() >= 0.2F * var9)) {
         float var10 = 0.4375F;
         float var11 = var7 + var9 * var2.nextFloat();
         double var12 = 0.5 + (double)(0.4375F * (float)var5.implements_()) + (double)(var11 * (float)var6.implements_());
         double var14 = 0.5 + (double)(0.4375F * (float)var5.finally_()) + (double)(var11 * (float)var6.finally_());
         double var16 = 0.5 + (double)(0.4375F * (float)var5.extends_()) + (double)(var11 * (float)var6.extends_());
         var1.class_(
            new rLc_1(var4.class_(), var4.break_(), var4.byte_(), 1.0F),
            (double)var3.b_() + var12,
            (double)var3.c_() + var14,
            (double)var3.d_() + var16,
            0.0,
            0.0,
            0.0
         );
      }
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, xd_3 var4, rfH_2 var5, boolean var6) {
      if (!var2.continue_) {
         if (var1.class_((rRR)var2, var3)) {
            this.class_(var2, var3, var1);
         } else {
            protected_(var1, var2, var3);
            var2.class_(var3, false);
         }
      }
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var4.class_(var1.break_()) && !var2.continue_) {
         this.class_(var2, var3, var1);

         for (rpr_3 var7 : rpb_3.VERTICAL) {
            var2.break_(var3.break_(var7), this);
         }

         this.protected_(var2, var3);
      }
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      return this.class_(var1.int_(), this.public_, var1.class_());
   }

   private void class_(rYB var1, rfH_2 var2, xc_3 var3, xc_3 var4) {
      for (rpr_3 var6 : rpb_3.HORIZONTAL) {
         rfH_2 var7 = var2.break_(var6);
         if (var3.byte_(continue_.get(var6)).break_() != var4.byte_(continue_.get(var6)).break_() && var1.byte_(var7).catch_(var1, var7)) {
            var1.class_(var7, var4.break_(), var6.case_());
         }
      }
   }

   @Override
   public ryZ_2 class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (!((rhx_3)var4.implements_[18]).throws_) {
         return ryZ_2.PASS;
      } else {
         if (volatile_(var1) || final_(var1)) {
            xc_3 var7 = volatile_(var1) ? this.continue_() : this.public_;
            var7 = var7.class_(new_, var1.byte_(new_));
            var7 = this.class_(var2, var7, var3);
            if (var7 != var1) {
               var2.class_(var3, var7, 3);
               this.class_(var2, var3, var1, var7);
               return ryZ_2.SUCCESS;
            }
         }

         return ryZ_2.PASS;
      }
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_, final_, package_, int_, new_);
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
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      int var5 = var1.byte_(new_);
      if (var5 != 0) {
         for (rpr_3 var7 : rpb_3.HORIZONTAL) {
            rCY var8 = var1.byte_(continue_.get(var7));
            switch (var8) {
               case UP:
                  this.class_(var2, var4, var3, return_[var5], var7, rpr_3.UP, -0.5F, 0.5F);
               case SIDE:
                  this.class_(var2, var4, var3, return_[var5], rpr_3.DOWN, var7, 0.0F, 0.5F);
                  break;
               case NONE:
               default:
                  this.class_(var2, var4, var3, return_[var5], rpr_3.DOWN, var7, 0.0F, 0.3F);
            }
         }
      }
   }

   private void class_(rYB var1, rfH_2 var2, xc_3 var3) {
      int var4 = this.class_(var1, var2);
      if (var3.byte_(new_) != var4) {
         if (var1.byte_(var2) == var3) {
            var1.class_(var2, var3.class_(new_, Integer.valueOf(var4)), 2);
         }

         HashSet var5 = Sets.newHashSet();
         var5.add(var2);

         for (rpr_3 var9 : rpr_3.values()) {
            var5.add(var2.break_(var9));
         }

         for (rfH_2 var11 : var5) {
            var1.break_(var11, this);
         }
      }
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var2 == rpr_3.DOWN) {
         return var1;
      } else if (var2 == rpr_3.UP) {
         return this.class_(var4, var1, var5);
      } else {
         rCY var7 = this.class_(var4, var5, var2);
         return var7.break_() == var1.byte_(continue_.get(var2)).break_() && !volatile_(var1)
            ? var1.class_(continue_.get(var2), var7)
            : this.class_(var4, this.public_.class_(new_, var1.byte_(new_)).class_(continue_.get(var2), var7), var5);
      }
   }

   @Override
   public void class_(xc_3 var1, rRg_1 var2, rfH_2 var3, int var4, int var5) {
      rfw_3 var6 = new rfw_3();

      for (rpr_3 var8 : rpb_3.HORIZONTAL) {
         rCY var9 = var1.byte_(continue_.get(var8));
         if (var9 != rCY.NONE && !var2.byte_(var6.class_(var3, var8)).class_(this)) {
            var6.class_(rpr_3.DOWN);
            xc_3 var10 = var2.byte_(var6);
            if (!var10.class_(xu_3.bK)) {
               rfH_2 var11 = var6.break_(var8.case_());
               xc_3 var12 = var10.class_(var8.case_(), var2.byte_(var11), var2, var6, var11);
               class_(var10, var12, var2, var6, var4, var5);
            }

            var6.class_(var3, var8).class_(rpr_3.UP);
            xc_3 var14 = var2.byte_(var6);
            if (!var14.class_(xu_3.bK)) {
               rfH_2 var15 = var6.break_(var8.case_());
               xc_3 var13 = var14.class_(var8.case_(), var2.byte_(var15), var2, var6, var15);
               class_(var14, var13, var2, var6, var4, var5);
            }
         }
      }
   }

   private rCY class_(rRq_1 var1, rfH_2 var2, rpr_3 var3) {
      return this.class_(var1, var2, var3, !var1.byte_(var2.final_()).catch_(var1, var2));
   }

   @Override
   public boolean class_(xc_3 var1, rRR var2, rfH_2 var3) {
      rfH_2 var4 = var3.break_();
      xc_3 var5 = var2.byte_(var4);
      return this.break_(var2, var4, var5);
   }

   private rCY class_(rRq_1 var1, rfH_2 var2, rpr_3 var3, boolean var4) {
      rfH_2 var5 = var2.break_(var3);
      xc_3 var6 = var1.byte_(var5);
      if (var4) {
         boolean var7 = this.break_(var1, var5, var6);
         if (var7 && private_(var1.byte_(var5.final_()))) {
            if (var6.protected_(var1, var5, var3.case_())) {
               return rCY.UP;
            }

            return rCY.SIDE;
         }
      }

      return class_(var6, var3) || !var6.catch_(var1, var5) && private_(var1.byte_(var5.break_())) ? rCY.SIDE : rCY.NONE;
   }

   private xc_3 class_(rRq_1 var1, xc_3 var2, rfH_2 var3) {
      boolean var4 = final_(var2);
      var2 = this.break_(var1, this.continue_().class_(new_, var2.byte_(new_)), var3);
      if (var4 && final_(var2)) {
         return var2;
      } else {
         boolean var5 = var2.byte_(volatile_).break_();
         boolean var6 = var2.byte_(package_).break_();
         boolean var7 = var2.byte_(final_).break_();
         boolean var8 = var2.byte_(int_).break_();
         boolean var9 = !var5 && !var6;
         boolean var10 = !var7 && !var8;
         if (!var8 && var9) {
            var2 = var2.class_(int_, rCY.SIDE);
         }

         if (!var7 && var9) {
            var2 = var2.class_(final_, rCY.SIDE);
         }

         if (!var5 && var10) {
            var2 = var2.class_(volatile_, rCY.SIDE);
         }

         if (!var6 && var10) {
            var2 = var2.class_(package_, rCY.SIDE);
         }

         return var2;
      }
   }

   private int class_(rYB var1, rfH_2 var2) {
      this.goto_ = false;
      int var3 = var1.goto_(var2);
      this.goto_ = true;
      int var4 = 0;
      if (var3 < 15) {
         for (rpr_3 var6 : rpb_3.HORIZONTAL) {
            rfH_2 var7 = var2.break_(var6);
            xc_3 var8 = var1.byte_(var7);
            var4 = Math.max(var4, this.package_(var8));
            rfH_2 var9 = var2.final_();
            if (var8.catch_(var1, var7) && !var1.byte_(var9).catch_(var1, var9)) {
               var4 = Math.max(var4, this.package_(var1.byte_(var7.final_())));
            } else if (!var8.catch_(var1, var7)) {
               var4 = Math.max(var4, this.package_(var1.byte_(var7.break_())));
            }
         }
      }

      return Math.max(var3, var4 - 1);
   }

   private xc_3 break_(rRq_1 var1, xc_3 var2, rfH_2 var3) {
      boolean var4 = !var1.byte_(var3.final_()).catch_(var1, var3);

      for (rpr_3 var6 : rpb_3.HORIZONTAL) {
         if (!var2.byte_(continue_.get(var6)).break_()) {
            rCY var7 = this.class_(var1, var3, var6, var4);
            var2 = var2.class_(continue_.get(var6), var7);
         }
      }

      return var2;
   }

   private void break_(rYB var1, rfH_2 var2) {
      if (var1.byte_(var2).class_(this)) {
         var1.break_(var2, this);

         for (rpr_3 var6 : rpr_3.values()) {
            var1.break_(var2.break_(var6), this);
         }
      }
   }

   @Override
   public void break_(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var5 && !var1.class_(var4.break_())) {
         super.break_(var1, var2, var3, var4, var5);
         if (!var2.continue_) {
            for (rpr_3 var9 : rpr_3.values()) {
               var2.break_(var3.break_(var9), this);
            }

            this.class_(var2, var3, var1);
            this.protected_(var2, var3);
         }
      }
   }

   @Override
   public int break_(xc_3 var1, rRq_1 var2, rfH_2 var3, rpr_3 var4) {
      return !this.goto_ ? 0 : var1.break_(var2, var3, var4);
   }

   private boolean break_(rRq_1 var1, rfH_2 var2, xc_3 var3) {
      return var3.protected_(var1, var2, rpr_3.UP) || var3.class_(xu_3.sl);
   }

   private rjC_2 implements_(xc_3 var1) {
      rjC_2 var2 = super_;

      for (rpr_3 var4 : rpb_3.HORIZONTAL) {
         rCY var5 = var1.byte_(continue_.get(var4));
         if (var5 == rCY.SIDE) {
            var2 = rjw_3.class_(var2, this_.get(var4));
         } else if (var5 == rCY.UP) {
            var2 = rjw_3.class_(var2, else_.get(var4));
         }
      }

      return var2;
   }

   private int package_(xc_3 var1) {
      return var1.class_(this) ? var1.byte_(new_) : 0;
   }

   private void protected_(rYB var1, rfH_2 var2) {
      for (rpr_3 var4 : rpb_3.HORIZONTAL) {
         this.break_(var1, var2.break_(var4));
      }

      for (rpr_3 var7 : rpb_3.HORIZONTAL) {
         rfH_2 var5 = var2.break_(var7);
         if (var1.byte_(var5).catch_(var1, var5)) {
            this.break_(var1, var5.final_());
         } else {
            this.break_(var1, var5.break_());
         }
      }
   }

   protected static boolean private_(xc_3 var0) {
      return class_(var0, (rpr_3)null);
   }

   private static boolean final_(xc_3 var0) {
      return !var0.byte_(volatile_).break_() && !var0.byte_(package_).break_() && !var0.byte_(final_).break_() && !var0.byte_(int_).break_();
   }

   private static boolean volatile_(xc_3 var0) {
      return var0.byte_(volatile_).break_() && var0.byte_(package_).break_() && var0.byte_(final_).break_() && var0.byte_(int_).break_();
   }
}
