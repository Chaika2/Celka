package celestial;

public class rmG_2<T> {
   final rut_3<T> id_class;
   T id_break;
   private boolean id_byte;

   public boolean id_byte() {
      return this.id_byte;
   }

   public rmG_2(rut_3<T> var1, T var2) {
      this.id_class = var1;
      this.id_break = (T)var2;
      this.id_byte = true;
   }

   @Override
   public String toString() {
      return "DataEntry{key=" + this.id_class + ", value=" + this.id_break + ", dirty=" + this.id_byte + "}";
   }

   public void id_class(T var1) {
      this.id_break = (T)var1;
   }

   public void id_class(boolean var1) {
      this.id_byte = var1;
   }

   public rut_3<T> id_class() {
      return this.id_class;
   }

   public T id_break() {
      return this.id_break;
   }

   public rmG_2<T> id_protected() {
      return new rmG_2<>(this.id_class, this.id_class.id_break().id_class(this.id_break));
   }
}
