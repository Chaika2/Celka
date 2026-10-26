package celestial;

class rGy_1 extends rPY {
   private float id_implements;
   private int id_finally;
   private final rGA id_extends;
   private boolean id_native;

   public rGy_1(rGA var1) {
      super(var1);
      this.id_extends = var1;
      this.id_implements = 180.0F * (Float)var1.id_throws[15] / (float) Math.PI;
   }

   @Override
   public void id_class() {
      is_3 var10000 = this.id_class;
      Float var5 = this.id_class((Float)this.id_class.id_throws[15], this.id_implements, 90.0F);
      var10000.id_throws[15] = var5;
      var10000 = this.id_class;
      Float var6 = (Float)this.id_class.id_throws[15];
      var10000.id_private[25] = var6;
      var10000 = this.id_class;
      Float var7 = (Float)this.id_class.id_throws[15];
      var10000.id_private[23] = var7;
      if (this.id_private != rPo_1.MOVE_TO) {
         this.id_class.id_catch(0.0F);
      } else {
         this.id_private = rPo_1.WAIT;
         if (this.id_class.BL()) {
            this.id_class.id_super((float)(this.id_throws * this.id_class.id_class(iQ_2.id_protected)));
            if (this.id_finally-- <= 0) {
               this.id_finally = this.id_extends.id_implements();
               if (this.id_native) {
                  this.id_finally /= 3;
               }

               this.id_extends.id_else().id_class();
               if (this.id_extends.sz()) {
                  this.id_extends.id_class(this.id_extends.sd(), this.id_extends.Si(), this.id_extends.id_throws());
               }
            } else {
               rGA var13 = this.id_extends;
               Float var8 = 0.0F;
               var13.id_private[42] = var8;
               rGA var14 = this.id_extends;
               Float var9 = 0.0F;
               var14.id_private[44] = var9;
               this.id_class.id_super(0.0F);
            }
         } else {
            this.id_class.id_super((float)(this.id_throws * this.id_class.id_class(iQ_2.id_protected)));
         }
      }
   }

   public void id_class(double var1) {
      this.id_throws = var1;
      this.id_private = rPo_1.MOVE_TO;
   }

   public void id_class(float var1, boolean var2) {
      this.id_implements = var1;
      this.id_native = var2;
   }
}
