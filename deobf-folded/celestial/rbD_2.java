package celestial;

import java.util.List;

class rbD_2 extends rBk_1 {
   private int id_break;

   @Override
   public void id_byte() {
      List var1 = ((rYB)this.id_class.id_throws[7]).id_class(rsE_2.class, this.id_class.rN().id_byte(8.0, 8.0, 8.0), rbo_3.id_class);
      if (!var1.isEmpty()) {
         this.id_class.id_public().id_class((an_3)var1.get(0), 1.2F);
         this.id_class.id_class(rqn_3.Pg, 1.0F, 1.0F);
      }

      this.id_break = 0;
   }

   rbD_2(rbo_3 var1) {
      this.id_class = var1;
   }

   private void id_class(rdn_3 var1) {
      if (!var1.id_class()) {
         double var2 = this.id_class.rH() - 0.3F;
         rsE_2 var4 = new rsE_2((rYB)this.id_class.id_throws[7], this.id_class.rx(), var2, this.id_class.BO(), var1);
         var4.id_class(40);
         var4.id_byte(this.id_class.ro());
         float var5 = 0.3F;
         float var6 = rbo_3.id_break(this.id_class).nextFloat() * (float) (Math.PI * 2);
         float var7 = 0.02F * rbo_3.id_byte(this.id_class).nextFloat();
         var4.id_catch(
            (double)(
               0.3F
                     * -rfU_2.id_class((Float)this.id_class.id_throws[15] * (float) (Math.PI / 180.0))
                     * rfU_2.id_break((Float)this.id_class.id_throws[16] * (float) (Math.PI / 180.0))
                  + rfU_2.id_break(var6) * var7
            ),
            (double)(0.3F * rfU_2.id_class((Float)this.id_class.id_throws[16] * (float) (Math.PI / 180.0)) * 1.5F),
            (double)(
               0.3F
                     * rfU_2.id_break((Float)this.id_class.id_throws[15] * (float) (Math.PI / 180.0))
                     * rfU_2.id_break((Float)this.id_class.id_throws[16] * (float) (Math.PI / 180.0))
                  + rfU_2.id_class(var6) * var7
            )
         );
         ((rYB)this.id_class.id_throws[7]).a_(var4);
      }
   }

   @Override
   public boolean id_class() {
      if (this.id_break > (Integer)this.id_class.id_throws[41]) {
         return false;
      } else {
         List var1 = ((rYB)this.id_class.id_throws[7]).id_class(rsE_2.class, this.id_class.rN().id_byte(8.0, 8.0, 8.0), rbo_3.id_class);
         return !var1.isEmpty() || !this.id_class.id_class(rXQ.MAINHAND).id_class();
      }
   }

   @Override
   public void id_throws() {
      List var1 = ((rYB)this.id_class.id_throws[7]).id_class(rsE_2.class, this.id_class.rN().id_byte(8.0, 8.0, 8.0), rbo_3.id_class);
      rdn_3 var2 = this.id_class.id_class(rXQ.MAINHAND);
      if (!var2.id_class()) {
         this.id_class(var2);
         this.id_class.id_class(rXQ.MAINHAND, rdn_3.id_break);
      } else if (!var1.isEmpty()) {
         this.id_class.id_public().id_class((an_3)var1.get(0), 1.2F);
      }
   }

   @Override
   public void id_protected() {
      rdn_3 var1 = this.id_class.id_class(rXQ.MAINHAND);
      if (!var1.id_class()) {
         this.id_class(var1);
         this.id_class.id_class(rXQ.MAINHAND, rdn_3.id_break);
         this.id_break = (Integer)this.id_class.id_throws[41] + rbo_3.id_class(this.id_class).nextInt(100);
      }
   }
}
