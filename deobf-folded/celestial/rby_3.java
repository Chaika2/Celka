package celestial;

import java.util.EnumSet;

public class rby_3 extends rbq_3 {
   private int id_byte;

   @Override
   public void id_byte() {
      this.id_byte = 0;
      super.id_byte();
   }

   rby_3(rbF_2 var1) {
      super(var1);
      this.id_class = var1;
      this.id_byte = ((rYB)this.id_class.id_throws[7]).id_int.nextInt(10);
      this.id_class(EnumSet.of(rBW.MOVE));
   }

   @Override
   public void id_throws() {
      if (this.id_class.id_char != null) {
         this.id_byte++;
         if (this.id_byte > 600) {
            this.id_class.id_char = null;
         } else if (!rbF_2.id_volatile(this.id_class).id_volatile()) {
            if (this.id_class.id_native(this.id_class.id_char)) {
               this.id_class.id_char = null;
            } else {
               this.id_class.id_finally(this.id_class.id_char);
            }
         }
      }
   }

   private boolean id_finally() {
      return this.id_class.id_while > 2400;
   }

   @Override
   public boolean id_catch() {
      return this.id_class.id_char != null
         && !this.id_class.k()
         && this.id_finally()
         && this.id_class.id_volatile(this.id_class.id_char)
         && !this.id_class.id_break(this.id_class.id_char, 2);
   }

   @Override
   public void id_protected() {
      this.id_byte = 0;
      rbF_2.id_extends(this.id_class).id_final();
      rbF_2.id_native(this.id_class).id_case();
   }

   @Override
   public boolean id_private() {
      return this.id_catch();
   }
}
