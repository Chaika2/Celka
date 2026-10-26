package celestial;

public class dN_2 extends xd_3 {
   public static final rCc_1 volatile_ = kE_2.p;
   public static final rCN final_ = rCT.else_;
   public static final rCu_1<rCI> package_ = rCT.f;
   public static final rCN int_ = rCT.return_;
   public static final rCu_1<rCf_1> new_ = rCT.G;
   protected static final rjC_2 continue_ = xd_3.class_(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final rjC_2 super_ = xd_3.class_(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final rjC_2 this_ = xd_3.class_(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final rjC_2 else_ = xd_3.class_(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);

   protected dN_2(Jq_1 var1) {
      super(var1);
      this.extends_(
         this.abstract_
            .break_()
            .class_(volatile_, rpr_3.NORTH)
            .class_(final_, Boolean.valueOf(false))
            .class_(package_, rCI.LEFT)
            .class_(int_, Boolean.valueOf(false))
            .class_(new_, rCf_1.LOWER)
      );
   }

   @Override
   public xc_3 class_(xc_3 var1, rqd_3 var2) {
      return var1.class_(volatile_, var2.class_(var1.byte_(volatile_)));
   }

   private void class_(rYB var1, rfH_2 var2, boolean var3) {
      var1.class_((rhd_3)null, var3 ? this.implements_() : this.break_(), var2, 0);
   }

   @Override
   public boolean class_(xc_3 var1, rRR var2, rfH_2 var3) {
      rfH_2 var4 = var3.break_();
      xc_3 var5 = var2.byte_(var4);
      return var1.byte_(new_) == rCf_1.LOWER ? var5.protected_(var2, var4, rpr_3.UP) : var5.class_(this);
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, xd_3 var4, rfH_2 var5, boolean var6) {
      boolean var7 = var2.public_(var3) || var2.public_(var3.break_(var1.byte_(new_) == rCf_1.LOWER ? rpr_3.UP : rpr_3.DOWN));
      if (var4 != this && var7 != var1.byte_(int_)) {
         if (var7 != var1.byte_(final_)) {
            this.class_(var2, var3, var7);
         }

         var2.class_(var3, var1.class_(int_, Boolean.valueOf(var7)).class_(final_, Boolean.valueOf(var7)), 2);
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: invalid constant type: Lcelestial/rpr_3; with value 4
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.ConstExprent.toJava(ConstExprent.java:356)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.SwitchStatement.toJava(SwitchStatement.java:170)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.RootStatement.toJava(RootStatement.java:36)
      //   at org.jetbrains.java.decompiler.main.ClassWriter.writeMethod(ClassWriter.java:1283)
      //
      // Bytecode:
      // 00: aload 1
      // 01: getstatic celestial/dN_2.volatile_ Lcelestial/rCc_1;
      // 04: invokevirtual celestial/xc_3.byte_ (Lcelestial/rCZ;)Ljava/lang/Comparable;
      // 07: checkcast celestial/rpr_3
      // 0a: astore 5
      // 0c: aload 1
      // 0d: getstatic celestial/dN_2.final_ Lcelestial/rCN;
      // 10: invokevirtual celestial/xc_3.byte_ (Lcelestial/rCZ;)Ljava/lang/Comparable;
      // 13: checkcast java/lang/Boolean
      // 16: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 19: ifne 20
      // 1c: bipush 1
      // 1d: goto 21
      // 20: bipush 0
      // 21: istore 6
      // 23: aload 1
      // 24: getstatic celestial/dN_2.package_ Lcelestial/rCu_1;
      // 27: invokevirtual celestial/xc_3.byte_ (Lcelestial/rCZ;)Ljava/lang/Comparable;
      // 2a: getstatic celestial/rCI.RIGHT Lcelestial/rCI;
      // 2d: if_acmpne 34
      // 30: bipush 1
      // 31: goto 35
      // 34: bipush 0
      // 35: istore 7
      // 37: getstatic celestial/dc_3.class_ [I
      // 3a: aload 5
      // 3c: invokevirtual celestial/rpr_3.ordinal ()I
      // 3f: iaload
      // 40: tableswitch 32 1 4 32 58 84 110
      // 60: iload 6
      // 62: ifeq 6b
      // 65: getstatic celestial/dN_2.else_ Lcelestial/rjC_2;
      // 68: goto 79
      // 6b: iload 7
      // 6d: ifeq 76
      // 70: getstatic celestial/dN_2.super_ Lcelestial/rjC_2;
      // 73: goto 79
      // 76: getstatic celestial/dN_2.continue_ Lcelestial/rjC_2;
      // 79: areturn
      // 7a: iload 6
      // 7c: ifeq 85
      // 7f: getstatic celestial/dN_2.continue_ Lcelestial/rjC_2;
      // 82: goto 93
      // 85: iload 7
      // 87: ifeq 90
      // 8a: getstatic celestial/dN_2.else_ Lcelestial/rjC_2;
      // 8d: goto 93
      // 90: getstatic celestial/dN_2.this_ Lcelestial/rjC_2;
      // 93: areturn
      // 94: iload 6
      // 96: ifeq 9f
      // 99: getstatic celestial/dN_2.this_ Lcelestial/rjC_2;
      // 9c: goto ad
      // 9f: iload 7
      // a1: ifeq aa
      // a4: getstatic celestial/dN_2.continue_ Lcelestial/rjC_2;
      // a7: goto ad
      // aa: getstatic celestial/dN_2.super_ Lcelestial/rjC_2;
      // ad: areturn
      // ae: iload 6
      // b0: ifeq b9
      // b3: getstatic celestial/dN_2.super_ Lcelestial/rjC_2;
      // b6: goto c7
      // b9: iload 7
      // bb: ifeq c4
      // be: getstatic celestial/dN_2.this_ Lcelestial/rjC_2;
      // c1: goto c7
      // c4: getstatic celestial/dN_2.else_ Lcelestial/rjC_2;
      // c7: areturn
   }

   public void class_(rYB var1, xc_3 var2, rfH_2 var3, boolean var4) {
      if (var2.class_(this) && var2.byte_(final_) != var4) {
         var1.class_(var3, var2.class_(final_, Boolean.valueOf(var4)), 10);
         this.class_(var1, var3, var4);
      }
   }

   public static boolean class_(rYB var0, rfH_2 var1) {
      return implements_(var0.byte_(var1));
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(new_, volatile_, final_, package_, int_);
   }

   @Override
   public long class_(xc_3 var1, rfH_2 var2) {
      return rfU_2.byte_(var2.b_(), var2.catch_(var1.byte_(new_) == rCf_1.LOWER ? 0 : 1).c_(), var2.d_());
   }

   @Override
   public xc_3 class_(xc_3 var1, rpa_3 var2) {
      return var2 == rpa_3.NONE ? var1 : var1.class_(var2.class_(var1.byte_(volatile_))).class_(package_);
   }

   @Override
   public void class_(rYB var1, rfH_2 var2, xc_3 var3, iB_2 var4, rdn_3 var5) {
      var1.class_(var2.final_(), var3.class_(new_, rCf_1.UPPER), 3);
   }

   @Override
   public boolean class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      switch (var4) {
         case LAND:
            return var1.byte_(final_);
         case WATER:
            return false;
         case AIR:
            return var1.byte_(final_);
         default:
            return false;
      }
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      rfH_2 var2 = var1.class_();
      if (var2.c_() < 255 && var1.int_().byte_(var2.final_()).class_(var1)) {
         rYB var3 = var1.int_();
         boolean var4 = var3.public_(var2) || var3.public_(var2.final_());
         return this.continue_()
            .class_(volatile_, var1.case_())
            .class_(package_, this.break_(var1))
            .class_(int_, Boolean.valueOf(var4))
            .class_(final_, Boolean.valueOf(var4))
            .class_(new_, rCf_1.LOWER);
      } else {
         return null;
      }
   }

   @Override
   public void class_(rYB var1, rfH_2 var2, xc_3 var3, rhd_3 var4) {
      if (!var1.continue_ && var4.implements_()) {
         du_3.break_(var1, var2, var3, var4);
      }

      super.class_(var1, var2, var3, var4);
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      rCf_1 var7 = var1.byte_(new_);
      if (var2.final_() == rpB_2.Y && var7 == rCf_1.LOWER == (var2 == rpr_3.UP)) {
         return var3.class_(this) && var3.byte_(new_) != var7
            ? var1.class_(volatile_, var3.byte_(volatile_))
               .class_(final_, var3.byte_(final_))
               .class_(package_, var3.byte_(package_))
               .class_(int_, var3.byte_(int_))
            : xu_3.class_.continue_();
      } else {
         return var7 == rCf_1.LOWER && var2 == rpr_3.DOWN && !var1.class_(var4, var5)
            ? xu_3.class_.continue_()
            : super.class_(var1, var2, var3, var4, var5, var6);
      }
   }

   @Override
   public ryZ_2 class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (this.break_ == QP.static_) {
         return ryZ_2.PASS;
      } else {
         var1 = var1.class_(final_);
         var2.class_(var3, var1, 10);
         var2.class_(var4, var1.byte_(final_) ? this.implements_() : this.break_(), var3, 0);
         return ryZ_2.class_(var2.continue_);
      }
   }

   private int break_() {
      return this.break_ == QP.static_ ? 1011 : 1012;
   }

   private rCI break_(rxx_3 var1) {
      rYB var2 = var1.int_();
      rfH_2 var3 = var1.class_();
      rpr_3 var4 = var1.case_();
      rfH_2 var5 = var3.final_();
      rpr_3 var6 = var4.private_();
      rfH_2 var7 = var3.break_(var6);
      xc_3 var8 = var2.byte_(var7);
      rfH_2 var9 = var5.break_(var6);
      xc_3 var10 = var2.byte_(var9);
      rpr_3 var11 = var4.catch_();
      rfH_2 var12 = var3.break_(var11);
      xc_3 var13 = var2.byte_(var12);
      rfH_2 var14 = var5.break_(var11);
      xc_3 var15 = var2.byte_(var14);
      int var16 = (var8.new_(var2, var7) ? -1 : 0) + (var10.new_(var2, var9) ? -1 : 0) + (var13.new_(var2, var12) ? 1 : 0) + (var15.new_(var2, var14) ? 1 : 0);
      boolean var17 = var8.class_(this) && var8.byte_(new_) == rCf_1.LOWER;
      boolean var18 = var13.class_(this) && var13.byte_(new_) == rCf_1.LOWER;
      if ((!var17 || var18) && var16 <= 0) {
         if ((!var18 || var17) && var16 >= 0) {
            int var19 = var4.implements_();
            int var20 = var4.extends_();
            rjU_2 var21 = var1.extends_();
            double var22 = var21.break_ - (double)var3.b_();
            double var24 = var21.protected_ - (double)var3.d_();
            return var19 < 0 && var24 < 0.5 || var19 > 0 && var24 > 0.5 || var20 < 0 && var22 > 0.5 || var20 > 0 && var22 < 0.5 ? rCI.RIGHT : rCI.LEFT;
         } else {
            return rCI.LEFT;
         }
      } else {
         return rCI.RIGHT;
      }
   }

   public static boolean implements_(xc_3 var0) {
      return var0.break_() instanceof dN_2 && (var0.byte_() == QP.goto_ || var0.byte_() == QP.while_);
   }

   private int implements_() {
      return this.break_ == QP.static_ ? 1005 : 1006;
   }

   @Override
   public Qs_1 protected_(xc_3 var1) {
      return Qs_1.DESTROY;
   }

   public boolean private_(xc_3 var1) {
      return var1.byte_(final_);
   }
}
