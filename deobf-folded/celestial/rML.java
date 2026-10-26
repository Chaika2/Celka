package celestial;

public enum rML {
   RED("red", xu_3.rT.id_continue()),
   BROWN("brown", xu_3.rq.id_continue());

   final String name;
   final xc_3 renderState;

   private rML(String var3, xc_3 var4) {
      this.name = var3;
      this.renderState = var4;
   }

   public xc_3 id_class() {
      return this.renderState;
   }

   static rML id_class(String var0) {
      for (rML var4 : values()) {
         if (var4.name.equals(var0)) {
            return var4;
         }
      }

      return RED;
   }
}
