package celestial;

class rGo_1 extends rPY {
   public rGo_1(rGg_1 var1, rGg_1 var2) {
      super(var2);
      this.id_implements = var1;
   }

   @Override
   public void id_class() {
      if (this.id_private == rPo_1.MOVE_TO) {
         rjU_2 var1 = new rjU_2(this.id_break - this.id_implements.rx(), this.id_byte - this.id_implements.re(), this.id_protected - this.id_implements.BO());
         double var2 = var1.id_case();
         if (var2 < this.id_implements.rN().id_class()) {
            this.id_private = rPo_1.WAIT;
            this.id_implements.id_byte(this.id_implements.rv().id_class(0.5));
         } else {
            this.id_implements.id_byte(this.id_implements.rv().id_throws(var1.id_class(this.id_throws * 0.05 / var2)));
            if (this.id_implements.I_() == null) {
               rjU_2 var4 = this.id_implements.rv();
               rGg_1 var10000 = this.id_implements;
               Float var12 = -((float)rfU_2.id_protected(var4.id_break, var4.id_protected)) * (180.0F / (float)Math.PI);
               var10000.id_throws[15] = var12;
               var10000 = this.id_implements;
               Float var13 = (Float)this.id_implements.id_throws[15];
               var10000.id_private[23] = var13;
            } else {
               double var16 = this.id_implements.I_().rx() - this.id_implements.rx();
               double var6 = this.id_implements.I_().BO() - this.id_implements.BO();
               rGg_1 var18 = this.id_implements;
               Float var14 = -((float)rfU_2.id_protected(var16, var6)) * (180.0F / (float)Math.PI);
               var18.id_throws[15] = var14;
               var18 = this.id_implements;
               Float var15 = (Float)this.id_implements.id_throws[15];
               var18.id_private[23] = var15;
            }
         }
      }
   }
}
