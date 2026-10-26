package celestial;

public class rrkX extends rrXi_1 {
   private rrdD throws_ = null;

   public rrkX(int var1, int var2, int var3, int var4, int var5, rrdD var6, String var7) {
      super(var1, var2, var3, var4, var5, var7);
      this.throws_ = var6;
   }

   @Override
   protected boolean break_(int var1) {
      return this.throws_ instanceof rrdi_1 ? var1 == 0 : true;
   }

   public boolean extends_() {
      return true;
   }

   public void implements_() {
   }

   public rrdD private_() {
      return this.throws_;
   }
}
