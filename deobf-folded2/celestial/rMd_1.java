package celestial;

import java.util.UUID;
import java.util.function.Predicate;

class rMd_1 extends rBI<iB_2> {
   private iB_2 id_finally;
   private iB_2 id_extends;
   private int id_native;

   @Override
   public void id_byte() {
      this.id_class(this.id_finally);
      this.id_byte = this.id_finally;
      if (this.id_extends != null) {
         this.id_native = this.id_extends.Sb();
      }

      this.id_implements.id_class(rqn_3.Su, 1.0F, 1.0F);
      this.id_implements.id_goto(true);
      this.id_implements.sF();
      super.id_byte();
   }

   public rMd_1(Class<iB_2> var1, boolean var2, boolean var3, Predicate<iB_2> var4, Predicate var5) {
      super(var1, var2, 10, var3, var4, var5);
      this.id_implements = var1;
   }

   @Override
   public boolean id_class() {
      if (this.id_break > 0 && this.id_throws.Sa().nextInt(this.id_break) != 0) {
         return false;
      } else {
         for (UUID var2 : this.id_implements.sZ()) {
            if (var2 != null
               && (rYB)this.id_implements.id_throws[7] instanceof rrEm_1
               && ((rrEm_1)((rYB)this.id_implements.id_throws[7])).id_break(var2) instanceof iB_2 var4) {
               this.id_extends = var4;
               this.id_finally = var4.Sr();
               int var5 = var4.Sb();
               return var5 != this.id_native && this.id_class(this.id_finally, this.id_protected);
            }
         }

         return false;
      }
   }
}
