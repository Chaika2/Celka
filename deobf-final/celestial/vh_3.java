package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class vh_3 {
   public final rAt_1 class_;
   final List<rAp_1> protected_;
   final List<rAp_1> throws_;
   final Function<rAp_1, rqO_2> case_;
   public Runnable break_;
   public final Consumer<rAt_1> byte_;

   public void byte_() {
      this.class_.class_(Lists.reverse(this.protected_).stream().map(rAp_1::throws_).collect(ImmutableList.toImmutableList()));
      this.byte_.accept(this.class_);
   }

   public vh_3(Runnable var1, Function<rAp_1, rqO_2> var2, rAt_1 var3, Consumer<rAt_1> var4) {
      this.break_ = var1;
      this.case_ = var2;
      this.class_ = var3;
      this.protected_ = Lists.newArrayList(var3.throws_());
      Collections.reverse(this.protected_);
      this.throws_ = Lists.newArrayList(var3.byte_());
      this.throws_.removeAll(this.protected_);
      this.byte_ = var4;
   }

   public Stream<vd_3> class_() {
      return this.throws_.stream().map(var1 -> new vJ_2(this, var1));
   }

   public Stream<vd_3> break_() {
      return this.protected_.stream().map(var1 -> new vx_3(this, var1));
   }

   public void protected_() {
      this.class_.class_();
      this.protected_.retainAll(this.class_.byte_());
      this.throws_.clear();
      this.throws_.addAll(this.class_.byte_());
      this.throws_.removeAll(this.protected_);
   }
}
