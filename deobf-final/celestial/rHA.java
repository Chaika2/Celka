package celestial;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class rHA extends ryO_2 implements rHf_1 {
   private static final xd_3[] break_ = new xd_3[]{xu_3.Em, xu_3.EZ, xu_3.EH, xu_3.Ev};
   public int class_;
   private float byte_;
   private boolean protected_;
   private boolean throws_;
   private final List<rfH_2> case_ = Lists.newArrayList();
   private iB_2 catch_;
   private UUID private_;
   private long implements_;

   public rHA() {
      this(ryW_2.goto_);
   }

   public rHA(ryW_2<?> var1) {
      super(var1);
   }

   public void class_(rqA_2 var1) {
      this.extends_.class_((rhd_3)null, this.native_, var1, rqL_2.BLOCKS, 1.0F, 1.0F);
   }

   public float class_(float var1) {
      return (this.byte_ + var1) * -0.0375F;
   }

   @Override
   public void class_(xc_3 var1, rcd_3 var2) {
      super.class_(var1, var2);
      if (var2.break_("Target")) {
         this.private_ = var2.class_("Target");
      } else {
         this.private_ = null;
      }
   }

   private void class_(boolean var1) {
      if (var1 != this.protected_) {
         this.class_(var1 ? rqn_3.Ps : rqn_3.PM);
      }

      this.protected_ = var1;
   }

   @Override
   public rcd_3 class_(rcd_3 var1) {
      super.class_(var1);
      if (this.catch_ != null) {
         var1.class_("Target", this.catch_.ro());
      }

      return var1;
   }

   private void break_(boolean var1) {
      this.throws_ = var1;
   }

   @Override
   public void throws_() {
      this.class_++;
      long var1 = this.extends_.r();
      if (var1 % 40L == 0L) {
         this.class_(this.finally_());
         if (!this.extends_.continue_ && this.catch_()) {
            this.extends_();
            this.native_();
         }
      }

      if (var1 % 80L == 0L && this.catch_()) {
         this.class_(rqn_3.PE);
      }

      if (var1 > this.implements_ && this.catch_()) {
         this.implements_ = var1 + 60L + (long)this.extends_.long_().nextInt(40);
         this.class_(rqn_3.PG);
      }

      if (this.extends_.continue_) {
         this.volatile_();
         this.new_();
         if (this.catch_()) {
            this.byte_++;
         }
      }
   }

   private boolean finally_() {
      this.case_.clear();

      for (int var1 = -1; var1 <= 1; var1++) {
         for (int var2 = -1; var2 <= 1; var2++) {
            for (int var3 = -1; var3 <= 1; var3++) {
               rfH_2 var4 = this.native_.break_(var1, var2, var3);
               if (!this.extends_.final_(var4)) {
                  return false;
               }
            }
         }
      }

      for (int var13 = -2; var13 <= 2; var13++) {
         for (int var14 = -2; var14 <= 2; var14++) {
            for (int var15 = -2; var15 <= 2; var15++) {
               int var16 = Math.abs(var13);
               int var5 = Math.abs(var14);
               int var6 = Math.abs(var15);
               if ((var16 > 1 || var5 > 1 || var6 > 1)
                  && (var13 == 0 && (var5 == 2 || var6 == 2) || var14 == 0 && (var16 == 2 || var6 == 2) || var15 == 0 && (var16 == 2 || var5 == 2))) {
                  rfH_2 var7 = this.native_.break_(var13, var14, var15);
                  xc_3 var8 = this.extends_.byte_(var7);

                  for (xd_3 var12 : break_) {
                     if (var8.class_(var12)) {
                        this.case_.add(var7);
                     }
                  }
               }
            }
         }
      }

      this.break_(this.case_.size() >= 42);
      return this.case_.size() >= 16;
   }

   public boolean catch_() {
      return this.protected_;
   }

   private void extends_() {
      int var1 = this.case_.size();
      int var2 = var1 / 7 * 16;
      int var3 = this.native_.b_();
      int var4 = this.native_.c_();
      int var5 = this.native_.d_();
      rfl_3 var6 = new rfl_3((double)var3, (double)var4, (double)var5, (double)(var3 + 1), (double)(var4 + 1), (double)(var5 + 1))
         .class_((double)var2)
         .break_(0.0, (double)this.extends_.try_(), 0.0);
      List var7 = this.extends_.class_(rhd_3.class, var6);
      if (!var7.isEmpty()) {
         for (rhd_3 var9 : var7) {
            if (this.native_.class_(var9.Bs(), (double)var2) && var9.Pf()) {
               var9.break_(new rLY(rLD.throw_, 260, 0, true, true));
            }
         }
      }
   }

   private void new_() {
      Random var1 = this.extends_.int_;
      double var2 = (double)(rfU_2.class_((float)(this.class_ + 35) * 0.1F) / 2.0F + 0.5F);
      var2 = (var2 * var2 + var2) * 0.3F;
      rjU_2 var4 = new rjU_2((double)this.native_.b_() + 0.5, (double)this.native_.c_() + 1.5 + var2, (double)this.native_.d_() + 0.5);

      for (rfH_2 var6 : this.case_) {
         if (var1.nextInt(50) == 0) {
            float var7 = -0.5F + var1.nextFloat();
            float var8 = -2.0F + var1.nextFloat();
            float var9 = -0.5F + var1.nextFloat();
            rfH_2 var10 = var6.byte_(this.native_);
            rjU_2 var11 = new rjU_2((double)var7, (double)var8, (double)var9).break_((double)var10.b_(), (double)var10.c_(), (double)var10.d_());
            this.extends_.class_(rLQ.h, var4.break_, var4.byte_, var4.protected_, var11.break_, var11.byte_, var11.protected_);
         }
      }

      if (this.catch_ != null) {
         rjU_2 var13 = new rjU_2(this.catch_.rx(), this.catch_.rH(), this.catch_.BO());
         float var14 = (-0.5F + var1.nextFloat()) * (3.0F + this.catch_.PN());
         float var15 = -1.0F + var1.nextFloat() * this.catch_.Bm();
         float var16 = (-0.5F + var1.nextFloat()) * (3.0F + this.catch_.PN());
         rjU_2 var17 = new rjU_2((double)var14, (double)var15, (double)var16);
         this.extends_.class_(rLQ.h, var13.break_, var13.byte_, var13.protected_, var17.break_, var17.byte_, var17.protected_);
      }
   }

   private iB_2 package_() {
      List var1 = this.extends_.class_(iB_2.class, this.final_(), var1x -> var1x.ro().equals(this.private_));
      return var1.size() == 1 ? (iB_2)var1.get(0) : null;
   }

   public boolean private_() {
      return this.throws_;
   }

   private rfl_3 final_() {
      int var1 = this.native_.b_();
      int var2 = this.native_.c_();
      int var3 = this.native_.d_();
      return new rfl_3((double)var1, (double)var2, (double)var3, (double)(var1 + 1), (double)(var2 + 1), (double)(var3 + 1)).class_(8.0);
   }

   private void volatile_() {
      if (this.private_ == null) {
         this.catch_ = null;
      } else if (this.catch_ == null || !this.catch_.ro().equals(this.private_)) {
         this.catch_ = this.package_();
         if (this.catch_ == null) {
            this.private_ = null;
         }
      }
   }

   private void native_() {
      iB_2 var1 = this.catch_;
      int var2 = this.case_.size();
      if (var2 < 42) {
         this.catch_ = null;
      } else if (this.catch_ == null && this.private_ != null) {
         this.catch_ = this.package_();
         this.private_ = null;
      } else if (this.catch_ == null) {
         List var3 = this.extends_.class_(iB_2.class, this.final_(), var0 -> var0 instanceof rEK && var0.Pf());
         if (!var3.isEmpty()) {
            this.catch_ = (iB_2)var3.get(this.extends_.int_.nextInt(var3.size()));
         }
      } else if (!this.catch_.BM() || !this.native_.class_(this.catch_.Bs(), 8.0)) {
         this.catch_ = null;
      }

      if (this.catch_ != null) {
         this.extends_.class_((rhd_3)null, this.catch_.rx(), this.catch_.re(), this.catch_.BO(), rqn_3.Pb, rqL_2.BLOCKS, 1.0F, 1.0F);
         this.catch_.break_(rye_3.package_, 4.0F);
      }

      if (var1 != this.catch_) {
         xc_3 var4 = this.abstract_();
         this.extends_.class_(this.native_, var4, var4, 2);
      }
   }

   @Override
   public rFy_1 Y_() {
      return new rFy_1(this.native_, 5, this.Z_());
   }

   @Override
   public rcd_3 Z_() {
      return this.class_(new rcd_3());
   }
}
