package celestial;

public class rrdI extends rrdw_1 {
   public static final String[] class_ = new String[]{"default", "fast", "fancy", "off"};
   public static final String[] break_ = new String[]{"Default", "Fast", "Fancy", "OFF"};

   public rrdI(String var1, String var2, int var3) {
      super(var1, class_, var2, break_, var3);
   }

   @Override
   public boolean class_(String var1) {
      if (rrbb_3.class_((Object)var1, (Object)"none")) {
         var1 = "off";
      }

      return super.class_(var1);
   }

   public boolean finally_() {
      return this.class_() == 3;
   }

   public boolean catch_() {
      return this.class_() == 0;
   }

   public boolean implements_() {
      return this.class_() == 2;
   }

   public boolean private_() {
      return this.class_() == 1;
   }
}
