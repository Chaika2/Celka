package celestial;

import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.function.Consumer;

public class rlY_2 {
   private final Collection<rle_3> id_class = Lists.newArrayList();
   private Collection<rlC_2> id_break = Lists.newArrayList();

   public int id_byte() {
      return (int)this.id_class.stream().filter(rle_3::id_implements).count();
   }

   public rlY_2() {
   }

   public rlY_2(Collection<rle_3> var1) {
      this.id_class.addAll(var1);
   }

   @Override
   public String toString() {
      return this.id_private();
   }

   public void id_class(rle_3 var1) {
      this.id_class.add(var1);
      this.id_break.forEach(var1::id_class);
   }

   public void id_class(Consumer<rle_3> var1) {
      this.id_class(new rlo_3(this, var1));
   }

   public int id_class() {
      return (int)this.id_class.stream().filter(rle_3::id_catch).filter(rle_3::id_extends).count();
   }

   public void id_class(rlC_2 var1) {
      this.id_break.add(var1);
      this.id_class.forEach(var1x -> var1x.id_class(var1));
   }

   public int id_break() {
      return (int)this.id_class.stream().filter(rle_3::id_catch).filter(rle_3::id_native).count();
   }

   public boolean id_throws() {
      return this.id_break() > 0;
   }

   public boolean id_catch() {
      return this.id_byte() == this.id_case();
   }

   public int id_case() {
      return this.id_class.size();
   }

   public boolean id_protected() {
      return this.id_class() > 0;
   }

   public String id_private() {
      StringBuffer var1 = new StringBuffer();
      var1.append('[');
      this.id_class.forEach(var1x -> {
         if (!var1x.id_private()) {
            var1.append(' ');
         } else if (var1x.id_case()) {
            var1.append('+');
         } else if (var1x.id_catch()) {
            var1.append((char)(var1x.id_extends() ? 'X' : 'x'));
         } else {
            var1.append('_');
         }
      });
      var1.append(']');
      return var1.toString();
   }
}
