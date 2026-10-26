package celestial;

public class rSA extends rSw_1 {
   private int id_break;
   private int id_byte;
   private aZ_2 id_protected;

   @Override
   public void id_byte() {
      this.id_break = 0;
      this.id_byte++;
   }

   public rSA(rSu_1 var1) {
      super(var1);
   }

   @Override
   public void id_class() {
      this.id_break++;
      if (this.id_break % 2 == 0 && this.id_break < 10) {
         rjU_2 var1 = this.id_class.id_byte(1.0F).id_protected();
         var1.id_break((float) (-Math.PI / 4));
         double var2 = this.id_class.id_super.rx();
         double var4 = this.id_class.id_super.id_byte(0.5);
         double var6 = this.id_class.id_super.BO();

         for (int var8 = 0; var8 < 8; var8++) {
            double var9 = var2 + this.id_class.Sa().nextGaussian() / 2.0;
            double var11 = var4 + this.id_class.Sa().nextGaussian() / 2.0;
            double var13 = var6 + this.id_class.Sa().nextGaussian() / 2.0;

            for (int var15 = 0; var15 < 6; var15++) {
               ((rYB)this.id_class.id_throws[7])
                  .id_class(
                     rLQ.id_implements,
                     var9,
                     var11,
                     var13,
                     -var1.id_break * 0.08F * (double)var15,
                     -var1.id_byte * 0.6F,
                     -var1.id_protected * 0.08F * (double)var15
                  );
            }

            var1.id_break((float) (Math.PI / 16));
         }
      }
   }

   @Override
   public void id_break() {
      this.id_break++;
      if (this.id_break >= 200) {
         if (this.id_byte >= 4) {
            this.id_class.L().id_class(rST.id_throws);
         } else {
            this.id_class.L().id_class(rST.id_catch);
         }
      } else if (this.id_break == 10) {
         rjU_2 var1 = new rjU_2(this.id_class.id_super.rx() - this.id_class.rx(), 0.0, this.id_class.id_super.BO() - this.id_class.BO()).id_protected();
         float var2 = 5.0F;
         double var3 = this.id_class.id_super.rx() + var1.id_break * 5.0 / 2.0;
         double var5 = this.id_class.id_super.BO() + var1.id_protected * 5.0 / 2.0;
         double var7 = this.id_class.id_super.id_byte(0.5);
         double var9 = var7;
         rfw_3 var11 = new rfw_3(var3, var7, var5);

         while (((rYB)this.id_class.id_throws[7]).id_finally(var11)) {
            if (--var9 < 0.0) {
               var9 = var7;
               break;
            }

            var11.id_break(var3, var9, var5);
         }

         var9 = (double)(rfU_2.id_byte(var9) + 1);
         this.id_protected = new aZ_2((rYB)this.id_class.id_throws[7], var3, var9, var5);
         this.id_protected.id_class(this.id_class);
         this.id_protected.id_byte(5.0F);
         this.id_protected.id_break(200);
         this.id_protected.id_class(rLQ.id_implements);
         this.id_protected.id_class(new rLY(rLD.id_catch));
         ((rYB)this.id_class.id_throws[7]).a_(this.id_protected);
      }
   }

   @Override
   public void id_catch() {
      if (this.id_protected != null) {
         this.id_protected.PD();
         this.id_protected = null;
      }
   }

   @Override
   public rST<rSA> id_protected() {
      return rST.id_case;
   }

   public void id_private() {
      this.id_byte = 0;
   }
}
