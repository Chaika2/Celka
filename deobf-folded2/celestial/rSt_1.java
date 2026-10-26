package celestial;

public class rSt_1 extends rSw_1 {
   private static final ay_3 id_break = new ay_3().id_class(150.0);
   private final ay_3 id_byte;
   private int id_protected;

   @Override
   public void id_byte() {
      this.id_protected = 0;
   }

   public rSt_1(rSu_1 var1) {
      super(var1);
      this.id_byte = new ay_3().id_class(20.0).id_class(var1x -> Math.abs(var1x.re() - var1.re()) <= 10.0);
   }

   @Override
   public void id_break() {
      this.id_protected++;
      rhd_3 var1 = ((rYB)this.id_class.id_throws[7]).id_class(this.id_byte, this.id_class, this.id_class.rx(), this.id_class.re(), this.id_class.BO());
      if (var1 != null) {
         if (this.id_protected > 25) {
            this.id_class.L().id_class(rST.id_private);
         } else {
            rjU_2 var2 = new rjU_2(var1.rx() - this.id_class.rx(), 0.0, var1.BO() - this.id_class.BO()).id_protected();
            rjU_2 var3 = new rjU_2(
                  (double)rfU_2.id_class((Float)this.id_class.id_throws[15] * (float) (Math.PI / 180.0)),
                  0.0,
                  (double)(-rfU_2.id_break((Float)this.id_class.id_throws[15] * (float) (Math.PI / 180.0)))
               )
               .id_protected();
            float var4 = (float)var3.id_break(var2);
            float var5 = (float)(Math.acos((double)var4) * 180.0F / (float)Math.PI) + 0.5F;
            if (var5 < 0.0F || var5 > 10.0F) {
               double var6 = var1.rx() - this.id_class.id_super.rx();
               double var8 = var1.BO() - this.id_class.id_super.BO();
               double var10 = rfU_2.id_class(
                  rfU_2.id_case(180.0 - rfU_2.id_protected(var6, var8) * 180.0F / (float)Math.PI - (double)((Float)this.id_class.id_throws[15]).floatValue()),
                  -100.0,
                  100.0
               );
               this.id_class.id_public *= 0.8F;
               float var12 = rfU_2.id_class(var6 * var6 + var8 * var8) + 1.0F;
               float var13 = var12;
               if (var12 > 40.0F) {
                  var12 = 40.0F;
               }

               this.id_class.id_public = (float)((double)this.id_class.id_public + var10 * (double)(0.7F / var12 / var13));
               rSu_1 var10000 = this.id_class;
               Float var18 = (Float)this.id_class.id_throws[15] + this.id_class.id_public;
               var10000.id_throws[15] = var18;
            }
         }
      } else if (this.id_protected >= 100) {
         var1 = ((rYB)this.id_class.id_throws[7]).id_class(id_break, this.id_class, this.id_class.rx(), this.id_class.re(), this.id_class.BO());
         this.id_class.L().id_class(rST.id_throws);
         if (var1 != null) {
            this.id_class.L().id_class(rST.id_implements);
            this.id_class.L().id_break(rST.id_implements).id_class(new rjU_2(var1.rx(), var1.re(), var1.BO()));
         }
      }
   }

   @Override
   public rST<rSt_1> id_protected() {
      return rST.id_catch;
   }
}
