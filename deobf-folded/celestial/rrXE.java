package celestial;

public class rrXE extends rrOG {
   public rrXE() {
      super(aI_2.rs, "zombie", 0.5F);
   }

   protected rrXE(aI_2 var1, String var2, float var3) {
      super(var1, var2, var3);
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      pg_3 var3 = QY.id_instanceof().id_case();
      Tk_1 var4 = new Tk_1(var3);
      var4.id_throws = (wg_3<rbB_2>)var1;
      var4.id_byte = var2;
      return var4;
   }

   @Override
   public In_1 id_throws() {
      return new wg_3(0.0F, false);
   }
}
