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

   public String id_class() {
      return this.charsFirst;
   }

   public static rrXU id_class(char var0) {
      for (int var1 = 0; var1 < VALUES.length; var1++) {
         rrXU var2 = VALUES[var1];
         if (var2.id_class().indexOf(var0) >= 0) {
            return var2;
         }
      }

      return null;
   }

   public String id_break() {
      return this.charsNext;
   }

   public boolean id_break(char var1) {
      return this.charsNext.indexOf(var1) >= 0;
   }
}
