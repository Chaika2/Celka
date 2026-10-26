package celestial;

public class rLV extends rLR {
   protected rLV(rLo_1 var1, int var2) {
      super(var1, var2);
   }

   @Override
   public void class_(iB_2 var1, ik_3 var2, int var3) {
      var1.return_(var1.Sd() - (float)(4 * (var3 + 1)));
      super.class_(var1, var2, var3);
   }

   @Override
   public void break_(iB_2 var1, ik_3 var2, int var3) {
      var1.return_(var1.Sd() + (float)(4 * (var3 + 1)));
      super.break_(var1, var2, var3);
   }
}
