package celestial;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Stream;

public class gh_3<T> extends gd_3<T> {
   protected gz_3<T> class_ = new gz_3<>();
   private final Function<T, Stream<String>> protected_;

   public gh_3(Function<T, Stream<String>> var1, Function<T, Stream<rqO_2>> var2) {
      super(var2);
      this.protected_ = var1;
   }

   @Override
   public List<T> class_(String var1) {
      int var2 = var1.indexOf(58);
      if (var2 < 0) {
         return this.class_.class_(var1);
      } else {
         List var3 = this.break_.class_(var1.substring(0, var2).trim());
         String var4 = var1.substring(var2 + 1).trim();
         List var5 = this.byte_.class_(var4);
         List var6 = this.class_.class_(var4);
         return Lists.newArrayList(new gk_3<T>(var3.iterator(), new gX_2<T>(var5.iterator(), var6.iterator(), this::class_), this::class_));
      }
   }

   @Override
   public void break_() {
      this.class_ = new gz_3<>();
      super.break_();
      this.class_.class_();
   }

   @Override
   protected void break_(T var1) {
      super.break_((T)var1);
      this.protected_.apply((T)var1).forEach(var2 -> this.class_.class_((T)var1, var2.toLowerCase(Locale.ROOT)));
   }
}
