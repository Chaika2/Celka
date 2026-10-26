package celestial;

import com.google.common.collect.Lists;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nonnull;
import org.apache.commons.lang3.Validate;

public class rqs_3<E> extends AbstractList<E> {
   private final List<E> id_class;
   private final E id_break;

   protected rqs_3(List<E> var1, E var2) {
      this.id_class = var1;
      this.id_break = (E)var2;
   }

   protected rqs_3() {
      this(Lists.newArrayList(), null);
   }

   @Override
   public E remove(int var1) {
      return this.id_class.remove(var1);
   }

   @Override
   public int size() {
      return this.id_class.size();
   }

   @Nonnull
   @Override
   public E get(int var1) {
      return this.id_class.get(var1);
   }

   @Override
   public void clear() {
      if (this.id_break == null) {
         super.clear();
      } else {
         for (int var1 = 0; var1 < this.size(); var1++) {
            this.set(var1, this.id_break);
         }
      }
   }

   @Override
   public void add(int var1, E var2) {
      Validate.notNull(var2);
      this.id_class.add(var1, (E)var2);
   }

   public static <E> rqs_3<E> id_class(int var0, E var1) {
      Validate.notNull(var1);
      Object[] var2 = new Object[var0];
      Arrays.fill(var2, var1);
      return new rqs_3<>(Arrays.asList((E[])var2), (E)var1);
   }

   public static <E> rqs_3<E> id_class() {
      return new rqs_3<>();
   }

   @SafeVarargs
   public static <E> rqs_3<E> id_class(E var0, E... var1) {
      return new rqs_3<>(Arrays.asList((E[])var1), (E)var0);
   }

   @Override
   public E set(int var1, E var2) {
      Validate.notNull(var2);
      return this.id_class.set(var1, (E)var2);
   }
}
