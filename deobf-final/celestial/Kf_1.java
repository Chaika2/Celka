package celestial;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class Kf_1 implements KI {
   static final SuggestionProvider<gy_3> break_ = (var0, var1) -> gR_2.class_(class_(var0).class_(), var1);
   public static final Function<String, Kp_1> class_ = var0 -> new Kj_1(var0);
   private final rrEU byte_;
   private final rqO_2 protected_;

   Kf_1(rrEU var1, rqO_2 var2) {
      this.byte_ = var1;
      this.protected_ = var2;
   }

   @Override
   public rgP_2 class_(YJ var1, double var2, int var4) {
      return new rgn_3("commands.data.storage.get", var1, this.protected_, String.format(Locale.ROOT, "%.2f", var2), var4);
   }

   static rrEU class_(CommandContext<gy_3> var0) {
      return ((gy_3)var0.getSource()).super_().Y();
   }

   @Override
   public void class_(rcd_3 var1) {
      this.byte_.class_(this.protected_, var1);
   }

   @Override
   public rcd_3 class_() {
      return this.byte_.class_(this.protected_);
   }

   @Override
   public rgP_2 class_(rcZ_2 var1) {
      return new rgn_3("commands.data.storage.query", this.protected_, var1.volatile_());
   }

   @Override
   public rgP_2 break_() {
      return new rgn_3("commands.data.storage.modified", this.protected_);
   }
}
