package celestial;

public class cN_2 {
   public static final rgP_2 class_ = new rgn_3("options.on");
   public static final rgP_2 break_ = new rgn_3("options.off");
   public static final rgP_2 byte_ = new rgn_3("gui.done");
   public static final rgP_2 protected_ = new rgn_3("gui.cancel");
   public static final rgP_2 throws_ = new rgn_3("gui.yes");
   public static final rgP_2 case_ = new rgn_3("gui.no");
   public static final rgP_2 catch_ = new rgn_3("gui.proceed");
   public static final rgP_2 private_ = new rgn_3("gui.back");
   public static final rgP_2 implements_ = new rgn_3("connect.failed");

   public static rgP_2 class_(boolean var0) {
      return var0 ? class_ : break_;
   }

   public static rVi_1 class_(rgP_2 var0, boolean var1) {
      return new rgn_3(var1 ? "options.on.composed" : "options.off.composed", var0);
   }
}
