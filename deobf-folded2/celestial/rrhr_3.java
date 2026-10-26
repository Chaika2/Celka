package celestial;

public class rrhr_3 extends rrMi_1 {
   public rrhr_3() {
      super(aI_2.id_switch, "minecart", 0.5F);
   }

   protected rrhr_3(aI_2 var1, String var2, float var3) {
      super(var1, var2, var3);
   }

   @Override
   public Iq_1 id_class(In_1 var1, String var2) {
      if (!(var1 instanceof wr_3 var3)) {
         return null;
      } else {
         Iq_1[] var4 = (Iq_1[])rrxr_3.sA.id_class(var3);
         if (var4 != null) {
            if (var2.equals("bottom")) {
               return var4[0];
            }

            if (var2.equals("back")) {
               return var4[1];
            }

            if (var2.equals("front")) {
               return var4[2];
            }

            if (var2.equals("right")) {
               return var4[3];
            }

            if (var2.equals("left")) {
               return var4[4];
            }

            if (var2.equals("dirt")) {
               return var4[5];
            }
         }

         return null;
      }
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      pg_3 var3 = QY.id_instanceof().id_case();
      qN_2 var4 = new qN_2(var3);
      if (!rrxr_3.Gr.id_protected()) {
         rrbb_3.id_protected("Field not found: RenderMinecart.modelMinecart");
         return null;
      } else {
         rrxr_3.id_class(var4, rrxr_3.Gr, var1);
         var4.id_byte = var2;
         return var4;
      }
   }

   @Override
   public In_1 id_throws() {
      return new wr_3();
   }

   @Override
   public String[] id_case() {
      return new String[]{"bottom", "back", "front", "right", "left", "dirt"};
   }
}
