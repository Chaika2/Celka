package celestial;

import java.util.Optional;

public class QH extends VF {
   public QH(Qg_1 var1) {
      this(var1, var1.public_());
   }

   private QH(Qg_1 var1, Qa_1 var2) {
      super("options.fullscreen.resolution", -1.0, var2 != null ? (double)(var2.throws_() - 1) : -1.0, 1.0F, var2x -> {
         if (var2 == null) {
            return -1.0;
         } else {
            Optional var3 = var1.case_();
            return var3.<Double>map(var1xx -> (double)var2.class_(var1xx)).orElse(-1.0);
         }
      }, (var2x, var3) -> {
         if (var2 != null) {
            if (var3 == -1.0) {
               var1.class_(Optional.empty());
            } else {
               var1.class_(Optional.of(var2.class_(var3.intValue())));
            }
         }
      }, (var1x, var2x) -> {
         if (var2 == null) {
            return new rgn_3("options.fullscreen.unavailable");
         } else {
            double var3 = var2x.class_(var1x);
            return var3 == -1.0 ? var2x.class_(new rgn_3("options.fullscreen.current")) : var2x.class_(new rgN_2(var2.class_((int)var3).toString()));
         }
      });
   }
}
