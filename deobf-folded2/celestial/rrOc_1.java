package celestial;

import java.util.Iterator;

public class rrOc_1 extends rrMi_1 {
   public rrOc_1() {
      super(aI_2.id_final, "dolphin", 0.7F);
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      pg_3 var3 = QY.id_instanceof().id_case();
      py_3 var4 = new py_3(var3);
      var4.id_throws = (tn_3<rbo_3>)var1;
      var4.id_byte = var2;
      return var4;
   }

   @Override
   public Iq_1 id_class(In_1 var1, String var2) {
      if (!(var1 instanceof tn_3 var3)) {
         return null;
      } else {
         Iterator var4 = var3.id_class().iterator();
         Iq_1 var5 = rrXO.id_class(var4, 0);
         if (var5 == null) {
            return null;
         } else if (var2.equals("body")) {
            return var5;
         } else if (var2.equals("back_fin")) {
            return var5.id_class(0);
         } else if (var2.equals("left_fin")) {
            return var5.id_class(1);
         } else if (var2.equals("right_fin")) {
            return var5.id_class(2);
         } else if (var2.equals("tail")) {
            return var5.id_class(3);
         } else if (var2.equals("tail_fin")) {
            return var5.id_class(3).id_class(0);
         } else {
            return var2.equals("head") ? var5.id_class(4) : null;
         }
      }
   }

   @Override
   public In_1 id_throws() {
      return new tn_3();
   }

   @Override
   public String[] id_case() {
      return new String[]{"body", "back_fin", "left_fin", "right_fin", "tail", "tail_fin", "head"};
   }
}
