package celestial;

public interface rAZ {
   rAZ class_ = class_();
   rAZ break_ = class_("pack.source.builtin");
   rAZ byte_ = class_("pack.source.world");
   rAZ protected_ = class_("pack.source.server");

   static rAZ class_(String var0) {
      rgn_3 var1 = new rgn_3(var0);
      return var1x -> new rgn_3("pack.nameAndSource", var1x, var1).class_(rgF_2.GRAY);
   }

   static rAZ class_() {
      return var0 -> var0;
   }

   rgP_2 decorate(rgP_2 var1);
}
