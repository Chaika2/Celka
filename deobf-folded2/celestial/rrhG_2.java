package celestial;

public class rrhG_2 extends rrhr_3 {
   public rrhG_2() {
      super(aI_2.E, "tnt_minecart", 0.5F);
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      pg_3 var3 = QY.id_instanceof().id_case();
      qe_3 var4 = new qe_3(var3);
      if (!rrxr_3.Gr.id_protected()) {
         rrbb_3.id_protected("Field not found: RenderMinecart.modelMinecart");
         return null;
      } else {
         rrxr_3.id_class(var4, rrxr_3.Gr, var1);
         var4.id_byte = var2;
         return var4;
      }
   }
}
