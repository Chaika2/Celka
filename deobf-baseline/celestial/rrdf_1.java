package celestial;

public class rrdf_1 extends rrdw_1 {
   public static final String[] id_class = new String[]{"default", "true", "false"};
   public static final String[] id_break = new String[]{"Default", "ON", "OFF"};

   public rrdf_1(String var1, String var2, int var3) {
      super(var1, id_class, var2, id_break, var3);
   }

   @Override
   public String id_break() {
      if (this.id_catch()) {
         return rrba_3.id_case();
      } else if (this.id_private()) {
         return rrba_3.id_break();
      } else {
         return this.id_implements() ? rrba_3.id_byte() : super.id_break();
      }
   }

   public boolean id_catch() {
      return this.id_class() == 0;
   }

   public boolean id_implements() {
      return this.id_class() == 2;
   }

   public boolean id_private() {
      return this.id_class() == 1;
   }
}
