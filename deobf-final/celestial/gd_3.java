package celestial;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Stream;

public class gd_3<T> implements Vo_1<T> {
   protected gz_3<T> break_ = new gz_3<>();
   protected gz_3<T> byte_ = new gz_3<>();
   private final Function<T, Stream<rqO_2>> class_;
   private final List<T> protected_ = Lists.newArrayList();
   private final Object2IntMap<T> throws_ = new Object2IntOpenHashMap();

   public gd_3(Function<T, Stream<rqO_2>> var1) {
      this.class_ = var1;
   }

   protected int class_(T var1, T var2) {
      return Integer.compare(this.throws_.getInt(var1), this.throws_.getInt(var2));
   }

   @Override
   public List<T> class_(String var1) {
      int var2 = var1.indexOf(58);
      if (var2 == -1) {
         return this.byte_.class_(var1);
      } else {
         List var3 = this.break_.class_(var1.substring(0, var2).trim());
         String var4 = var1.substring(var2 + 1).trim();
         List var5 = this.byte_.class_(var4);
         return Lists.newArrayList(new gk_3<T>(var3.iterator(), var5.iterator(), this::class_));
      }
   }

   @Override
   public void class_() {
      this.protected_.clear();
      this.throws_.clear();
   }

   @Override
   public void class_(T var1) {
      this.throws_.put(var1, this.protected_.size());
      this.protected_.add((T)var1);
      this.break_((T)var1);
   }

   protected void break_(T var1) {
      this.class_.apply((T)var1).forEach(var2 -> {
         this.break_.class_((T)var1, var2.byte_().toLowerCase(Locale.ROOT));
         this.byte_.class_((T)var1, var2.break_().toLowerCase(Locale.ROOT));
      });
   }

   @Override
   public void break_() {
      this.break_ = new gz_3<>();
      this.byte_ = new gz_3<>();

      for (Object var2 : this.protected_) {
         this.break_((T)var2);
      }

      this.break_.class_();
      this.byte_.class_();
   }
}
