package celestial;

import java.util.List;

public class rEH extends rGt_1 {
   private final ay_3 throws_;

   public rEH(rEA var1) {
      super(var1);
      this.class_ = var1;
      this.throws_ = new ay_3().class_(16.0).class_().class_(var0 -> ((rOb_1)var0).n() == rxL_2.BLUE);
   }

   @Override
   public boolean class_() {
      if (this.class_.I_() != null) {
         return false;
      } else if (this.class_.sn()) {
         return false;
      } else if ((Integer)this.class_.throws_[41] < this.byte_) {
         return false;
      } else if (!((rYB)this.class_.throws_[7]).B().break_(rRu_1.break_)) {
         return false;
      } else {
         List var1 = ((rYB)this.class_.throws_[7]).class_(rOb_1.class, this.throws_, this.class_, this.class_.rN().byte_(16.0, 4.0, 16.0));
         if (var1.isEmpty()) {
            return false;
         } else {
            this.class_.class_((rOb_1)var1.get(rEA.throws_(this.class_).nextInt(var1.size())));
            return true;
         }
      }
   }

   @Override
   public boolean break_() {
      return this.class_.sH() != null && this.break_ > 0;
   }

   @Override
   protected void finally_() {
      rOb_1 var1 = this.class_.sH();
      if (var1 != null && var1.BM()) {
         var1.break_(rxL_2.RED);
      }
   }

   @Override
   protected int catch_() {
      return 60;
   }

   @Override
   protected rqA_2 extends_() {
      return rqn_3.Sr;
   }

   @Override
   public void protected_() {
      super.protected_();
      this.class_.class_((rOb_1)null);
   }

   @Override
   protected int private_() {
      return 140;
   }

   @Override
   protected int volatile_() {
      return 40;
   }

   @Override
   protected rGT native_() {
      return rGT.WOLOLO;
   }
}
