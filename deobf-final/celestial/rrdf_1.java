package celestial;

public class rrdf_1 extends rrdw_1 {
   public static final String[] class_ = new String[]{"default", "true", "false"};
   public static final String[] break_ = new String[]{"Default", "ON", "OFF"};

   public rrdf_1(String var1, String var2, int var3) {
      super(var1, class_, var2, break_, var3);
   }

   @Override
   public String break_() {
      if (this.catch_()) {
         return rrba_3.case_();
      } else if (this.private_()) {
         return rrba_3.break_();
      } else {
         return this.implements_() ? rrba_3.byte_() : super.break_();
      }
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
