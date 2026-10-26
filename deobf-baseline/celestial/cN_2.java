package celestial;

public class cN_2 {
   public static final rgP_2 id_class = new rgn_3("options.on");
   public static final rgP_2 id_break = new rgn_3("options.off");
   public static final rgP_2 id_byte = new rgn_3("gui.done");
   public static final rgP_2 id_protected = new rgn_3("gui.cancel");
   public static final rgP_2 id_throws = new rgn_3("gui.yes");
   public static final rgP_2 id_case = new rgn_3("gui.no");
   public static final rgP_2 id_catch = new rgn_3("gui.proceed");
   public static final rgP_2 id_private = new rgn_3("gui.back");
   public static final rgP_2 id_implements = new rgn_3("connect.failed");

   public static rgP_2 id_class(boolean var0) {
      return var0 ? id_class : id_break;
   }

   public static rVi_1 id_class(rgP_2 var0, boolean var1) {
      return new rgn_3(var1 ? "options.on.composed" : "options.off.composed", var0);
   }
}
