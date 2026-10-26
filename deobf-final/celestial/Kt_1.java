package celestial;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;

public class Kt_1 implements KI {
   private static final SimpleCommandExceptionType break_ = new SimpleCommandExceptionType(new rgn_3("commands.data.entity.invalid"));
   public static final Function<String, Kp_1> class_ = var0 -> new Kw_1(var0);
   private final an_3 byte_;

   public Kt_1(an_3 var1) {
      this.byte_ = var1;
   }

   @Override
   public rgP_2 class_(rcZ_2 var1) {
      return new rgn_3("commands.data.entity.query", this.byte_.L_(), var1.volatile_());
   }

   @Override
   public rgP_2 class_(YJ var1, double var2, int var4) {
      return new rgn_3("commands.data.entity.get", var1, this.byte_.L_(), String.format(Locale.ROOT, "%.2f", var2), var4);
   }

   @Override
   public void class_(rcd_3 var1) throws CommandSyntaxException {
      if (this.byte_ instanceof rhd_3) {
         throw break_.create();
      } else {
         UUID var2 = this.byte_.ro();
         this.byte_.throws_(var1);
         this.byte_.a_(var2);
      }
   }

   @Override
   public rcd_3 class_() {
      return XC.break_(this.byte_);
   }

   @Override
   public rgP_2 break_() {
      return new rgn_3("commands.data.entity.modified", this.byte_.L_());
   }
}
