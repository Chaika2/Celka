package celestial;

import com.mojang.serialization.Lifecycle;
import java.util.Optional;
import java.util.Random;
import javax.annotation.Nonnull;

public class rVu_1<T> extends rVC<T> {
   private final rqO_2 rX;
   private T rJ;

   public rVu_1(String var1, rqM_2<? extends rVL<T>> var2, Lifecycle var3) {
      super(var2, var3);
      this.rX = new rqO_2(var1);
   }

   @Nonnull
   @Override
   public T id_class(rqO_2 var1) {
      Object var2 = super.id_class(var1);
      return (T)(var2 == null ? this.rJ : var2);
   }

   @Nonnull
   @Override
   public T id_class(int var1) {
      Object var2 = super.id_class(var1);
      return (T)(var2 == null ? this.rJ : var2);
   }

   @Nonnull
   @Override
   public T id_class(Random var1) {
      Object var2 = super.id_class(var1);
      return (T)(var2 == null ? this.rJ : var2);
   }

   public rqO_2 id_class() {
      return this.rX;
   }

   @Override
   public <V extends T> V id_class(int var1, rqM_2<T> var2, V var3, Lifecycle var4) {
      if (this.rX.equals(var2.id_class())) {
         this.rJ = (T)var3;
      }

      return super.id_class(var1, var2, (V)var3, var4);
   }

   @Override
   public int id_class(T var1) {
      int var2 = super.id_class((T)var1);
      return var2 == -1 ? super.id_class(this.rJ) : var2;
   }

   @Nonnull
   @Override
   public rqO_2 id_break(T var1) {
      rqO_2 var2 = super.id_break((T)var1);
      return var2 == null ? this.rX : var2;
   }

   @Override
   public Optional<T> id_break(rqO_2 var1) {
      return Optional.ofNullable(super.id_class(var1));
   }
}
