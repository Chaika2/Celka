package celestial;

public class rrf_3 extends rrD_2 {
   public rrf_3(float var1) {
      super(var1);
   }

   @Override
   protected boolean id_class(rrEm_1 var1, iB_2 var2) {
      rrEr_1 var3 = var1.id_interface(var2.Bs());
      return var3 != null && var3.id_throws() && super.id_class(var1, var2);
   }
}
