package celestial;

import com.mojang.datafixers.util.Pair;

class rJt_1 extends rJY {
   rJt_1(rJT var1, rXu_1 var2, int var3, int var4, int var5, rXQ var6) {
      super(var2, var3, var4, var5);
      this.class_ = var6;
   }

   @Override
   public boolean class_(rhd_3 var1) {
      rdn_3 var2 = this.class_();
      return !var2.class_() && !var1.implements_() && eA_2.protected_(var2) ? false : super.class_(var1);
   }

   @Override
   public boolean class_(rdn_3 var1) {
      return this.class_ == is_3.finally_(var1);
   }

   @Override
   public Pair<rqO_2, rqO_2> throws_() {
      return Pair.of(rJT.class_, rJT.implements_[this.class_.break_()]);
   }

   @Override
   public int protected_() {
      return 1;
   }
}
