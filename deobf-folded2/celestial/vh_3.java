package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class vh_3 {
   public final rAt_1 id_class;
   final List<rAp_1> id_protected;
   final List<rAp_1> id_throws;
   final Function<rAp_1, rqO_2> id_case;
   public Runnable id_break;
   public final Consumer<rAt_1> id_byte;

   public void id_byte() {
      this.id_class.id_class(Lists.reverse(this.id_protected).stream().map(rAp_1::id_throws).collect(ImmutableList.toImmutableList()));
      this.id_byte.accept(this.id_class);
   }

   public vh_3(Runnable var1, Function<rAp_1, rqO_2> var2, rAt_1 var3, Consumer<rAt_1> var4) {
      this.id_break = var1;
      this.id_case = var2;
      this.id_class = var3;
      this.id_protected = Lists.newArrayList(var3.id_throws());
      Collections.reverse(this.id_protected);
      this.id_throws = Lists.newArrayList(var3.id_byte());
      this.id_throws.removeAll(this.id_protected);
      this.id_byte = var4;
   }

   public Stream<vd_3> id_class() {
      return this.id_throws.stream().map(var1 -> new vJ_2(this, var1));
   }

   public Stream<vd_3> id_break() {
      return this.id_protected.stream().map(var1 -> new vx_3(this, var1));
   }

   public void id_protected() {
      this.id_class.id_class();
      this.id_protected.retainAll(this.id_class.id_byte());
      this.id_throws.clear();
      this.id_throws.addAll(this.id_class.id_byte());
      this.id_throws.removeAll(this.id_protected);
   }
}
