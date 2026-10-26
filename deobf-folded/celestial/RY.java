package celestial;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import java.util.function.Predicate;

public class RY implements Predicate<rdn_3> {
   private static final Dynamic2CommandExceptionType id_class = new Dynamic2CommandExceptionType(
      (var0, var1) -> new rgn_3("arguments.item.overstacked", var0, var1)
   );
   private final rdb_3 id_break;
   private final rcd_3 id_byte;

   public RY(rdb_3 var1, rcd_3 var2) {
      this.id_break = var1;
      this.id_byte = var2;
   }

   public boolean id_class(rdn_3 var1) {
      return var1.id_break() == this.id_break && rco_3.id_class(this.id_byte, var1.id_package(), true);
   }

   public rdb_3 id_class() {
      return this.id_break;
   }

   public rdn_3 id_class(int var1, boolean var2) throws CommandSyntaxException {
      rdn_3 var3 = new rdn_3(this.id_break, var1);
      if (this.id_byte != null) {
         var3.id_byte(this.id_byte);
      }

      if (var2 && var1 > var3.id_byte()) {
         throw id_class.create(rVL.id_for.id_break(this.id_break), var3.id_byte());
      } else {
         return var3;
      }
   }

   public String id_break() {
      StringBuilder var1 = new StringBuilder(rVL.id_for.id_class(this.id_break));
      if (this.id_byte != null) {
         var1.append(this.id_byte);
      }

      return var1.toString();
   }
}
