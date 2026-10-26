package celestial;

import java.util.EnumSet;

public class rBU extends rBk_1 {
   protected final aA_2 id_class;
   protected double id_break;
   protected double id_byte;
   protected double id_protected;
   protected final double id_throws;
   protected int id_case;
   protected boolean id_catch;
   private boolean id_private;

   @Override
   public void id_byte() {
      this.id_class.id_public().id_class(this.id_break, this.id_byte, this.id_protected, this.id_throws);
   }

   public rBU(aA_2 var1, double var2, int var4, boolean var5) {
      this.id_class = var1;
      this.id_throws = var2;
      this.id_case = var4;
      this.id_private = var5;
      this.id_class(EnumSet.of(rBW.MOVE));
   }

   public rBU(aA_2 var1, double var2, int var4) {
      this(var1, var2, var4, true);
   }

   public rBU(aA_2 var1, double var2) {
      this(var1, var2, 120);
   }

   public void id_class(int var1) {
      this.id_case = var1;
   }

   @Override
   public boolean id_class() {
      if (this.id_class.BP()) {
         return false;
      } else {
         if (!this.id_catch) {
            if (this.id_private && this.id_class.BI() >= 100) {
               return false;
            }

            if (this.id_class.Sa().nextInt(this.id_case) != 0) {
               return false;
            }
         }

         rjU_2 var1 = this.id_catch();
         if (var1 == null) {
            return false;
         } else {
            this.id_break = var1.id_break;
            this.id_byte = var1.id_byte;
            this.id_protected = var1.id_protected;
            this.id_catch = false;
            return true;
         }
      }
   }

   @Override
   public boolean id_break() {
      return !this.id_class.id_public().id_native() && !this.id_class.BP();
   }

   protected rjU_2 id_catch() {
      return iX_2.id_class(this.id_class, 10, 7);
   }

   @Override
   public void id_protected() {
      this.id_class.id_public().id_final();
      super.id_protected();
   }

   public void id_private() {
      this.id_catch = true;
   }
}
