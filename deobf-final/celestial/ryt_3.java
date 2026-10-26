package celestial;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class ryt_3 {
   private final List<String> class_ = Lists.newArrayList();

   public ryt_3 class_(String var1) {
      this.class_.add(var1);
      return this;
   }

   public ryT_2 class_(Writer var1) throws IOException {
      return new ryT_2(var1, this.class_);
   }
}
