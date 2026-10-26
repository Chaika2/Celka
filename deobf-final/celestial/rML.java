package celestial;

public enum rML {
   RED("red", xu_3.rT.continue_()),
   BROWN("brown", xu_3.rq.continue_());

   final String name;
   final xc_3 renderState;

   private rML(String var3, xc_3 var4) {
      this.name = var3;
      this.renderState = var4;
   }

   public xc_3 class_() {
      return this.renderState;
   }

   static rML class_(String var0) {
      for (rML var4 : values()) {
         if (var4.name.equals(var0)) {
            return var4;
         }
      }

      return RED;
   }
}
