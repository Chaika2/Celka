package celestial;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class rqJ_2<T> {
   final List<T> class_ = Lists.newArrayList();
   final Spliterator<T> break_;

   public rqJ_2(Stream<T> var1) {
      this.break_ = var1.spliterator();
   }

   public Stream<T> class_() {
      return StreamSupport.stream(new rqx_3(this, Long.MAX_VALUE, 0), false);
   }
}
