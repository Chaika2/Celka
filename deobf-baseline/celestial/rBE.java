package celestial;

import java.util.EnumSet;
import java.util.List;

public class rBE extends rSM {
   private final rMZ id_class;
   private iB_2 id_break;
   private final ay_3 id_byte = new ay_3().id_class(64.0);

   @Override
   public void id_byte() {
      this.id_class.id_byte(this.id_break);
      super.id_byte();
   }

   public rBE(rMZ var1) {
      super(var1, false, true);
      this.id_class = var1;
      this.id_class(EnumSet.of(rBW.TARGET));
   }

   @Override
   public boolean id_class() {
      rfl_3 var1 = this.id_class.rN().id_byte(10.0, 8.0, 10.0);
      List var2 = ((rYB)this.id_class.id_throws[7]).id_class(rsq_3.class, this.id_byte, this.id_class, var1);
      List var3 = ((rYB)this.id_class.id_throws[7]).id_class(this.id_byte, this.id_class, var1);

      for (iB_2 var5 : var2) {
         rsq_3 var6 = (rsq_3)var5;

         for (rhd_3 var8 : var3) {
            int var9 = var6.id_throws(var8);
            if (var9 <= -100) {
               this.id_break = var8;
            }
         }
      }

      return this.id_break == null ? false : !(this.id_break instanceof rhd_3) || !this.id_break.id_native() && !((rhd_3)this.id_break).id_implements();
   }
}
