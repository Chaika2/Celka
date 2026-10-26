package celestial;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class rqJ_2<T> {
   final List<T> id_class = Lists.newArrayList();
   final Spliterator<T> id_break;

   public rqJ_2(Stream<T> var1) {
      this.id_break = var1.spliterator();
   }

   public Stream<T> id_class() {
      return StreamSupport.stream(new rqx_3(this, Long.MAX_VALUE, 0), false);
   }
}
