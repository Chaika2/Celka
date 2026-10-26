package celestial;

public class rmG_2<T> {
   final rut_3<T> class_;
   T break_;
   private boolean byte_;

   public boolean byte_() {
      return this.byte_;
   }

   public rmG_2(rut_3<T> var1, T var2) {
      this.class_ = var1;
      this.break_ = (T)var2;
      this.byte_ = true;
   }

   @Override
   public String toString() {
      return "DataEntry{key=" + this.class_ + ", value=" + this.break_ + ", dirty=" + this.byte_ + "}";
   }

   public void class_(T var1) {
      this.break_ = (T)var1;
   }

   public void class_(boolean var1) {
      this.byte_ = var1;
   }

   public rut_3<T> class_() {
      return this.class_;
   }

   public T break_() {
      return this.break_;
   }

   public rmG_2<T> protected_() {
      return new rmG_2<>(this.class_, this.class_.break_().class_(this.break_));
   }
}
