package celestial;

import java.util.Random;

public class NL {
   private final Random id_class = new Random();
   private final QY id_break;
   private NQ id_byte;
   private int id_protected = 100;

   public NL(QY var1) {
      this.id_break = var1;
   }

   public void id_class(NS var1) {
      this.id_byte = Np_1.id_class(var1.id_class());
      if (this.id_byte.id_catch() != Nf_1.id_class) {
         this.id_break.c().id_class(this.id_byte);
      }

      this.id_protected = Integer.MAX_VALUE;
   }

   public void id_class() {
      NS var1 = this.id_break.id_try();
      if (this.id_byte != null) {
         if (!var1.id_class().id_class().equals(this.id_byte.id_case()) && var1.id_protected()) {
            this.id_break.c().id_break(this.id_byte);
            this.id_protected = rfU_2.id_class(this.id_class, 0, var1.id_break() / 2);
         }

         if (!this.id_break.c().id_byte(this.id_byte)) {
            this.id_byte = null;
            this.id_protected = Math.min(this.id_protected, rfU_2.id_class(this.id_class, var1.id_break(), var1.id_byte()));
         }
      }

      this.id_protected = Math.min(this.id_protected, var1.id_byte());
      if (this.id_byte == null && this.id_protected-- <= 0) {
         this.id_class(var1);
      }
   }

   public void id_break() {
      if (this.id_byte != null) {
         this.id_break.c().id_break(this.id_byte);
         this.id_byte = null;
      }

      this.id_protected += 100;
   }

   public boolean id_break(NS var1) {
      return this.id_byte == null ? false : var1.id_class().id_class().equals(this.id_byte.id_case());
   }
}
