package celestial;

public class kn_3 extends xF_2 {
   protected static final rjC_2 volatile_ = xd_3.class_(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   protected kn_3(Jq_1 var1) {
      super(var1);
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, an_3 var4) {
      super.class_(var1, var2, var3, var4);
      if (var2 instanceof rrEm_1 && var4 instanceof rSK) {
         var2.class_(new rfH_2(var3), true, var4);
      }
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return volatile_;
   }

   @Override
   protected boolean catch_(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      rXE var4 = var2.break_(var3);
      rXE var5 = var2.break_(var3.final_());
      return (var4.class_() == rXG.byte_ || var1.byte_() == QP.long_) && var5.class_() == rXG.class_;
   }
}
