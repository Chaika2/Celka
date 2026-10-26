package celestial;

import java.util.Iterator;

public class rrOc_1 extends rrMi_1 {
   public rrOc_1() {
      super(aI_2.final_, "dolphin", 0.7F);
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      pg_3 var3 = QY.instanceof_().case_();
      py_3 var4 = new py_3(var3);
      var4.throws_ = (tn_3<rbo_3>)var1;
      var4.byte_ = var2;
      return var4;
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof tn_3 var3)) {
         return null;
      } else {
         Iterator var4 = var3.class_().iterator();
         Iq_1 var5 = rrXO.class_(var4, 0);
         if (var5 == null) {
            return null;
         } else if (var2.equals("body")) {
            return var5;
         } else if (var2.equals("back_fin")) {
            return var5.class_(0);
         } else if (var2.equals("left_fin")) {
            return var5.class_(1);
         } else if (var2.equals("right_fin")) {
            return var5.class_(2);
         } else if (var2.equals("tail")) {
            return var5.class_(3);
         } else if (var2.equals("tail_fin")) {
            return var5.class_(3).class_(0);
         } else {
            return var2.equals("head") ? var5.class_(4) : null;
         }
      }
   }

   @Override
   public In_1 throws_() {
      return new tn_3();
   }

   @Override
   public String[] case_() {
      return new String[]{"body", "back_fin", "left_fin", "right_fin", "tail", "tail_fin", "head"};
   }
}
