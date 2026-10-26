package celestial;

public class CN extends CH {
   private final yB_2 class_;
   private final an_3 break_;
   private final an_3 instanceof_;
   private int throw_;
   private final pg_3 interface_;

   public CN(pg_3 var1, yB_2 var2, gm_3 var3, an_3 var4, an_3 var5) {
      this(var1, var2, var3, var4, var5, var4.rv());
   }

   private CN(pg_3 var1, yB_2 var2, gm_3 var3, an_3 var4, an_3 var5, rjU_2 var6) {
      super(var3, var4.rx(), var4.re(), var4.BO(), var6.break_, var6.byte_, var6.protected_);
      this.class_ = var2;
      this.break_ = this.class_(var4);
      this.instanceof_ = var5;
      this.interface_ = var1;
   }

   @Override
   public CJ class_() {
      return CJ.throws_;
   }

   @Override
   public void class_(Ok_1 var1, ly_3 var2, float var3) {
      rrdG var4 = null;
      if (rrbb_3.rs()) {
         var4 = rrdZ.Sz;
         rrdZ.class_(this.break_);
      }

      float var5 = ((float)this.throw_ + var3) / 3.0F;
      var5 *= var5;
      double var6 = rfU_2.protected_((double)var3, (Double)this.instanceof_.throws_[34], this.instanceof_.rx());
      double var8 = rfU_2.protected_((double)var3, (Double)this.instanceof_.throws_[35], this.instanceof_.re()) + 0.5;
      double var10 = rfU_2.protected_((double)var3, (Double)this.instanceof_.throws_[36], this.instanceof_.BO());
      double var12 = rfU_2.protected_((double)var5, this.break_.rx(), var6);
      double var14 = rfU_2.protected_((double)var5, this.break_.re(), var8);
      double var16 = rfU_2.protected_((double)var5, this.break_.BO(), var10);
      Hd_1 var18 = this.class_.break_();
      rjU_2 var19 = var2.break_();
      this.interface_
         .class_(
            this.break_,
            var12 - var19.class_(),
            var14 - var19.break_(),
            var16 - var19.byte_(),
            (Float)this.break_.throws_[15],
            var3,
            new Ml_1(),
            var18,
            this.interface_.class_(this.break_, var3)
         );
      var18.break_();
      if (rrbb_3.rs()) {
         rrdZ.break_((an_3)null);
         rrdZ.class_(var4);
      }
   }

   private an_3 class_(an_3 var1) {
      return (an_3)(!(var1 instanceof rsE_2) ? var1 : ((rsE_2)var1).continue_());
   }

   @Override
   public void case_() {
      this.throw_++;
      if (this.throw_ == 3) {
         this.finally_();
      }
   }
}
