package celestial;

public class rLV extends rLR {
   protected rLV(rLo_1 var1, int var2) {
      super(var1, var2);
   }

   @Override
   public void id_class(iB_2 var1, ik_3 var2, int var3) {
      var1.id_return(var1.Sd() - (float)(4 * (var3 + 1)));
      super.id_class(var1, var2, var3);
   }

   @Override
   public void id_break(iB_2 var1, ik_3 var2, int var3) {
      var1.id_return(var1.Sd() + (float)(4 * (var3 + 1)));
      super.id_break(var1, var2, var3);
   }
}
