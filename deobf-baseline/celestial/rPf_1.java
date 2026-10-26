package celestial;

public class rPf_1 {
   private final is_3 id_class;
   private int id_break;
   private float id_byte;

   private void id_byte() {
      is_3 var10000 = this.id_class;
      Float var5 = rfU_2.id_break((Float)this.id_class.id_private[25], (Float)this.id_class.id_private[23], (float)this.id_class.S());
      var10000.id_private[25] = var5;
   }

   public rPf_1(is_3 var1) {
      this.id_class = var1;
   }

   public void id_class() {
      if (this.id_case()) {
         is_3 var10000 = this.id_class;
         Float var5 = (Float)this.id_class.id_throws[15];
         var10000.id_private[23] = var5;
         this.id_byte();
         this.id_byte = (Float)this.id_class.id_private[25];
         this.id_break = 0;
      } else if (this.id_throws()) {
         if (Math.abs((Float)this.id_class.id_private[25] - this.id_byte) > 15.0F) {
            this.id_break = 0;
            this.id_byte = (Float)this.id_class.id_private[25];
            this.id_break();
         } else {
            this.id_break++;
            if (this.id_break > 10) {
               this.id_protected();
            }
         }
      }
   }

   private void id_break() {
      is_3 var10000 = this.id_class;
      Float var5 = rfU_2.id_break((Float)this.id_class.id_private[23], (Float)this.id_class.id_private[25], (float)this.id_class.S());
      var10000.id_private[23] = var5;
   }

   private boolean id_throws() {
      return this.id_class.Bh().isEmpty() || !(this.id_class.Bh().get(0) instanceof is_3);
   }

   private boolean id_case() {
      double var1 = this.id_class.rx() - (Double)this.id_class.id_throws[8];
      double var3 = this.id_class.BO() - (Double)this.id_class.id_throws[10];
      return var1 * var1 + var3 * var3 > 2.5000003E-7F;
   }

   private void id_protected() {
      int var1 = this.id_break - 10;
      float var2 = rfU_2.id_class((float)var1 / 10.0F, 0.0F, 1.0F);
      float var3 = (float)this.id_class.S() * (1.0F - var2);
      is_3 var10000 = this.id_class;
      Float var8 = rfU_2.id_break((Float)this.id_class.id_private[23], (Float)this.id_class.id_private[25], var3);
      var10000.id_private[23] = var8;
   }
}
