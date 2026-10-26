package celestial;

public class rSd_1 extends rSk_1 {
   public rSd_1(aA_2 var1, double var2) {
      super(var1, var2);
   }

   private rjU_2 id_finally() {
      rfH_2 var1 = this.id_class.Bs();
      rfw_3 var2 = new rfw_3();
      rfw_3 var3 = new rfw_3();

      for (rfH_2 var5 : rfH_2.id_break(
         rfU_2.id_byte(this.id_class.rx() - 3.0),
         rfU_2.id_byte(this.id_class.re() - 6.0),
         rfU_2.id_byte(this.id_class.BO() - 3.0),
         rfU_2.id_byte(this.id_class.rx() + 3.0),
         rfU_2.id_byte(this.id_class.re() + 6.0),
         rfU_2.id_byte(this.id_class.BO() + 3.0)
      )) {
         if (!var1.equals(var5)) {
            xd_3 var6 = ((rYB)this.id_class.id_throws[7]).id_byte(var3.id_class(var5, rpr_3.DOWN)).id_break();
            boolean var7 = var6 instanceof kZ_2 || var6.id_class(rls_3.id_super);
            if (var7 && ((rYB)this.id_class.id_throws[7]).id_finally(var5) && ((rYB)this.id_class.id_throws[7]).id_finally(var2.id_class(var5, rpr_3.UP))) {
               return rjU_2.id_protected(var5);
            }
         }
      }

      return null;
   }

   @Override
   protected rjU_2 id_catch() {
      rjU_2 var1 = null;
      if (this.id_class.rT()) {
         var1 = iX_2.id_break(this.id_class, 15, 15);
      }

      if (this.id_class.Sa().nextFloat() >= this.id_private) {
         var1 = this.id_finally();
      }

      return var1 == null ? super.id_catch() : var1;
   }
}
