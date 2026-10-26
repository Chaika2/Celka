package celestial;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import java.util.function.Predicate;

public class RY implements Predicate<rdn_3> {
   private static final Dynamic2CommandExceptionType class_ = new Dynamic2CommandExceptionType(
      (var0, var1) -> new rgn_3("arguments.item.overstacked", var0, var1)
   );
   private final rdb_3 break_;
   private final rcd_3 byte_;

   public RY(rdb_3 var1, rcd_3 var2) {
      this.break_ = var1;
      this.byte_ = var2;
   }

   public boolean class_(rdn_3 var1) {
      return var1.break_() == this.break_ && rco_3.class_(this.byte_, var1.package_(), true);
   }

   public rdb_3 class_() {
      return this.break_;
   }

   public rdn_3 class_(int var1, boolean var2) throws CommandSyntaxException {
      rdn_3 var3 = new rdn_3(this.break_, var1);
      if (this.byte_ != null) {
         var3.byte_(this.byte_);
      }

      if (var2 && var1 > var3.byte_()) {
         throw class_.create(rVL.for_.break_(this.break_), var3.byte_());
      } else {
         return var3;
      }
   }

   public String break_() {
      StringBuilder var1 = new StringBuilder(rVL.for_.class_(this.break_));
      if (this.byte_ != null) {
         var1.append(this.byte_);
      }

      return var1.toString();
   }
}
