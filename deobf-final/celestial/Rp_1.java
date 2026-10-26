package celestial;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import java.util.Collection;
import java.util.Collections;

class Rp_1 implements Rq_1 {
   Rp_1(RH var1, rqO_2 var2) {
      this.class_ = var2;
   }

   @Override
   public Collection<gt_3> class_(CommandContext<gy_3> var1) throws CommandSyntaxException {
      return Collections.singleton(RH.class_(var1, this.class_));
   }

   @Override
   public Pair<rqO_2, Either<gt_3, rlb_3<gt_3>>> break_(CommandContext<gy_3> var1) throws CommandSyntaxException {
      return Pair.of(this.class_, Either.left(RH.class_(var1, this.class_)));
   }
}
