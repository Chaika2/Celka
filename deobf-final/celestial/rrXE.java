package celestial;

public class rrXE extends rrOG {
   public rrXE() {
      super(aI_2.rs, "zombie", 0.5F);
   }

   protected rrXE(aI_2 var1, String var2, float var3) {
      super(var1, var2, var3);
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      pg_3 var3 = QY.instanceof_().case_();
      Tk_1 var4 = new Tk_1(var3);
      var4.throws_ = (wg_3<rbB_2>)var1;
      var4.byte_ = var2;
      return var4;
   }

   @Override
   public In_1 throws_() {
      return new wg_3(0.0F, false);
   }
}
