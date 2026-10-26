package celestial;

public class Xc_1 {
   private Xm_1 id_class = Xm_1.id_throws;
   private Xm_1 id_break = Xm_1.id_throws;
   private Xm_1 id_byte = Xm_1.id_throws;
   private rqM_2<rYG> id_protected;
   private rrrZ<?> id_throws;
   private rqM_2<rYB> id_case;
   private Boolean id_catch;
   private XQ id_private = XQ.id_class;
   private hO_2 id_implements = hO_2.id_class;
   private XS id_finally = XS.id_class;

   public Xc_1 id_class(Boolean var1) {
      this.id_catch = var1;
      return this;
   }

   public Xc_1 id_class(hO_2 var1) {
      this.id_implements = var1;
      return this;
   }

   public Xc_1 id_class(rqM_2<rYG> var1) {
      this.id_protected = var1;
      return this;
   }

   public static Xc_1 id_class() {
      return new Xc_1();
   }

   public XN id_break() {
      return new XN(
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
}
