package celestial;

import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.ArrayDeque;

public class gI_2 implements gj_3 {
   private final ParseResults<gy_3> class_;

   public gI_2(ParseResults<gy_3> var1) {
      this.class_ = var1;
   }

   @Override
   public String toString() {
      return this.class_.getReader().getString();
   }

   @Override
   public void class_(Oa_1 var1, gy_3 var2, ArrayDeque<Oi_1> var3, int var4) throws CommandSyntaxException {
      var1.break_().execute(new ParseResults(this.class_.getContext().withSource(var2), this.class_.getReader(), this.class_.getExceptions()));
   }
}
