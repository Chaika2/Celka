package celestial;

import java.util.EnumSet;

public class rBl_1 extends rBk_1 {
   protected final aA_2 class_;
   private final double break_;
   private final boolean byte_;
   private rLC protected_;
   private double throws_;
   private double case_;
   private double catch_;
   private int private_;
   private int implements_;
   private final int finally_ = 20;
   private long extends_;

   @Override
   public void byte_() {
      this.class_.public_().class_(this.protected_, this.break_);
      this.class_.case_(true);
      this.private_ = 0;
      this.implements_ = 0;
   }

   public rBl_1(aA_2 var1, double var2, boolean var4) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var4;
      this.class_(EnumSet.of(rBW.MOVE, rBW.LOOK));
   }

   protected double class_(iB_2 var1) {
      return (double)(this.class_.PN() * 2.0F * this.class_.PN() * 2.0F + var1.PN());
   }

   protected void class_(iB_2 var1, double var2) {
      double var4 = this.class_(var1);
      if (var2 <= var4 && this.implements_ <= 0) {
         this.catch_();
         this.class_.class_(rpm_3.MAIN_HAND);
         this.class_.public_(var1);
      }
   }

   @Override
   public boolean class_() {
      long var1 = ((rYB)this.class_.throws_[7]).r();
      if (var1 - this.extends_ < 20L) {
         return false;
      } else {
         this.extends_ = var1;
         iB_2 var3 = this.class_.I_();
         if (var3 == null) {
            return false;
         } else if (!var3.BM()) {
            return false;
         } else {
            this.protected_ = this.class_.public_().class_(var3, 0);
            return this.protected_ != null ? true : this.class_(var3) >= this.class_.class_(var3.rx(), var3.re(), var3.BO());
         }
      }
   }

   @Override
   public boolean break_() {
      iB_2 var1 = this.class_.I_();
      if (var1 == null) {
         return false;
      } else if (!var1.BM()) {
         return false;
      } else if (!this.byte_) {
         return !this.class_.public_().native_();
      } else {
         return !this.class_.private_(var1.Bs()) ? false : !(var1 instanceof rhd_3) || !var1.native_() && !((rhd_3)var1).implements_();
      }
   }

   @Override
   public void throws_() {
      iB_2 var1 = this.class_.I_();
      this.class_.continue_().class_(var1, 30.0F, 30.0F);
      double var2 = this.class_.class_(var1.rx(), var1.re(), var1.BO());
      this.private_ = Math.max(this.private_ - 1, 0);
      if ((this.byte_ || this.class_.goto_().class_(var1))
         && this.private_ <= 0
         && (
            this.throws_ == 0.0 && this.case_ == 0.0 && this.catch_ == 0.0
               || var1.class_(this.throws_, this.case_, this.catch_) >= 1.0
               || this.class_.Sa().nextFloat() < 0.05F
         )) {
         this.throws_ = var1.rx();
         this.case_ = var1.re();
         this.catch_ = var1.BO();
         this.private_ = 4 + this.class_.Sa().nextInt(7);
         if (var2 > 1024.0) {
            this.private_ += 10;
         } else if (var2 > 256.0) {
            this.private_ += 5;
         }

         if (!this.class_.public_().class_(var1, this.break_)) {
            this.private_ += 15;
         }
      }

      this.implements_ = Math.max(this.implements_ - 1, 0);
      this.class_(var1, var2);
   }

   protected int finally_() {
      return this.implements_;
   }

   protected void catch_() {
      this.implements_ = 20;
   }

   protected int extends_() {
      return 20;
   }

   @Override
   public void protected_() {
      iB_2 var1 = this.class_.I_();
      if (!rpJ_2.throws_.test(var1)) {
         this.class_.byte_((iB_2)null);
      }

      this.class_.case_(false);
      this.class_.public_().final_();
   }

   protected boolean private_() {
      return this.implements_ <= 0;
   }
}
