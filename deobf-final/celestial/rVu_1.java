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
   public T class_(rqO_2 var1) {
      Object var2 = super.class_(var1);
      return (T)(var2 == null ? this.rJ : var2);
   }

   @Nonnull
   @Override
   public T class_(int var1) {
      Object var2 = super.class_(var1);
      return (T)(var2 == null ? this.rJ : var2);
   }

   @Nonnull
   @Override
   public T class_(Random var1) {
      Object var2 = super.class_(var1);
      return (T)(var2 == null ? this.rJ : var2);
   }

   public rqO_2 class_() {
      return this.rX;
   }

   @Override
   public <V extends T> V class_(int var1, rqM_2<T> var2, V var3, Lifecycle var4) {
      if (this.rX.equals(var2.class_())) {
         this.rJ = (T)var3;
      }

      return super.class_(var1, var2, (V)var3, var4);
   }

   @Override
   public int class_(T var1) {
      int var2 = super.class_((T)var1);
      return var2 == -1 ? super.class_(this.rJ) : var2;
   }

   @Nonnull
   @Override
   public rqO_2 break_(T var1) {
      rqO_2 var2 = super.break_((T)var1);
      return var2 == null ? this.rX : var2;
   }

   @Override
   public Optional<T> break_(rqO_2 var1) {
      return Optional.ofNullable(super.class_(var1));
   }
}
