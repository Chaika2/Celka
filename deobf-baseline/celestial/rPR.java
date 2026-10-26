package celestial;

public class rPR {
   protected final is_3 id_class;
   protected float id_break;
   protected float id_byte;
   protected boolean id_protected;
   protected double id_throws;
   protected double id_case;
   protected double id_catch;

   public boolean id_byte() {
      return this.id_protected;
   }

   public rPR(is_3 var1) {
      this.id_class = var1;
   }

   public void id_class() {
      if (this.id_break()) {
         is_3 var10000 = this.id_class;
         Float var5 = 0.0F;
         var10000.id_throws[16] = var5;
      }

      if (this.id_protected) {
         this.id_protected = false;
         is_3 var10 = this.id_class;
         Float var6 = this.id_class((Float)this.id_class.id_private[25], this.id_private(), this.id_break);
         var10.id_private[25] = var6;
         var10 = this.id_class;
         Float var7 = this.id_class((Float)this.id_class.id_throws[16], this.id_catch(), this.id_byte);
         var10.id_throws[16] = var7;
      } else {
         is_3 var12 = this.id_class;
         Float var8 = this.id_class((Float)this.id_class.id_private[25], (Float)this.id_class.id_private[23], 10.0F);
         var12.id_private[25] = var8;
      }

      if (!this.id_class.id_public().id_native()) {
         is_3 var13 = this.id_class;
         Float var9 = rfU_2.id_break((Float)this.id_class.id_private[25], (Float)this.id_class.id_private[23], (float)this.id_class.S());
         var13.id_private[25] = var9;
      }
   }

   public void id_class(rjU_2 var1) {
      this.id_class(var1.id_break, var1.id_byte, var1.id_protected);
   }

   private static double id_class(an_3 var0) {
      return var0 instanceof iB_2 ? var0.rH() : (var0.rN().id_break + var0.rN().id_throws) / 2.0;
   }

   protected float id_class(float var1, float var2, float var3) {
      float var4 = rfU_2.id_byte(var1, var2);
      float var5 = rfU_2.id_class(var4, -var3, var3);
      return var1 + var5;
   }

   public void id_class(an_3 var1, float var2, float var3) {
      this.id_class(var1.rx(), id_class(var1), var1.BO(), var2, var3);
   }

   public void id_class(double var1, double var3, double var5, float var7, float var8) {
      this.id_throws = var1;
      this.id_case = var3;
      this.id_catch = var5;
      this.id_break = var7;
      this.id_byte = var8;
      this.id_protected = true;
   }

   public void id_class(double var1, double var3, double var5) {
      this.id_class(var1, var3, var5, (float)this.id_class.s(), (float)this.id_class.r());
   }

   protected boolean id_break() {
      return true;
   }

   public double id_throws() {
      return this.id_case;
   }

   protected float id_catch() {
      double var1 = this.id_throws - this.id_class.rx();
      double var3 = this.id_case - this.id_class.rH();
      double var5 = this.id_catch - this.id_class.BO();
      double var7 = (double)rfU_2.id_class(var1 * var1 + var5 * var5);
      return (float)(-(rfU_2.id_protected(var3, var7) * 180.0F / (float)Math.PI));
   }

   public double id_case() {
      return this.id_catch;
   }

   public double id_protected() {
      return this.id_throws;
   }

   protected float id_private() {
      double var1 = this.id_throws - this.id_class.rx();
      double var3 = this.id_catch - this.id_class.BO();
      return (float)(rfU_2.id_protected(var3, var1) * 180.0F / (float)Math.PI) - 90.0F;
   }
}
