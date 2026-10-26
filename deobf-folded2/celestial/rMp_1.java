package celestial;

class rMp_1 extends rBk_1 {
   private final rMl_1 id_class;

   @Override
   public void id_byte() {
      this.id_class.id_return(true);
   }

   public rMp_1(rMl_1 var1) {
      this.id_class = var1;
   }

   @Override
   public boolean id_class() {
      if (this.id_class.n_() && this.id_class.sy()) {
         return this.id_class.sC() && rMl_1.id_class(this.id_class).nextInt(500) == 1 ? true : rMl_1.id_break(this.id_class).nextInt(6000) == 1;
      } else {
         return false;
      }
   }

   @Override
   public boolean id_break() {
      return false;
   }
}
