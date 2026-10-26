package celestial;

public enum rrXU {
   IDENTIFIER("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_:."),
   NUMBER("0123456789", "0123456789."),
   OPERATOR("+-*/%!&|<>=", "&|="),
   COMMA(","),
   BRACKET_OPEN("("),
   BRACKET_CLOSE(")");

   private String charsFirst;
   private String charsNext;
   public static final rrXU[] VALUES = values();

   private rrXU(String var3) {
      this(var3, "");
   }

   private rrXU(String var3, String var4) {
      this.charsFirst = var3;
      this.charsNext = var4;
   }

   public String class_() {
      return this.charsFirst;
   }

   public static rrXU class_(char var0) {
      for (int var1 = 0; var1 < VALUES.length; var1++) {
         rrXU var2 = VALUES[var1];
         if (var2.class_().indexOf(var0) >= 0) {
            return var2;
         }
      }

      return null;
   }

   public String break_() {
      return this.charsNext;
   }

   public boolean break_(char var1) {
      return this.charsNext.indexOf(var1) >= 0;
   }
}
