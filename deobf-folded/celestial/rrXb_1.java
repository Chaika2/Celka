package celestial;

public class rrXb_1 extends rrOG {
   public rrXb_1() {
      super(aI_2.rG, "zombie_villager", 0.5F);
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      rAv_1 var3 = (rAv_1)QY.id_instanceof().F();
      pg_3 var4 = QY.id_instanceof().id_case();
      TW var5 = new TW(var4, var3);
      var5.id_throws = (wR_2<rbE_2>)var1;
      var5.id_byte = var2;
      return var5;
   }

   @Override
   public In_1 id_throws() {
      return new wR_2(0.0F, false);
   }
}
