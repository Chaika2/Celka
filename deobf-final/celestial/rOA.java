package celestial;

import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.Set;

class rOA extends rBk_1 {
   private static final ay_3 class_ = new ay_3().class_(10.0).break_().class_();
   private final rON break_;
   private final double byte_;
   private rhd_3 protected_;
   private int throws_;
   private final Set<rdb_3> case_;

   rOA(rON var1, double var2, rdb_3 var4) {
      this.break_ = var1;
      this.byte_ = var2;
      this.case_ = Sets.newHashSet(new rdb_3[]{var4});
      this.class_(EnumSet.of(rBW.MOVE, rBW.LOOK));
   }

   private boolean class_(rdn_3 var1) {
      return this.case_.contains(var1.break_());
   }

   @Override
   public boolean class_() {
      if (this.throws_ > 0) {
         this.throws_--;
         return false;
      } else {
         this.protected_ = ((rYB)this.break_.throws_[7]).class_(class_, this.break_);
         return this.protected_ == null ? false : this.class_(this.protected_.ss()) || this.class_(this.protected_.Sn());
      }
   }

   @Override
   public boolean break_() {
      return this.class_();
   }

   @Override
   public void throws_() {
      this.break_.continue_().class_(this.protected_, (float)(this.break_.S() + 20), (float)this.break_.r());
      if (this.break_.int_(this.protected_) < 6.25) {
         this.break_.public_().final_();
      } else {
         this.break_.public_().class_(this.protected_, this.byte_);
      }
   }

   @Override
   public void protected_() {
      this.protected_ = null;
      this.break_.public_().final_();
      this.throws_ = 100;
   }
}
