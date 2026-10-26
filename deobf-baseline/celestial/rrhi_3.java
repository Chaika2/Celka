package celestial;

public class rrhi_3 extends rrhU_2 {
   public rrhi_3() {
      super(aI_2.a, "witch", 0.5F);
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      pg_3 var3 = QY.id_instanceof().id_case();
      TO var4 = new TO(var3);
      var4.id_throws = (wf_3<rGi_1>)var1;
      var4.id_byte = var2;
      return var4;
   }

   @Override
   public Iq_1 id_class(In_1 var1, String var2) {
      if (!(var1 instanceof wf_3 var3)) {
         return null;
      } else {
         return var2.equals("mole") ? (Iq_1)rrxr_3.id_class(var3, rrxr_3.ET) : super.id_class(var3, var2);
      }
   }

   @Override
   public In_1 id_throws() {
      return new wf_3(0.0F);
   }

   @Override
   public String[] id_case() {
      String[] var1 = super.id_case();
      return (String[])rrbb_3.id_class((Object[])var1, (Object)"mole");
   }
}
