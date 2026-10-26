package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class rHO extends ryO_2 implements rHf_1, rJZ {
   public static final rLR[][] class_ = new rLR[][]{{rLD.class_, rLD.byte_}, {rLD.extends_, rLD.private_}, {rLD.throws_}, {rLD.finally_}};
   private static final Set<rLR> break_ = Arrays.stream(class_).flatMap(Arrays::stream).collect(Collectors.toSet());
   List<rHX> byte_ = Lists.newArrayList();
   private List<rHX> protected_ = Lists.newArrayList();
   int throws_;
   private int case_ = -1;
   rLR catch_;
   rLR private_;
   private rgP_2 implements_;
   private rRK finally_ = rRK.class_;
   private final rpF_2 final_ = new rHh_1(this);

   public rHO() {
      super(ryW_2.final_);
   }

   public void class_(rqA_2 var1) {
      this.extends_.class_((rhd_3)null, this.native_, var1, rqL_2.BLOCKS, 1.0F, 1.0F);
   }

   static rLR class_(int var0) {
      rLR var1 = rLR.class_(var0);
      return break_.contains(var1) ? var1 : null;
   }

   @Override
   public rcd_3 class_(rcd_3 var1) {
      super.class_(var1);
      var1.break_("Primary", rLR.class_(this.catch_));
      var1.break_("Secondary", rLR.class_(this.private_));
      var1.break_("Levels", this.throws_);
      if (this.implements_ != null) {
         var1.class_("CustomName", rgB_2.class_(this.implements_));
      }

      this.finally_.class_(var1);
      return var1;
   }

   @Override
   public void class_(xc_3 var1, rcd_3 var2) {
      super.class_(var1, var2);
      this.catch_ = class_(var2.private_("Primary"));
      this.private_ = class_(var2.private_("Secondary"));
      if (var2.byte_("CustomName", 8)) {
         this.implements_ = rgB_2.class_(var2.native_("CustomName"));
      }

      this.finally_ = rRK.break_(var2);
   }

   private void class_(int var1, int var2, int var3) {
      this.throws_ = 0;

      for (int var4 = 1; var4 <= 4; this.throws_ = var4++) {
         int var5 = var2 - var4;
         if (var5 < 0) {
            break;
         }

         boolean var6 = true;

         for (int var7 = var1 - var4; var7 <= var1 + var4 && var6; var7++) {
            for (int var8 = var3 - var4; var8 <= var3 + var4; var8++) {
               if (!this.extends_.byte_(new rfH_2(var7, var5, var8)).class_(rls_3.m)) {
                  var6 = false;
                  break;
               }
            }
         }

         if (!var6) {
            break;
         }
      }
   }

   public void class_(rgP_2 var1) {
      this.implements_ = var1;
   }

   @Override
   public void throws_() {
      int var1 = this.native_.b_();
      int var2 = this.native_.c_();
      int var3 = this.native_.d_();
      rfH_2 var4;
      if (this.case_ < var2) {
         var4 = this.native_;
         this.protected_ = Lists.newArrayList();
         this.case_ = var4.c_() - 1;
      } else {
         var4 = new rfH_2(var1, this.case_ + 1, var3);
      }

      rHX var5 = this.protected_.isEmpty() ? null : this.protected_.get(this.protected_.size() - 1);
      int var6 = this.extends_.class_(rKv_1.WORLD_SURFACE, var1, var3);

      for (int var7 = 0; var7 < 10 && var4.c_() <= var6; var7++) {
         xc_3 var8 = this.extends_.byte_(var4);
         xd_3 var9 = var8.break_();
         if (var9 instanceof kO_2) {
            float[] var10 = ((kO_2)var9).break_().protected_();
            if (this.protected_.size() <= 1) {
               var5 = new rHX(var10);
               this.protected_.add(var5);
            } else if (var5 != null) {
               if (Arrays.equals(var10, var5.class_)) {
                  var5.class_();
               } else {
                  var5 = new rHX(new float[]{(var5.class_[0] + var10[0]) / 2.0F, (var5.class_[1] + var10[1]) / 2.0F, (var5.class_[2] + var10[2]) / 2.0F});
                  this.protected_.add(var5);
               }
            }
         } else {
            if (var5 == null || var8.break_((rRq_1)this.extends_, var4) >= 15 && var9 != xu_3.while_) {
               this.protected_.clear();
               this.case_ = var6;
               break;
            }

            var5.class_();
         }

         var4 = var4.final_();
         this.case_++;
      }

      int var12 = this.throws_;
      if (this.extends_.r() % 80L == 0L) {
         if (!this.byte_.isEmpty()) {
            this.class_(var1, var2, var3);
         }

         if (this.throws_ > 0 && !this.byte_.isEmpty()) {
            this.finally_();
            this.class_(rqn_3.A);
         }
      }

      if (this.case_ >= var6) {
         this.case_ = -1;
         boolean var13 = var12 > 0;
         this.byte_ = this.protected_;
         if (!this.extends_.continue_) {
            boolean var14 = this.throws_ > 0;
            if (!var13 && var14) {
               this.class_(rqn_3.L);

               for (rhN_2 var11 : this.extends_
                  .class_(
                     rhN_2.class, new rfl_3((double)var1, (double)var2, (double)var3, (double)var1, (double)(var2 - 4), (double)var3).byte_(10.0, 5.0, 10.0)
                  )) {
                  Oo_1.native_.class_(var11, this);
               }
            } else if (var13 && !var14) {
               this.class_(rqn_3.n);
            }
         }
      }
   }

   private void finally_() {
      if (!this.extends_.continue_ && this.catch_ != null) {
         double var1 = (double)(this.throws_ * 10 + 10);
         byte var3 = 0;
         if (this.throws_ >= 4 && this.catch_ == this.private_) {
            var3 = 1;
         }

         int var4 = (9 + this.throws_ * 2) * 20;
         rfl_3 var5 = new rfl_3(this.native_).class_(var1).break_(0.0, (double)this.extends_.try_(), 0.0);
         List var6 = this.extends_.class_(rhd_3.class, var5);

         for (rhd_3 var8 : var6) {
            var8.break_(new rLY(this.catch_, var4, var3, true, true));
         }

         if (this.throws_ >= 4 && this.catch_ != this.private_ && this.private_ != null) {
            for (rhd_3 var10 : var6) {
               var10.break_(new rLY(this.private_, var4, 0, true, true));
            }
         }
      }
   }

   public List<rHX> catch_() {
      return (List<rHX>)(this.throws_ == 0 ? ImmutableList.of() : this.byte_);
   }

   @Override
   public double implements_() {
      return 256.0;
   }

   public int private_() {
      return this.throws_;
   }

   @Override
   public void aa_() {
      this.class_(rqn_3.n);
      super.aa_();
   }

   @Override
   public rgP_2 L_() {
      return (rgP_2)(this.implements_ != null ? this.implements_ : new rgn_3("container.beacon"));
   }

   @Override
   public rFy_1 Y_() {
      return new rFy_1(this.native_, 3, this.Z_());
   }

   @Override
   public rcd_3 Z_() {
      return this.class_(new rcd_3());
   }

   @Override
   public rJr_1 createMenu(int var1, rhz_3 var2, rhd_3 var3) {
      return rHD.class_(var3, this.finally_, this.L_()) ? new rXT(var1, var2, this.final_, rpq_3.class_(this.extends_, this.char_())) : null;
   }
}
