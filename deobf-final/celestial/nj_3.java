package celestial;

public class nj_3 extends CL {
   private final an_3 class_;
   private int break_;
   private final int instanceof_;
   private final rLx_1 throw_;

   private nj_3(gm_3 var1, an_3 var2, rLx_1 var3, int var4, rjU_2 var5) {
      super(var1, var2.rx(), var2.byte_(0.5), var2.BO(), var5.break_, var5.byte_, var5.protected_);
      this.class_ = var2;
      this.instanceof_ = var4;
      this.throw_ = var3;
      this.case_();
   }

   public nj_3(gm_3 var1, an_3 var2, rLx_1 var3, int var4) {
      this(var1, var2, var3, var4, var2.rv());
   }

   public nj_3(gm_3 var1, an_3 var2, rLx_1 var3) {
      this(var1, var2, var3, 3);
   }

   @Override
   public void case_() {
      for (int var1 = 0; var1 < 16; var1++) {
         double var2 = (double)(this.continue_.nextFloat() * 2.0F - 1.0F);
         double var4 = (double)(this.continue_.nextFloat() * 2.0F - 1.0F);
         double var6 = (double)(this.continue_.nextFloat() * 2.0F - 1.0F);
         if (!(var2 * var2 + var4 * var4 + var6 * var6 > 1.0)) {
            double var8 = this.class_.catch_(var2 / 4.0);
            double var10 = this.class_.byte_(0.5 + var4 / 4.0);
            double var12 = this.class_.throws_(var6 / 4.0);
            this.byte_.class_(this.throw_, false, var8, var10, var12, var2, var4 + 0.2, var6);
         }
      }

      this.break_++;
      if (this.break_ >= this.instanceof_) {
         this.finally_();
      }
   }
}
