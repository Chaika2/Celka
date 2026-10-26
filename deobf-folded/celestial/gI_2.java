package celestial;

import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.ArrayDeque;

public class gI_2 implements gj_3 {
   private final ParseResults<gy_3> id_class;

   public gI_2(ParseResults<gy_3> var1) {
      this.id_class = var1;
   }

   @Override
   public String toString() {
      return this.id_class.getReader().getString();
   }

   @Override
   public void id_class(Oa_1 var1, gy_3 var2, ArrayDeque<Oi_1> var3, int var4) throws CommandSyntaxException {
      var1.id_break().execute(new ParseResults(this.id_class.getContext().withSource(var2), this.id_class.getReader(), this.id_class.getExceptions()));
   }
}
