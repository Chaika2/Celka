package celestial;

public class rrOC extends rrOY {
   public rrOC() {
      super(aI_2.id_return, "evoker", 0.5F, new String[]{"evocation_illager"});
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      pg_3 var3 = QY.id_instanceof().id_case();
      pY_2 var4 = new pY_2(var3);
      var4.id_throws = (tp_3)var1;
      var4.id_byte = var2;
      return var4;
   }

   @Override
   public In_1 id_throws() {
      return new tK_2(0.0F, 0.0F, 64, 64);
   }
}
