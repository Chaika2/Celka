package celestial;

public class rrXP extends rrOG {
   public rrXP() {
      super(aI_2.rr, "wither_skeleton", 0.7F);
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      pg_3 var3 = QY.id_instanceof().id_case();
      TX var4 = new TX(var3);
      var4.id_throws = (wL_2<rEb_1>)var1;
      var4.id_byte = var2;
      return var4;
   }

   @Override
   public In_1 id_throws() {
      return new wL_2();
   }
}
