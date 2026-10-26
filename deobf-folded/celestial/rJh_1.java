package celestial;

public class rJh_1 extends rJY {
   private final rXH id_class;

   @Override
   public int id_byte(rdn_3 var1) {
      return id_throws(var1) ? 1 : super.id_byte(var1);
   }

   public rJh_1(rXH var1, rXu_1 var2, int var3, int var4, int var5) {
      super(var2, var3, var4, var5);
      this.id_class = var1;
   }

   @Override
   public boolean id_class(rdn_3 var1) {
      return this.id_class.id_break(var1) || id_throws(var1);
   }

   public static boolean id_throws(rdn_3 var0) {
      return var0.id_break() == rdy_3.hg;
   }
}
