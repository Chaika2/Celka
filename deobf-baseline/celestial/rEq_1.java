package celestial;

import java.util.EnumSet;

class rEq_1 extends rBk_1 {
   private final rEy_1 id_class;

   public rEq_1(rEy_1 var1) {
      this.id_class = var1;
      this.id_class(EnumSet.of(rBW.LOOK));
   }

   @Override
   public boolean id_class() {
      return true;
   }

   @Override
   public void id_throws() {
      if (this.id_class.I_() == null) {
         rjU_2 var1 = this.id_class.rv();
         rEy_1 var10000 = this.id_class;
         Float var10 = -((float)rfU_2.id_protected(var1.id_break, var1.id_protected)) * (180.0F / (float)Math.PI);
         var10000.id_throws[15] = var10;
         var10000 = this.id_class;
         Float var11 = (Float)this.id_class.id_throws[15];
         var10000.id_private[23] = var11;
      } else {
         iB_2 var14 = this.id_class.I_();
         if (var14.id_int(this.id_class) < 4096.0) {
            double var2 = var14.rx() - this.id_class.rx();
            double var4 = var14.BO() - this.id_class.BO();
            rEy_1 var16 = this.id_class;
            Float var12 = -((float)rfU_2.id_protected(var2, var4)) * (180.0F / (float)Math.PI);
            var16.id_throws[15] = var12;
            var16 = this.id_class;
            Float var13 = (Float)this.id_class.id_throws[15];
            var16.id_private[23] = var13;
         }
      }
   }
}
