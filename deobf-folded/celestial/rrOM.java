package celestial;

import com.google.common.collect.ImmutableList;

public class rrOM extends rrMi_1 {
   public rrOM() {
      super(aI_2.id_catch, "boat", 0.5F);
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      pg_3 var3 = QY.id_instanceof().id_case();
      pv_3 var4 = new pv_3(var3);
      if (!rrxr_3.Eg.id_protected()) {
         rrbb_3.id_protected("Field not found: RenderBoat.modelBoat");
         return null;
      } else {
         rrxr_3.id_class(var4, rrxr_3.Eg, var1);
         var4.id_byte = var2;
         return var4;
      }
   }

   @Override
   public Iq_1 id_class(In_1 var1, String var2) {
      if (!(var1 instanceof tu_3 var3)) {
         return null;
      } else {
         ImmutableList var4 = var3.id_break();
         if (var4 != null) {
            if (var2.equals("bottom")) {
               return rrXO.id_class(var4, 0);
            }

            if (var2.equals("back")) {
               return rrXO.id_class(var4, 1);
            }

            if (var2.equals("front")) {
               return rrXO.id_class(var4, 2);
            }

            if (var2.equals("right")) {
               return rrXO.id_class(var4, 3);
            }

            if (var2.equals("left")) {
               return rrXO.id_class(var4, 4);
            }

            if (var2.equals("paddle_left")) {
               return rrXO.id_class(var4, 5);
            }

            if (var2.equals("paddle_right")) {
               return rrXO.id_class(var4, 6);
            }
         }

         return var2.equals("bottom_no_water") ? var3.id_byte() : null;
      }
   }

   @Override
   public In_1 id_throws() {
      return new tu_3();
   }

   @Override
   public String[] id_case() {
      return new String[]{"bottom", "back", "front", "right", "left", "paddle_left", "paddle_right", "bottom_no_water"};
   }
}
