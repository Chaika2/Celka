package celestial;

public class rlq_3 extends rlK_2 {
   private final rfH_2 class_ = null;
   private final rfH_2 break_ = null;
   private final long byte_ = 0L;

   private rlq_3() {
      super("Synthetic constructor added by MCP, do not call");
      throw new RuntimeException("Synthetic constructor added by MCP, do not call");
   }

   public String class_() {
      return super.getMessage() + " here";
   }

   @Override
   public String getMessage() {
      String var1 = this.class_.b_()
         + ","
         + this.class_.c_()
         + ","
         + this.class_.d_()
         + " (relative: "
         + this.break_.b_()
         + ","
         + this.break_.c_()
         + ","
         + this.break_.d_()
         + ")";
      return super.getMessage() + " at " + var1 + " (t=" + 0L + ")";
   }

   public rfH_2 break_() {
      return this.class_;
   }
}
