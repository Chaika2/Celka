package celestial;

public class rrhc_3 extends rrMi_1 {
   public rrhc_3() {
      super(aI_2.N, "puffer_fish_small", 0.2F);
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      pg_3 var3 = QY.instanceof_().case_();
      Object var4 = var3.throws_().get(aI_2.N);
      if (!(var4 instanceof qy_3)) {
         rrbb_3.protected_("Not a PufferfishRenderer: " + var4);
         return null;
      } else {
         if (((pV_2)var4).byte_() == null) {
            qy_3 var5 = new qy_3(var3);
            var5.byte_ = var2;
            var4 = var5;
         }

         qy_3 var6 = (qy_3)var4;
         if (!rrxr_3.EU.protected_()) {
            rrbb_3.protected_("Model field not found: RenderPufferfish.modelSmall");
            return null;
         } else {
            rrxr_3.EU.class_(var6, var1);
            return var6;
         }
      }
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof wd_3 var3)) {
         return null;
      } else if (var2.equals("body")) {
         return (Iq_1)rrxr_3.sg.class_(var3, 0);
      } else if (var2.equals("eye_right")) {
         return (Iq_1)rrxr_3.sg.class_(var3, 1);
      } else if (var2.equals("eye_left")) {
         return (Iq_1)rrxr_3.sg.class_(var3, 2);
      } else if (var2.equals("fin_right")) {
         return (Iq_1)rrxr_3.sg.class_(var3, 3);
      } else if (var2.equals("fin_left")) {
         return (Iq_1)rrxr_3.sg.class_(var3, 4);
      } else {
         return var2.equals("tail") ? (Iq_1)rrxr_3.sg.class_(var3, 5) : null;
      }
   }

   @Override
   public In_1 throws_() {
      return new wd_3();
   }

   @Override
   public String[] case_() {
      return new String[]{"body", "eye_right", "eye_left", "tail", "fin_right", "fin_left"};
   }
}
