package celestial;

class rVo_1 implements rpv_3 {
   private float id_break;
   private int id_byte;

   public rVo_1(rVj_1 var1, float var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public int id_class() {
      return this.id_byte;
   }

   @Override
   public boolean accept(int var1, rgc_3 var2, int var3) {
      this.id_break = this.id_break - this.id_class.id_class.getWidth(var3, var2);
      if (this.id_break >= 0.0F) {
         this.id_byte = var1 + Character.charCount(var3);
         return true;
      } else {
         return false;
      }
   }

   public void id_break() {
      this.id_byte = 0;
   }
}
