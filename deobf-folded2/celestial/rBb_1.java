package celestial;

import java.util.EnumSet;
import java.util.function.Predicate;

public class rBb_1 extends rBk_1 {
   private static final Predicate<xc_3> id_class = Qd_1.id_class(xu_3.e);
   private final is_3 id_break;
   private final rYB id_byte;
   private int id_protected;

   @Override
   public void id_byte() {
      this.id_protected = 40;
      this.id_byte.id_class(this.id_break, (byte)10);
      this.id_break.id_public().id_final();
   }

   public rBb_1(is_3 var1) {
      this.id_break = var1;
      this.id_byte = (rYB)var1.id_throws[7];
      this.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK, rBW.JUMP));
   }

   @Override
   public boolean id_class() {
      if (this.id_break.Sa().nextInt(this.id_break.n_() ? 50 : 1000) != 0) {
         return false;
      } else {
         rfH_2 var1 = this.id_break.Bs();
         return id_class.test(this.id_byte.id_byte(var1)) ? true : this.id_byte.id_byte(var1.id_break()).id_class(xu_3.id_implements);
      }
   }

   @Override
   public boolean id_break() {
      return this.id_protected > 0;
   }

   @Override
   public void id_throws() {
      this.id_protected = Math.max(0, this.id_protected - 1);
      if (this.id_protected == 4) {
         rfH_2 var1 = this.id_break.Bs();
         if (id_class.test(this.id_byte.id_byte(var1))) {
            if (this.id_byte.B().id_break(rRu_1.id_break)) {
               this.id_byte.id_break(var1, false);
            }

            this.id_break.id_instanceof();
         } else {
            rfH_2 var2 = var1.id_break();
            if (this.id_byte.id_byte(var2).id_class(xu_3.id_implements)) {
               if (this.id_byte.B().id_break(rRu_1.id_break)) {
                  this.id_byte.id_byte(2001, var2, xd_3.id_finally(xu_3.id_implements.id_continue()));
                  this.id_byte.id_class(var2, xu_3.id_finally.id_continue(), 2);
               }

               this.id_break.id_instanceof();
            }
         }
      }
   }

   public int id_catch() {
      return this.id_protected;
   }

   @Override
   public void id_protected() {
      this.id_protected = 0;
   }
}
