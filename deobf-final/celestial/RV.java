package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class RV implements Rj_1<Xm_1> {
   private static final Collection<String> class_ = Arrays.asList("0..5.2", "0", "-5.4", "-100.76..", "..100");

   public Xm_1 class_(StringReader var1) throws CommandSyntaxException {
      return Xm_1.class_(var1);
   }

   public Collection<String> getExamples() {
      return class_;
   }
}
