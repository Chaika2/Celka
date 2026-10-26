package celestial;

public class rJh_1 extends rJY {
   private final rXH class_;

   @Override
   public int byte_(rdn_3 var1) {
      return throws_(var1) ? 1 : super.byte_(var1);
   }

   public rJh_1(rXH var1, rXu_1 var2, int var3, int var4, int var5) {
      super(var2, var3, var4, var5);
      this.class_ = var1;
   }

   @Override
   public boolean class_(rdn_3 var1) {
      return this.class_.break_(var1) || throws_(var1);
   }

   public static boolean throws_(rdn_3 var0) {
      return var0.break_() == rdy_3.hg;
   }
}
