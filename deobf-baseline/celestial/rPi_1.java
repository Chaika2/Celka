package celestial;

import java.util.function.Predicate;

public class rPi_1 extends rBu_1 {
   private final Predicate<rRO> id_catch;
   protected int id_class;
   protected int id_break = -1;
   protected int id_byte = -1;

   @Override
   public void id_byte() {
      super.id_byte();
      this.id_class = 0;
   }

   public rPi_1(is_3 var1, Predicate<rRO> var2) {
      super(var1);
      this.id_catch = var2;
   }

   public rPi_1(is_3 var1, int var2, Predicate<rRO> var3) {
      this(var1, var3);
      this.id_byte = var2;
   }

   private boolean id_class(rRO var1) {
      return this.id_catch.test(var1);
   }

   @Override
   public boolean id_class() {
      if (!super.id_class()) {
         return false;
      } else {
         return !((rYB)this.id_protected.id_throws[7]).B().id_break(rRu_1.id_break)
            ? false
            : this.id_class(((rYB)this.id_protected.id_throws[7]).id_abstract()) && !this.id_catch();
      }
   }

   @Override
   public boolean id_break() {
      return this.id_class <= this.id_case()
         && !this.id_catch()
         && this.id_throws.id_class(this.id_protected.Ps(), 2.0)
         && this.id_class(((rYB)this.id_protected.id_throws[7]).id_abstract());
   }

   @Override
   public void id_throws() {
      super.id_throws();
      if (this.id_protected.Sa().nextInt(20) == 0) {
         ((rYB)this.id_protected.id_throws[7]).id_byte(1019, this.id_throws, 0);
         if (!(Boolean)this.id_protected.id_private[5]) {
            this.id_protected.id_class(this.id_protected.P());
         }
      }

      this.id_class++;
      int var1 = (int)((float)this.id_class / (float)this.id_case() * 10.0F);
      if (var1 != this.id_break) {
         ((rYB)this.id_protected.id_throws[7]).id_class(this.id_protected.V(), this.id_throws, var1);
         this.id_break = var1;
      }

      if (this.id_class == this.id_case() && this.id_class(((rYB)this.id_protected.id_throws[7]).id_abstract())) {
         ((rYB)this.id_protected.id_throws[7]).id_class(this.id_throws, false);
         ((rYB)this.id_protected.id_throws[7]).id_byte(1021, this.id_throws, 0);
         ((rYB)this.id_protected.id_throws[7]).id_byte(2001, this.id_throws, xd_3.id_finally(((rYB)this.id_protected.id_throws[7]).id_byte(this.id_throws)));
      }
   }

   protected int id_case() {
      return Math.max(240, this.id_byte);
   }

   @Override
   public void id_protected() {
      super.id_protected();
      ((rYB)this.id_protected.id_throws[7]).id_class(this.id_protected.V(), this.id_throws, -1);
   }
}
