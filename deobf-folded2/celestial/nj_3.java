package celestial;

public class nj_3 extends CL {
   private final an_3 id_class;
   private int id_break;
   private final int id_instanceof;
   private final rLx_1 id_throw;

   private nj_3(gm_3 var1, an_3 var2, rLx_1 var3, int var4, rjU_2 var5) {
      super(var1, var2.rx(), var2.id_byte(0.5), var2.BO(), var5.id_break, var5.id_byte, var5.id_protected);
      this.id_class = var2;
      this.id_instanceof = var4;
      this.id_throw = var3;
      this.id_case();
   }

   public nj_3(gm_3 var1, an_3 var2, rLx_1 var3, int var4) {
      this(var1, var2, var3, var4, var2.rv());
   }

   public nj_3(gm_3 var1, an_3 var2, rLx_1 var3) {
      this(var1, var2, var3, 3);
   }

   @Override
   public void id_case() {
      for (int var1 = 0; var1 < 16; var1++) {
         double var2 = (double)(this.id_continue.nextFloat() * 2.0F - 1.0F);
         double var4 = (double)(this.id_continue.nextFloat() * 2.0F - 1.0F);
         double var6 = (double)(this.id_continue.nextFloat() * 2.0F - 1.0F);
         if (!(var2 * var2 + var4 * var4 + var6 * var6 > 1.0)) {
            double var8 = this.id_class.id_catch(var2 / 4.0);
            double var10 = this.id_class.id_byte(0.5 + var4 / 4.0);
            double var12 = this.id_class.id_throws(var6 / 4.0);
            this.id_byte.id_class(this.id_throw, false, var8, var10, var12, var2, var4 + 0.2, var6);
         }
      }

      this.id_break++;
      if (this.id_break >= this.id_instanceof) {
         this.id_finally();
      }
   }
}
