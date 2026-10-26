package celestial;

import java.util.Optional;

public class QH extends VF {
   public QH(Qg_1 var1) {
      this(var1, var1.id_public());
   }

   private QH(Qg_1 var1, Qa_1 var2) {
      super("options.fullscreen.resolution", -1.0, var2 != null ? (double)(var2.id_throws() - 1) : -1.0, 1.0F, var2x -> {
         if (var2 == null) {
            return -1.0;
         } else {
            Optional var3 = var1.id_case();
            return var3.<Double>map(var1xx -> (double)var2.id_class(var1xx)).orElse(-1.0);
         }
      }, (var2x, var3) -> {
         if (var2 != null) {
            if (var3 == -1.0) {
               var1.id_class(Optional.empty());
            } else {
               var1.id_class(Optional.of(var2.id_class(var3.intValue())));
            }
         }
      }, (var1x, var2x) -> {
         if (var2 == null) {
            return new rgn_3("options.fullscreen.unavailable");
         } else {
            double var3 = var2x.id_class(var1x);
            return var3 == -1.0 ? var2x.id_class(new rgn_3("options.fullscreen.current")) : var2x.id_class(new rgN_2(var2.id_class((int)var3).toString()));
         }
      });
   }
}
