package celestial;

import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.function.Function;

public class Kl_1 implements KI {
   static final SimpleCommandExceptionType id_break = new SimpleCommandExceptionType(new rgn_3("commands.data.block.invalid"));
   public static final Function<String, Kp_1> id_class = var0 -> new KH(var0);
   private final ryO_2 id_byte;
   private final rfH_2 id_protected;

   public Kl_1(ryO_2 var1, rfH_2 var2) {
      this.id_byte = var1;
      this.id_protected = var2;
   }

   @Override
   public rgP_2 id_class(rcZ_2 var1) {
      return new rgn_3("commands.data.block.query", this.id_protected.b_(), this.id_protected.c_(), this.id_protected.d_(), var1.id_volatile());
   }

   @Override
   public rgP_2 id_class(YJ var1, double var2, int var4) {
      return new rgn_3(
         "commands.data.block.get",
         var1,
         this.id_protected.b_(),
         this.id_protected.c_(),
         this.id_protected.d_(),
         String.format(Locale.ROOT, "%.2f", var2),
         var4
      );
   }

   @Override
   public void id_class(rcd_3 var1) {
      var1.id_break("x", this.id_protected.b_());
      var1.id_break("y", this.id_protected.c_());
      var1.id_break("z", this.id_protected.d_());
      xc_3 var2 = this.id_byte.id_while().id_byte(this.id_protected);
      this.id_byte.id_class(var2, var1);
      this.id_byte.id_break();
      this.id_byte.id_while().id_class(this.id_protected, var2, var2, 3);
   }

   @Override
   public rcd_3 id_class() {
      return this.id_byte.id_class(new rcd_3());
   }

   @Override
   public rgP_2 id_break() {
      return new rgn_3("commands.data.block.modified", this.id_protected.b_(), this.id_protected.c_(), this.id_protected.d_());
   }
}
