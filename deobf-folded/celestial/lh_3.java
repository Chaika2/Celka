package celestial;

public class lh_3 extends CK {
   lh_3(gm_3 var1, double var2, double var4, double var6, double var8, double var10, double var12, Ch_1 var14) {
      super(var1, var2, var4, var6, var14, 0.0F);
      this.id_throw = 0.5F;
      this.id_throws(1.0F);
      this.id_class(0.0F, 0.0F, 0.0F);
      this.id_this = (int)((double)(this.id_throw * 12.0F) / (Math.random() * 0.8F + 0.2F));
      this.id_break(var14);
      this.id_final = false;
      this.id_finally = var8;
      this.id_extends = var10;
      this.id_native = var12;
      this.id_case(0.0F);
   }

   @Override
   public void id_case() {
      this.id_protected = this.id_catch;
      this.id_throws = this.id_private;
      this.id_case = this.id_implements;
      if (this.id_super++ >= this.id_this) {
         this.id_finally();
      } else {
         this.id_break(this.id_class);
         if (this.id_super > this.id_this / 2) {
            this.id_throws(1.0F - ((float)this.id_super - (float)(this.id_this / 2)) / (float)this.id_this);
         }

         this.id_class(this.id_finally, this.id_extends, this.id_native);
         if (this.id_byte.id_byte(new rfH_2(this.id_catch, this.id_private, this.id_implements)).id_catch()) {
            this.id_extends -= 0.008F;
         }

         this.id_finally *= 0.92F;
         this.id_extends *= 0.92F;
         this.id_native *= 0.92F;
         if (this.id_volatile) {
            this.id_finally *= 0.7F;
            this.id_native *= 0.7F;
         }
      }
   }
}
