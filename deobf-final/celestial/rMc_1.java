package celestial;

class rMc_1 extends rBA {
   public rMc_1(is_3 var1, Class<? extends iB_2> var2, float var3, float var4) {
      super(var2, var3, var4);
      this.catch_ = var1;
   }

   @Override
   public boolean class_() {
      return super.class_() && !this.catch_.sx() && !this.catch_.su();
   }

   @Override
   public boolean break_() {
      return super.break_() && !this.catch_.sx() && !this.catch_.su();
   }
}
