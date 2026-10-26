package celestial;

public class rSS extends rBU {
   public rSS(aA_2 var1, double var2, boolean var4) {
      super(var1, var2, 10, var4);
   }

   @Override
   public boolean class_() {
      rrEm_1 var1 = (rrEm_1)((rYB)this.class_.throws_[7]);
      rfH_2 var2 = this.class_.Bs();
      return var1.throw_(var2) ? false : super.class_();
   }

   @Override
   protected rjU_2 catch_() {
      rrEm_1 var1 = (rrEm_1)((rYB)this.class_.throws_[7]);
      rfH_2 var2 = this.class_.Bs();
      rjh_3 var3 = rjh_3.class_(var2);
      rjh_3 var4 = iA_2.class_(var1, var3, 2);
      return var4 != var3 ? iX_2.break_(this.class_, 10, 7, rjU_2.protected_(var4.int_())) : null;
   }
}
