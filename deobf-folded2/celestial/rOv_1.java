package celestial;

class rOv_1 extends rPY {
   private final rON id_implements;

   rOv_1(rON var1) {
      super(var1);
      this.id_implements = var1;
   }

   @Override
   public void id_class() {
      this.id_catch();
      if (this.id_private == rPo_1.MOVE_TO && !this.id_implements.id_public().id_native()) {
         double var1 = this.id_break - this.id_implements.rx();
         double var3 = this.id_byte - this.id_implements.re();
         double var5 = this.id_protected - this.id_implements.BO();
         double var7 = (double)rfU_2.id_class(var1 * var1 + var3 * var3 + var5 * var5);
         var3 /= var7;
         float var9 = (float)(rfU_2.id_protected(var5, var1) * 180.0F / (float)Math.PI) - 90.0F;
         rON var10000 = this.id_implements;
         Float var15 = this.id_class((Float)this.id_implements.id_throws[15], var9, 90.0F);
         var10000.id_throws[15] = var15;
         var10000 = this.id_implements;
         Float var16 = (Float)this.id_implements.id_throws[15];
         var10000.id_private[23] = var16;
         float var10 = (float)(this.id_throws * this.id_implements.id_class(iQ_2.id_protected));
         this.id_implements.id_super(rfU_2.id_catch(0.125F, this.id_implements.sB(), var10));
         this.id_implements.id_byte(this.id_implements.rv().id_break(0.0, (double)this.id_implements.sB() * var3 * 0.1, 0.0));
      } else {
         this.id_implements.id_super(0.0F);
      }
   }

   private void id_catch() {
      if (this.id_implements.rT()) {
         this.id_implements.id_byte(this.id_implements.rv().id_break(0.0, 0.005, 0.0));
         if (!this.id_implements.sx().id_class(this.id_implements.Ps(), 16.0)) {
            this.id_implements.id_super(Math.max(this.id_implements.sB() / 2.0F, 0.08F));
         }

         if (this.id_implements.n_()) {
            this.id_implements.id_super(Math.max(this.id_implements.sB() / 3.0F, 0.06F));
         }
      } else if (rON.id_break(this.id_implements)) {
         this.id_implements.id_super(Math.max(this.id_implements.sB() / 2.0F, 0.06F));
      }
   }
}
