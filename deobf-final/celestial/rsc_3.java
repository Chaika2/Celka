package celestial;

import java.util.List;

public class rsc_3 extends rsQ_2 implements rHI {
   private boolean protected_ = true;
   private int catch_ = -1;
   private final rfH_2 private_ = rfH_2.protected_;

   public boolean char_() {
      return this.catch_ > 0;
   }

   public void byte_(boolean var1) {
      this.protected_ = var1;
   }

   @Override
   public xc_3 int_() {
      return xu_3.sl.continue_();
   }

   public rsc_3(aI_2<? extends rsc_3> var1, rYB var2) {
      super(var1, var2);
   }

   public rsc_3(rYB var1, double var2, double var4, double var6) {
      super(aI_2.S, var2, var4, var6, var1);
   }

   @Override
   public void this_() {
      super.this_();
      if (!((rYB)this.throws_[7]).continue_ && this.BM() && this.goto_()) {
         rfH_2 var1 = this.Bs();
         if (var1.equals(this.private_)) {
            this.catch_--;
         } else {
            this.volatile_(0);
         }

         if (!this.char_()) {
            this.volatile_(0);
            if (this.interface_()) {
               this.volatile_(4);
               this.break_();
            }
         }
      }
   }

   public boolean interface_() {
      if (rHt_1.class_((rHI)this)) {
         return true;
      } else {
         List var1 = ((rYB)this.throws_[7]).class_(rsE_2.class, this.rN().byte_(0.25, 0.0, 0.25), rpJ_2.class_);
         if (!var1.isEmpty()) {
            rHt_1.class_(this, (rsE_2)var1.get(0));
         }

         return false;
      }
   }

   @Override
   public rJr_1 class_(int var1, rhz_3 var2) {
      return new rJz_1(var1, var2, this);
   }

   @Override
   protected void class_(rcd_3 var1) {
      super.class_(var1);
      var1.break_("TransferCooldown", this.catch_);
      var1.class_("Enabled", this.protected_);
   }

   @Override
   public void class_(int var1, int var2, int var3, boolean var4) {
      boolean var5 = !var4;
      if (var5 != this.goto_()) {
         this.byte_(var5);
      }
   }

   @Override
   protected void break_(rcd_3 var1) {
      super.break_(var1);
      this.catch_ = var1.private_("TransferCooldown");
      this.protected_ = var1.throws_("Enabled") ? var1.new_("Enabled") : true;
   }

   @Override
   public void break_(rye_3 var1) {
      super.break_(var1);
      if (((rYB)this.throws_[7]).B().break_(rRu_1.catch_)) {
         this.class_(xu_3.sl);
      }
   }

   public boolean goto_() {
      return this.protected_;
   }

   @Override
   public int continue_() {
      return 1;
   }

   @Override
   public int else_() {
      return 5;
   }

   @Override
   public double instanceof_() {
      return this.re() + 0.5;
   }

   @Override
   public double throw_() {
      return this.BO();
   }

   @Override
   public double try_() {
      return this.rx();
   }

   @Override
   public rYB while_() {
      return (rYB)this.throws_[7];
   }

   @Override
   public rsd_3 final_() {
      return rsd_3.HOPPER;
   }

   public void volatile_(int var1) {
      this.catch_ = var1;
   }
}
