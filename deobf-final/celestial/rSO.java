package celestial;

import java.util.EnumSet;

public class rSO extends rBk_1 {
   private static final ay_3 byte_ = new ay_3().class_(10.0).class_().break_().protected_().byte_();
   protected final aA_2 class_;
   private final double protected_;
   private double throws_;
   private double case_;
   private double catch_;
   private double private_;
   private double implements_;
   protected rhd_3 break_;
   private int finally_;
   private boolean extends_;
   private final rkg_3 native_;
   private final boolean volatile_;

   @Override
   public void byte_() {
      this.throws_ = this.break_.rx();
      this.case_ = this.break_.re();
      this.catch_ = this.break_.BO();
      this.extends_ = true;
   }

   public rSO(aA_2 var1, double var2, rkg_3 var4, boolean var5) {
      this(var1, var2, var5, var4);
   }

   public rSO(aA_2 var1, double var2, boolean var4, rkg_3 var5) {
      this.class_ = var1;
      this.protected_ = var2;
      this.native_ = var5;
      this.volatile_ = var4;
      this.class_(EnumSet.of(rBW.MOVE, rBW.LOOK));
      if (!(var1.public_() instanceof rLA) && !(var1.public_() instanceof rLL)) {
         throw new IllegalArgumentException("Unsupported mob type for TemptGoal");
      }
   }

   @Override
   public boolean class_() {
      if (this.finally_ > 0) {
         this.finally_--;
         return false;
      } else {
         this.break_ = ((rYB)this.class_.throws_[7]).class_(byte_, this.class_);
         return this.break_ == null ? false : this.class_(this.break_.ss()) || this.class_(this.break_.Sn());
      }
   }

   protected boolean class_(rdn_3 var1) {
      return this.native_.class_(var1);
   }

   @Override
   public boolean break_() {
      if (this.catch_()) {
         if (this.class_.int_(this.break_) < 36.0) {
            if (this.break_.class_(this.throws_, this.case_, this.catch_) > 0.010000000000000002) {
               return false;
            }

            if (Math.abs((double)((Float)this.break_.throws_[16]).floatValue() - this.private_) > 5.0
               || Math.abs((double)((Float)this.break_.throws_[15]).floatValue() - this.implements_) > 5.0) {
               return false;
            }
         } else {
            this.throws_ = this.break_.rx();
            this.case_ = this.break_.re();
            this.catch_ = this.break_.BO();
         }

         this.private_ = (double)((Float)this.break_.throws_[16]).floatValue();
         this.implements_ = (double)((Float)this.break_.throws_[15]).floatValue();
      }

      return this.class_();
   }

   @Override
   public void throws_() {
      this.class_.continue_().class_(this.break_, (float)(this.class_.S() + 20), (float)this.class_.r());
      if (this.class_.int_(this.break_) < 6.25) {
         this.class_.public_().final_();
      } else {
         this.class_.public_().class_(this.break_, this.protected_);
      }
   }

   protected boolean catch_() {
      return this.volatile_;
   }

   @Override
   public void protected_() {
      this.break_ = null;
      this.class_.public_().final_();
      this.finally_ = 100;
      this.extends_ = false;
   }

   public boolean private_() {
      return this.extends_;
   }
}
