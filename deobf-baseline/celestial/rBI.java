package celestial;

import java.util.EnumSet;
import java.util.function.Predicate;

public class rBI<T extends iB_2> extends rSM {
   protected final Class<T> id_class;
   protected final int id_break;
   protected iB_2 id_byte;
   protected ay_3 id_protected;

   @Override
   public void id_byte() {
      this.id_throws.id_byte(this.id_byte);
      super.id_byte();
   }

   public rBI(is_3 var1, Class<T> var2, boolean var3) {
      this(var1, var2, var3, false);
   }

   public rBI(is_3 var1, Class<T> var2, int var3, boolean var4, boolean var5, Predicate<iB_2> var6) {
      super(var1, var4, var5);
      this.id_class = var2;
      this.id_break = var3;
      this.id_class(EnumSet.of(rBW.TARGET));
      this.id_protected = new ay_3().id_class(this.id_extends()).id_class(var6);
   }

   public rBI(is_3 var1, Class<T> var2, boolean var3, boolean var4) {
      this(var1, var2, 10, var3, var4, (Predicate<iB_2>)null);
   }

   public void id_class(iB_2 var1) {
      this.id_byte = var1;
   }

   protected rfl_3 id_class(double var1) {
      return this.id_throws.rN().id_byte(var1, 4.0, var1);
   }

   @Override
   public boolean id_class() {
      if (this.id_break > 0 && this.id_throws.Sa().nextInt(this.id_break) != 0) {
         return false;
      } else {
         this.id_finally();
         return this.id_byte != null;
      }
   }

   protected void id_finally() {
      if (this.id_class != rhd_3.class && this.id_class != rhN_2.class) {
         this.id_byte = ((rYB)this.id_throws.id_throws[7])
            .id_break(
               this.id_class,
               this.id_protected,
               this.id_throws,
               this.id_throws.rx(),
               this.id_throws.rH(),
               this.id_throws.BO(),
               this.id_class(this.id_extends())
            );
      } else {
         this.id_byte = ((rYB)this.id_throws.id_throws[7])
            .id_class(this.id_protected, this.id_throws, this.id_throws.rx(), this.id_throws.rH(), this.id_throws.BO());
      }
   }
}
