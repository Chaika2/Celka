package celestial;

public class CR extends Cw_1 {
   CR(gm_3 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.id_throw = (float)((double)this.id_throw * 1.5);
      this.id_this = (int)(Math.random() * 2.0) + 60;
   }

   @Override
   public float id_class(float var1) {
      float var2 = 1.0F - ((float)this.id_super + var1) / ((float)this.id_this * 1.5F);
      return this.id_throw * var2;
   }

   @Override
   public void id_case() {
      this.id_protected = this.id_catch;
      this.id_throws = this.id_private;
      this.id_case = this.id_implements;
      if (this.id_super++ >= this.id_this) {
         this.id_finally();
      } else {
         float var1 = (float)this.id_super / (float)this.id_this;
         this.id_catch = this.id_catch + this.id_finally * (double)var1;
         this.id_private = this.id_private + this.id_extends * (double)var1;
         this.id_implements = this.id_implements + this.id_native * (double)var1;
      }
   }
}
