package celestial;

public class Cv_1 extends lO_2 {
   Cv_1(gm_3 var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.id_finally *= 0.8F;
      this.id_extends *= 0.8F;
      this.id_native *= 0.8F;
      this.id_extends = (double)(this.id_continue.nextFloat() * 0.4F + 0.05F);
      this.id_throw = this.id_throw * (this.id_continue.nextFloat() * 2.0F + 0.2F);
      this.id_this = (int)(16.0 / (Math.random() * 0.8 + 0.2));
   }

   @Override
   public CJ id_class() {
      return CJ.id_break;
   }

   @Override
   public float id_class(float var1) {
      float var2 = ((float)this.id_super + var1) / (float)this.id_this;
      return this.id_throw * (1.0F - var2 * var2);
   }

   @Override
   public int id_break(float var1) {
      int var2 = super.id_break(var1);
      short var3 = 240;
      int var4 = var2 >> 16 & 0xFF;
      return 240 | var4 << 16;
   }

   @Override
   public void id_case() {
      this.id_protected = this.id_catch;
      this.id_throws = this.id_private;
      this.id_case = this.id_implements;
      float var1 = (float)this.id_super / (float)this.id_this;
      if (this.id_continue.nextFloat() > var1) {
         this.id_byte.id_class(rLQ.id_double, this.id_catch, this.id_private, this.id_implements, this.id_finally, this.id_extends, this.id_native);
      }

      if (this.id_super++ >= this.id_this) {
         this.id_finally();
      } else {
         this.id_extends -= 0.03;
         this.id_class(this.id_finally, this.id_extends, this.id_native);
         this.id_finally *= 0.999F;
         this.id_extends *= 0.999F;
         this.id_native *= 0.999F;
         if (this.id_volatile) {
            this.id_finally *= 0.7F;
            this.id_native *= 0.7F;
         }
      }
   }
}
