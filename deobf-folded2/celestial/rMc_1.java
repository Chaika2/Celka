package celestial;

class rMc_1 extends rBA {
   public rMc_1(is_3 var1, Class<? extends iB_2> var2, float var3, float var4) {
      super(var2, var3, var4);
      this.id_catch = var1;
   }

   @Override
   public boolean id_class() {
      return super.id_class() && !this.id_catch.sx() && !this.id_catch.su();
   }

   @Override
   public boolean id_break() {
      return super.id_break() && !this.id_catch.sx() && !this.id_catch.su();
   }
}
