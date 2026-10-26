package celestial;

public class rBD extends rBU {
   public rBD(aA_2 var1, double var2, int var4) {
      super(var1, var2, var4);
   }

   @Override
   protected rjU_2 id_catch() {
      rjU_2 var1 = iX_2.id_class(this.id_class, 10, 7);
      int var2 = 0;

      while (
         var1 != null
            && !((rYB)this.id_class.id_throws[7]).id_byte(new rfH_2(var1)).id_class((rYB)this.id_class.id_throws[7], new rfH_2(var1), rLT.WATER)
            && var2++ < 10
      ) {
         var1 = iX_2.id_class(this.id_class, 10, 7);
      }

      return var1;
   }
}
