package celestial;

import java.util.EnumSet;

public class rBA extends rBk_1 {
   protected final is_3 class_;
   protected an_3 break_;
   protected final float byte_;
   private int catch_;
   protected final float protected_;
   protected final Class<? extends iB_2> throws_;
   protected final ay_3 case_;

   @Override
   public void byte_() {
      this.catch_ = 40 + this.class_.Sa().nextInt(40);
   }

   public rBA(is_3 var1, Class<? extends iB_2> var2, float var3) {
      this(var1, var2, var3, 0.02F);
   }

   public rBA(is_3 var1, Class<? extends iB_2> var2, float var3, float var4) {
      this.class_ = var1;
      this.throws_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.class_(EnumSet.of(rBW.LOOK));
      if (var2 == rhd_3.class) {
         this.case_ = new ay_3().class_((double)var3).break_().class_().protected_().class_(var1x -> rpJ_2.break_(var1).test(var1x));
      } else {
         this.case_ = new ay_3().class_((double)var3).break_().class_().protected_();
      }
   }

   @Override
   public boolean class_() {
      if (this.class_.Sa().nextFloat() >= this.protected_) {
         return false;
      } else {
         if (this.class_.I_() != null) {
            this.break_ = this.class_.I_();
         }

         if (this.throws_ == rhd_3.class) {
            this.break_ = ((rYB)this.class_.throws_[7]).class_(this.case_, this.class_, this.class_.rx(), this.class_.rH(), this.class_.BO());
         } else {
            this.break_ = ((rYB)this.class_.throws_[7])
               .break_(
                  this.throws_,
                  this.case_,
                  this.class_,
                  this.class_.rx(),
                  this.class_.rH(),
                  this.class_.BO(),
                  this.class_.rN().byte_((double)this.byte_, 3.0, (double)this.byte_)
               );
         }

         return this.break_ != null;
      }
   }

   @Override
   public boolean break_() {
      if (!this.break_.BM()) {
         return false;
      } else {
         return this.class_.int_(this.break_) > (double)(this.byte_ * this.byte_) ? false : this.catch_ > 0;
      }
   }

   @Override
   public void throws_() {
      this.class_.continue_().class_(this.break_.rx(), this.break_.rH(), this.break_.BO());
      this.catch_--;
   }

   @Override
   public void protected_() {
      this.break_ = null;
   }
}
