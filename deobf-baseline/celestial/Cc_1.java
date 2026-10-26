package celestial;

public class Cc_1 extends lO_2 {
   private final Ch_1 id_class;

   Cc_1(gm_3 var1, double var2, double var4, double var6, double var8, Ch_1 var10) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.id_this = 6 + this.id_continue.nextInt(4);
      float var11 = this.id_continue.nextFloat() * 0.6F + 0.4F;
      this.id_synchronized = var11;
      this.id_return = var11;
      this.id_public = var11;
      this.id_throw = 2.0F * (1.0F - (float)var8 * 0.5F);
      this.id_class = var10;
      this.id_break(var10);
   }

   @Override
   public CJ id_class() {
      return CJ.id_protected;
   }

   @Override
   public int id_break(float var1) {
      return 15728880;
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
      }
   }
}
