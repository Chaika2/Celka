package celestial;

import java.util.EnumSet;

public class rhM_2 extends rSM {
   private final rhP_2 id_class;
   private iB_2 id_break;
   private int id_byte;

   @Override
   public void id_byte() {
      this.id_throws.id_byte(this.id_break);
      an_3 var1 = this.id_class.N();
      if (var1 instanceof rsU_2) {
         this.id_byte = ((rsU_2)var1).Sb();
      }

      super.id_byte();
   }

   public rhM_2(rhb_3 var1, rhP_2 var2) {
      super(var2, false);
      this.id_class = var2;
      this.id_class(EnumSet.of(rBW.TARGET));
   }

   @Override
   public boolean id_class() {
      if (!this.id_class.z()) {
         return false;
      } else if (!(this.id_class.N() instanceof rsU_2 var2)) {
         return false;
      } else {
         this.id_break = var2.Sr();
         int var3 = var2.Sb();
         return var3 != this.id_byte && this.id_class(this.id_break, ay_3.id_class);
      }
   }
}
