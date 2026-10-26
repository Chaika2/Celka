package celestial;

class rMg_1 extends rBA {
   private final rMl_1 id_catch;

   public rMg_1(rMl_1 var1, Class<? extends iB_2> var2, float var3) {
      super(var1, var2, var3);
      this.id_catch = var1;
   }

   public void id_class(iB_2 var1) {
      this.id_break = var1;
   }

   @Override
   public boolean id_class() {
      if (this.id_class.Sa().nextFloat() >= this.id_protected) {
         return false;
      } else {
         if (this.id_break == null) {
            if (this.id_throws == rhd_3.class) {
               this.id_break = ((rYB)this.id_class.id_throws[7])
                  .id_class(this.id_case, this.id_class, this.id_class.rx(), this.id_class.rH(), this.id_class.BO());
            } else {
               this.id_break = ((rYB)this.id_class.id_throws[7])
                  .id_break(
                     this.id_throws,
                     this.id_case,
                     this.id_class,
                     this.id_class.rx(),
                     this.id_class.rH(),
                     this.id_class.BO(),
                     this.id_class.rN().id_byte((double)this.id_byte, 3.0, (double)this.id_byte)
                  );
            }
         }

         return this.id_catch.sy() && this.id_break != null;
      }
   }

   @Override
   public boolean id_break() {
      return this.id_break != null && super.id_break();
   }

   @Override
   public void id_throws() {
      if (this.id_break != null) {
         super.id_throws();
      }
   }
}
