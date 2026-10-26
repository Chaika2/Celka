package celestial;

import java.util.List;
import java.util.stream.Stream;

public abstract class rOt_1 extends rOp_1 {
   private rOt_1 class_;
   private int break_ = 1;

   public rOt_1(aI_2<? extends rOt_1> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public void this_() {
      super.this_();
      if (this.sz() && ((rYB)this.throws_[7]).int_.nextInt(200) == 1) {
         List var1 = ((rYB)this.throws_[7]).class_(this.getClass(), this.rN().byte_(8.0, 8.0, 8.0));
         if (var1.size() <= 1) {
            this.break_ = 1;
         }
      }
   }

   @Override
   protected boolean n() {
      return !this.sd();
   }

   @Override
   public aU_2 class_(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      super.class_(var1, var2, var3, (aU_2)var4, var5);
      if (var4 == null) {
         var4 = new rOw_1(this);
      } else {
         this.class_(((rOw_1)var4).class_);
      }

      return (aU_2)var4;
   }

   public void class_(Stream<rOt_1> var1) {
      var1.limit((long)(this.sx() - this.break_)).filter(var1x -> var1x != this).forEach(var1x -> var1x.class_(this));
   }

   public rOt_1 class_(rOt_1 var1) {
      this.class_ = var1;
      var1.sc();
      return var1;
   }

   private void sc() {
      this.break_++;
   }

   public boolean sd() {
      return this.class_ != null && this.class_.BM();
   }

   public int sx() {
      return super.E();
   }

   public void sk() {
      this.class_.su();
      this.class_ = null;
   }

   @Override
   protected void final_() {
      super.final_();
      this.package_.class_(5, new rBd_1(this));
   }

   @Override
   public int E() {
      return this.sx();
   }

   public boolean sz() {
      return this.break_ > 1;
   }

   public void sN() {
      if (this.sd()) {
         this.public_().class_(this.class_, 1.0);
      }
   }

   private void su() {
      this.break_--;
   }

   public boolean sW() {
      return this.sz() && this.break_ < this.sx();
   }

   public boolean sQ() {
      return this.int_(this.class_) <= 121.0;
   }
}
