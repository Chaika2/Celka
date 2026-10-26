package celestial;

import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.function.Consumer;

public class rlY_2 {
   private final Collection<rle_3> class_ = Lists.newArrayList();
   private Collection<rlC_2> break_ = Lists.newArrayList();

   public int byte_() {
      return (int)this.class_.stream().filter(rle_3::implements_).count();
   }

   public rlY_2() {
   }

   public rlY_2(Collection<rle_3> var1) {
      this.class_.addAll(var1);
   }

   @Override
   public String toString() {
      return this.private_();
   }

   public void class_(rle_3 var1) {
      this.class_.add(var1);
      this.break_.forEach(var1::class_);
   }

   public void class_(Consumer<rle_3> var1) {
      this.class_(new rlo_3(this, var1));
   }

   public int class_() {
      return (int)this.class_.stream().filter(rle_3::catch_).filter(rle_3::extends_).count();
   }

   public void class_(rlC_2 var1) {
      this.break_.add(var1);
      this.class_.forEach(var1x -> var1x.class_(var1));
   }

   public int break_() {
      return (int)this.class_.stream().filter(rle_3::catch_).filter(rle_3::native_).count();
   }

   public boolean throws_() {
      return this.break_() > 0;
   }

   public boolean catch_() {
      return this.byte_() == this.case_();
   }

   public int case_() {
      return this.class_.size();
   }

   public boolean protected_() {
      return this.class_() > 0;
   }

   public String private_() {
      StringBuffer var1 = new StringBuffer();
      var1.append('[');
      this.class_.forEach(var1x -> {
         if (!var1x.private_()) {
            var1.append(' ');
         } else if (var1x.case_()) {
            var1.append('+');
         } else if (var1x.catch_()) {
            var1.append((char)(var1x.extends_() ? 'X' : 'x'));
         } else {
            var1.append('_');
         }
      });
      var1.append(']');
      return var1.toString();
   }
}
