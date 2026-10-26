package celestial;

import java.util.EnumSet;
import java.util.function.Predicate;

public class rPD<T extends iB_2> extends rBk_1 {
   protected final aA_2 id_class;
   private final double id_implements;
   private final double id_finally;
   protected T id_break;
   protected final float id_byte;
   protected rLC id_protected;
   protected final rLy_1 id_throws;
   protected final Class<T> id_case;
   protected final Predicate<iB_2> id_catch;
   protected final Predicate<iB_2> id_private;
   private final ay_3 id_extends;

   @Override
   public void id_byte() {
      this.id_throws.id_class(this.id_protected, this.id_implements);
   }

   public rPD(aA_2 var1, Class<T> var2, float var3, double var4, double var6) {
      this(var1, var2, var0 -> true, var3, var4, var6, rpJ_2.id_throws::test);
   }

   public rPD(aA_2 var1, Class<T> var2, float var3, double var4, double var6, Predicate<iB_2> var8) {
      this(var1, var2, var0 -> true, var3, var4, var6, var8);
   }

   public rPD(aA_2 var1, Class<T> var2, Predicate<iB_2> var3, float var4, double var5, double var7, Predicate<iB_2> var9) {
      this.id_class = var1;
      this.id_case = var2;
      this.id_catch = var3;
      this.id_byte = var4;
      this.id_implements = var5;
      this.id_finally = var7;
      this.id_private = var9;
      this.id_throws = var1.id_public();
      this.id_class(EnumSet.of(rBW.MOVE));
      this.id_extends = new ay_3().id_class((double)var4).id_class(var9.and(var3));
   }

   @Override
   public boolean id_class() {
      this.id_break = ((rYB)this.id_class.id_throws[7])
         .id_break(
            this.id_case,
            this.id_extends,
            this.id_class,
            this.id_class.rx(),
            this.id_class.re(),
            this.id_class.BO(),
            this.id_class.rN().id_byte((double)this.id_byte, 3.0, (double)this.id_byte)
         );
      if (this.id_break == null) {
         return false;
      } else {
         rjU_2 var1 = iX_2.id_byte(this.id_class, 16, 7, this.id_break.Ps());
         if (var1 == null) {
            return false;
         } else if (this.id_break.id_class(var1.id_break, var1.id_byte, var1.id_protected) < this.id_break.id_int(this.id_class)) {
            return false;
         } else {
            this.id_protected = this.id_throws.id_class(var1.id_break, var1.id_byte, var1.id_protected, 0);
            return this.id_protected != null;
         }
      }
   }

   @Override
   public boolean id_break() {
      return !this.id_throws.id_native();
   }

   @Override
   public void id_throws() {
      if (this.id_class.id_int(this.id_break) < 49.0) {
         this.id_class.id_public().id_class(this.id_finally);
      } else {
         this.id_class.id_public().id_class(this.id_implements);
      }
   }

   @Override
   public void id_protected() {
      this.id_break = null;
   }
}
