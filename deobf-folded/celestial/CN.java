package celestial;

public class CN extends CH {
   private final yB_2 id_class;
   private final an_3 id_break;
   private final an_3 id_instanceof;
   private int id_throw;
   private final pg_3 id_interface;

   public CN(pg_3 var1, yB_2 var2, gm_3 var3, an_3 var4, an_3 var5) {
      this(var1, var2, var3, var4, var5, var4.rv());
   }

   private CN(pg_3 var1, yB_2 var2, gm_3 var3, an_3 var4, an_3 var5, rjU_2 var6) {
      super(var3, var4.rx(), var4.re(), var4.BO(), var6.id_break, var6.id_byte, var6.id_protected);
      this.id_class = var2;
      this.id_break = this.id_class(var4);
      this.id_instanceof = var5;
      this.id_interface = var1;
   }

   @Override
   public CJ id_class() {
      return CJ.id_throws;
   }

   @Override
   public void id_class(Ok_1 var1, ly_3 var2, float var3) {
      rrdG var4 = null;
      if (rrbb_3.rs()) {
         var4 = rrdZ.Sz;
         rrdZ.id_class(this.id_break);
      }

      float var5 = ((float)this.id_throw + var3) / 3.0F;
      var5 *= var5;
      double var6 = rfU_2.id_protected((double)var3, (Double)this.id_instanceof.id_throws[34], this.id_instanceof.rx());
      double var8 = rfU_2.id_protected((double)var3, (Double)this.id_instanceof.id_throws[35], this.id_instanceof.re()) + 0.5;
      double var10 = rfU_2.id_protected((double)var3, (Double)this.id_instanceof.id_throws[36], this.id_instanceof.BO());
      double var12 = rfU_2.id_protected((double)var5, this.id_break.rx(), var6);
      double var14 = rfU_2.id_protected((double)var5, this.id_break.re(), var8);
      double var16 = rfU_2.id_protected((double)var5, this.id_break.BO(), var10);
      Hd_1 var18 = this.id_class.id_break();
      rjU_2 var19 = var2.id_break();
      this.id_interface
         .id_class(
            this.id_break,
            var12 - var19.id_class(),
            var14 - var19.id_break(),
            var16 - var19.id_byte(),
            (Float)this.id_break.id_throws[15],
            var3,
            new Ml_1(),
            var18,
            this.id_interface.id_class(this.id_break, var3)
         );
      var18.id_break();
      if (rrbb_3.rs()) {
         rrdZ.id_break((an_3)null);
         rrdZ.id_class(var4);
      }
   }

   private an_3 id_class(an_3 var1) {
      return (an_3)(!(var1 instanceof rsE_2) ? var1 : ((rsE_2)var1).id_continue());
   }

   @Override
   public void id_case() {
      this.id_throw++;
      if (this.id_throw == 3) {
         this.id_finally();
      }
   }
}
