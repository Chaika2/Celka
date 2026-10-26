package celestial;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class Kf_1 implements KI {
   static final SuggestionProvider<gy_3> id_break = (var0, var1) -> gR_2.id_class(id_class(var0).id_class(), var1);
   public static final Function<String, Kp_1> id_class = var0 -> new Kj_1(var0);
   private final rrEU id_byte;
   private final rqO_2 id_protected;

   Kf_1(rrEU var1, rqO_2 var2) {
      this.id_byte = var1;
      this.id_protected = var2;
   }

   @Override
   public rgP_2 id_class(YJ var1, double var2, int var4) {
      return new rgn_3("commands.data.storage.get", var1, this.id_protected, String.format(Locale.ROOT, "%.2f", var2), var4);
   }

   static rrEU id_class(CommandContext<gy_3> var0) {
      return ((gy_3)var0.getSource()).id_super().Y();
   }

   @Override
   public void id_class(rcd_3 var1) {
      this.id_byte.id_class(this.id_protected, var1);
   }

   @Override
   public rcd_3 id_class() {
      return this.id_byte.id_class(this.id_protected);
   }

   @Override
   public rgP_2 id_class(rcZ_2 var1) {
      return new rgn_3("commands.data.storage.query", this.id_protected, var1.id_volatile());
   }

   @Override
   public rgP_2 id_break() {
      return new rgn_3("commands.data.storage.modified", this.id_protected);
   }
}
