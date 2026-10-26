package celestial;

class rbK_2 extends rPY {
   private final rbo_3 id_implements;

   public rbK_2(rbo_3 var1) {
      super(var1);
      this.id_implements = var1;
   }

   @Override
   public void id_class() {
      if (this.id_implements.rT()) {
         this.id_implements.id_byte(this.id_implements.rv().id_break(0.0, 0.005, 0.0));
      }

      if (this.id_private == rPo_1.MOVE_TO && !this.id_implements.id_public().id_native()) {
         double var1 = this.id_break - this.id_implements.rx();
         double var3 = this.id_byte - this.id_implements.re();
         double var5 = this.id_protected - this.id_implements.BO();
         double var7 = var1 * var1 + var3 * var3 + var5 * var5;
         if (var7 < 2.5000003E-7F) {
            this.id_class.id_catch(0.0F);
         } else {
            float var9 = (float)(rfU_2.id_protected(var5, var1) * 180.0F / (float)Math.PI) - 90.0F;
            rbo_3 var10000 = this.id_implements;
            Float var18 = this.id_class((Float)this.id_implements.id_throws[15], var9, 10.0F);
            var10000.id_throws[15] = var18;
            var10000 = this.id_implements;
            Float var19 = (Float)this.id_implements.id_throws[15];
            var10000.id_private[23] = var19;
            var10000 = this.id_implements;
            Float var20 = (Float)this.id_implements.id_throws[15];
            var10000.id_private[25] = var20;
            float var10 = (float)(this.id_throws * this.id_implements.id_class(iQ_2.id_protected));
            if (this.id_implements.rT()) {
               this.id_implements.id_super(var10 * 0.02F);
               float var11 = -((float)(rfU_2.id_protected(var3, (double)rfU_2.id_class(var1 * var1 + var5 * var5)) * 180.0F / (float)Math.PI));
               var11 = rfU_2.id_class(rfU_2.id_catch(var11), -85.0F, 85.0F);
               var10000 = this.id_implements;
               Float var21 = this.id_class((Float)this.id_implements.id_throws[16], var11, 5.0F);
               var10000.id_throws[16] = var21;
               float var12 = rfU_2.id_break((Float)this.id_implements.id_throws[16] * (float) (Math.PI / 180.0));
               float var13 = rfU_2.id_class((Float)this.id_implements.id_throws[16] * (float) (Math.PI / 180.0));
               var10000 = this.id_implements;
               Float var22 = var12 * var10;
               var10000.id_private[44] = var22;
               var10000 = this.id_implements;
               Float var23 = -var13 * var10;
               var10000.id_private[43] = var23;
            } else {
               this.id_implements.id_super(var10 * 0.1F);
            }
         }
      } else {
         this.id_implements.id_super(0.0F);
         this.id_implements.id_try(0.0F);
         this.id_implements.id_while(0.0F);
         this.id_implements.id_catch(0.0F);
      }
   }
}
