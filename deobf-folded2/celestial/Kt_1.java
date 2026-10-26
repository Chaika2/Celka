package celestial;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;

public class Kt_1 implements KI {
   private static final SimpleCommandExceptionType id_break = new SimpleCommandExceptionType(new rgn_3("commands.data.entity.invalid"));
   public static final Function<String, Kp_1> id_class = var0 -> new Kw_1(var0);
   private final an_3 id_byte;

   public Kt_1(an_3 var1) {
      this.id_byte = var1;
   }

   @Override
   public rgP_2 id_class(rcZ_2 var1) {
      return new rgn_3("commands.data.entity.query", this.id_byte.L_(), var1.id_volatile());
   }

   @Override
   public rgP_2 id_class(YJ var1, double var2, int var4) {
      return new rgn_3("commands.data.entity.get", var1, this.id_byte.L_(), String.format(Locale.ROOT, "%.2f", var2), var4);
   }

   @Override
   public void id_class(rcd_3 var1) throws CommandSyntaxException {
      if (this.id_byte instanceof rhd_3) {
         throw id_break.create();
      } else {
         UUID var2 = this.id_byte.ro();
         this.id_byte.id_throws(var1);
         this.id_byte.a_(var2);
      }
   }

   @Override
   public rcd_3 id_class() {
      return XC.id_break(this.id_byte);
   }

   @Override
   public rgP_2 id_break() {
      return new rgn_3("commands.data.entity.modified", this.id_byte.L_());
   }
}
