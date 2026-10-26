package celestial;

public class rPV extends rPY {
   private final int id_implements;
   private final boolean id_finally;

   public rPV(is_3 var1, int var2, boolean var3) {
      super(var1);
      this.id_implements = var2;
      this.id_finally = var3;
   }

   @Override
   public void id_class() {
      if (this.id_private == rPo_1.MOVE_TO) {
         this.id_private = rPo_1.WAIT;
         this.id_class.id_finally(true);
         double var1 = this.id_break - this.id_class.rx();
         double var3 = this.id_byte - this.id_class.re();
         double var5 = this.id_protected - this.id_class.BO();
         double var7 = var1 * var1 + var3 * var3 + var5 * var5;
         if (var7 < 2.5000003E-7F) {
            this.id_class.id_while(0.0F);
            this.id_class.id_catch(0.0F);
            return;
         }

         float var9 = (float)(rfU_2.id_protected(var5, var1) * 180.0F / (float)Math.PI) - 90.0F;
         is_3 var10000 = this.id_class;
         Float var18 = this.id_class((Float)this.id_class.id_throws[15], var9, 90.0F);
         var10000.id_throws[15] = var18;
         float var10;
         if (this.id_class.BL()) {
            var10 = (float)(this.id_throws * this.id_class.id_class(iQ_2.id_protected));
         } else {
            var10 = (float)(this.id_throws * this.id_class.id_class(iQ_2.id_throws));
         }

         this.id_class.id_super(var10);
         double var11 = (double)rfU_2.id_class(var1 * var1 + var5 * var5);
         float var13 = (float)(-(rfU_2.id_protected(var3, var11) * 180.0F / (float)Math.PI));
         var10000 = this.id_class;
         Float var19 = this.id_class((Float)this.id_class.id_throws[16], var13, (float)this.id_implements);
         var10000.id_throws[16] = var19;
         this.id_class.id_while(var3 > 0.0 ? var10 : -var10);
      } else {
         if (!this.id_finally) {
            this.id_class.id_finally(false);
         }

         this.id_class.id_while(0.0F);
         this.id_class.id_catch(0.0F);
      }
   }
}
