package celestial;

class rOd_1 extends rBk_1 {
   private final rOJ class_;

   public rOd_1(rOJ var1, rOJ var2) {
      this.class_ = var2;
   }

   @Override
   public boolean class_() {
      return true;
   }

   @Override
   public void throws_() {
      int var1 = this.class_.BI();
      if (var1 > 100) {
         this.class_.byte_(0.0F, 0.0F, 0.0F);
      } else if (this.class_.Sa().nextInt(50) == 0 || !rOJ.class_(this.class_) || !this.class_.L()) {
         float var2 = this.class_.Sa().nextFloat() * (float) (Math.PI * 2);
         float var3 = rfU_2.break_(var2) * 0.2F;
         float var4 = -0.1F + this.class_.Sa().nextFloat() * 0.2F;
         float var5 = rfU_2.class_(var2) * 0.2F;
         this.class_.byte_(var3, var4, var5);
      }
   }
}
