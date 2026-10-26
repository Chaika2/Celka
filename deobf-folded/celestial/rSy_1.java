package celestial;

import java.util.Random;

public class rSy_1 extends rSp_1 {
   private rjU_2 id_break;

   @Override
   public void id_byte() {
      this.id_break = null;
   }

   public rSy_1(rSu_1 var1) {
      super(var1);
   }

   @Override
   public void id_class() {
      rjU_2 var1 = this.id_class.id_byte(1.0F).id_protected();
      var1.id_break((float) (-Math.PI / 4));
      double var2 = this.id_class.id_super.rx();
      double var4 = this.id_class.id_super.id_byte(0.5);
      double var6 = this.id_class.id_super.BO();

      for (int var8 = 0; var8 < 8; var8++) {
         Random var9 = this.id_class.Sa();
         double var10 = var2 + var9.nextGaussian() / 2.0;
         double var12 = var4 + var9.nextGaussian() / 2.0;
         double var14 = var6 + var9.nextGaussian() / 2.0;
         rjU_2 var16 = this.id_class.rv();
         ((rYB)this.id_class.id_throws[7])
            .id_class(
               rLQ.id_implements,
               var10,
               var12,
               var14,
               -var1.id_break * 0.08F + var16.id_break,
               -var1.id_byte * 0.3F + var16.id_byte,
               -var1.id_protected * 0.08F + var16.id_protected
            );
         var1.id_break((float) (Math.PI / 16));
      }
   }

   @Override
   public void id_break() {
      if (this.id_break == null) {
         this.id_break = rjU_2.id_protected(((rYB)this.id_class.id_throws[7]).id_class(rKv_1.MOTION_BLOCKING_NO_LEAVES, rUs_1.id_class));
      }

      if (this.id_break.id_protected(this.id_class.rx(), this.id_class.re(), this.id_class.BO()) < 1.0) {
         this.id_class.L().id_break(rST.id_case).id_private();
         this.id_class.L().id_class(rST.id_catch);
      }
   }

   @Override
   public float id_throws() {
      return 1.5F;
   }

   @Override
   public rjU_2 id_case() {
      return this.id_break;
   }

   @Override
   public float id_implements() {
      float var1 = rfU_2.id_class(an_3.id_case(this.id_class.rv())) + 1.0F;
      float var2 = Math.min(var1, 40.0F);
      return var2 / var1;
   }

   @Override
   public rST<rSy_1> id_protected() {
      return rST.id_protected;
   }
}
