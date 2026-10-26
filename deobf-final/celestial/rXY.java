package celestial;

class rXY extends rXA {
   rXY(rXR var1, int var2) {
      super(var2);
      this.class_ = var1;
   }

   @Override
   public void break_() {
      this.class_.class_(this);
      super.break_();
   }
}
