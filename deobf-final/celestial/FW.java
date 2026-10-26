package celestial;

abstract class FW extends FJ {
   private final int class_;
   private final int throws_;

   protected FW(int var1, int var2, int var3, int var4) {
      super(var1, var2);
      this.class_ = var3;
      this.throws_ = var4;
   }

   @Override
   protected void class_(Ml_1 var1) {
      this.break_(var1, this.volatile_ + 2, this.final_ + 2, this.class_, this.throws_, 18, 18);
   }
}
