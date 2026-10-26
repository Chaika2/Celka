package celestial;

public class hK_2 {
   private hD_2 class_;
   private hl_3 break_;
   private XN byte_;
   private XA protected_;
   private XC throws_;
   private hj_3 case_;
   private hI_2 catch_;
   private Xj_1 private_;
   private rWI implements_;
   private hY_2 finally_;
   private hY_2 extends_;
   private String native_;
   private rqO_2 volatile_;

   public hK_2() {
      this.class_ = hD_2.class_;
      this.break_ = hl_3.class_;
      this.byte_ = XN.class_;
      this.protected_ = XA.class_;
      this.throws_ = XC.class_;
      this.case_ = hj_3.class_;
      this.catch_ = hI_2.class_;
      this.private_ = Xj_1.class_;
      this.implements_ = rWI.class_;
      this.finally_ = hY_2.class_;
      this.extends_ = hY_2.class_;
   }

   public hK_2 class_(hI_2 var1) {
      this.catch_ = var1;
      return this;
   }

   public hK_2 class_(hj_3 var1) {
      this.case_ = var1;
      return this;
   }

   public hK_2 class_(XC var1) {
      this.throws_ = var1;
      return this;
   }

   public hK_2 class_(XA var1) {
      this.protected_ = var1;
      return this;
   }

   public hK_2 class_(String var1) {
      this.native_ = var1;
      return this;
   }

   public hK_2 class_(hY_2 var1) {
      this.finally_ = var1;
      return this;
   }

   public hK_2 class_(rWI var1) {
      this.implements_ = var1;
      return this;
   }

   public hK_2 class_(Xj_1 var1) {
      this.private_ = var1;
      return this;
   }

   public hK_2 class_(rqO_2 var1) {
      this.volatile_ = var1;
      return this;
   }

   public hK_2 class_(rlb_3<aI_2<?>> var1) {
      this.class_ = hD_2.class_(var1);
      return this;
   }

   public hK_2 class_(aI_2<?> var1) {
      this.class_ = hD_2.break_(var1);
      return this;
   }

   public static hK_2 class_() {
      return new hK_2();
   }

   public hK_2 class_(XN var1) {
      this.byte_ = var1;
      return this;
   }

   public hK_2 class_(hl_3 var1) {
      this.break_ = var1;
      return this;
   }

   public hK_2 class_(hD_2 var1) {
      this.class_ = var1;
      return this;
   }

   public hY_2 break_() {
      return new hY_2(
         this.class_,
         this.break_,
         this.byte_,
         this.protected_,
         this.throws_,
         this.case_,
         this.catch_,
         this.private_,
         this.implements_,
         this.finally_,
         this.extends_,
         this.native_,
         this.volatile_
      );
   }

   public hK_2 break_(rqO_2 var1) {
      this.volatile_ = var1;
      return this;
   }

   public hK_2 break_(hY_2 var1) {
      this.extends_ = var1;
      return this;
   }
}
