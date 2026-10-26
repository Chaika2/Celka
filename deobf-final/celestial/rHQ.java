package celestial;

import java.util.Arrays;

public class rHQ extends rHD implements rHf_1, rXF {
   private static final int[] break_ = new int[]{3};
   private static final int[] byte_ = new int[]{0, 1, 2, 3};
   private static final int[] protected_ = new int[]{0, 1, 2, 4};
   private rqs_3<rdn_3> throws_ = rqs_3.class_(5, rdn_3.break_);
   int case_;
   private boolean[] catch_;
   private rdb_3 private_;
   int implements_;
   protected final rpF_2 class_ = new rHN(this);

   @Override
   public boolean byte_(rhd_3 var1) {
      return this.extends_.class_(this.native_) != this
         ? false
         : !(var1.class_((double)this.native_.b_() + 0.5, (double)this.native_.c_() + 0.5, (double)this.native_.d_() + 0.5) > 64.0);
   }

   public rHQ() {
      super(ryW_2.extends_);
   }

   @Override
   public void class_(xc_3 var1, rcd_3 var2) {
      super.class_(var1, var2);
      this.throws_ = rqs_3.class_(this.else_(), rdn_3.break_);
      rXC.break_(var2, this.throws_);
      this.case_ = var2.catch_("BrewTime");
      this.implements_ = var2.case_("Fuel");
   }

   @Override
   public rcd_3 class_(rcd_3 var1) {
      super.class_(var1);
      var1.class_("BrewTime", (short)this.case_);
      rXC.class_(var1, this.throws_);
      var1.class_("Fuel", (byte)this.implements_);
      return var1;
   }

   @Override
   public boolean class_(int var1, rdn_3 var2, rpr_3 var3) {
      return this.a_(var1, var2);
   }

   @Override
   public int[] class_(rpr_3 var1) {
      if (var1 == rpr_3.UP) {
         return break_;
      } else {
         return var1 == rpr_3.DOWN ? byte_ : protected_;
      }
   }

   @Override
   public rdn_3 class_(int var1, int var2) {
      return rXC.class_(this.throws_, var1, var2);
   }

   @Override
   protected rJr_1 class_(int var1, rhz_3 var2) {
      return new rXf_1(var1, var2, this, this.class_);
   }

   @Override
   public void break_(int var1, rdn_3 var2) {
      if (var1 >= 0 && var1 < this.throws_.size()) {
         this.throws_.set(var1, var2);
      }
   }

   @Override
   public boolean break_(int var1, rdn_3 var2, rpr_3 var3) {
      return var1 == 3 ? var2.break_() == rdy_3.Jn : true;
   }

   @Override
   public void throws_() {
      rdn_3 var1 = this.throws_.get(4);
      if (this.implements_ <= 0 && var1.break_() == rdy_3.JH) {
         this.implements_ = 20;
         var1.catch_(1);
         this.break_();
      }

      boolean var2 = this.private_();
      boolean var3 = this.case_ > 0;
      rdn_3 var4 = this.throws_.get(3);
      if (var3) {
         this.case_--;
         boolean var5 = this.case_ == 0;
         if (var5 && var2) {
            this.finally_();
            this.break_();
         } else if (!var2) {
            this.case_ = 0;
            this.break_();
         } else if (this.private_ != var4.break_()) {
            this.case_ = 0;
            this.break_();
         }
      } else if (var2 && this.implements_ > 0) {
         this.implements_--;
         this.case_ = 400;
         this.private_ = var4.break_();
         this.break_();
      }

      if (!this.extends_.continue_) {
         boolean[] var8 = this.catch_();
         if (!Arrays.equals(var8, this.catch_)) {
            this.catch_ = var8;
            xc_3 var6 = this.extends_.byte_(this.char_());
            if (!(var6.break_() instanceof xZ_2)) {
               return;
            }

            for (int var7 = 0; var7 < xZ_2.volatile_.length; var7++) {
               var6 = var6.class_(xZ_2.volatile_[var7], Boolean.valueOf(var8[var7]));
            }

            this.extends_.class_(this.native_, var6, 2);
         }
      }
   }

   private void finally_() {
      rdn_3 var1 = this.throws_.get(3);

      for (int var2 = 0; var2 < 3; var2++) {
         this.throws_.set(var2, rAr_1.protected_(var1, this.throws_.get(var2)));
      }

      var1.catch_(1);
      rfH_2 var4 = this.char_();
      if (var1.break_().int_()) {
         rdn_3 var3 = new rdn_3(var1.break_().package_());
         if (var1.class_()) {
            var1 = var3;
         } else if (!this.extends_.continue_) {
            rXn_1.class_(this.extends_, (double)var4.b_(), (double)var4.c_(), (double)var4.d_(), var3);
         }
      }

      this.throws_.set(3, var1);
      this.extends_.byte_(1035, var4, 0);
   }

   public boolean[] catch_() {
      boolean[] var1 = new boolean[3];

      for (int var2 = 0; var2 < 3; var2++) {
         if (!this.throws_.get(var2).class_()) {
            var1[var2] = true;
         }
      }

      return var1;
   }

   @Override
   public rdn_3 extends_(int var1) {
      return var1 >= 0 && var1 < this.throws_.size() ? this.throws_.get(var1) : rdn_3.break_;
   }

   @Override
   public int else_() {
      return this.throws_.size();
   }

   @Override
   public boolean return_() {
      for (rdn_3 var2 : this.throws_) {
         if (!var2.class_()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void public_() {
      this.throws_.clear();
   }

   private boolean private_() {
      rdn_3 var1 = this.throws_.get(3);
      if (var1.class_()) {
         return false;
      } else if (!rAr_1.class_(var1)) {
         return false;
      } else {
         for (int var2 = 0; var2 < 3; var2++) {
            rdn_3 var3 = this.throws_.get(var2);
            if (!var3.class_() && rAr_1.class_(var3, var1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public rdn_3 native_(int var1) {
      return rXC.class_(this.throws_, var1);
   }

   @Override
   public boolean a_(int var1, rdn_3 var2) {
      if (var1 == 3) {
         return rAr_1.class_(var2);
      } else {
         rdb_3 var3 = var2.break_();
         return var1 == 4 ? var3 == rdy_3.JH : (var3 == rdy_3.JA || var3 == rdy_3.kk || var3 == rdy_3.kQ || var3 == rdy_3.Jn) && this.extends_(var1).class_();
      }
   }

   @Override
   protected rgP_2 X_() {
      return new rgn_3("container.brewing");
   }
}
