package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class RV implements Rj_1<Xm_1> {
   private static final Collection<String> id_class = Arrays.asList("0..5.2", "0", "-5.4", "-100.76..", "..100");

   public Xm_1 id_class(StringReader var1) throws CommandSyntaxException {
      return Xm_1.id_class(var1);
   }

   public Collection<String> getExamples() {
      return id_class;
   }
}
