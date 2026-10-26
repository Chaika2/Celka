package celestial;

import java.util.EnumSet;

public class rBR extends rSM {
   private final rOQ id_class;
   private iB_2 id_break;
   private int id_byte;

   @Override
   public void id_byte() {
      this.id_throws.id_byte(this.id_break);
      iB_2 var1 = this.id_class.sF();
      if (var1 != null) {
         this.id_byte = var1.SE();
      }

      super.id_byte();
   }

   public rBR(rOQ var1) {
      super(var1, false);
      this.id_class = var1;
      this.id_class(EnumSet.of(rBW.TARGET));
   }

   @Override
   public boolean id_class() {
      if (this.id_class.sZ() && !this.id_class.sL()) {
         iB_2 var1 = this.id_class.sF();
         if (var1 == null) {
            return false;
         } else {
            this.id_break = var1.SZ();
            int var2 = var1.SE();
            return var2 != this.id_byte && this.id_class(this.id_break, ay_3.id_class) && this.id_class.id_class(this.id_break, var1);
         }
      } else {
         return false;
      }
   }
}
