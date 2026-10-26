package celestial;

import com.google.common.collect.Lists;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nonnull;
import org.apache.commons.lang3.Validate;

public class rqs_3<E> extends AbstractList<E> {
   private final List<E> class_;
   private final E break_;

   protected rqs_3(List<E> var1, E var2) {
      this.class_ = var1;
      this.break_ = (E)var2;
   }

   protected rqs_3() {
      this(Lists.newArrayList(), null);
   }

   @Override
   public E remove(int var1) {
      return this.class_.remove(var1);
   }

   @Override
   public int size() {
      return this.class_.size();
   }

   @Nonnull
   @Override
   public E get(int var1) {
      return this.class_.get(var1);
   }

   @Override
   public void clear() {
      if (this.break_ == null) {
         super.clear();
      } else {
         for (int var1 = 0; var1 < this.size(); var1++) {
            this.set(var1, this.break_);
         }
      }
   }

   @Override
   public void add(int var1, E var2) {
      Validate.notNull(var2);
      this.class_.add(var1, (E)var2);
   }

   public static <E> rqs_3<E> class_(int var0, E var1) {
      Validate.notNull(var1);
      Object[] var2 = new Object[var0];
      Arrays.fill(var2, var1);
      return new rqs_3<>(Arrays.asList((E[])var2), (E)var1);
   }

   public static <E> rqs_3<E> class_() {
      return new rqs_3<>();
   }

   @SafeVarargs
   public static <E> rqs_3<E> class_(E var0, E... var1) {
      return new rqs_3<>(Arrays.asList((E[])var1), (E)var0);
   }

   @Override
   public E set(int var1, E var2) {
      Validate.notNull(var2);
      return this.class_.set(var1, (E)var2);
   }
}
