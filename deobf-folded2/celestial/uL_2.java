package celestial;

class uL_2 implements uJ_2 {
   private final int id_break;
   private final int id_byte;
   private final float id_protected;
   private final float id_throws;
   private final float id_case;
   private final int id_catch;

   @Override
   public float id_byte() {
      return this.id_class.id_byte;
   }

   uL_2(uF_2 var1, int var2, int var3, int var4, int var5, float var6, float var7, int var8) {
      this.id_class = var1;
      this.id_break = var3 - var2;
      this.id_byte = var4 - var5;
      this.id_case = var6 / var1.id_byte;
      this.id_protected = (var7 + (float)var2 + var1.id_throws) / var1.id_byte;
      this.id_throws = (var1.id_private - (float)var4 + var1.id_case) / var1.id_byte;
      this.id_catch = var8;
   }

   @Override
   public void id_class(int var1, int var2) {
      fN_2 var3 = new fN_2(fc_3.LUMINANCE, this.id_break, this.id_byte, false);
      var3.id_class(
         this.id_class.id_break,
         this.id_catch,
         this.id_break,
         this.id_byte,
         this.id_class.id_catch,
         this.id_class.id_catch,
         this.id_class.id_throws,
         this.id_class.id_case,
         0,
         0
      );
      var3.id_class(0, var1, var2, 0, 0, this.id_break, this.id_byte, false, true);
   }

   @Override
   public int id_class() {
      return this.id_break;
   }

   @Override
   public int id_break() {
      return this.id_byte;
   }

   @Override
   public float id_throws() {
      return this.id_protected;
   }

   @Override
   public boolean id_protected() {
      return false;
   }

   @Override
   public float id_native() {
      return this.id_throws;
   }

   @Override
   public float getAdvance() {
      return this.id_case;
   }
}
