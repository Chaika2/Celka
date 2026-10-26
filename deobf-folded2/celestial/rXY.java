package celestial;

class rXY extends rXA {
   rXY(rXR var1, int var2) {
      super(var2);
      this.id_class = var1;
   }

   @Override
   public void id_break() {
      this.id_class.id_class(this);
      super.id_break();
   }
}
