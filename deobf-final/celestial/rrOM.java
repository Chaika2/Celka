package celestial;

import com.google.common.collect.ImmutableList;

public class rrOM extends rrMi_1 {
   public rrOM() {
      super(aI_2.catch_, "boat", 0.5F);
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      pg_3 var3 = QY.instanceof_().case_();
      pv_3 var4 = new pv_3(var3);
      if (!rrxr_3.Eg.protected_()) {
         rrbb_3.protected_("Field not found: RenderBoat.modelBoat");
         return null;
      } else {
         rrxr_3.class_(var4, rrxr_3.Eg, var1);
         var4.byte_ = var2;
         return var4;
      }
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof tu_3 var3)) {
         return null;
      } else {
         ImmutableList var4 = var3.break_();
         if (var4 != null) {
            if (var2.equals("bottom")) {
               return rrXO.class_(var4, 0);
            }

            if (var2.equals("back")) {
               return rrXO.class_(var4, 1);
            }

            if (var2.equals("front")) {
               return rrXO.class_(var4, 2);
            }

            if (var2.equals("right")) {
               return rrXO.class_(var4, 3);
            }

            if (var2.equals("left")) {
               return rrXO.class_(var4, 4);
            }

            if (var2.equals("paddle_left")) {
               return rrXO.class_(var4, 5);
            }

            if (var2.equals("paddle_right")) {
               return rrXO.class_(var4, 6);
            }
         }

         return var2.equals("bottom_no_water") ? var3.byte_() : null;
      }
   }

   @Override
   public In_1 throws_() {
      return new tu_3();
   }

   @Override
   public String[] case_() {
      return new String[]{"bottom", "back", "front", "right", "left", "paddle_left", "paddle_right", "bottom_no_water"};
   }
}
