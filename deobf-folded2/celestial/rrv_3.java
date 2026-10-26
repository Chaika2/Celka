package celestial;

public class rrv_3 extends rrF_2 {
   public rrv_3(int var1, float var2) {
      super(var1, var2, 1);
   }

   @Override
   protected boolean id_class(rrEm_1 var1, iB_2 var2) {
      rrEr_1 var3 = var1.id_interface(var2.Bs());
      return super.id_class(var1, var2) && var3 != null && var3.id_this() && !var3.id_throws() && !var3.id_case();
   }
}
