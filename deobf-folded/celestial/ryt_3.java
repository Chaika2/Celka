package celestial;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class ryt_3 {
   private final List<String> id_class = Lists.newArrayList();

   public ryt_3 id_class(String var1) {
      this.id_class.add(var1);
      return this;
   }

   public ryT_2 id_class(Writer var1) throws IOException {
      return new ryT_2(var1, this.id_class);
   }
}
