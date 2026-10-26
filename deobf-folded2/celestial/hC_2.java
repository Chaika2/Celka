package celestial;

public class hC_2 {
   private Boolean id_class;
   private Boolean id_break;
   private Boolean id_byte;
   private Boolean id_protected;
   private Boolean id_throws;
   private Boolean id_case;
   private Boolean id_catch;
   private Boolean id_private;
   private hY_2 id_implements = hY_2.id_class;
   private hY_2 id_finally = hY_2.id_class;

   public hC_2 id_class(hK_2 var1) {
      this.id_implements = var1.id_break();
      return this;
   }

   public hC_2 id_class(Boolean var1) {
      this.id_class = var1;
      return this;
   }

   public static hC_2 id_class() {
      return new hC_2();
   }

   public hn_3 id_break() {
      return new hn_3(
         this.id_class,
         this.id_break,
         this.id_byte,
         this.id_protected,
         this.id_throws,
         this.id_case,
         this.id_catch,
         this.id_private,
         this.id_implements,
         this.id_finally
      );
   }

   public hC_2 id_break(Boolean var1) {
      this.id_private = var1;
      return this;
   }
}
