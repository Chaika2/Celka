package celestial;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Stream;

public class gh_3<T> extends gd_3<T> {
   protected gz_3<T> id_class = new gz_3<>();
   private final Function<T, Stream<String>> id_protected;

   public gh_3(Function<T, Stream<String>> var1, Function<T, Stream<rqO_2>> var2) {
      super(var2);
      this.id_protected = var1;
   }

   @Override
   public List<T> id_class(String var1) {
      int var2 = var1.indexOf(58);
      if (var2 < 0) {
         return this.id_class.id_class(var1);
      } else {
         List var3 = this.id_break.id_class(var1.substring(0, var2).trim());
         String var4 = var1.substring(var2 + 1).trim();
         List var5 = this.id_byte.id_class(var4);
         List var6 = this.id_class.id_class(var4);
         return Lists.newArrayList(new gk_3<T>(var3.iterator(), new gX_2<T>(var5.iterator(), var6.iterator(), this::id_class), this::id_class));
      }
   }

   @Override
   public void id_break() {
      this.id_class = new gz_3<>();
      super.id_break();
      this.id_class.id_class();
   }

   @Override
   protected void id_break(T var1) {
      super.id_break((T)var1);
      this.id_protected.apply((T)var1).forEach(var2 -> this.id_class.id_class((T)var1, var2.toLowerCase(Locale.ROOT)));
   }
}
