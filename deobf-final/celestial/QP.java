package celestial;

public final class QP {
   public static final QP class_ = new QB(QS.break_).byte_().implements_().break_().throws_().private_();
   public static final QP break_ = new QB(QS.break_).byte_().implements_().break_().throws_().private_();
   public static final QP byte_ = new QB(QS.break_).byte_().implements_().break_().catch_().private_();
   public static final QP protected_ = new QB(QS.throws_).byte_().implements_().break_().protected_().private_();
   public static final QP throws_ = new QB(QS.implements_).byte_().implements_().break_().case_().private_();
   public static final QP case_ = new QB(QS.final_).byte_().implements_().break_().case_().private_();
   public static final QP catch_ = new QB(QS.implements_).byte_().implements_().break_().case_().throws_().protected_().private_();
   public static final QP private_ = new QB(QS.implements_).byte_().implements_().break_().case_().throws_().private_();
   public static final QP implements_ = new QB(QS.final_).byte_().implements_().break_().case_().throws_().private_();
   public static final QP finally_ = new QB(QS.final_).byte_().implements_().break_().case_().throws_().class_().private_();
   public static final QP extends_ = new QB(QS.final_).byte_().implements_().break_().case_().throws_().class_().private_();
   public static final QP native_ = new QB(QS.case_).byte_().implements_().break_().case_().throws_().class_().private_();
   public static final QP volatile_ = new QB(QS.finally_).byte_().implements_().break_().case_().throws_().private_();
   public static final QP final_ = new QB(QS.break_).byte_().implements_().break_().case_().throws_().private_();
   public static final QP package_ = new QB(QS.break_).byte_().implements_().break_().case_().private_();
   public static final QP int_ = new QB(QS.throws_).byte_().implements_().case_().private_();
   public static final QP new_ = new QB(QS.break_).private_();
   public static final QP continue_ = new QB(QS.extends_).private_();
   public static final QP super_ = new QB(QS.native_).private_();
   public static final QP this_ = new QB(QS.byte_).private_();
   public static final QP else_ = new QB(QS.catch_).private_();
   public static final QP synchronized_ = new QB(QS.protected_).private_();
   public static final QP return_ = new QB(QS.this_).private_();
   public static final QP public_ = new QB(QS.while_).private_();
   public static final QP goto_ = new QB(QS.package_).protected_().private_();
   public static final QP while_ = new QB(QS.package_).private_();
   public static final QP try_ = new QB(QS.package_).protected_().case_().byte_().private_();
   public static final QP instanceof_ = new QB(QS.package_).protected_().case_().private_();
   public static final QP throw_ = new QB(QS.throws_).protected_().private_();
   public static final QP interface_ = new QB(QS.case_).protected_().implements_().private_();
   public static final QP char_ = new QB(QS.implements_).protected_().implements_().case_().private_();
   public static final QP abstract_ = new QB(QS.break_).implements_().private_();
   public static final QP long_ = new QB(QS.catch_).implements_().private_();
   public static final QP float_ = new QB(QS.implements_).implements_().case_().private_();
   public static final QP void_ = new QB(QS.volatile_).private_();
   public static final QP static_ = new QB(QS.private_).private_();
   public static final QP import_ = new QB(QS.finally_).private_();
   public static final QP short_ = new QB(QS.private_).catch_().private_();
   public static final QP default_ = new QB(QS.break_).catch_().private_();
   public static final QP const_ = new QB(QS.volatile_).catch_().private_();
   public static final QP strictfp_ = new QB(QS.implements_).case_().private_();
   public static final QP boolean_ = new QB(QS.implements_).case_().private_();
   public static final QP transient_ = new QB(QS.implements_).case_().private_();
   public static final QP for_ = new QB(QS.break_).case_().private_();
   private final QS double_;
   private final Qs_1 switch_;
   private final boolean r;
   private final boolean P;
   private final boolean B;
   private final boolean S;
   private final boolean s;
   private final boolean E;

   public boolean byte_() {
      return this.r;
   }

   public QP(QS var1, boolean var2, boolean var3, boolean var4, boolean var5, boolean var6, boolean var7, Qs_1 var8) {
      this.double_ = var1;
      this.B = var2;
      this.E = var3;
      this.r = var4;
      this.S = var5;
      this.P = var6;
      this.s = var7;
      this.switch_ = var8;
   }

   public boolean class_() {
      return this.B;
   }

   public boolean break_() {
      return this.E;
   }

   public boolean throws_() {
      return this.s;
   }

   public Qs_1 catch_() {
      return this.switch_;
   }

   public boolean case_() {
      return this.S;
   }

   public boolean protected_() {
      return this.P;
   }

   public QS private_() {
      return this.double_;
   }
}
