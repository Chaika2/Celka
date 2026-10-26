package celestial;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import java.util.Collection;

class Ry_1 implements Rq_1 {
   Ry_1(RH var1, rqO_2 var2) {
      this.id_class = var2;
   }

   @Override
   public Collection<gt_3> id_class(CommandContext<gy_3> var1) throws CommandSyntaxException {
      rlb_3 var2 = RH.id_break(var1, this.id_class);
      return var2.id_class();
   }

   @Override
   public Pair<rqO_2, Either<gt_3, rlb_3<gt_3>>> id_break(CommandContext<gy_3> var1) throws CommandSyntaxException {
      return Pair.of(this.id_class, Either.right(RH.id_break(var1, this.id_class)));
   }
}
