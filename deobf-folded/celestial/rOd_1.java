package celestial;

class rOd_1 extends rBk_1 {
   private final rOJ id_class;

   public rOd_1(rOJ var1, rOJ var2) {
      this.id_class = var2;
   }

   @Override
   public boolean id_class() {
      return true;
   }

   @Override
   public void id_throws() {
      int var1 = this.id_class.BI();
      if (var1 > 100) {
         this.id_class.id_byte(0.0F, 0.0F, 0.0F);
      } else if (this.id_class.Sa().nextInt(50) == 0 || !rOJ.id_class(this.id_class) || !this.id_class.L()) {
         float var2 = this.id_class.Sa().nextFloat() * (float) (Math.PI * 2);
         float var3 = rfU_2.id_break(var2) * 0.2F;
         float var4 = -0.1F + this.id_class.Sa().nextFloat() * 0.2F;
         float var5 = rfU_2.id_class(var2) * 0.2F;
         this.id_class.id_byte(var3, var4, var5);
      }
   }
}
