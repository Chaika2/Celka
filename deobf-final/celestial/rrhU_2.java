package celestial;

public class rrhU_2 extends rrMi_1 {
   public rrhU_2() {
      super(aI_2.D, "villager", 0.5F);
   }

   protected rrhU_2(aI_2 var1, String var2, float var3) {
      super(var1, var2, var3);
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof wI_2 var3)) {
         return null;
      } else if (var2.equals("head")) {
         return (Iq_1)rrxr_3.Ep.class_(var3, 0);
      } else if (var2.equals("headwear")) {
         return (Iq_1)rrxr_3.Ep.class_(var3, 1);
      } else if (var2.equals("headwear2")) {
         return (Iq_1)rrxr_3.Ep.class_(var3, 2);
      } else if (var2.equals("body")) {
         return (Iq_1)rrxr_3.Ep.class_(var3, 3);
      } else if (var2.equals("bodywear")) {
         return (Iq_1)rrxr_3.Ep.class_(var3, 4);
      } else if (var2.equals("arms")) {
         return (Iq_1)rrxr_3.Ep.class_(var3, 5);
      } else if (var2.equals("right_leg")) {
         return (Iq_1)rrxr_3.Ep.class_(var3, 6);
      } else if (var2.equals("left_leg")) {
         return (Iq_1)rrxr_3.Ep.class_(var3, 7);
      } else {
         return var2.equals("nose") ? (Iq_1)rrxr_3.Ep.class_(var3, 8) : null;
      }
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      rAv_1 var3 = (rAv_1)QY.instanceof_().F();
      pg_3 var4 = QY.instanceof_().case_();
      TE var5 = new TE(var4, var3);
      var5.throws_ = (wI_2<rsq_3>)var1;
      var5.byte_ = var2;
      return var5;
   }

   @Override
   public In_1 throws_() {
      return new wI_2(0.0F);
   }

   @Override
   public String[] case_() {
      return new String[]{"head", "headwear", "headwear2", "body", "bodywear", "arms", "right_leg", "left_leg", "nose"};
   }
}
