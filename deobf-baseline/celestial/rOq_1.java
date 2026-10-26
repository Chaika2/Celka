package celestial;

class rOq_1 extends rPY {
   private final rOp_1 id_implements;

   rOq_1(rOp_1 var1) {
      super(var1);
      this.id_implements = var1;
   }

   @Override
   public void id_class() {
      if (this.id_implements.id_class(rlG_2.id_break)) {
         this.id_implements.id_byte(this.id_implements.rv().id_break(0.0, 0.005, 0.0));
      }

      if (this.id_private == rPo_1.MOVE_TO && !this.id_implements.id_public().id_native()) {
         float var1 = (float)(this.id_throws * this.id_implements.id_class(iQ_2.id_protected));
         this.id_implements.id_super(rfU_2.id_catch(0.125F, this.id_implements.sB(), var1));
         double var2 = this.id_break - this.id_implements.rx();
         double var4 = this.id_byte - this.id_implements.re();
         double var6 = this.id_protected - this.id_implements.BO();
         if (var4 != 0.0) {
            double var8 = (double)rfU_2.id_class(var2 * var2 + var4 * var4 + var6 * var6);
            this.id_implements.id_byte(this.id_implements.rv().id_break(0.0, (double)this.id_implements.sB() * (var4 / var8) * 0.1, 0.0));
         }

         if (var2 != 0.0 || var6 != 0.0) {
            float var16 = (float)(rfU_2.id_protected(var6, var2) * 180.0F / (float)Math.PI) - 90.0F;
            rOp_1 var10000 = this.id_implements;
            Float var14 = this.id_class((Float)this.id_implements.id_throws[15], var16, 90.0F);
            var10000.id_throws[15] = var14;
            var10000 = this.id_implements;
            Float var15 = (Float)this.id_implements.id_throws[15];
            var10000.id_private[23] = var15;
         }
      } else {
         this.id_implements.id_super(0.0F);
      }
   }
}
