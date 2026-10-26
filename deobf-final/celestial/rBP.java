package celestial;

import java.util.EnumSet;
import java.util.List;

public class rBP extends rBk_1 {
   private static final ay_3 protected_ = new ay_3().class_(8.0).class_().break_().byte_();
   protected final rbZ_2 class_;
   private final Class<? extends rbZ_2> throws_;
   protected final rYB break_;
   protected rbZ_2 byte_;
   private int case_;
   private final double catch_;

   public rBP(rbZ_2 var1, double var2) {
      this(var1, var2, (Class<? extends rbZ_2>)var1.getClass());
   }

   public rBP(rbZ_2 var1, double var2, Class<? extends rbZ_2> var4) {
      this.class_ = var1;
      this.break_ = (rYB)var1.throws_[7];
      this.throws_ = var4;
      this.catch_ = var2;
      this.class_(EnumSet.of(rBW.MOVE, rBW.LOOK));
   }

   @Override
   public boolean class_() {
      if (!this.class_.sQ()) {
         return false;
      } else {
         this.byte_ = this.private_();
         return this.byte_ != null;
      }
   }

   @Override
   public boolean break_() {
      return this.byte_.BM() && this.byte_.sQ() && this.case_ < 60;
   }

   @Override
   public void throws_() {
      this.class_.continue_().class_(this.byte_, 10.0F, (float)this.class_.r());
      this.class_.public_().class_(this.byte_, this.catch_);
      this.case_++;
      if (this.case_ >= 60 && this.class_.int_(this.byte_) < 9.0) {
         this.catch_();
      }
   }

   protected void catch_() {
      this.class_.class_((rrEm_1)this.break_, this.byte_);
   }

   @Override
   public void protected_() {
      this.byte_ = null;
      this.case_ = 0;
   }

   private rbZ_2 private_() {
      List var1 = this.break_.class_(this.throws_, protected_, this.class_, this.class_.rN().class_(8.0));
      double var2 = Double.MAX_VALUE;
      rbZ_2 var4 = null;

      for (rbZ_2 var6 : var1) {
         if (this.class_.class_(var6) && this.class_.int_(var6) < var2) {
            var4 = var6;
            var2 = this.class_.int_(var6);
         }
      }

      return var4;
   }
}
