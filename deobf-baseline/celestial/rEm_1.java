package celestial;

import java.util.function.Predicate;

class rEm_1 extends rBI<rhd_3> {
   private final rEu_1 id_implements;
   private rhd_3 id_finally;
   private int id_extends;
   private int id_native;
   private final ay_3 id_volatile;
   private final ay_3 id_final = new ay_3().id_byte();

   @Override
   public void id_byte() {
      this.id_extends = 5;
      this.id_native = 0;
      this.id_implements.sz();
   }

   public rEm_1(rEu_1 var1, Predicate<iB_2> var2) {
      super(var1, rhd_3.class, 10, false, false, var2);
      this.id_implements = var1;
      this.id_volatile = new ay_3().id_class(this.id_extends()).id_class(var1x -> var1.id_case((rhd_3)var1x));
   }

   @Override
   public boolean id_class() {
      this.id_finally = ((rYB)this.id_implements.id_throws[7]).id_class(this.id_volatile, this.id_implements);
      return this.id_finally != null;
   }

   @Override
   public boolean id_break() {
      if (this.id_finally != null) {
         if (!this.id_implements.id_case(this.id_finally)) {
            return false;
         } else {
            this.id_implements.id_class(this.id_finally, 10.0F, 10.0F);
            return true;
         }
      } else {
         return this.id_byte != null && this.id_final.id_class(this.id_implements, this.id_byte) ? true : super.id_break();
      }
   }

   @Override
   public void id_throws() {
      if (this.id_implements.I_() == null) {
         super.id_class((iB_2)null);
      }

      if (this.id_finally != null) {
         if (--this.id_extends <= 0) {
            this.id_byte = this.id_finally;
            this.id_finally = null;
            super.id_byte();
         }
      } else {
         if (this.id_byte != null && !this.id_implements.Pm()) {
            if (this.id_implements.id_case((rhd_3)this.id_byte)) {
               if (this.id_byte.id_int(this.id_implements) < 16.0) {
                  this.id_implements.sx();
               }

               this.id_native = 0;
            } else if (this.id_byte.id_int(this.id_implements) > 256.0 && this.id_native++ >= 30 && this.id_implements.id_class(this.id_byte)) {
               this.id_native = 0;
            }
         }

         super.id_throws();
      }
   }

   @Override
   public void id_protected() {
      this.id_finally = null;
      super.id_protected();
   }
}
