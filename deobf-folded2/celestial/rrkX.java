package celestial;

public class rrkX extends rrXi_1 {
   private rrdD id_throws = null;

   public rrkX(int var1, int var2, int var3, int var4, int var5, rrdD var6, String var7) {
      super(var1, var2, var3, var4, var5, var7);
      this.id_throws = var6;
   }

   @Override
   protected boolean id_break(int var1) {
      return this.id_throws instanceof rrdi_1 ? var1 == 0 : true;
   }

   public boolean id_extends() {
      return true;
   }

   public void id_implements() {
   }

   public rrdD id_private() {
      return this.id_throws;
   }
}
