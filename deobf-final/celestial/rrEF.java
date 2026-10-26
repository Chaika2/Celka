package celestial;

import java.util.Objects;

public final class rrEF<T> implements Comparable<rrEF<?>> {
   private final rrEl_1<T> class_;
   private final int break_;
   private final T byte_;
   private long protected_;

   protected rrEF(rrEl_1<T> var1, int var2, T var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = (T)var3;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof rrEF var2)
            ? false
            : this.break_ == var2.break_ && Objects.equals(this.class_, var2.class_) && Objects.equals(this.byte_, var2.byte_);
      }
   }

   @Override
   public String toString() {
      return "Ticket[" + this.class_ + " " + this.break_ + " (" + this.byte_ + ")] at " + this.protected_;
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.class_, this.break_, this.byte_);
   }

   public rrEl_1<T> class_() {
      return this.class_;
   }

   protected void class_(long var1) {
      this.protected_ = var1;
   }

   public int class_(rrEF<?> var1) {
      int var2 = Integer.compare(this.break_, var1.break_);
      if (var2 != 0) {
         return var2;
      } else {
         int var3 = Integer.compare(System.identityHashCode(this.class_), System.identityHashCode(var1.class_));
         return var3 != 0 ? var3 : this.class_.class_().compare(this.byte_, var1.byte_);
      }
   }

   protected boolean break_(long var1) {
      long var3 = this.class_.break_();
      return var3 != 0L && var1 - this.protected_ > var3;
   }

   public int break_() {
      return this.break_;
   }
}
