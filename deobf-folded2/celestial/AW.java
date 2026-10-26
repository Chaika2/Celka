package celestial;

public enum AW {
   FAVORITES("Favorites", new rgn_3("unique_servers.favorites")),
   MOST_POPULAR("Most Popular", new rgn_3("unique_servers.most_popular")),
   DEFAULT("Default", new rgn_3("unique_servers.default"));

   private final String typeName;
   private final rgn_3 name;

   private AW(String var3, rgn_3 var4) {
      this.typeName = var3;
      this.name = var4;
   }

   public String id_class() {
      return this.typeName;
   }

   public static AW id_class(String var0) {
      for (AW var4 : values()) {
         if (var4.typeName.equalsIgnoreCase(var0.toLowerCase())) {
            return var4;
         }
      }

      return null;
   }

   public rgn_3 id_break() {
      return this.name;
   }
}
