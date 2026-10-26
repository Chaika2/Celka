package celestial;

public class rBZ extends rBk_1 {
   private final rOh_1 id_class;
   private rhN_2 id_break;
   private boolean id_byte;

   @Override
   public void id_byte() {
      this.id_break = (rhN_2)this.id_class.sF();
      this.id_byte = false;
   }

   public rBZ(rOh_1 var1) {
      this.id_class = var1;
   }

   @Override
   public boolean id_class() {
      rhN_2 var1 = (rhN_2)this.id_class.sF();
      boolean var2 = var1 != null && !var1.id_native() && !((rhx_3)var1.id_implements[18]).id_break && !var1.rT();
      return !this.id_class.sL() && var2 && this.id_class.sd();
   }

   @Override
   public void id_throws() {
      if (!this.id_byte && !this.id_class.Sc() && !this.id_class.z() && this.id_class.rN().id_byte(this.id_break.rN())) {
         this.id_byte = this.id_class.id_protected(this.id_break);
      }
   }

   @Override
   public boolean J_() {
      return !this.id_byte;
   }
}
