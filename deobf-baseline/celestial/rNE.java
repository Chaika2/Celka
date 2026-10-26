package celestial;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;

public enum rNE {
   REPLACE("replace"),
   APPEND("append"),
   MERGE("merge");

   final String op;

   rNE(String var3) {
      this.op = var3;
   }

   public abstract void id_class(rcZ_2 var1, YJ var2, List<rcZ_2> var3) throws CommandSyntaxException;

   public static rNE id_class(String var0) {
      for (rNE var4 : values()) {
         if (var4.op.equals(var0)) {
            return var4;
         }
      }

      throw new IllegalArgumentException("Invalid merge strategy" + var0);
   }
}
