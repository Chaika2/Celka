package celestial;

public class rrdI extends rrdw_1 {
   public static final String[] id_class = new String[]{"default", "fast", "fancy", "off"};
   public static final String[] id_break = new String[]{"Default", "Fast", "Fancy", "OFF"};

   public rrdI(String var1, String var2, int var3) {
      super(var1, id_class, var2, id_break, var3);
   }

   @Override
   public boolean id_class(String var1) {
      if (rrbb_3.id_class((Object)var1, (Object)"none")) {
         var1 = "off";
      }

      return super.id_class(var1);
   }

   public boolean id_finally() {
      return this.id_class() == 3;
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
