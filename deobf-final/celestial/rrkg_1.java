package celestial;

public class rrkg_1 extends rrkR {
   public rrkg_1() {
      super(new rrkI(), new rrkI(), new rrkI(), new rrkI());
   }

   @Override
   public int class_(int var1, int var2, int var3, int var4) {
      return var1 == var2 && var2 == var3 && var3 == var4 ? var1 : super.class_(var1, var2, var3, var4);
   }
}
