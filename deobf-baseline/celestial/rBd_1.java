package celestial;

import java.util.List;
import java.util.function.Predicate;

public class rBd_1 extends rBk_1 {
   private final rOt_1 id_class;
   private int id_break;
   private int id_byte;

   @Override
   public void id_byte() {
      this.id_break = 0;
   }

   public rBd_1(rOt_1 var1) {
      this.id_class = var1;
      this.id_byte = this.id_class(var1);
   }

   protected int id_class(rOt_1 var1) {
      return 200 + var1.Sa().nextInt(200) % 20;
   }

   @Override
   public boolean id_class() {
      if (this.id_class.sz()) {
         return false;
      } else if (this.id_class.sd()) {
         return true;
      } else if (this.id_byte > 0) {
         this.id_byte--;
         return false;
      } else {
         this.id_byte = this.id_class(this.id_class);
         Predicate var1 = var0 -> var0.sW() || !var0.sd();
         List var2 = ((rYB)this.id_class.id_throws[7]).id_class(this.id_class.getClass(), this.id_class.rN().id_byte(8.0, 8.0, 8.0), var1);
         rOt_1 var3 = var2.stream().filter(rOt_1::sW).findAny().orElse(this.id_class);
         var3.id_class(var2.stream().filter(var0 -> !var0.sd()));
         return this.id_class.sd();
      }
   }

   @Override
   public boolean id_break() {
      return this.id_class.sd() && this.id_class.sQ();
   }

   @Override
   public void id_throws() {
      if (--this.id_break <= 0) {
         this.id_break = 10;
         this.id_class.sN();
      }
   }

   @Override
   public void id_protected() {
      this.id_class.sk();
   }
}
