package celestial;

public class rBD extends rBU {
   public rBD(aA_2 var1, double var2, int var4) {
      super(var1, var2, var4);
   }

   @Override
   protected rjU_2 catch_() {
      rjU_2 var1 = iX_2.class_(this.class_, 10, 7);
      int var2 = 0;

      while (
         var1 != null && !((rYB)this.class_.throws_[7]).byte_(new rfH_2(var1)).class_((rYB)this.class_.throws_[7], new rfH_2(var1), rLT.WATER) && var2++ < 10
      ) {
         var1 = iX_2.class_(this.class_, 10, 7);
      }

      return var1;
   }
}
