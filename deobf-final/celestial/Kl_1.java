package celestial;

import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.function.Function;

public class Kl_1 implements KI {
   static final SimpleCommandExceptionType break_ = new SimpleCommandExceptionType(new rgn_3("commands.data.block.invalid"));
   public static final Function<String, Kp_1> class_ = var0 -> new KH(var0);
   private final ryO_2 byte_;
   private final rfH_2 protected_;

   public Kl_1(ryO_2 var1, rfH_2 var2) {
      this.byte_ = var1;
      this.protected_ = var2;
   }

   @Override
   public rgP_2 class_(rcZ_2 var1) {
      return new rgn_3("commands.data.block.query", this.protected_.b_(), this.protected_.c_(), this.protected_.d_(), var1.volatile_());
   }

   @Override
   public rgP_2 class_(YJ var1, double var2, int var4) {
      return new rgn_3(
         "commands.data.block.get", var1, this.protected_.b_(), this.protected_.c_(), this.protected_.d_(), String.format(Locale.ROOT, "%.2f", var2), var4
      );
   }

   @Override
   public void class_(rcd_3 var1) {
      var1.break_("x", this.protected_.b_());
      var1.break_("y", this.protected_.c_());
      var1.break_("z", this.protected_.d_());
      xc_3 var2 = this.byte_.while_().byte_(this.protected_);
      this.byte_.class_(var2, var1);
      this.byte_.break_();
      this.byte_.while_().class_(this.protected_, var2, var2, 3);
   }

   @Override
   public rcd_3 class_() {
      return this.byte_.class_(new rcd_3());
   }

   @Override
   public rgP_2 break_() {
      return new rgn_3("commands.data.block.modified", this.protected_.b_(), this.protected_.c_(), this.protected_.d_());
   }
}
