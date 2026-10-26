package celestial;

public class rrhr_3 extends rrMi_1 {
   public rrhr_3() {
      super(aI_2.switch_, "minecart", 0.5F);
   }

   protected rrhr_3(aI_2 var1, String var2, float var3) {
      super(var1, var2, var3);
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof wr_3 var3)) {
         return null;
      } else {
         Iq_1[] var4 = (Iq_1[])rrxr_3.sA.class_(var3);
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
   public rrMa_1 class_(In_1 var1, float var2) {
      pg_3 var3 = QY.instanceof_().case_();
      qN_2 var4 = new qN_2(var3);
      if (!rrxr_3.Gr.protected_()) {
         rrbb_3.protected_("Field not found: RenderMinecart.modelMinecart");
         return null;
      } else {
         rrxr_3.class_(var4, rrxr_3.Gr, var1);
         var4.byte_ = var2;
         return var4;
      }
   }

   @Override
   public In_1 throws_() {
      return new wr_3();
   }

   @Override
   public String[] case_() {
      return new String[]{"bottom", "back", "front", "right", "left", "dirt"};
   }
}
