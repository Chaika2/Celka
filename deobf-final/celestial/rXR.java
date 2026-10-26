package celestial;

public class rXR extends rJr_1 {
   private final rpq_3 break_;
   long byte_;
   public final rXu_1 class_ = new rXY(this, 2);
   private final rXd_1 protected_ = new rXo_1(this);

   public rXR(int var1, rhz_3 var2) {
      this(var1, var2, rpq_3.class_);
   }

   public rXR(int var1, rhz_3 var2, rpq_3 var3) {
      super(rJP.return_, var1);
      this.break_ = var3;
      this.break_(new rXK(this, this.class_, 0, 15, 15));
      this.break_(new rXD(this, this.class_, 1, 15, 52));
      this.break_(new rXU(this, this.protected_, 2, 145, 39, var3));

      for (int var4 = 0; var4 < 3; var4++) {
         for (int var5 = 0; var5 < 9; var5++) {
            this.break_(new rJY(var2, var5 + var4 * 9 + 9, 8 + var5 * 18, 84 + var4 * 18));
         }
      }

      for (int var6 = 0; var6 < 9; var6++) {
         this.break_(new rJY(var2, var6, 8 + var6 * 18, 142));
      }
   }

   @Override
   public rdn_3 class_(rhd_3 var1, int var2) {
      rdn_3 var3 = rdn_3.break_;
      rJY var4 = this.throws_.get(var2);
      if (var4 != null && var4.break_()) {
         rdn_3 var5 = var4.class_();
         rdb_3 var6 = var5.break_();
         var3 = var5.implements_();
         if (var2 == 2) {
            var6.break_(var5, (rYB)var1.throws_[7], var1);
            if (!this.class_(var5, 3, 39, true)) {
               return rdn_3.break_;
            }

            var4.class_(var5, var3);
         } else if (var2 != 1 && var2 != 0) {
            if (var6 == rdy_3.JX) {
               if (!this.class_(var5, 0, 1, false)) {
                  return rdn_3.break_;
               }
            } else if (var6 != rdy_3.Xb && var6 != rdy_3.dM && var6 != rdy_3.BD) {
               if (var2 >= 3 && var2 < 30) {
                  if (!this.class_(var5, 30, 39, false)) {
                     return rdn_3.break_;
                  }
               } else if (var2 >= 30 && var2 < 39 && !this.class_(var5, 3, 30, false)) {
                  return rdn_3.break_;
               }
            } else if (!this.class_(var5, 1, 2, false)) {
               return rdn_3.break_;
            }
         } else if (!this.class_(var5, 3, 39, false)) {
            return rdn_3.break_;
         }

         if (var5.class_()) {
            var4.break_(rdn_3.break_);
         }

         var4.byte_();
         if (var5.char_() == var3.char_()) {
            return rdn_3.break_;
         }

         var4.class_(var1, var5);
         this.native_();
      }

      return var3;
   }

   @Override
   public boolean class_(rdn_3 var1, rJY var2) {
      return var2.byte_ != this.protected_ && super.class_(var1, var2);
   }

   @Override
   public boolean class_(rhd_3 var1) {
      return class_(this.break_, var1, xu_3.XP);
   }

   @Override
   public void class_(rXu_1 var1) {
      rdn_3 var2 = this.class_.extends_(0);
      rdn_3 var3 = this.class_.extends_(1);
      rdn_3 var4 = this.protected_.extends_(2);
      if (var4.class_() || !var2.class_() && !var3.class_()) {
         if (!var2.class_() && !var3.class_()) {
            this.class_(var2, var3, var4);
         }
      } else {
         this.protected_.native_(2);
      }
   }

   private void class_(rdn_3 var1, rdn_3 var2, rdn_3 var3) {
      this.break_.class_((var4, var5) -> {
         rdb_3 var6 = var2.break_();
         rrGb_1 var7 = rxI_2.class_(var1, var4);
         if (var7 != null) {
            rdn_3 var8;
            if (var6 == rdy_3.Xb && !var7.private_ && var7.case_ < 4) {
               var8 = var1.implements_();
               var8.throws_(1);
               var8.int_().break_("map_scale_direction", 1);
               this.native_();
            } else if (var6 == rdy_3.BD && !var7.private_) {
               var8 = var1.implements_();
               var8.throws_(1);
               var8.int_().class_("map_to_lock", true);
               this.native_();
            } else {
               if (var6 != rdy_3.dM) {
                  this.protected_.native_(2);
                  this.native_();
                  return;
               }

               var8 = var1.implements_();
               var8.throws_(2);
               this.native_();
            }

            if (!rdn_3.break_(var8, var3)) {
               this.protected_.break_(2, var8);
               this.native_();
            }
         }
      });
   }

   @Override
   public void break_(rhd_3 var1) {
      super.break_(var1);
      this.protected_.native_(2);
      this.break_.class_((var2, var3) -> this.class_(var1, (rYB)var1.throws_[7], this.class_));
   }
}
