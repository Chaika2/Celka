package celestial;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Stream;

public class gd_3<T> implements Vo_1<T> {
   protected gz_3<T> id_break = new gz_3<>();
   protected gz_3<T> id_byte = new gz_3<>();
   private final Function<T, Stream<rqO_2>> id_class;
   private final List<T> id_protected = Lists.newArrayList();
   private final Object2IntMap<T> id_throws = new Object2IntOpenHashMap();

   public gd_3(Function<T, Stream<rqO_2>> var1) {
      this.id_class = var1;
   }

   protected int id_class(T var1, T var2) {
      return Integer.compare(this.id_throws.getInt(var1), this.id_throws.getInt(var2));
   }

   @Override
   public List<T> id_class(String var1) {
      int var2 = var1.indexOf(58);
      if (var2 == -1) {
         return this.id_byte.id_class(var1);
      } else {
         List var3 = this.id_break.id_class(var1.substring(0, var2).trim());
         String var4 = var1.substring(var2 + 1).trim();
         List var5 = this.id_byte.id_class(var4);
         return Lists.newArrayList(new gk_3<T>(var3.iterator(), var5.iterator(), this::id_class));
      }
   }

   @Override
   public void id_class() {
      this.id_protected.clear();
      this.id_throws.clear();
   }

   @Override
   public void id_class(T var1) {
      this.id_throws.put(var1, this.id_protected.size());
      this.id_protected.add((T)var1);
      this.id_break((T)var1);
   }

   protected void id_break(T var1) {
      this.id_class.apply((T)var1).forEach(var2 -> {
         this.id_break.id_class((T)var1, var2.id_byte().toLowerCase(Locale.ROOT));
         this.id_byte.id_class((T)var1, var2.id_break().toLowerCase(Locale.ROOT));
      });
   }

   @Override
   public void id_break() {
      this.id_break = new gz_3<>();
      this.id_byte = new gz_3<>();

      for (Object var2 : this.id_protected) {
         this.id_break((T)var2);
      }

      this.id_break.id_class();
      this.id_byte.id_class();
   }
}
