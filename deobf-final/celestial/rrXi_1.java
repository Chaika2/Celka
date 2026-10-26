package celestial;

public class rrXi_1 extends LF {
   public final int class_;

   public rrXi_1(int var1, int var2, int var3, String var4) {
      this(var1, var2, var3, 200, 20, var4, var0 -> {
      });
   }

   public rrXi_1(int var1, int var2, int var3, int var4, int var5, String var6) {
      this(var1, var2, var3, var4, var5, var6, var0 -> {
      });
   }

   public rrXi_1(int var1, int var2, int var3, int var4, int var5, String var6, LL var7) {
      super(var2, var3, var4, var5, new rgN_2(var6), var7);
      this.class_ = var1;
   }

   public void class_(String var1) {
      super.break_(new rgN_2(var1));
   }
}
