package celestial;

import java.util.EnumSet;

public class rSG extends rBk_1 {
   private final rOQ id_class;

   @Override
   public void id_byte() {
      this.id_class.id_public().id_final();
      this.id_class.id_public(true);
   }

   public rSG(rOQ var1) {
      this.id_class = var1;
      this.id_class(EnumSet.of(rBW.JUMP, rBW.MOVE));
   }

   @Override
   public boolean id_class() {
      if (!this.id_class.sZ()) {
         return false;
      } else if (this.id_class.Pa()) {
         return false;
      } else if (!this.id_class.BL()) {
         return false;
      } else {
         iB_2 var1 = this.id_class.sF();
         if (var1 == null) {
            return true;
         } else {
            return this.id_class.id_int(var1) < 144.0 && var1.Sr() != null ? false : this.id_class.sL();
         }
      }
   }

   @Override
   public boolean id_break() {
      return this.id_class.sL();
   }

   @Override
   public void id_protected() {
      this.id_class.id_public(false);
   }
}
