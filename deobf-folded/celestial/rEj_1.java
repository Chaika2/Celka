package celestial;

class rEj_1 extends rPY {
   private final rEI id_implements;

   public rEj_1(rEI var1) {
      super(var1);
      this.id_implements = var1;
   }

   @Override
   public void id_class() {
      if (this.id_private == rPo_1.MOVE_TO && !this.id_implements.id_public().id_native()) {
         rjU_2 var1 = new rjU_2(this.id_break - this.id_implements.rx(), this.id_byte - this.id_implements.re(), this.id_protected - this.id_implements.BO());
         double var2 = var1.id_case();
         double var4 = var1.id_break / var2;
         double var6 = var1.id_byte / var2;
         double var8 = var1.id_protected / var2;
         float var10 = (float)(rfU_2.id_protected(var1.id_protected, var1.id_break) * 180.0F / (float)Math.PI) - 90.0F;
         rEI var10000 = this.id_implements;
         Float var38 = this.id_class((Float)this.id_implements.id_throws[15], var10, 90.0F);
         var10000.id_throws[15] = var38;
         var10000 = this.id_implements;
         Float var39 = (Float)this.id_implements.id_throws[15];
         var10000.id_private[23] = var39;
         float var11 = (float)(this.id_throws * this.id_implements.id_class(iQ_2.id_protected));
         float var12 = rfU_2.id_catch(0.125F, this.id_implements.sB(), var11);
         this.id_implements.id_super(var12);
         double var13 = Math.sin((double)((Integer)this.id_implements.id_throws[41] + this.id_implements.V()) * 0.5) * 0.05;
         double var15 = Math.cos((double)((Float)this.id_implements.id_throws[15] * (float) (Math.PI / 180.0)));
         double var17 = Math.sin((double)((Float)this.id_implements.id_throws[15] * (float) (Math.PI / 180.0)));
         double var19 = Math.sin((double)((Integer)this.id_implements.id_throws[41] + this.id_implements.V()) * 0.75) * 0.05;
         this.id_implements
            .id_byte(this.id_implements.rv().id_break(var13 * var15, var19 * (var17 + var15) * 0.25 + (double)var12 * var6 * 0.1, var13 * var17));
         rPR var21 = this.id_implements.id_continue();
         double var22 = this.id_implements.rx() + var4 * 2.0;
         double var24 = this.id_implements.rH() + var6 / var2;
         double var26 = this.id_implements.BO() + var8 * 2.0;
         double var28 = var21.id_protected();
         double var30 = var21.id_throws();
         double var32 = var21.id_case();
         if (!var21.id_byte()) {
            var28 = var22;
            var30 = var24;
            var32 = var26;
         }

         this.id_implements
            .id_continue()
            .id_class(rfU_2.id_protected(0.125, var28, var22), rfU_2.id_protected(0.125, var30, var24), rfU_2.id_protected(0.125, var32, var26), 10.0F, 40.0F);
         this.id_implements.id_this(true);
      } else {
         this.id_implements.id_super(0.0F);
         this.id_implements.id_this(false);
      }
   }
}
