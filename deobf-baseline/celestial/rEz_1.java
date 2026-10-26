package celestial;

class rEz_1 extends rPY {
   private final rEx_1 id_implements;

   public rEz_1(rEx_1 var1) {
      super(var1);
      this.id_implements = var1;
   }

   @Override
   public void id_class() {
      iB_2 var1 = this.id_implements.I_();
      if (this.id_implements.su() && this.id_implements.rT()) {
         if (var1 != null && var1.re() > this.id_implements.re() || this.id_implements.id_protected) {
            this.id_implements.id_byte(this.id_implements.rv().id_break(0.0, 0.002, 0.0));
         }

         if (this.id_private != rPo_1.MOVE_TO || this.id_implements.id_public().id_native()) {
            this.id_implements.id_super(0.0F);
            return;
         }

         double var2 = this.id_break - this.id_implements.rx();
         double var4 = this.id_byte - this.id_implements.re();
         double var6 = this.id_protected - this.id_implements.BO();
         double var8 = (double)rfU_2.id_class(var2 * var2 + var4 * var4 + var6 * var6);
         var4 /= var8;
         float var10 = (float)(rfU_2.id_protected(var6, var2) * 180.0F / (float)Math.PI) - 90.0F;
         rEx_1 var10000 = this.id_implements;
         Float var17 = this.id_class((Float)this.id_implements.id_throws[15], var10, 90.0F);
         var10000.id_throws[15] = var17;
         var10000 = this.id_implements;
         Float var18 = (Float)this.id_implements.id_throws[15];
         var10000.id_private[23] = var18;
         float var11 = (float)(this.id_throws * this.id_implements.id_class(iQ_2.id_protected));
         float var12 = rfU_2.id_catch(0.125F, this.id_implements.sB(), var11);
         this.id_implements.id_super(var12);
         this.id_implements.id_byte(this.id_implements.rv().id_break((double)var12 * var2 * 0.005, (double)var12 * var4 * 0.1, (double)var12 * var6 * 0.005));
      } else {
         if (!rEx_1.id_class(this.id_implements)) {
            this.id_implements.id_byte(this.id_implements.rv().id_break(0.0, -0.008, 0.0));
         }

         super.id_class();
      }
   }
}
