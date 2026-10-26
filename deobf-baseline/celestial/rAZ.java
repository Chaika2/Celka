package celestial;

public interface rAZ {
   rAZ id_class = id_class();
   rAZ id_break = id_class("pack.source.builtin");
   rAZ id_byte = id_class("pack.source.world");
   rAZ id_protected = id_class("pack.source.server");

   static rAZ id_class(String var0) {
      rgn_3 var1 = new rgn_3(var0);
      return var1x -> new rgn_3("pack.nameAndSource", var1x, var1).id_class(rgF_2.GRAY);
   }

   static rAZ id_class() {
      return var0 -> var0;
   }

   rgP_2 decorate(rgP_2 var1);
}
