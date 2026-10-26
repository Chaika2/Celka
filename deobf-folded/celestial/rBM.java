package celestial;

public class rBM extends rBk_1 {
   private final aA_2 id_class;

   @Override
   public void id_byte() {
      rfH_2 var1 = null;

      for (rfH_2 var3 : rfH_2.id_break(
         rfU_2.id_byte(this.id_class.rx() - 2.0),
         rfU_2.id_byte(this.id_class.re() - 2.0),
         rfU_2.id_byte(this.id_class.BO() - 2.0),
         rfU_2.id_byte(this.id_class.rx() + 2.0),
         rfU_2.id_byte(this.id_class.re()),
         rfU_2.id_byte(this.id_class.BO() + 2.0)
      )) {
         if (((rYB)this.id_class.id_throws[7]).id_break(var3).id_class(rlG_2.id_break)) {
            var1 = var3;
            break;
         }
      }

      if (var1 != null) {
         this.id_class.id_super().id_class((double)var1.b_(), (double)var1.c_(), (double)var1.d_(), 1.0);
      }
   }

   public rBM(aA_2 var1) {
      this.id_class = var1;
   }

   @Override
   public boolean id_class() {
      return this.id_class.BL() && !((rYB)this.id_class.id_throws[7]).id_break(this.id_class.Bs()).id_class(rlG_2.id_break);
   }
}
