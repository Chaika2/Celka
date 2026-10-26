package celestial;

public class hK_2 {
   private hD_2 id_class;
   private hl_3 id_break;
   private XN id_byte;
   private XA id_protected;
   private XC id_throws;
   private hj_3 id_case;
   private hI_2 id_catch;
   private Xj_1 id_private;
   private rWI id_implements;
   private hY_2 id_finally;
   private hY_2 id_extends;
   private String id_native;
   private rqO_2 id_volatile;

   public hK_2() {
      this.id_class = hD_2.id_class;
      this.id_break = hl_3.id_class;
      this.id_byte = XN.id_class;
      this.id_protected = XA.id_class;
      this.id_throws = XC.id_class;
      this.id_case = hj_3.id_class;
      this.id_catch = hI_2.id_class;
      this.id_private = Xj_1.id_class;
      this.id_implements = rWI.id_class;
      this.id_finally = hY_2.id_class;
      this.id_extends = hY_2.id_class;
   }

   public hK_2 id_class(hI_2 var1) {
      this.id_catch = var1;
      return this;
   }

   public hK_2 id_class(hj_3 var1) {
      this.id_case = var1;
      return this;
   }

   public hK_2 id_class(XC var1) {
      this.id_throws = var1;
      return this;
   }

   public hK_2 id_class(XA var1) {
      this.id_protected = var1;
      return this;
   }

   public hK_2 id_class(String var1) {
      this.id_native = var1;
      return this;
   }

   public hK_2 id_class(hY_2 var1) {
      this.id_finally = var1;
      return this;
   }

   public hK_2 id_class(rWI var1) {
      this.id_implements = var1;
      return this;
   }

   public hK_2 id_class(Xj_1 var1) {
      this.id_private = var1;
      return this;
   }

   public hK_2 id_class(rqO_2 var1) {
      this.id_volatile = var1;
      return this;
   }

   public hK_2 id_class(rlb_3<aI_2<?>> var1) {
      this.id_class = hD_2.id_class(var1);
      return this;
   }

   public hK_2 id_class(aI_2<?> var1) {
      this.id_class = hD_2.id_break(var1);
      return this;
   }

   public static hK_2 id_class() {
      return new hK_2();
   }

   public hK_2 id_class(XN var1) {
      this.id_byte = var1;
      return this;
   }

   public hK_2 id_class(hl_3 var1) {
      this.id_break = var1;
      return this;
   }

   public hK_2 id_class(hD_2 var1) {
      this.id_class = var1;
      return this;
   }

   public hY_2 id_break() {
      return new hY_2(
         this.id_class,
         this.id_break,
         this.id_byte,
         this.id_protected,
         this.id_throws,
         this.id_case,
         this.id_catch,
         this.id_private,
         this.id_implements,
         this.id_finally,
         this.id_extends,
         this.id_native,
         this.id_volatile
      );
   }

   public hK_2 id_break(rqO_2 var1) {
      this.id_volatile = var1;
      return this;
   }

   public hK_2 id_break(hY_2 var1) {
      this.id_extends = var1;
      return this;
   }
}
